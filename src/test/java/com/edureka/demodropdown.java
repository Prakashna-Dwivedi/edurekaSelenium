package com.edureka;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class demodropdown {

	//xpath=//li[starts-with(text(),'Nikhil')]//span
	
	static WebDriver driver;
	@Test(priority=0)
	public void test1() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
	      driver=new ChromeDriver();
	      //driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	      driver.manage().window().maximize();
		driver.get("https://www.edureka.co/");
}
}
