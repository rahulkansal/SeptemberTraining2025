package Capabilities;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Pages.BaseClass;
import Pages.Login;
import Utility.FileUtility;

import java.io.File;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Base64;


public class CapabilitiesBase {
	
	public static WebDriver driver = null ;
	public static String subFolderPath ="";
	public static File path;
	public static ExtentReports extentReport ;
    public static ExtentTest extentTest ;
    public Login login;
	public BaseClass baseClass;
	public static Map<String, String> testData = new HashMap<String, String>();
	
	
	public static void generateReport()
    {
    
        subFolderPath =  System.getProperty("user.dir") + "/Reports/";
        String[] monthName = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
                "October", "November", "December" };

        Calendar calendar = Calendar.getInstance();
        int iMonth = calendar.get(Calendar.MONTH);
        String sMonthName = monthName[iMonth];
        String userName = System.getProperty("user.name");
        String timeStamp =  FileUtility.Timestamp();

        path = FileUtility.CreateFolder(subFolderPath);
        path =  FileUtility.CreateFolder(path.getAbsolutePath() + "/" + userName);
        path = FileUtility.CreateFolder(path.getAbsolutePath()+ "/" + sMonthName);
        path = FileUtility.CreateFolder(path.getAbsolutePath()+ "/" + timeStamp);

        extentReport = new ExtentReports(path.getAbsolutePath()+"\\ExtentReport.html");

        path = FileUtility.CreateFolder(path.getAbsolutePath()+"\\ScreenShots");

        //extentReport.addSystemInfo("Environment","UAT");
        extentReport.addSystemInfo("Environment", testData.get("Environment"));
        extentReport.loadConfig(new File(System.getProperty("user.dir")+"\\src\\main\\resources\\extent\\extent-config.xml"));

    }
	
	public static WebDriver launchBrowser(String browser)
    {

        if (browser.equalsIgnoreCase("chrome"))
        {
         
            driver = new ChromeDriver();
            driver.manage().deleteAllCookies();
        }

        else if(browser.equalsIgnoreCase("edge")) {

            driver = new EdgeDriver();
        }
        return driver;
    }
	
	public void excelSheetReading(String excelSheetFileName,String sheetName) throws IOException {
        // for testData (fetching all the sheets' data)
        String projectDir = System.getProperty("user.dir");

        FileInputStream fileInputStream = new FileInputStream(projectDir + "\\Excel\\" + excelSheetFileName + ".xlsx");
        System.out.println(fileInputStream);
        XSSFWorkbook workbook = null;
        workbook = new XSSFWorkbook(fileInputStream);
        
        //for (int sheetCount = 0; sheetCount < sheetNames.length; sheetCount++){
        XSSFSheet sheet = workbook.getSheet(sheetName);
        for (int rowCount = 0; rowCount < sheet.getPhysicalNumberOfRows(); rowCount++){
            Cell cell = sheet.getRow(rowCount).getCell(1);
           // if (cell.getCellType() == Cell.)
                testData.put(sheet.getRow(rowCount).getCell(0).getStringCellValue(),
                        sheet.getRow(rowCount).getCell(1).getStringCellValue());
     

        }
        // }
    }

	
	 @BeforeSuite
	    public void beforeSuite() throws Exception {

	        try {
	            excelSheetReading("TestData","Sheet1");
	        } catch (IOException e) {
	            e.printStackTrace();
	        }  
	        generateReport();
	    }

	 @BeforeMethod
	    public void beforeMethod(ITestResult result) throws Exception {
	       // String sheetName = "";
	        launchBrowser(testData.get("browser"));
			//launchBrowser("chrome"); 
			baseClass = new BaseClass();
			login = new Login();
			
			String methodName = result.getMethod().getMethodName();
	        extentTest = extentReport.startTest(methodName);
			
	    }
	 
	 @AfterMethod
		public static void getResult(ITestResult result) throws Exception {
			
			extentReport.endTest(extentTest);	
			 if (result.getStatus() == ITestResult.FAILURE) {

		            String screenshotPath = path.getAbsolutePath() + "\\FailedTestCase_" + FileUtility.Timestamp() + ".png";

		            File shot =  ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		            FileUtils.copyFile(shot, new File(screenshotPath));
		            InputStream is = new FileInputStream(screenshotPath);
		            byte[] ssBytes= IOUtils.toByteArray(is);
		            String base64 = Base64.getEncoder().encodeToString(ssBytes);

		            extentTest.log(LogStatus.FAIL, extentTest.addBase64ScreenShot("data:image/png;base64," + base64));
		            extentTest.log(LogStatus.FAIL, "Test Case Failed is " + result.getName());
		            extentTest.log(LogStatus.FAIL, "Test Case Failed is " + result.getThrowable());


		        } else if (result.getStatus() == ITestResult.SKIP) {
		            extentTest.log(LogStatus.SKIP, "Test Case Skipped is " + result.getName());
		        }  
			//driver.quit();
		}

	 @AfterSuite
	    public void afterSuite(){
	        extentReport.flush();
	    }
	 



}
