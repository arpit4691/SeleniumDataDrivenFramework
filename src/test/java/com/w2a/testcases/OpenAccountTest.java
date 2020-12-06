package com.w2a.testcases;

import java.util.Hashtable;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

import com.w2a.base.TestBase;
import com.w2a.utilities.TestUtil;

public class OpenAccountTest extends TestBase {

	@Test(dataProviderClass = TestUtil.class, dataProvider = "dp")
	public void openAccountTest(Hashtable<String,String> data) throws InterruptedException {
		
		if(!(TestUtil.isTestRunnable("openAccountTest", excel))){
			
			throw new SkipException("Skipping the test "+"openAccountTest".toUpperCase()+ "as the Run mode is NO");
		}
		
		
//		click("openaccount_CSS");
//		select("customer_CSS", data.get("customer"));
//		select("currency_CSS", data.get("currency"));
//		click("process_CSS");
//		Thread.sleep(2000);
//		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
//		alert.accept();

		
//		click("addbutton_Cal_Xpath");
		driver.findElement(By.xpath("//input[@placeholder='Enter First Name.']")).sendKeys(data.get("firstname"));
		System.out.println("FirstName "+data.get("firstname"));
		driver.findElement(By.xpath("//input[@placeholder='Enter your last name']")).sendKeys(data.get("lastname"));
		driver.findElement(By.xpath("//input[@placeholder='Enter email address']")).sendKeys(data.get("emailaddress"));
//		driver.findElement(By.xpath("//input[@id='__BVID__28_BV_option_0']")).click(); //Fuels Checkbox
		driver.findElement(By.xpath("//div[@id='caltex-forms']//form[@method='POST']/div[4]/div[7]/div/div[@role='group']/div[1]/label[@class='custom-control-label']")).click();
//		driver.findElement(By.xpath("//input[@id='__BVID__23']")).click();//TnC checkbox
//		driver.findElement(By.xpath("//body/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/form[1]/div[4]/div[12]/div[1]/div[1]/label[1]")).click();
		driver.findElement(By.xpath("//input[@placeholder='Enter contact number']")).sendKeys(data.get("contactnumber"));
//		driver.findElement(By.xpath("//input[@placeholder='Area code']")).sendKeys(data.get("areacode"));
//		driver.findElement(By.xpath("//input[@placeholder='Enter phone number']")).sendKeys(data.get("phonenumber"));
		driver.findElement(By.xpath("//input[@placeholder='Enter Loyalt Card Number']")).sendKeys(data.get("loyaltycardnumber"));
		
		driver.findElement(By.xpath("//div[@id='caltex-forms']//form[@method='POST']//div[@name='radioButtonField']/fieldset[@class='form-group']/div[@role='group']/div[1]/label[@class='custom-control-label']")).click();
		driver.findElement(By.xpath("//button[@class='cta-button btn btn-primary caltex-forms-submit']")).click();
//		Thread.sleep(2000);
		
		String FormSubmissionOutput=driver.findElement(By.xpath("//div[@class='success-message caltex-forms-success-message']/h1")).getText();
		if(FormSubmissionOutput.equalsIgnoreCase("Form submit is a success.")) {
			System.out.println("Form Submitted SuccessFully ");
		}else {
			System.out.println("Form Submission failed");
		}
		
//		Thread.sleep(5000);
		driver.get("http://caltex.vmlyrconnect.asia/content/caltex/my/en/business-solutions/forms-test2.html");
//		type("firstname_Cal_XPath",data.get("firstname"));
		
//		type("lastname_Cal_Xpath",data.get("lastname"));
		
//		type("postcode_CSS",data.get("postcode"));
//		click("addbtn_CSS");
		
//		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
//		
//		Assert.assertTrue(alert.getText().contains(data.get("alerttext")));
//		alert.accept();
//		
//		Thread.sleep(2000);
		
	}

}
