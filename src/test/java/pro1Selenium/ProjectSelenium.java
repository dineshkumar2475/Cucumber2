package pro1Selenium;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ProjectSelenium {

	public static void main(String[] args) {
		// System.setProperty("webdriver.chrome.driver",
		// "C:\\Users\\dines\\eclipse-workspace\\Selenium\\lib\\chromedriver.exe");
		// WebDriver driver = new ChromeDriver();
		// driver.manage().window().maximize();
		// driver.get("https://www.flipkart.com/");
		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//
		// WebElement home = driver.findElement(By.xpath("//*[@aria-label=\"Home &
		// Furniture\"]"));
		// Actions act = new Actions(driver);
		// act.moveToElement(home).perform();
		// List<WebElement> Furniture =
		// driver.findElements(By.xpath("//*[@class=\"_16rZTH\"]"));
		// ArrayList<String> Text = new ArrayList<String>();
		// for (WebElement Furnitures : Furniture) {
		// Text.add(Furnitures.getText());
		// if (Furniture.contains("Living Room")) {
		// System.out.println("available");
		// Furnitures.click();
		// }
		// else {
		// System.out.println("not available");
		// }
		// driver.close();
		//
		// }
		// System.out.println(Text);
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\dines\\eclipse-workspace\\Selenium\\lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String URL = driver.getCurrentUrl();
		String title = driver.getTitle();
		System.out.println("The URL of the page is: " + URL + "\nThe Title of the page is: " + title);
		if(title.contains("log in or sign up")){
			System.out.println("Valid Title");
			driver.manage().window().maximize();
			
		}
		else {
			System.out.println("Not a Valid Title");
		}
		driver.close();
	
	}

}
