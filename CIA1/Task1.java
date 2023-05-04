package com.ca1;

import org.openqa.selenium.By;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Task1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","c://Drivers//chromedriver.exe" );
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origin=*");
		WebDriver driver=new ChromeDriver(co);
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize() ;
		//WebElement signin=driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]"));
		//signin.click();
		//WebElement Login=driver.findElement(By.xpath("//*[@id=\"nav-flyout-ya-signin\"]/a/span"));
		//Login.click();
		//WebElement Username=driver.findElement(By.xpath("//*[@id=\"user-name\"]"));
		//Username.sendKeys("+919342721791");
		//WebElement Password=driver.findElement(By.xpath("//*[@id=\"password\"]"));
		//Password.sendKeys("secret_sauce");
		driver.get ("https://www.amazon.in/Sony-PS5-PlayStation-Console/dp/B0BRCP72X8/ref=sr_1_1?crid=KR4GF43YG3I3&keywords=ps5&qid=1683189996&sprefix=ps%2Caps%2C409&sr=8-1");
		String currentTitle=driver.getTitle();
		System.out.println(currentTitle);
		String expectedTitle="Sony PS5 PlayStation Console : Amazon.in: Video Games";
		if(currentTitle.equals(expectedTitle)) {
			System.out.println("Title Matched");
		}
		else {
			System.out.println("Title not Matched");
		}
		driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"nav-cart\"]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"a-autoid-0-announce\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"quantity_4\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"sc-buy-box-ptc-button\"]/span/input")).click();
		
		

		Thread.sleep(5000);

	}


	}
	


