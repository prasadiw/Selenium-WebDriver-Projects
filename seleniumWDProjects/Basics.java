//Browser invocation : how to create web driver instances for Firefox,Chrome and IE.
//launching url and read page infor using web driver program.

package seleniumWDProjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Basics {

	public static void main(String[] args) {

		WebDriver driver = new Basics().getFirefoxDriver();
		//WebDriver driver = new Basics().getChromeDriver();
		//WebDriver driver=new Basics().getIEDriver();
		
		// driver.get("http://www.qaclickacademy.com/");//get the url
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getPageSource());
		System.out.println(driver.getCurrentUrl());
		//driver.quit();
		driver.close();
	}

	public WebDriver getFirefoxDriver() {
		//java requirement 1.8
		//Ff less than 47+ - Then sellinium 2.5
		//Firefox 48+ - selenium 3.0 - need to have suppliment by geckodriver
		//https://github.com/mozilla/geckodriver/releases/
		
		System.setProperty("webdrive.geco.driver", "C:\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		return driver;
	}

	public WebDriver getChromeDriver() {

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		return driver;

	}
	
	public WebDriver getIEDriver(){
		System.setProperty("webdriver.ie.driver", "C:\\IEDriverServer_x64_3.3.0\\IEDriverServer.exe");
		WebDriver driver=new InternetExplorerDriver();
		return driver;
		
	}
}
