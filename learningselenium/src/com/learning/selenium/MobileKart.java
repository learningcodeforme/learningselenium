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
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://rahulshettyacademy.com/loginpagePractise/#/");
		
		signIn(driver);
		
	}
	
	public static void signIn(WebDriver driver) throws InterruptedException {
		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("password")).sendKeys("learning");
		driver.findElement(By.xpath("//input[@value='user']")).click();
		
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".btn.btn-success")));
		driver.findElement(By.cssSelector(".btn.btn-success")).click();
		
		Select dropdown = new Select(driver.findElement(By.cssSelector("select[data-style='btn-info']")));
		dropdown.selectByVisibleText("Consultant");
		driver.findElement(By.id("terms")).click();
		driver.findElement(By.id("signInBtn")).click();
		
		
		Thread.sleep(5000);
		
		//w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".btn.btn-info")));
		List<WebElement> products = driver.findElements(By.cssSelector(".btn.btn-info"));
		
		System.out.println(products.size());
		
	   for(int i=0;i<products.size();i++){
		driver.findElements(By.xpath("//button[@class='btn btn-info']")).get(i).click();
		
	}
		
	   Thread.sleep(5000);
	   driver.findElement(By.xpath("//a[@class='nav-link btn btn-primary']")).click();
	}
 
}
