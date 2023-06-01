package pageObjectsRoundTrip;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;


public class TripSummaryPage2 {
	public static WebElement checkOut(ChromeDriver driver) {
		
	 Set<String> windowHandles1 = driver.getWindowHandles();
     List<String> book=new ArrayList<String>(windowHandles1);
	 driver.switchTo().window(book.get(1));
	 return driver.findElement(By.xpath("//button[text()='Continue to Checkout']"));
		
	}
	       
	       @FindBy(xpath = "//button[text()='Skip & Continue']")
	       public static WebElement skip; 
		
}
