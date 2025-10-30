package com.selenium.practice;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v142.network.Network;
import org.openqa.selenium.devtools.v142.network.model.Cookie;

import java.io.*;
import java.util.*;

public class Test {

    private static final String COOKIE_FILE = "all_cookies.ser";

    public static void main(String[] args) throws Exception {
        WebDriver driver = new ChromeDriver();
        DevTools devTools = ((ChromeDriver) driver).getDevTools();
        devTools.createSession();

        // Enable the Network domain to access cookies
        devTools.send(Network.enable(Optional.empty(), Optional.empty(), Optional.empty()));

        // STEP 1️⃣: First-time manual login (with OTP)
        driver.get("https://google.com");

        System.out.println("🔹 Please complete login manually and press ENTER here...");
        System.in.read();

        // STEP 2️⃣: Fetch all cookies (from every domain)
        List<Cookie> cookies = devTools.send(Network.getAllCookies());

        // Save cookies to file
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(COOKIE_FILE))) {
            oos.writeObject(cookies);
        }
        System.out.println("✅ All cookies saved: " + cookies.size());

        driver.quit();

        // STEP 3️⃣: Reload session later
        restoreSession();
    }

    public static void restoreSession() throws Exception {
        WebDriver driver = new ChromeDriver();
        DevTools devTools = ((ChromeDriver) driver).getDevTools();
        devTools.createSession();
        devTools.send(Network.enable(Optional.empty(), Optional.empty(), Optional.empty()));

        // Load cookies from file
        List<Cookie> cookies;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(COOKIE_FILE))) {
            cookies = (List<Cookie>) ois.readObject();
        }

        for (Cookie c : cookies) {
//            devTools.send(Network.setCookie(
//                c.getName(),                                // name
//                c.getValue(),                               // value
//                Optional.ofNullable(c.getDomain()),         // domain
//                Optional.ofNullable(c.getPath()),           // path
//                Optional.of(c.getSecure()),                  // secure
//                Optional.of(c.getHttpOnly()),                // httpOnly
//                Optional.empty(),                           // sameSite
//                Optional.ofNullable(c.getExpires() != null 
//                    ? c.getExpires().longValue() : null),   // expires
//                Optional.empty(),                           // priority
//                Optional.empty(),                           // source scheme
//                Optional.empty(),                           // partition key
//                Optional.empty()                            // sameSite mode
//            ));
       

        }




        // STEP 4️⃣: Open login page (it should automatically redirect to the home page)
        driver.get("https://risk-strategies--retailqa.my.salesforce.com");
        System.out.println("✅ Session restored. You should be logged in.");

        Thread.sleep(10000);
        driver.quit();
    }
}

