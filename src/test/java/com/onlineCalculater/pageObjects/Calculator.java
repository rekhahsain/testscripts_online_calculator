package com.onlineCalculater.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Calculator {
	WebDriver ldriver;
	public Calculator(WebDriver rdriver){
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[4]/span[1]")
	@CacheLookup
	WebElement btnZero;
	
	@FindBy(xpath="//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[3]/span[1]")
	@CacheLookup
	WebElement btnOne;
	
	@FindBy(xpath="//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[3]/span[2]")
	@CacheLookup
	WebElement btnTwo;
	
	@FindBy(xpath="//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[3]/span[3]")
	@CacheLookup
	WebElement btnThree;
	
	@FindBy(xpath="//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[2]/span[1]")
	@CacheLookup
	WebElement btnFour;
	
	@FindBy(xpath="//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[2]/span[2]")
	@CacheLookup
	WebElement btnFive;
	
	@FindBy(xpath="//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[2]/span[3]")
	@CacheLookup
	WebElement btnSix;
	
	@FindBy(xpath="//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[1]/span[1]")
	@CacheLookup
	WebElement btnSeven;
	
	@FindBy(xpath="//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[1]/span[2]")
	@CacheLookup
	WebElement btnEight;
	
	@FindBy(xpath="//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[1]/span[3]")
	@CacheLookup
	WebElement btnNine;
	
	@FindBy(xpath="//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[1]/span[4]")
	@CacheLookup
	WebElement btnAdd;
	
	@FindBy(xpath="//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[2]/span[4]")
	@CacheLookup
	WebElement btnSub;
	
	@FindBy(xpath="//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[3]/span[4]")
	@CacheLookup
	WebElement btnMulti;
	
	@FindBy(xpath="//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[4]/span[4]")
	@CacheLookup
	WebElement btnDiv;
	
	@FindBy(xpath="//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[5]/span[4]")
	@CacheLookup
	WebElement btnEqual;
	
	@FindBy(xpath="//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[1]/span[5]")
	@CacheLookup
	WebElement btnBack;
	

	@FindBy(id="sciOutPut")
	@CacheLookup
	WebElement outputBox;
	
	
//	public void setUserName(String uname) {
//		txtUserName.sendKeys(uname);
//	}
//	public void setPassword(String pwd) {
//		txtPassword.sendKeys(pwd);
//	}
	public void clickZero() {
		btnZero.click();
	}
	
	public void clickOne() {
		btnOne.click();
	}
	
	public void clickTwo() {
		btnTwo.click();
	}
	
	public void clickThree() {
		btnThree.click();
	}
	
	public void clickFour() {
		btnFour.click();
	}
	
	public void clickFive() {
		btnFive.click();
	}
	
	public void clickSix() {
		btnSix.click();
	}
	
	public void clickSeven() {
		btnSeven.click();
	}
	
	public void clickEight() {
		btnEight.click();
	}
	
	public void clickNine() {
		btnNine.click();
	}
	
	public void clickEqual() {
		btnEqual.click();
	}
	
	public void clickAdd() {
		btnAdd.click();
	}
	
	public void clickSub() {
		btnSub.click();
	}
	
	public void clickMulti() {
		btnMulti.click();
	}
	
	public void clickDiv() {
		btnDiv.click();
	}
	
	public void clickBack() {
		btnBack.click();
	}
	
	public String getResult() {
		return outputBox.getText();
	}
	
	
	
	
	
}
