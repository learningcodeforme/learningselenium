import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class FlightBookingE2E {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='BLR']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
		Thread.sleep(3000);
	//	driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
//		String value=driver.findElement(By.xpath("//div[@id='Div']")).getAttribute("style");
//		if(value.contains("0.5")) {
//			System.out.println("Return Date is disabled");
//			Assert.assertTrue(true);			
//		}
//		else
//		{
//			System.out.println("Return Date is not disable");
//			Assert.assertTrue(false);
//		}
		
		driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).click();
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
