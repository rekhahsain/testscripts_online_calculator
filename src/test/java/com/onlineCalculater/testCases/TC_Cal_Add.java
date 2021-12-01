package com.onlineCalculater.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.onlineCalculater.pageObjects.Calculator;

public class TC_Cal_Add extends BaseClass {
	@Test
	public void CalAddTest() throws InterruptedException {
		
		logger.info("Url is opened");
		Calculator calc = new Calculator(driver);
		calc.clickSub();
		calc.clickTwo();
		calc.clickThree();
		calc.clickFour();
		calc.clickTwo();
		calc.clickThree();
		calc.clickFour();
		
		logger.info("Entered number -234234");
		calc.clickAdd();
		logger.info("clicked Add symbol");
		calc.clickThree();
		calc.clickFour();
		calc.clickFive();
		calc.clickThree();
		calc.clickFour();
		calc.clickFive();
		logger.info("Entered number 345345");
		calc.clickEqual();
		Thread.sleep(1000);
		String actualResult = calc.getResult();
		Assert.assertEquals(actualResult.trim(), "111111".toString());
//		if(calc.getResult().toString() == ){
//			Assert.assertTrue(true);
//			logger.info(" TC_Cal_Add success");
//		} else {
//			Assert.assertTrue(false);
//			logger.warn("TC_Cal_Add failed");
//		}
	}
}
