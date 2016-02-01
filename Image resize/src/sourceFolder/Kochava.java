package sourceFolder;

import java.util.concurrent.TimeUnit;

import org.apache.xml.serialize.Printer;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import net.sourceforge.htmlunit.corejs.javascript.regexp.SubString;

import org.openqa.selenium.WebElement;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
//import org.openqa.selenium.htmlunit.*;
import java.util.List;


public class Kochava {

	private static PrintWriter writer;

	public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException  {
		  System.setProperty("webdriver.chrome.driver", "C:/Users/satijaa/Documents/chromedriver.exe");
		  WebDriver driver1 = new ChromeDriver();

		  
//		WebDriver driver= new FirefoxDriver();
		writer = new PrintWriter("C:/Users/satijaa/Desktop/the-file-name.txt", "UTF-8");
		driver1.get("http://www.kochava.com/");
		driver1.findElement(By.id("menu-item-23")).click();
		driver1.findElement(By.id("username")).sendKeys("glong");
		driver1.findElement(By.id("password")).sendKeys("swyftswyft");
		driver1.findElement(By.cssSelector("input[type='submit']")).click();
		driver1.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver1.findElement(By.cssSelector("#session_account>a")).click();
		driver1.findElement(By.cssSelector("#session_account>ul>li>a")).click();
		driver1.switchTo().frame(0);

		//CREATING A NEW APP
		
//		driver1.findElement(By.id("activity-create_an_app")).click();
//		driver1.switchTo().frame(0);
//		driver1.findElement(By.cssSelector("#name")).sendKeys("testAndroid");
//		new Select(driver1.findElement(By.id("platform"))).selectByVisibleText("Android");
//		new Select(driver1.findElement(By.id("integration-type"))).selectByVisibleText("SDK: Native Android");
//		driver1.findElement(By.cssSelector("input[value='➤ Save']")).click();

		//Finding an app's kochava id
//		List <WebElement> elements = driver.findElements(By.cssSelector(".box.box-item"));
//		for (WebElement element: elements)
//		{
//			try{
//			if(element.findElement(By.cssSelector(".title .header-text")).getText().equals("TestingFinally"))
//			{
//				String ko = element.findElement(By.cssSelector(".data .data-info-popup>p")).getText();
//				int col= ko.indexOf(":");
//				String koid = ko.substring(col+1);
//				System.out.println(koid);
//				writer.println(koid);
//				
//			}
//			
//			}
//			
//			
//			catch(Exception e)
//			{
//				
//			}
//		}
//		writer.close();
		
		//CREATING AND DISBALING EVENTS
		List <WebElement> elements = driver1.findElements(By.cssSelector(".box.box-item"));
		for (WebElement element: elements){
			if(element.findElement(By.cssSelector(".title .header-text")).getText().equals("TestingFinally"))
				{
					element.findElement(By.cssSelector(".header-text>a")).click();
					break;
				}
		}
		driver1.switchTo().defaultContent();
		driver1.findElement(By.cssSelector(".nav-item.configuration>a")).click();
		driver1.switchTo().frame(0);
		driver1.findElement(By.id("event-_Install")).click();
		driver1.switchTo().frame(0);
		driver1.findElement(By.cssSelector("input[value='Submit']")).click();
		//driver1.findElement(By.cssSelector("input[value='➤ Confirm Activation']")).click();
		
		
}
}
