package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Registerdemowebshop {
	WebDriver driver;
	@BeforeMethod
	
		public void launch()
	    {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		 driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		}
	
	@Test
	public void register() throws InterruptedException {
		driver.findElement(By.xpath("//a[@class='ico-register']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='gender-male']")).click();
		driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("rakesh");
		driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("jii");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("rakeshrebelt@gmaiil.com");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("raki123");
		driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys("raki123");
		driver.findElement(By.xpath("//input[@id='register-button']")).click();
		}
	
	@AfterMethod
	public void closeapplication() {
		driver.close();
	

}
}
