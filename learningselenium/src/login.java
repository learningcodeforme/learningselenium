import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class login {


	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://rahulshettyacademy.com/locatorspractice/");

		driver.findElement(By.id("inputUsername")).sendKeys(" Nitesh");

		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("rahulshettyacademy");

		driver.findElement(By.className("signInBtn")).click();
		
		System.out.println("Getting Text");
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.tagName("p")).getText());
		
		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.","Text Not Match");
   
		driver.quit();
		

	}

}
