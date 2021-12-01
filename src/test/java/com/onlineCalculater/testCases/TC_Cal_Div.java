package com.onlineCalculater.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.onlineCalculater.pageObjects.Calculator;

public class TC_Cal_Div extends BaseClass{
	
	
		@Test
		public void CalDivTest() throws InterruptedException {
				
				logger.info("Url is opened");
				Calculator calc = new Calculator(driver);
				
				
				
				calc.clickFour();
				calc.clickZero();
				calc.clickZero();
				calc.clickZero();
				logger.info("Entered number 4000");
				calc.clickDiv();
				logger.info("clicked Div symbol");
				calc.clickTwo();
				calc.clickZero();
				calc.clickZero();
				
				logger.info("Entered number 200");
				calc.clickEqual();
				Thread.sleep(1000);
				String actualResult = calc.getResult();
				Assert.assertEquals(actualResult.trim(), "20".toString());
		//		if(calc.getResult().toString() == ){
		//			Assert.assertTrue(true);
		//			logger.info(" TC_Cal_Add success");
		//		} else {
		//			Assert.assertTrue(false);
		//			logger.warn("TC_Cal_Add failed");
		//		}
			}
		




}
