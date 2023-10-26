package week7day1seleniumWindowhandling;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.chrome.ChromeDriver;

public class MergeLead {
	
	public static void main(String[] args) {
		
		 ChromeDriver driver=new ChromeDriver();
		 
		 driver.get("http://leaftaps.com/opentaps/control/login");
			
			driver.manage().window().maximize();
			
		  	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
			
			driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
			
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
			
			driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
			
			driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
			
			driver.findElement(By.linkText("Leads")).click();
	 		 
			
			driver.findElement(By.xpath("//a[text()='Merge Leads']")).click();
		  
		   driver.findElement(By.xpath("//span[text()='From Lead']/following::img[1]")).click();
		   
		   Set<String> childWindow=driver.getWindowHandles();
		   
		   List<String>openWindow=new ArrayList<String>(childWindow);
		   
		   driver.switchTo().window(openWindow.get(1));
		   
		   driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/following::a[2]")).click();		   
		   
		   driver.switchTo().window(openWindow.get(0));
		   
		   driver.findElement(By.xpath("//span[text()='To Lead']/following::img")).click();
		   
           Set<String> childWindow1=driver.getWindowHandles();
		   
		   List<String>openWindow1=new ArrayList<String>(childWindow1);
		   
		   driver.switchTo().window(openWindow1.get(1));
		   
		   driver.findElement(By.xpath("//div[contains(@class,'x-grid3-cell-inner')]/following::a[10]")).click();
		   
		   driver.switchTo().window(openWindow.get(0));
		   
		   driver.findElement(By.xpath("//a[text()='Merge']")).click();
		   
		   driver.switchTo().alert().accept();
		   
		   
		   
		   
		   
		   
		  
		  
		  
		  
		  
		  
	}

}
