import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowAcivities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		// to maximize the window
		driver.manage().window().maximize();

		driver.get("https://www.google.com");

		// to navigate to from one url to another url
		// differnce between get() and navigate ()
		// -- get () will wait till page is fully loaded ( halt other command to get
		// executed)
		// where navigate will not wait for page to be load and other selenium command
		// start executing

		driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
		driver.navigate().back();
		driver.navigate().forward();

		// from selenium version 4.6.0 System.setProperty() -- locating to browser
		// driver ( path in our system become optional )
		// they handle in jar called as selenium manager
		// seleiunm manger figure out what driver we are using and it download exact
		// version of driver matching to our system browser and it remove the headace of
		// downloading
		
		// if we use  System.setProperty() then selenium manger pause their work 
		
		

	}

}
