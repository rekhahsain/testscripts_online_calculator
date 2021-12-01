package com.onlineCalculater.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.onlineCalculater.pageObjects.Calculator;

public class TC_Cal_Sub extends BaseClass{
	
	@Test
	public void CalSubTest() throws InterruptedException {
			
			logger.info("Url is opened");
			Calculator calc = new Calculator(driver);
			
			calc.clickTwo();
			calc.clickThree();
			calc.clickFour();
			calc.clickEight();
			calc.clickTwo();
			calc.clickThree();
			
			
			logger.info("Entered number 234823");
			calc.clickSub();
			logger.info("clicked Sub symbol");
			calc.clickSub();
			calc.clickTwo();
			calc.clickThree();
			calc.clickZero();
			calc.clickNine();
			calc.clickFour();
			calc.clickEight();
			calc.clickTwo();
			calc.clickThree();
			logger.info("Entered number -23094823");
			calc.clickEqual();
			Thread.sleep(1000);
			String actualResult = calc.getResult();
			Assert.assertEquals(actualResult.trim(), "23329646".toString());
	//		if(calc.getResult().toString() == ){
	//			Assert.assertTrue(true);
	//			logger.info(" TC_Cal_Add success");
	//		} else {
	//			Assert.assertTrue(false);
	//			logger.warn("TC_Cal_Add failed");
	//		}
		}
	

}
