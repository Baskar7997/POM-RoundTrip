package pageObjectsRoundTrip;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class PaymentPage2 {
	
	public static WebElement cardNo(ChromeDriver driver) {
		driver.switchTo().frame(0);
		return driver.findElement(By.xpath("//div[@class='p-CardNumberInput']//input"));
		}
	
	@FindBy(xpath="//input[@class='p-Input-input Input Input--empty p-Input-input--textRight']")
	public static WebElement exp; 
	
	@FindBy(xpath ="//input[@class='p-Input-input Input Input--empty p-Input-input--textRight']" )
	public static WebElement cvv;
	
	public static WebElement proceed(ChromeDriver driver) throws InterruptedException {
	driver.switchTo().defaultContent();
	Thread.sleep(1000);
	return  driver.findElement(By.xpath("//button[text()='Proceed to pay']"));
   
	}
}
