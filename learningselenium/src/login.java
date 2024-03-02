import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class login {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		String name = "Nitesh";

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://rahulshettyacademy.com/locatorspractice/");

		driver.findElement(By.linkText("Forgot your password?")).click();

		Thread.sleep(2000);

		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();

		String passwordText = driver.findElement(By.cssSelector("form p")).getText();

		String password = getPassword(passwordText);

		// going back to login page

		driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();

		Thread.sleep(2000);

		// enter the username
		driver.findElement(By.id("inputUsername")).sendKeys(name);

		//enter the grabed password
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys(password);

		//Thread.sleep(2000);

		driver.findElement(By.className("signInBtn")).click();

		Thread.sleep(2000);

		System.out.println(driver.findElement(By.tagName("p")).getText());

		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.",
				"Text Not Match");

		Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(),
				"Hello " + name + ",", "Name not match");

		driver.findElement(By.xpath("//button[text()='Log Out']")).click();

		driver.quit();

	}

	public static String getPassword(String passwordText) throws InterruptedException {

		String[] passwordArray = passwordText.split("'");

		String password = passwordArray[1].split("'")[0];

		return password;

	}

}
