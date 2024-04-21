import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");

//we need to create action object and pass driver as arrgument to apply action class method on driver instance
// we need to add .build().perform() to perform action in action class method
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.cssSelector("#nav-link-accountList-nav-line-1"))).build().perform();

	}
}
