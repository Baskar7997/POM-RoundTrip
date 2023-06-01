package pageObjectsRoundTrip;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class HomePage2 {
	
	@FindBy(xpath = "//div[text()='Flights']")
	public static WebElement flights ; 
	
	public static WebElement from(ChromeDriver driver) throws InterruptedException {
		 WebElement source = driver.findElement(By.xpath("//input[@id='locationInput']"));	
		
		 source.sendKeys("M");
		 Thread.sleep(500);
		 source.sendKeys("A");
		 Thread.sleep(500);
		 source.sendKeys("A");
		 Thread.sleep(500);
		 source.click();
		 Thread.sleep(500);		
		 return source;
		
	}
	@FindBy(xpath = "//span[contains(text(),'Chennai, India')]")
	public static WebElement selectSource;
	
	public static WebElement to(ChromeDriver driver) throws InterruptedException {
		 WebElement destination = driver.findElement(By.xpath("//input[@placeholder='Flying to']"));
		 
		 destination.sendKeys("J");
		 Thread.sleep(500);
		 destination.sendKeys("F");
		 Thread.sleep(500);
		 destination.sendKeys("K");
		 Thread.sleep(500);
		 return destination;
	}
	
	@FindBy(xpath = "//span[contains(text(),'New york, ')]")
	public static WebElement selectDestination;
	
    public static WebElement calendar(ChromeDriver driver) throws InterruptedException {	 
	 WebElement next = driver.findElement(By.xpath("//div[@class='DayPickerNavigation_button DayPickerNavigation_button_1 DayPickerNavigation_button__default DayPickerNavigation_button__default_2 DayPickerNavigation_button__horizontal DayPickerNavigation_button__horizontal_3 DayPickerNavigation_button__horizontalDefault DayPickerNavigation_button__horizontalDefault_4 DayPickerNavigation_rightButton__horizontalDefault DayPickerNavigation_rightButton__horizontalDefault_5']"));
	
	 next.click();
		 Thread.sleep(500);
	 next.click();
		 Thread.sleep(500);
	 next.click();
		 Thread.sleep(500);
	 next.click();
	    return next;			 
    }
   
    public static WebElement fromDate(ChromeDriver driver) throws InterruptedException {	
    	Actions action = new Actions(driver);
    	Thread.sleep(1000);
        WebElement depart = driver.findElement(By.xpath("//table[@class='CalendarMonth_table CalendarMonth_table_1']/tbody/tr[2]/td[3]"));    	
        action.moveToElement(depart).click().perform();
        return depart;
    }
  
    public static WebElement toDate(ChromeDriver driver) throws InterruptedException {	
    	Actions action = new Actions(driver);
    	Thread.sleep(1000);
    	WebElement ret = driver.findElement(By.xpath("//table[@class='CalendarMonth_table CalendarMonth_table_1']/tbody/tr[3]/td[4]"));
    	action.moveToElement(ret).click().perform();
    	return ret;
    }
    @FindBy(xpath = "//span[text()='Done']")
    public static WebElement done;
    @FindBy(xpath = "//span[text()='Search for flights']" )
   	public static WebElement search;
}
