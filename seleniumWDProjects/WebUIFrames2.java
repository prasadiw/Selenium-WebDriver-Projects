package seleniumWDProjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WebUIFrames2 {
	public static int gotoframe(WebDriver driver1,By by)

	{//find the frame index where the element is present

	driver1.switchTo().defaultContent();

	int i;

	int num = -1;

	int a=driver1.findElements(By.tagName("iframe")).size();

	for(i=0;i<a;i++)

	{

	driver1.switchTo().defaultContent();

	driver1.switchTo().frame(i);

	int b=driver1.findElements(by).size(); 

	if(b>0)

	{

	num=i;

	break;

	}

	}

	driver1.switchTo().defaultContent();

	return num;

	}
}
