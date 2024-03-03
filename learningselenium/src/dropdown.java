import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		Thread.sleep(1000);
	//	driver.findElement(By.xpath("//a[@value='BLR']")).click();
		
		driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='BLR']")).click();
		
		
		/* Note- Most of people facing issue while selecting MAA in destination drop down.
		 *  It happen because  when we select origin place('BLR') 
		 *   selenium look for desitnation very fast ( before the destination dropdown
		 *    open,so our test got fail) 
		 *    
		 * if we use Thead.sleep() it solve the problem */
		Thread.sleep(3000);
		//driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
		
		
		// in the below xpath is example of Parent and child  relationship here is white space between parent and child xpath
		// first we find parent xpath and after giving white space we search the child xpath inside parent xpath ( it reduce 
		// scope of search 
		/// /div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] <one space >//a[@value='MAA']"
		
		driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
		
		
		

	}

}
