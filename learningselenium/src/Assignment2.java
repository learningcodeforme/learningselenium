import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Assignment2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.findElement(By.xpath("(//div/input)[1]")).sendKeys("Vinayak");
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("vinayak@outlook.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("*********");
		driver.findElement(By.cssSelector("input[type='checkbox']")).click();
		driver.findElement(By.cssSelector("#exampleFormControlSelect1")).click();
		driver.findElement(By.xpath("//*[contains(text(),'Female')]")).click();
		driver.findElement(By.xpath("//label[@for='inlineRadio2']")).click();
		driver.findElement(By.cssSelector("input[type='date")).sendKeys("03-03-2024");
     	driver.findElement(By.cssSelector("input[value='Submit")).click();
		String msg = driver.findElement(By.cssSelector(".alert.alert-success.alert-dismissible")).getText();
		System.out.println(" Message on page- " + msg);
		driver.quit();

	}

}
