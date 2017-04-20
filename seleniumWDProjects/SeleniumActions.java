package seleniumWDProjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SeleniumActions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");;
		WebDriver driver=new ChromeDriver();
		
		SeleniumActions a= new SeleniumActions();
		a.moveToElementSendKeys(driver);
		

	}

	
	public void hoverOver(WebDriver driver){
		driver.get("http://imgur.com/");
		Actions builder = new Actions(driver);
		builder.moveToElement(driver.findElement(By.xpath("//div[contains(@class,'cards')]/div[1]/a"))).build().perform();
		driver.close();
	}
	
	public void moveToElementSendKeys(WebDriver driver){
		driver.get("https://www.facebook.com/");
		Actions builder = new Actions(driver);
		builder.moveToElement(driver.findElement(By.id("email"))).keyDown(Keys.SHIFT).sendKeys("capsonkeys").build().perform();
		driver.close();
	}
	
	
}
