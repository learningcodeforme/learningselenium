import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class basic {

	public static void main(String[] args) {
		System.out.println("Hello world");
		
		 WebDriver driver= new ChromeDriver();
			// WebDriver driver= new FirefoxDriver();
			//WebDriver driver = new EdgeDriver();
			driver.get("https://rahulshettyacademy.com/loginpagePractise/");
			System.out.println(driver.getTitle());
			System.out.println(driver.getCurrentUrl());
			// it will close current window
			// driver.close();
			// it will close all assoicate window
			// driver.quit();
			// locator learning
			driver.findElement(By.id("username")).sendKeys(" rahulshettyacademy420");
			driver.findElement(By.name("password")).sendKeys("xyz");
			driver.findElement(By.className("btn-info")).click();
//			locator
			// id
			// name
			//classname
			// xpath
			// css
			// link text
					// partial link text
					
					// css  selector
				//	class name -> tagname.classname
				//	id-> tagname#id
			//

	}

}
