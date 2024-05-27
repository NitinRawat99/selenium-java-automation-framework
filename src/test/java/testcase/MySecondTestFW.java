package testcase;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;

public class MySecondTestFW  extends BaseTest
{
	
	@Test
	public void AddressLine1()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	String txt2 = 	driver.findElement(By.xpath(loc.getProperty("AddressLine1"))).getText();
	Assert.assertEquals(txt2,"Delivering to Toronto M6N");
	}
	
	@Test
	public void selectDropDown()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));

		driver.manage().window().maximize();
		WebElement dropdwnlst=driver.findElement(By.xpath(loc.getProperty("dropdownlst")));
		Select select = new Select(dropdwnlst);
		select.selectByIndex(10);
		WebElement txt = select.getFirstSelectedOption();
		Assert.assertEquals(txt.getText(),"Clothing, Shoes & Jewellery");
		
	}
	
	@Test
	public void txtBoxSize()
	{
		//System.out.println(driver.findElement(By.xpath()).getAttribute("placeholder"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));

		driver.manage().window().maximize();
		
		Dimension d = driver.findElement(By.xpath(loc.getProperty("itemsearchbar"))).getSize();
		
		System.out.println(d.getHeight()+"  "+d.getWidth());
		

			
	}

}
