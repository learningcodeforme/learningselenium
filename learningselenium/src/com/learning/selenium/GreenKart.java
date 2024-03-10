package com.learning.selenium;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreenKart {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));

		String[] itemtNames = { "Brocolli", "Beetroot", "Brinjal" };
		List itemNeedList = Arrays.asList(itemtNames);
		int itemNumber = itemNeedList.size();
		int counter = 0;

		for (int i = 0; i <= products.size(); i++) {

			String[] name = products.get(i).getText().split("-");
			String actualName = name[0].trim();

			// format it to get actual vegitable name to exact to match  with arrayllist
			// check whether name of your extracted is present in array or not
			// covert array into arraylist for easy search

			if (itemNeedList.contains(actualName)) {
				counter++;
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();

				if (counter == itemNumber)
					break;
			}

//		 if(name.contains( itemtNames[i])) {

			/*
			 * if I use above code i got error as below Exception in thread "main"
			 * java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2
			 * at com.learning.selenium.GreenKart.main(GreenKart.java:26)
			 * 
			 * This is because we care using contains methods but it not support by array To
			 * avoid it we need to convert array to arraylist
			 * 
			 * one question come in mind why i cannot use arraylist when declaring the
			 * itemname .. array consume less memory as compared to arraylist so it
			 * adivisble to to declare array and the convert to arraylist
			 * 
			 * 
			 * 
			 */

		}
		Thread.sleep(6000);
		driver.quit();

	}

}
