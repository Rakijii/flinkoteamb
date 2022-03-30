package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test1 {
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
	
	@Test
	public void login() throws InterruptedException {
		driver.findElement(By.xpath("//a[@class='ico-login']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("rakeshrebelraki@gmail.com");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("raki123");
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
		
	}
	@Test
	public void searchbooks() {
		driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("books");
		driver.findElement(By.xpath("//input[@class='button-1 search-box-button']")).click();
		
		
	}
	@Test
	public void computersaction() {
		Actions a1=new Actions(driver);
		WebElement comp1=driver.findElement(By.xpath("(//a[@href='/computers'])[1]"));
		a1.moveToElement(comp1).build().perform();
		WebElement desktop=driver.findElement(By.xpath("(//a[@href='/desktops'])[1]"));
		a1.moveToElement(desktop).click().perform();
		
	}
	@Test
	public void electronics() {
		Actions a2=new Actions(driver);
		WebElement elect2=driver.findElement(By.xpath("(//a[@href=\"/electronics\"])[1]"));
		a2.moveToElement(elect2).build().perform();
		WebElement cellphone=driver.findElement(By.xpath("(//a[@href='/cell-phones'])[1]"));
		a2.moveToElement(cellphone).click().perform();
		
		
	}
	
	@AfterMethod
	public void closeapplication() {
		driver.close();
		
		
	}
		
	
	
		
	
	}
	


