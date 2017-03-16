//static and dynamic handling of drop downs
//static and dynamic handling of radio buttons
//static and dynamic handling of check boxes

package seleniumWDProjects;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.support.ui.Select;

public class WebUIAutomation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public void handlingDropDowns(){
		
		System.setProperty("webdriver.chrome.driver", "C:\\Chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://spicejet.com/");

	
		 
		 driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
		 
		 driver.findElement(By.xpath("//a[@value='GOI']")).click();
		 
		 

		// If you want to accees any methods in class ,create object for that
		// class and access methods

		// using object.method

		
		 Select dropdown=new Select(driver.findElement(By.xpath(
		 ".//*[@id='ctl00_mainContent_ddl_Adult']"))); 
		 
		 dropdown.selectByIndex(4);
		 
		 dropdown.selectByVisibleText("9 Adults");
		 
		 dropdown.selectByValue("8");
		 
		
	}
	
	public void handlingCheckBoxes() {
		System.setProperty("webdriver.chrome.driver", "C:\\Chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://spicejet.com/");

		

		System.out.println(driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_chk_IndArm']")).isSelected());

		driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_chk_IndArm']")).click();

		System.out.println(driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_chk_IndArm']")).isSelected());

		driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_chk_IndArm']")).click();

		System.out.println(driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_chk_IndArm']")).isSelected());

	}

	public void handlingRadioButtons() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		// WebDriver driver=new FirefoxDriver();

		driver.get("http://www.echoecho.com/htmlforms10.htm");

		// driver.findElement(By.xpath("//input[@value='Milk']")).click();

		int count = driver.findElements(By.xpath("//input[@name='group1']")).size();

		for (int i = 0; i < count; i++)

		{

			// driver.findElements(By.xpath("//input[@name='group1']")).get(i).click();

			String text = driver.findElements(By.xpath("//input[@name='group1']")).get(i).getAttribute("value");

			if (text.equals("Cheese"))

			{

				driver.findElements(By.xpath("//input[@name='group1']")).get(i).click();

			}

		}

	}

	
}
