package com.test.testng.orangeHrm;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

//Initializing variables or properties
//Author -- Vasanth K

public class Base {

	public static WebDriver driver;
	public static WebDriverWait wait;
	public static String destFile;
	public static Properties prop = new Properties();
	public String propertyPath = "C:\\Users\\Vasant\\eclipse-workspace\\testng.orangeHrm\\src\\test\\java\\ReadingPropertyFile\\TestData.properties";
	public FileReader read;
	public static Date d;

	public Base() {
		try {
			read = new FileReader(propertyPath);
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} // Reading property file

		try {
			prop.load(read);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // loading property file
	}

	public static void initialization() {
		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		wait = new WebDriverWait(driver, 10);
		System.out.println("Create Browser Obj");
		driver.get(prop.getProperty("URL"));
		driver.manage().window().maximize();

	}

}
