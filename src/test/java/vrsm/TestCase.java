package vrsm;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.util.List;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;


@Test
public class TestCase {
	
	  private WebDriver driver;
	    
	    @Test(priority=1)
	      public void testCase1() {
	          //driver.get("http://172.19.81.202:9090/vrsm/");
	          
	          driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[1]/div/div[1]/div/div[1]/div/div[1]/div/div[3]/div")).click();
	          Reporter.log("click on New video button successful");
	          
	          WebElement field = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[1]/div/div[1]/div/div[3]/div/div[1]/div/input"));
	          field.clear();
	          field.sendKeys("Twilight");
	          
	          WebElement field1 = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[1]/div/div[1]/div/div[3]/div/div[3]/div/input"));
	          field1.clear();
	          field1.sendKeys("Catherine");
	          
	          WebElement field2 = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[1]/div/div[1]/div/div[3]/div/div[5]/div/input"));
	          field2.clear();
	          field2.sendKeys("2008");
	          
	          driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[1]/div/div[1]/div/div[3]/div/div[7]/div/div[1]")).click();
	          Reporter.log("Saved successfully !!!!"); 
	          
	          

	      }
	    
	    @Test(priority=2)
	       public void testCase2() {
	   		  driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[1]/div/div[1]/div/div[1]/div/div[1]/div/div[3]/div")).click();
	          Reporter.log("click on New video button successful");
	          
	          WebElement field6 = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[1]/div/div[1]/div/div[3]/div/div[1]/div/input"));
	          field6.clear();
	          field6.sendKeys("Harry Potter");
	          
	          WebElement field7 = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[1]/div/div[1]/div/div[3]/div/div[3]/div/input"));
	          field7.clear();
	          field7.sendKeys("Chris");
	          
	          WebElement field8 = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[1]/div/div[1]/div/div[3]/div/div[5]/div/input"));
	          field8.clear();
	          field8.sendKeys("2001");
	          
	          driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[1]/div/div[1]/div/div[3]/div/div[7]/div/div[2]")).click();
	          Reporter.log("Cancelled successfully !!!!");
	    } 
	   
	    @Test(priority=3)
	    	public void testCase3() {
	    		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[1]/div/div[3]/div/div/div/div[1]/div/div[3]/div")).click();
	    									
	    		Reporter.log("click on New customer button successful");
	    		
	    		WebElement field3 = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[1]/div/div[3]/div/div[1]/div/div[1]/div/input"));
		        field3.clear();
		        field3.sendKeys("Harry");
		        
		        WebElement field4 = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[1]/div/div[3]/div/div[1]/div/div[3]/div/input"));
		        field4.clear();
		        field4.sendKeys("Potter");
		        
		        WebElement field5 = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[1]/div/div[3]/div/div[1]/div/div[5]/div/input"));
		        field5.clear();
		        field5.sendKeys("harrypotter@gmail.com");
		        
		        driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[1]/div/div[3]/div/div[1]/div/div[7]/div/div[1]")).click();
		        Reporter.log("Saved successfully !!!!");
	    	
	    }
	    
	    
	    @BeforeTest
	      public void beforeTest() {
	          driver = new FirefoxDriver();
	        // Launch website
	          driver.navigate().to("http://172.19.81.202:9090/video-rental-store-0.0.1-SNAPSHOT/");
	          driver.manage().window().maximize();
	          
	      }

	      @AfterTest
	      public void afterTest() {
	          driver.quit();
	      }
	    
	    }


