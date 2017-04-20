package seleniumWDProjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebUIFrames1 extends WebUIFrames2{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();

		WebDriverWait wd=new WebDriverWait(driver,7);

		driver.get("https://fantasycricket.dream11.com/IN/");

		driver.manage().window().maximize();
		//retrieve the frame index where the element is present
		int m=gotoframe(driver,By.xpath(".//*[@id='recaptcha-anchor']"));
		
		driver.switchTo().frame(m);

		driver.findElement(By.xpath(".//*[@id='recaptcha-anchor']/div[5]")).click();

		driver.switchTo().defaultContent();

		wd.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.id("I1_1441700500937")));

		int j=gotoframe(driver,By.xpath(".//*[@id='recaptcha-verify-button']"));

		if(j!=-1)

		{

		driver.switchTo().frame(j);

		//WebDriverWait wd=new WebDriverWait(driver,5);

		//wd.until(ExpectedConditions.(By.xpath(".//*[@id='recaptcha-verify-button']")));

		driver.findElement(By.xpath(".//*[@id='recaptcha-verify-button']")).click();

		}

		else{

		System.out.println("ops");

		}

	}

}
