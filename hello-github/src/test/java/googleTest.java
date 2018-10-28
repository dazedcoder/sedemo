import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.*;
import java.util.concurrent.TimeUnit;

public class googleTest {
	
protected WebDriver driver;
	
	@Test
	public void demoTest() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\girir\\Desktop\\study\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.MILLISECONDS);
		driver.get("https://www.google.com");
		String expectedTitle= "Google";
		String actualTitle = driver.getTitle();
		
	if(actualTitle.equals(expectedTitle)) {
	 
		System.out.println("Test passed hurray!!");
	}
		
		driver.quit();
		
			
	
}
	
	
	

}
