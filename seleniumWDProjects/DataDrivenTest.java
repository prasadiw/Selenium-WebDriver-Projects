package seleniumWDProjects;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class DataDrivenTest {

	public static void main(String[] args) throws IOException {
		DataDrivenTest ddt=new DataDrivenTest();
		Properties prop=new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\Admin\\workspace\\Introduction\\src\\seleniumWDProjects\\datadrive.properties");
		
		prop.load(fis);
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get(prop.getProperty("url"));

		ddt.BasicLocatorTechniques(driver,prop);
		 //locator.customizedXpath(driver); locator.tagNameTraversing(driver);
		 
		//locator.cssLocator(driver);

	}

	public void BasicLocatorTechniques(WebDriver driver, Properties prop) {
		// basic locator techniques:
		// id,name,classname,linkText,partialLinkText,xpath
		driver.findElement(By.id("email")).sendKeys(prop.getProperty("username"));
		// driver.findElement(By.className("className")).sendKeys(text);
		driver.findElement(By.name("pass")).sendKeys(prop.getProperty("password"));
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
		//driver.findElement(By.cssSelector("div.reg_form_box>div:nth-child(1)/div/div:nth-child(1)/div/div/input")).sendKeys("prasadi");
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