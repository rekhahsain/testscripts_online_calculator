package com.onlineCalculater.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.onlineCalculater.pageObjects.Calculator;

public class TC_Cal_Multi extends BaseClass{
	

	@Test
	public void CalMultiTest() throws InterruptedException {
			
			logger.info("Url is opened");
			Calculator calc = new Calculator(driver);
			
			
			
			calc.clickFour();
			calc.clickTwo();
			calc.clickThree();
			logger.info("Entered number 423");
			calc.clickMulti();
			logger.info("clicked Multi symbol");
			calc.clickFive();
			calc.clickTwo();
			calc.clickFive();
			
			logger.info("Entered number 525");
			calc.clickEqual();
			Thread.sleep(1000);
			String actualResult = calc.getResult();
			Assert.assertEquals(actualResult.trim(), "222075".toString());
	//		if(calc.getResult().toString() == ){
	//			Assert.assertTrue(true);
	//			logger.info(" TC_Cal_Add success");
	//		} else {
	//			Assert.assertTrue(false);
	//			logger.warn("TC_Cal_Add failed");
	//		}
		}
	


}
