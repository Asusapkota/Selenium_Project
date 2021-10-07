import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import org.openqa.selenium.firefox.FirefoxDriver;

public class Kira {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
			//Selenium code
		// Create driver object for chrome browser
		
System.setProperty("webdriver.chrome.driver", "//Users//sumandahal//Desktop//KIRA//chromedriver");
WebDriver driver=new ChromeDriver();

//Navigate to google.ca
driver.get("https://www.google.ca/");

//Type Kira System in search box
driver.findElement(By.xpath("//*[@id='Search']")).sendKeys("Kira Systems");
driver.findElement(By.xpath("//*[@id='Search']")).click();
driver.get("https://kirasystems.com/");
System.out.println("driver.getTitle");

	
	}
	
}
