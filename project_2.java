package project_2;

import java.util.List;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.github.dockerjava.api.model.Driver;

public class project_2 {
	
	
	
	@BeforeTest
	public void myTest() {
		WebDriver driver = new ChromeDriver();

		
			driver.get("https://www.saucedemo.com/");

			driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standard_user");

			driver.findElement(By.id("password")).sendKeys("secret_sauce");
			driver.findElement(By.name("login-button")).click();
			driver.manage().window().maximize();

			List<WebElement> addtoCartButtons = driver.findElements(By.className("btn_primary"));
			List<WebElement> GetName = driver.findElements(By.className("inventory_item_name"));
			List<WebElement> Get_Price =driver.findElements(By.className("inventory_item_price"));
			

			
			
			for(int i=0 ;i<addtoCartButtons.size();i=i+2) {
				addtoCartButtons.get(i).click();
				System.out.println("add pass");
			
			}

		
	}
			
			
	@Test
	public void mySetup() {}
		
		
	
					
					
					
					
					
					
	@AfterTest
    public void myAfter() {}

}
