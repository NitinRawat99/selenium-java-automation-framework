package testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BaseTest;
import utilities.ReadXLSdata;

public class MyFirstTestFW extends BaseTest
{

	
	@Test(dataProviderClass=ReadXLSdata.class,dataProvider="testData")
	public static void search(String username) throws InterruptedException 
	{
		System.out.println("clicked successfully");
		System.out.println("value  "+username);
		driver.findElement(By.xpath(loc.getProperty("txt_field"))).sendKeys(username);
		//Thread.sleep(5000);
	//	driver.findElement(By.xpath(loc.getProperty("searchButton"))).click();
		
	}
	
	@Test
	public static void VerifyGmail()
	{
	String txt1=	driver.findElement(By.xpath("//a[text()='Gmail']")).getText();
	Assert.assertEquals(txt1,"Gmail");
	System.out.println("Is it verified");
	}
	
	@Test
	public void ButtonText1()
	{
	//	driver.switchTo().frame(0);
	String txt1 =	driver.findElement(By.xpath(loc.getProperty("GoogleButtonText"))).getAttribute("value");
	Assert.assertEquals(txt1,"Google Search");
	}
	
	@Test
	public void ButtonText2()
	{
		String txt2 = driver.findElement(By.xpath(loc.getProperty("IamFeelingLuckyButton"))).getAttribute("value");
		Assert.assertEquals(txt2,"I'm Feeling Lucky");
	}
	
	@Test
	public void TextBox()
	{
		Point p=driver.findElement(By.xpath(loc.getProperty("txtboxarea"))).getLocation();
		System.out.println(p.getX()+"  "+p.getY());
	}
	
	@Test
	public void ImagesTxt()
	{
	String ImagesTxt=	driver.findElement(By.xpath(loc.getProperty("ImagesTxt"))).getText();
	
	Assert.assertEquals(ImagesTxt,"Images");
	}
//	@DataProvider(name="testdata")
//	public Object[][] tData()
//	{
//		return new Object[][]
//				{
//			{"hello world",""},
//			{"hello world1",""},
//			{"hello world2",""}
//				};
//	}

}
