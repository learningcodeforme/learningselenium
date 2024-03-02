import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class basic {

	/**
	 * @param args
	 * @throws InterruptedException
	 */
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

		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("1233434343535345");

		driver.findElement(By.className("signInBtn")).click();

		System.out.println("Alert text -- > " + driver.findElement(By.cssSelector("p.error")).getText());

		driver.findElement(By.linkText("Forgot your password?")).click();

		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("enter by xpath");

		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("enter by css");

		// Phone number
		// parent child traversing using xpath
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("parent child xpath");

		// click on reset button
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();

		// grab the text messasge using parent child concept using css
		System.out.println(driver.findElement(By.cssSelector("form p")).getText());

		// going back to login page using css


		
		driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
		
		Thread.sleep(2000);

		// enter username using regular express in css
	
		driver.findElement(By.cssSelector("input[placeholder*='User']")).sendKeys("Nitesh");
		
		driver.findElement(By.cssSelector("input[placeholder*='Pass']")).sendKeys("rahulshettyacademy");
		Thread.sleep(2000);
		
		//selecting checkbox 
		driver.findElement(By.id("chkboxOne")).click();
		
		Thread.sleep(1000);
		
		// using regular express in xpath click sign button
		
		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
		
		Thread.sleep(5000);
	
		// using text() to find the locator(using text  appear ) 
		driver.findElement(By.xpath("//button[text()='Log Out']")).click();
		
		Thread.sleep(5000);
		
		driver.quit();
		

		
		
		
		
		

		// xpath with regular expression

		// css with regular expression

		// parent child travering using css

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
		// $('p.error')
		//

		// Link Text
		// a - > anchor tag
		// 1. driver.findElement(By.linkText("text of link that appear"))

		// xpath
		// //tagname[@attibute='value']

		// css
		// tagname[attribute="value"]

		// we can verify the xpath using developer tool console using $x('xpath')
		// $x('//input[@placeholder="Phone Number"]')

		// index in xpath and css

		// xpath using index in form of array
		// driver.findElement(By.xpath("//input[@type='Text']"))[1]

		// Example --> //input[@type='text'][3]

		// in css it uses :nth-child(3)
		// driver.findElement(By.css("input[type='Text']")):nth-child(3)

		// example--> input[type='text']:nth-child(4)

		// another way to write css and xpath
		// Parent child traversing parent to child

		// examples-- > //form/input[3]
		// //div[@class='forgot-pwd-btn-conainer']/button[1] --> here we user parent full xpath and child we use tagname
		// only with index
		/*
		 * //parenttagename/childtagename( syntax) use double // for before parent and
		 * single / before child we can provide index if multiple child are available
		 * 
		 * 
		 * in case of css
		 * 
		 * syntax - patent ( space) child form p where --> form is parent and p is child
		 */

		// Regular expression in css 
		// Example -> "input[placeholder*='User']"   using asterik after arrtibute name
		
		// Regular expression in xpath
		//Example -->    button[contains(@class,'submit')]  --> using contians key words 
		
		//search the locator with text using text()
		
		//text()
		 // it is applicable only for xpath in css we cannot use text()
		// //button[text()="Log Out"]
		
		
		
	}

}
