package com.test.TC1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class BaseClass {
	static String url = "https://chromedriver.chromium.org/capabilities";
	WebDriver driver ;
	
///Tesing/DriverFile/geckodriver-v0.26.0-win64/geckodriver.exe
	/*
	 * public static void main(String[] args) { System.setProperty(
	 * "webdriver.gecko.driver","F:\\WORKSPACE FOR APPUIM\\Tesing\\DriverFile\\geckodriver-v0.26.0-win64\\geckodriver.exe"
	 * ); WebDriver driver =new FirefoxDriver();
	 * 
	 * //System.setProperty(
	 * "webdriver.gecko.driver","F:\\WORKSPACE FOR APPUIM\\Tesing\\DriverFile\\chromedriver_win32\\chromedriver.exe"
	 * );
	 * 
	 * //WebDriver driver = new ChromeDriver();
	 * 
	 * driver.get(url); }
	 */
	
	@Test
public void baseSetup() {
	
	System.setProperty("webdriver.gecko.driver","DriverFile\\geckodriver-v0.26.0-win64\\geckodriver.exe");
	 driver =new FirefoxDriver();
	 driver.get(url);
	 System.out.println("---------------the test DOne 12345679ffdjb--------------------------------------------");
	 driver.quit();
}

}
