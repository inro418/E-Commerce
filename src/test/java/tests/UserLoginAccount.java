package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class UserLoginAccount {

	WebDriver driver;
	
	@Test
	public void User_Login() throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//1. Go to https://live.demoguru99.com/
		driver.get("https://live.demoguru99.com/"); 
		
		//2. Click Account link
		driver.findElement(By.xpath("//*[@id='top']/body/div/div/div[3]/div/div[4]/ul/li[1]/a")).click();
		
		//3. Valid User and Valid password for Login
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("inro4ebony@gmail.com");  
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("isua41888"); 
		driver.findElement(By.xpath("//*[@id='send2']")).click(); 
		
		//4. Go to TV menu
		driver.findElement(By.xpath("//*[@id='nav']/ol/li[2]/a")).click(); 
		
		Thread.sleep(5000);   
		
		//5. Add product in your Wish list
		driver.findElement(By.xpath("//*[@id='top']/body/div/div/div[2]/div/div[2]/div[1]/div[2]/ul/li[1]/div/div[3]/ul/li[1]/a")).click();
		
		//6. Add Wish list
		driver.findElement(By.xpath("//*[@id='item_39498']/td[3]/div/div/input")).sendKeys("2"); 
		
		//7. Click Wish list
		driver.findElement(By.xpath("//*[@id='wishlist-view-form']/div/div/button[1]/span/span")).click();
		
		//8. In the next page enter Email and message and click SHARE WISHLIST
		driver.findElement(By.xpath("//*[@id='email_address']")).sendKeys("inro4ebony@gmail.com"); 
		driver.findElement(By.xpath("//*[@id='message']")).sendKeys("Good TV screen"); 
		driver.findElement(By.xpath("//*[@id='form-validate']/div[2]/button/span/span")).click(); 
		
	}
}
