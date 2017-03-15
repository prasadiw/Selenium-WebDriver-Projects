package seleniumWDProjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Locator {

	public static void main(String[] args) {
		Locator locator = new Locator();
		WebDriver driver = new FirefoxDriver();

		driver.get("https://www.facebook.com/");
		// driver.get("http://www.qaclickacademy.com/");// get the url

		/*
		 * locator.BasicLocatorTechniques(driver);
		 * locator.customizedXpath(driver); locator.tagNameTraversing(driver);
		 */
		locator.cssLocator(driver);

	}

	public void BasicLocatorTechniques(WebDriver driver) {
		// basic locator techniques:
		// id,name,classname,linkText,partialLinkText,xpath
		driver.findElement(By.id("email")).sendKeys("qaclickacademy");
		// driver.findElement(By.className("className")).sendKeys(text);
		driver.findElement(By.name("pass")).sendKeys("12345");
		driver.findElement(By.partialLinkText("Forgot")).click();
		// driver.findElement(By.linkText("Forgot account?")).click();
		driver.findElement(By.xpath(".//*[@id='u_0_q']")).click();
		// driver.findElement(By.xpath(".//*[@id='homepage']/section[2]/div/a")).click();
	}

	public void customizedXpath(WebDriver driver) {
		// customize the xpath value. creating a xpath.
		// syntax: //tagname[@attribute='value'] , for any tag:
		// //*[@attribute='value'].
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("qaclickacademy");
		driver.findElement(By.name("pass")).sendKeys("12345");
		driver.findElement(By.xpath(".//input[@value='Log In']")).click();

	}

	public void tagNameTraversing(WebDriver driver) {
		// customize the xpath : traverse through the tagname and create xpath
		// using it.
		// syntax: //tagname[@attribute='value']
		driver.findElement(By.xpath("//div[@id='reg_form_box']/div[1]/div/div[1]/div/div/input")).sendKeys("prasadi");
	}

	public void cssLocator(WebDriver driver) {
		// locate objects using css by writing cssSelector strings.
		// syntax: tagname[attribute='value'], for ant tag: [attribute='value']
		// this uses css selector shortcuts. #id , .class.name (replace spaces
		// with dots)
		driver.findElement(By.cssSelector("input[name='firstname']")).sendKeys("prasadi");
		driver.findElement(By.cssSelector("[id='u_0_3']")).sendKeys("warnaweera");
		driver.findElement(By.cssSelector("#u_0_6")).sendKeys("12345678");
		driver.findElement(By.cssSelector("#u_0_9")).sendKeys("12345678");
		driver.findElement(By.cssSelector("._6j.mvm._6wk._6wl._58mi._3ma._6o._6v")).click();

	}
}
