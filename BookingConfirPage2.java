package pageObjectsRoundTrip;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class BookingConfirPage2 {

	   @FindBy(xpath ="//span[@class='rounded-xl flex items-center justify-between gap-2']/input")	
	   public static WebElement firstName;
	   
	   @FindBy(xpath ="(//span[@class='rounded-xl flex items-center justify-between gap-2']/input)[3]")	
	   public static WebElement lastName;
	   
	   public static WebElement birthDate(ChromeDriver driver) throws InterruptedException {
		 Actions action = new Actions(driver);
		 WebElement dob = driver.findElement(By.xpath("//span[@class='w-full flex items-center justify-between gap-2']/input"));
		 action.moveToElement(dob).click().perform();
		 Thread.sleep(200);
		 dob.sendKeys("12");
		 Thread.sleep(100);
		 dob.sendKeys("12");
		 Thread.sleep(200);
		 dob.sendKeys("1999");
		 return dob;
	   }	
	   
	   public static WebElement countrySelect(ChromeDriver driver) throws InterruptedException {
	     WebElement country = driver.findElement(By.xpath("//div[@class='passport-issue-country w-full md:w-1/3 lg:1/3']//span/select"));
	     Thread.sleep(500);
	     Select countryDropDown = new Select(country);
		 countryDropDown.selectByVisibleText("India");
		 return country;
	   }	
	   
	   public static WebElement genderSelect(ChromeDriver driver) throws InterruptedException {
	     WebElement gender = driver.findElement(By.xpath("//div[@class='gender w-full md:w-1/3 lg:1/3']//span/select"));
	     Thread.sleep(500);
		 Select genderDropDown = new Select(gender);
		 genderDropDown.selectByVisibleText("Male");
	     return gender;
	   }
	   
	   @FindBy(xpath ="(//div[@class='w-full  flex gap-4 p-0.5 rounded-xl  shrink justify-center items-center'])[1]/input")
	   public static WebElement address;
	   
	   @FindBy(xpath ="//button[@class='w-full flex justify-between items-center bg-transparent']/input")
	   public static WebElement country;
	   
	   @FindBy(xpath = "//span[text()='India']")
	   public static WebElement india;
	   
	   @FindBy(xpath ="//input[@placeholder='Zipcode*']") 
	   public static WebElement zipcpde;
	   
	   @FindBy(xpath ="(//div[@class='w-full  flex gap-4 p-0.5 rounded-xl  shrink justify-center items-center'])[2]/input")
	   public static WebElement city;
	   
	   @FindBy(xpath ="//input[@placeholder='Email*']")
	   public static WebElement email;
	   
	   @FindBy(xpath ="//input[@placeholder='Contact number']")
	   public static WebElement phoneNo;
	   
}
