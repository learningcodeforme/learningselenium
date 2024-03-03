import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class updatedDropdow {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(3000);
		
		System.out.println("Before selection number of Adult passangers --> "+driver.findElement(By.id("divpaxinfo")).getText());
		int i=1;
		while(i<5) {
		driver.findElement(By.id("hrefIncAdt")).click();
		i++;
		}
		
		driver.findElement(By.id("btnclosepaxoption")).click();
		
		System.out.println("After  selection number of Adult passangers --> "+driver.findElement(By.id("divpaxinfo")).getText());
		
	}

}

