package com.ca1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class Task2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","c://Drivers//chromedriver.exe" );
		ChromeOptions co=new ChromeOptions();
		co.addArguments ("--remote-allow-origins=*");
		//WebDriverManager.chromedriver().setup ();
		WebDriver driver=new ChromeDriver(co);
		driver.get ("https://www.amazon.in/");
		driver.manage().window().maximize() ;
		String currentTitle=driver.getTitle();
		System.out.println(currentTitle);
		String expectedTitle="Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		if(currentTitle.equals(expectedTitle)) {
			System.out.println("Title Matched");
		}
		else {
			System.out.println("Title not Matched");
		}
		WebElement txtBoxl=driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));
		txtBoxl.sendKeys("playstation");
		driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
		
		
		String txt1=driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[2]/div/div/div/div/div/div[2]/div/div/div[1]/h2")).getText();
		System.out.println(txt1);
		String txt2=driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span")).getText();
		System.out.println(txt2);
		String txt3=driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[4]/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span")).getText();
		System.out.println(txt3);
		String txt4=driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[5]/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span")).getText();
		System.out.println(txt4);
		String txt5=driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[6]/div/div/div/div/div/div[2]/div/div/div[1]/h2")).getText();
		System.out.println(txt5);
	
		driver.findElement(By.xpath("//*[@id=\"n/20904637031\"]/span/a/span")).click();
		driver.findElement(By.xpath("//*[@id=\"p_36/1741398031\"]/span/a/span")).click();
		

	}

}
