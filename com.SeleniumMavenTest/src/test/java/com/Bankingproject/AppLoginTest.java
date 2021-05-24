package com.Bankingproject;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.Project.Utilities.AppBrowser;

import app.Objects.LoginPageObjects;

public class AppLoginTest 
public static WebDriver driver;
public static Datareader reader;
{
   
@BeforeSuite
 public void launchBrowser() {
	
}
	
	System.out.println("TestNG Test");
	
}
    @Test
    public void shouldAnswerWithTrue()
    {
    	
    	LoginPageObjects loginpage = new LoginPageObjects(driver);
    	Loginpage.verifyusername("qatrainer");
    	LoginPage.verfypassword("admin");
    	Loginpage.verifyloginbutton();
    @AfterTest
    public void closebrowser() {
    	
    	AppBrowser.closebrowser();
    	
    	 }
}
