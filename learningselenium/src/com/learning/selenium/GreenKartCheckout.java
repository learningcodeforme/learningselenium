package com.learning.selenium;

import java.util.Arrays;
import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;




public class GreenKartCheckout {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
	// Implict wait 
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	// explict wait
		// we need to create object of webDriverWait and pass diver on which we want to implment and duration of time) 
	    WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));
	    
		
		
		String[] itemNames = { "Brocolli", "Beetroot", "Brinjal" };
		addItem(driver, itemNames);
		checkOut(driver,w);

	}

	private static void checkOut(WebDriver driver, WebDriverWait w) throws InterruptedException {
		driver.findElement(By.cssSelector("a.cart-icon")).click();
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
	
		//call until method of WebDriverWait 
		//ExpectedConditions-> what expected condition which we can to call
		//visibilityOfElementLocated--> wait until specfic webelement appear
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".promoCode")));
		driver.findElement(By.cssSelector(".promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector(".promoBtn")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".promoInfo")));
		System.out.println(driver.findElement(By.cssSelector(".promoInfo")).getText());
		

	}

	public static void addItem(WebDriver driver, String[] itemNames) {

		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));

		List<String> itemNeedList = Arrays.asList(itemNames);
		int itemNumber = itemNeedList.size();
		int counter = 0;

		for (int i = 0; i <= products.size(); i++) {
			String[] name = products.get(i).getText().split("-");
			String actualName = name[0].trim();

			if (itemNeedList.contains(actualName)) {
				counter++;
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();

				if (counter == itemNumber)
					break;
			}

		}
	}

}
