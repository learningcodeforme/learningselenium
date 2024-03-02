import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorLearning {

  public static void main(String args[]) {
	  
	  WebDriver driver = new ChromeDriver();
	  
	  driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	 
	  
	  
	  /* Sibiling - Parent traverse to child and look for sibling
	   * 
	   *
	   * //header/div/button[1]/following-sibling::button[1]
	   * //header/div/button[1]---> parent to child 
	   * //following-sibling::button[1] --> sibling finding 
	   * 
	   * here button[1] is child 1 and we are looking for it sibling so we use " /following-sibling::" to reach it sibling 
	   * then we provide actual sibiling we are looking for it  "button[1]"
	 
	   */
	  System.out.println(" Parent to child  traverse - > "+driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText());
	  
	  /* Child to parent traversing
	   * //div/button[1]/parent::div/button[2]
	   * here we to reach child - button[1] using this -->  //div/button[1] 
	   *we use /parent --> to reach it parent and from parent we to go it child /button[2]
	   *
	   */ 
	  System.out.println("child to Parent traverse - > "+driver.findElement(By.xpath("//div/button[1]/parent::div/button[2]")).getText());
	   
	  // child to grandparent
	  // need to understand how to go in lesson 47
	  
  }
}
