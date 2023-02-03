package com.edureka;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingAllControls {
      
	static WebDriver driver;
	@Test(priority=0)
	public void edurekaProfile() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
	      driver=new ChromeDriver();
	      //driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	      driver.manage().window().maximize();
		driver.get("https://www.edureka.co/");
		
		Thread.sleep(2000);
       driver.findElement(By.xpath("/html/body/header/nav/ul/li[4]/span")).click();
       Thread.sleep(1000);
       
         Actions action=new Actions(driver);
     action.moveToElement(driver.findElement(By.id("si_popup_email")));
       action.click();
       action.sendKeys("dwivediprakashna@gmail.com");
       Thread.sleep(2000);
     action.build().perform();
     
     action.moveToElement(driver.findElement(By.id("si_popup_passwd")));
     action.click();
     action.sendKeys("Prakashna@123");
     Thread.sleep(2000);
   action.build().perform();
   
   action.moveToElement(driver.findElement(By.xpath("//button[@class=\"clik_btn_log btn-block\"]")));
   Thread.sleep(2000);
   action.click();
   action.build().perform();
   
   Thread.sleep(2000);
   driver.findElement(By.xpath("//img[@class='img30']")).click();
   Thread.sleep(2000);
   driver.findElement(By.xpath("/html/body/header/nav/div[4]/ul/li[6]/ul/li[4]/a")).click();
   
   String pageTitle=driver.getTitle();
   
   driver.findElement(By.xpath("//*[@id=\"personal_details\"]/i")).click();
   Thread.sleep(3000);
   
  // driver.findElement(By.xpath("//input[@class='form-control ng-dirty ng-invalid ng-touched']")).sendKeys("Prakashna");
   //Thread.sleep(2000);
  /*driver.findElement(By.xpath("//mat-tab-body/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/ngx-select-dropdown[1]/div[1]/button[1]/span[1]")).click();
 Thread.sleep(2000);
 driver.findElement(By.xpath("//li[contains(text(),'2-4 years')]")).click();*/
// Thread.sleep(2000);
 /*Select drp_Sector=new Select(driver.findElement(By.cssSelector("body.autofoot.banner_class_body:nth-child(2) section.onboarding-p2.step-1:nth-child(2) div.container mat-tab-group.mat-tab-group.mat-primary.mat_tab_bx_view div.mat-tab-body-wrapper mat-tab-body.mat-tab-body.ng-tns-c10-0.mat-tab-body-active:nth-child(1) div.mat-tab-body-content.ng-trigger.ng-trigger-translateTab div.stepper-section div.step-item div.step-content div.step-content-item:nth-child(1) div.form-group.ed-form-group.inline-form:nth-child(3) ngx-select-dropdown.ng-touched.ng-dirty.ng-valid div.ngx-dropdown-container button.ngx-dropdown-button > span.nsdicon-angle-down:nth-child(2)")));
   drp_Sector.selectByVisibleText("IT-Software / Software Services ");
   Thread.sleep(2000);
*/   
 //  driver.findElement(By.xpath("//input[@id='designation']")).sendKeys("testing");
   
   driver.findElement(By.xpath("//mat-tab-body/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/ngx-select-dropdown[1]/div[1]/button[1]/span[2]")).click();
  driver.findElement(By.xpath("//li[contains(text(),'10:00 AM')]")).click();
   Thread.sleep(2000);
   
   driver.findElement(By.xpath("//button[contains(text(),'Save and Continue')]")).click();
   Thread.sleep(1000);
	
   driver.navigate().to("https://learning.edureka.co/my-profile");
   Thread.sleep(2000);
   
   driver.findElement(By.xpath("//a[contains(text(),'Topics of Interest')]")).click();
   Thread.sleep(2000);
   driver.findElement(By.xpath("//button[contains(text(),'EDIT')]")).click();
   Thread.sleep(2000);
   
   /*driver.findElement(By.xpath("//label[contains(text(),'Big Data')]")).click();
   Thread.sleep(2000);*/
   driver.findElement(By.xpath("//button[contains(text(),'Save and Continue')]")).click();
   Thread.sleep(2000);
   
   driver.navigate().to("https://www.edureka.co/");
   Thread.sleep(2000);
   driver.findElement(By.xpath("/html/body/header/nav/div[4]/ul/li[6]/a/span[2]/img")).click();
   Thread.sleep(2000);
   driver.findElement(By.xpath("//a[contains(text(),'Log Out')]")).click();
   
   
	}
}

