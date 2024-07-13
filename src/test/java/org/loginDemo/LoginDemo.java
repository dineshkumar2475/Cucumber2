package org.loginDemo;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginDemo {

	WebDriver driver;
	String ExpectedURL = "https://demo.automationtesting.in/Register.html";

	@Given("URL and prerequisits")
	public void url_and_prerequisits() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\dines\\eclipse-workspace\\Selenium\\lib\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		String actualURL = driver.getCurrentUrl();
		if (actualURL != ExpectedURL) {
			System.out.println("URL is mismatching");

		} else {
			System.out.println("URL is matching progressing the further steps");
		}

	}

	@When("im in homepage and I need to register my details")
	public void im_in_homepage_and_I_need_to_register_my_details()  {
		driver.findElement(By.xpath("//input[@placeholder=\"First Name\"]")).sendKeys("Dinesh");
		driver.findElement(By.xpath("//input[@placeholder=\"Last Name\"]")).sendKeys("Kumar");
	}
	@Then("Validation for the websites")
	public void validation_for_the_websites() {
		driver.close();

	}

}
