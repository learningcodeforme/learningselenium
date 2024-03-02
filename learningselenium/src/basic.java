import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class basic {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Hello world");

		WebDriver driver = new ChromeDriver();
		// wait in selenium -->
		// it is globally appliacable for entire webpage
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		// WebDriver driver= new FirefoxDriver();
		// WebDriver driver = new EdgeDriver();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		// it will close current window
		// driver.close();
		// it will close all assoicate window
		// driver.quit();
		// locator learning
		
		driver.findElement(By.id("inputUsername")).sendKeys(" rahulshettyacademy420");
		// driver.findElement(By.name("password")).sendKeys("xyz");
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("1233434343535345");
		driver.findElement(By.className("signInBtn")).click();
		Thread.sleep(5000);
		//driver.findElement(By.cssSelector("div.alert"));
		System.out.println("Alert text -- > "+ driver.findElement(By.cssSelector("p.error")).getText());
		 driver.quit();

		// selenium support following locator
		// id
		// name
		// classname - if class name sperated by space it mean two name and we can use
		// any one of that
		// xpath
		// css
		// Tag name
		// link text
		// partial link text

		// ****** understanding tag in html*********************

		// <input type="text" name="username" id="username" class="form-control">
		// input is tag name
		// type/name/id/ class are attibutes
		// "text"/ "username"/"form-control is attribute value//

		// css selector
		// class name -> tagname.classname
		// id-> tagname#id

		// css example for class name, id and using tagname
		// <input type="password" name="password" id="password" class="form-control"
		// xpath="1">

		// 1. using class in css---> tagname.classname
		// input.form-control

		// 2/using id in css ------> tagname#id
		// input#password

		// 3. tagame[attribute='value']
		// input[type='password']

		// wait in selenium
		// implict and explict wait
		// implict wait apply on every element in the webpage
		 // we can verify the css what we written using selectorhub it is external plugin 
		 // we can verify using developer tool console 
		 // example - > $('css of locator')
		 //$('p.error')
		 //

	}

}
