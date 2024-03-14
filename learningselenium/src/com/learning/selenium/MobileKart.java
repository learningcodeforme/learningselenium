package com.learning.selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MobileKart {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://rahulshettyacademy.com/loginpagePractise/#/");
		signIn(driver, w);
		checkOut(driver, w);

	}

	public static void signIn(WebDriver driver, WebDriverWait w) throws InterruptedException {

		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("password")).sendKeys("learning");
		driver.findElement(By.xpath("//input[@value='user']")).click();

		w = new WebDriverWait(driver, Duration.ofSeconds(10));
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".btn.btn-success")));
		driver.findElement(By.cssSelector(".btn.btn-success")).click();

		Select dropdown = new Select(driver.findElement(By.cssSelector("select[data-style='btn-info']")));
		dropdown.selectByVisibleText("Consultant");
		driver.findElement(By.id("terms")).click();
		driver.findElement(By.id("signInBtn")).click();

	}

	private static void checkOut(WebDriver driver, WebDriverWait w) {
		// TODO Auto-generated method stub

		// when we signIn button click and directly when we look for add button it load
		// only 1 element
		// w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".btn.btn-info")));
		// so we need to look for other element that is appearing in explicit wait
		// condition so out "Add Button" appear
		// for all element then we procedd for add to cart button

		// looking for shop name locator
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("h1.my-4")));
		// so we get time all Add button( .btn.btn-info) to be loaded in the page
		List<WebElement> products = driver.findElements(By.cssSelector(".btn.btn-info"));

		System.out.println(products.size());

		for (int i = 0; i < products.size(); i++) {
			driver.findElements(By.xpath("//button[@class='btn btn-info']")).get(i).click();

		}
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='nav-link btn btn-primary']")));
		driver.findElement(By.xpath("//a[@class='nav-link btn btn-primary']")).click();

		driver.findElement(By.cssSelector(".btn.btn-success")).click();

		driver.findElement(By.id("country")).sendKeys("India");

		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".suggestions")));
		driver.findElement(By.cssSelector(".suggestions")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".checkbox.checkbox-primary")));
		driver.findElement(By.cssSelector(".checkbox.checkbox-primary")).click();

		driver.findElement(By.cssSelector(".btn.btn-success.btn-lg")).click();
		driver.quit();

	}

}
