package xslt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class Example {
	
	
	
	static WebDriver driver;
	
	@Test
	public void f() {
		
		driver.get("https://www.amazon.in/");
		System.out.println("This is the first test case");
		driver.findElement(By.xpath("//span[@id='glow-ingress-line1']")).click();
		
	}

	@Test
	public void g() {
		
		driver.get("https://www.amazon.in/");
		System.out.println("This is the first test case");
		driver.findElement(By.xpath("//span[@id='glow-ingress-line1']")).click();
		
		
		
	}
	
	@Test
	public void h() {
		
		driver.get("https://www.amazon.in/");
		System.out.println("This is the first test case");
		driver.findElement(By.xpath("//span[@id='glow-ingress-line1']")).click();
		
	}
	
	@BeforeMethod
	public void before() {
		
		String path="C:\\Users\\M1046899\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		driver= new ChromeDriver();
	
		
	}
	
	@AfterMethod
	public void after()
	{
		driver.quit();
	}

}
