import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class staticDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

		// learning dropdown
		// type of dropdown
		// 1 Static - option are static
		// 2. dynamic - option are dynamic
		// in selenium we have class called "select class" to handle dropdown

		WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		// we have to create object of Select class and need to provide the address of
		// webelement of dropdown
		Select dropdown = new Select(staticDropdown);

		// Note --> if select tag is present in dom then all below method will work
		// getFirstSelectedOption - return the first selected option in drop

		dropdown.selectByIndex(3);
		System.out.println("Option selected based on the index - > " + dropdown.getFirstSelectedOption().getText());
         Thread.sleep(3000);
         
		dropdown.selectByVisibleText("AED");
		System.out.println("Option selected based on visible text - > " + dropdown.getFirstSelectedOption().getText());
		Thread.sleep(3000);

		dropdown.selectByValue("INR");
		System.out.println("Option selected based on the value - > " + dropdown.getFirstSelectedOption().getText());
		
		driver.findElement(By.id("")).click();
		Thread.sleep(2000);

	}

}
