package com.automation.modules;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.automation.objectrepository.Locators;
import com.automation.utility.GlobalFunctions;
import com.automation.utility.ReporterManager;
import com.relevantcodes.extentreports.LogStatus;

public class Login extends ReporterManager {
  @Test
  public void tc01() throws Exception {
	 test=extent.startTest( "Sample Program Through Framework");
		driver=	GlobalFunctions.launchBrowser(driver);
		driver = GlobalFunctions.openUrl(driver,"url");
		//test.log(LogStatus.INFO, "Browser Launched Sucessfully");
		//driver.findElement(By.name("userName")).sendKeys("tutorial");
		GlobalFunctions.enterText(driver, Locators.username, "tutorial");
		GlobalFunctions.sendkeys(driver, Locators.password, "tutorial");
		GlobalFunctions.click(driver, Locators.signinbtn);
		GlobalFunctions.waitForPageToLoad(driver);
		System.out.println(driver.getTitle());
		GlobalFunctions.close(driver);
  }
  
  @Test
  public void tc02() throws Exception {
	 test=extent.startTest( "Sample Program Through Framework");
		driver=	GlobalFunctions.launchBrowser(driver);
		driver = GlobalFunctions.openUrl(driver,"url");
		//test.log(LogStatus.INFO, "Browser Launched Sucessfully");
		//driver.findElement(By.name("userName")).sendKeys("tutorial");
		GlobalFunctions.enterText(driver, Locators.username, "tutorial");
		GlobalFunctions.sendkeys(driver, Locators.password, "tutorial");
		GlobalFunctions.click(driver, Locators.signinbtn);
		test.log(LogStatus.INFO, "Clicked signin button successfully");
		GlobalFunctions.waitForPageToLoad(driver);
		test.log(LogStatus.WARNING, "xxxx");
		System.out.println(driver.getTitle());
		test.log(LogStatus.WARNING, "Title is not as expected");
		GlobalFunctions.close(driver);
}
  
  @Test
  public void tc03() throws Exception {
	 test=extent.startTest( "Sample Program Through Framework");
		driver=	GlobalFunctions.launchBrowser(driver);
		driver = GlobalFunctions.openUrl(driver,"url");
		//test.log(LogStatus.INFO, "Browser Launched Sucessfully");
		//driver.findElement(By.name("userName")).sendKeys("tutorial");
		GlobalFunctions.enterText(driver, Locators.username, "tutorial");
		GlobalFunctions.sendkeys(driver, Locators.password, "tutorial");
		GlobalFunctions.click(driver, Locators.signinbtnn);
		GlobalFunctions.waitForPageToLoad(driver);
		System.out.println(driver.getTitle());
		GlobalFunctions.close(driver);
}
  
}