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
		WebUIAutomation webUIA = new WebUIAutomation();
		// TODO Auto-generated method stub
		webUIA.handlingDropDowns(); 
		//webUIA.handlingCheckBoxes();
		//webUIA.handlingRadioButtons();

	}

	public void handlingDropDowns(){
		
		System.setProperty("webdriver.chrome.driver", "C:\\Chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://spicejet.com/");

	
		 //handling an adavnced dropdown with dynamic input
		 driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
		 
		 driver.findElement(By.xpath("//a[@value='GOI']")).click();
		 
		 driver.findElement(By.xpath("(//a[@value='GAU'])[2]")).click();
		 

		// If you want to accees any methods in class ,create object for that
		// class and access methods

		// using object.method

		//automatically select and set value to an ordinary dropdown
		 Select dropdown=new Select(driver.findElement(By.xpath(
		 ".//*[@id='ctl00_mainContent_ddl_Adult']"))); 
		 
		 dropdown.selectByIndex(4);
		 
		 //dropdown.selectByVisibleText("9 Adults");
		 
		// dropdown.selectByValue("8");
		 dropdown= new Select(driver.findElement(By.cssSelector("select#ctl00_mainContent_ddl_Child")));
		 dropdown.selectByVisibleText("1 Child");
		 
		 dropdown= new Select(driver.findElement(By.xpath("//select[contains(@id, 'ctl00_mainContent_ddl_Infant')]")));
		 dropdown.selectByValue("3");;
		 
		 driver.close();
		
	}
	
	public void handlingCheckBoxes() {
		System.setProperty("webdriver.chrome.driver", "C:\\Chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://spicejet.com/");

		

		System.out.println(driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_chk_IndArm']")).isSelected());
		
		if (!driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_chk_IndArm']")).isSelected())
		{

		driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_chk_IndArm']")).click();
		
		}

		System.out.println(driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_chk_IndArm']")).isSelected());

		//driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_chk_IndArm']")).click();

		//System.out.println(driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_chk_IndArm']")).isSelected());

		driver.close();
	}

	public void handlingRadioButtons() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		// WebDriver driver=new FirefoxDriver();

		driver.get("http://www.echoecho.com/htmlforms10.htm");

		// driver.findElement(By.xpath("//input[@value='Milk']")).click();

		int count = driver.findElements(By.xpath("//tr/td[@class='table5']/input[@name='group1']")).size();
		System.out.println(count);
		
		for (int i = 0; i < count; i++)

		{

			// driver.findElements(By.xpath("//input[@name='group1']")).get(i).click();

			String text = driver.findElements(By.xpath("//tr/td[@class='table5']/input[@name='group1']")).get(i).getAttribute("value");
			
			System.out.println(text);
			
			if (text.equals("Milk"))

			{

				driver.findElements(By.xpath("//input[@name='group1']")).get(i).click();
				break;
			}

		}
		
		int count2 = driver.findElements(By.xpath("//tr/td[@class='table5']/input[@name='group2']")).size();
		System.out.println(count2);
		
		for(int i=0;i<count2;i++)
		{
			String text2= driver.findElements(By.xpath("//tr/td[@class='table5']/input[@name='group2']")).get(i).getAttribute("value");
			
			if (text2.equals("Beer"))
			{
				driver.findElements(By.xpath("//tr/td[@class='table5']/input[@name='group2']")).get(i).click();
				
			}
		}
		driver.close();

	}

	
}
