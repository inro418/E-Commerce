package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CreatAccount {

	WebDriver driver;  
	
	@Test
	public void Register_Account() throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//1. Go to https://live.demoguru99.com/
		driver.get("https://live.demoguru99.com/"); 
		
		//2. Click on my account link
		driver.findElement(By.xpath("//*[@id='top']/body/div/div/div[3]/div/div[4]/ul/li[1]/a")).click(); 
		
		//3. Click Create Account link and fill new User information except Email ID
		driver.findElement(By.xpath("//a[@title='Create an Account']")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[@id='firstname']")).sendKeys("Oke");
		driver.findElement(By.xpath("//*[@id='middlename']")).sendKeys("Owo");
		driver.findElement(By.xpath("//*[@id='lastname']")).sendKeys("Owola");
		driver.findElement(By.xpath("//*[@id='email_address']")).sendKeys("inro4ebony@gmail.com");
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("isua41888");
		driver.findElement(By.xpath("//*[@id='confirmation']")).sendKeys("isua41888");
		
		//4. Click Register
		driver.findElement(By.xpath("//*[@id='form-validate']/div[2]/button")).click(); 
		
		//5. Verify Registration is done
		System.out.println("Thank you for registering with Main Website Store");   
		
		//6. Close the browser
		driver.quit();
	}
}
