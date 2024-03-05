import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class updatedDropdow {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		System.out.println("Senior Citizen Checkbox is checked -"+driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).isSelected());
		Assert.assertFalse(driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).isSelected());
		driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).click();
		System.out.println("Senior Citizen Checkbox is checked -"+driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).isSelected());
		Assert.assertTrue(driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).isSelected());
		System.out.println("Number of the checkboxes - "+driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		
		
		driver.findElement(By.cssSelector("input[value='RoundTrip']")).click();
		
		//driver.findElement(By.cssSelector("input[value='OneWay']")).click();
		
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))
		{
			Assert.assertTrue(true);
			System.out.println("Round Trip is selected");
			
		}
		else
		{
			Assert.assertFalse(false);
			System.out.println("One way Trip is selected");
		}
		
		
		
	
//		driver.findElement(By.id("divpaxinfo")).click();
//		Thread.sleep(3000);
//		
//		System.out.println("Before selection number of Adult passangers --> "+driver.findElement(By.id("divpaxinfo")).getText());
//		int i=1;
//		while(i<5) {
//		driver.findElement(By.id("hrefIncAdt")).click();
//		i++;
//		}
//		
//		driver.findElement(By.id("btnclosepaxoption")).click();
//		
//		System.out.println("After  selection number of Adult passangers --> "+driver.findElement(By.id("divpaxinfo")).getText());
//		
//	driver.quit();
	}
	


}

