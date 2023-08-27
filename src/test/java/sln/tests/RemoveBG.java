package sln.tests;

import org.testng.annotations.Test;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RemoveBG {

	
	@Test
	public void testRemoveBG() {
		
		DesiredCapabilities capability = new DesiredCapabilities();
	       capability.setCapability(CapabilityType.UNHANDLED_PROMPT_BEHAVIOUR, "ignore");
		// Set ChromeDriver path
     System.setProperty("webdriver.chrome.driver", "/Users/abhdas/Documents/SeleniumWebdriverAutomationSetupSoftwares/driver/newdriver/chromedriver");
     
     ChromeOptions opt = new ChromeOptions();
     opt.setExperimentalOption("debuggerAddress", "localhost:9222");
     // Create a new instance of the Chrome driver
     WebDriver driver = new ChromeDriver(opt);
     //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Set explicit wait time
     // Navigate to YouTube
     driver.get("https://new.express.adobe.com/");
     
     try {
         Thread.sleep(3000);
     } catch (InterruptedException e) {
         e.printStackTrace();
     }
     
     JavascriptExecutor js = (JavascriptExecutor) driver;
     
     WebElement signInButton = driver.findElement(By.className("feds-login"));
     signInButton.click();
     
     try {
         Thread.sleep(4000);
     } catch (InterruptedException e) {
         e.printStackTrace();
     }
     
     
     
     String str = "return document.querySelector(\"body > x-app\").shadowRoot.querySelector(\"x-susi-container\").shadowRoot.querySelector(\"div > x-pre-susi\").shadowRoot.querySelector(\"x-theme > div > div > div > div > x-susi-buttons-component\").shadowRoot.querySelector(\"#signIn\")";
     
     WebElement xapp = (WebElement) js.executeScript(str);
     xapp.click();
     
     try {
         Thread.sleep(50000);
     } catch (InterruptedException e) {
         e.printStackTrace();
     }
     
     WebElement emailaddress = driver.findElement(By.id("EmailPage-EmailField"));
     emailaddress.sendKeys("abhdas+spaceprod+T2+1@abhdas-spacesprod-eu.adobeorgtest.com");
     
     WebElement contbtn1 = driver.findElement(By.className("spectrum-Button"));
     contbtn1.click();
     
     try {
         Thread.sleep(2000);
     } catch (InterruptedException e) {
         e.printStackTrace();
     }
     
     WebElement accounttype = driver.findElement(By.cssSelector("[data-id='AccountChooser-AccountList-enterprise']"));
     accounttype.click();
     
     try {
         Thread.sleep(3000);
     } catch (InterruptedException e) {
         e.printStackTrace();
     }
     
     WebElement pswd = driver.findElement(By.id("PasswordPage-PasswordField"));
     pswd.sendKeys("Adobe123#");
     
     WebElement contbtn2 = driver.findElement(By.className("spectrum-Button"));
     contbtn2.click();
     
     try {
         Thread.sleep(10000);
     } catch (InterruptedException e) {
         e.printStackTrace();
     }
		
     js.executeScript("window.scrollBy(0,750)", "");
     
     String bgcard = "return document.querySelector(\"body > x-app\").shadowRoot.querySelector(\"x-theme > x-coachmark-underlay > hz-app-frame > main > x-home\").shadowRoot.querySelector(\"#home-modules-animator > div > x-home-quick-actions-module\").shadowRoot.querySelector(\"div > x-row-scroller\").shadowRoot.querySelector(\"#idx-0 > x-home-card\").shadowRoot.querySelector(\"div > sp-card > [aria-label='Get started with Remove background']\")";
            
     if(bgcard!=null) {
     	WebElement removebgcard = (WebElement) js.executeScript(bgcard);
         removebgcard.click();
         System.out.println(removebgcard);
     }
     
     try {
     	Thread.sleep(10000);
     } catch (InterruptedException e) {
     	e.printStackTrace();
     }
     
     String bgcard2 = "return document.querySelector(\"body > x-app\").shadowRoot.querySelector(\"x-theme > x-coachmark-underlay > hz-app-frame > main > x-home\").shadowRoot.querySelector(\"#home-modules-animator > div > x-home-quick-actions-module\").shadowRoot.querySelector(\"div > x-row-scroller\").shadowRoot.querySelector(\"#idx-0 > x-home-card\").shadowRoot.querySelector(\"div > sp-card > [aria-label='Get started with Remove background']\")";
     
     if(bgcard2!=null) {
     	WebElement removebgcard2 = (WebElement) js.executeScript(bgcard2);
         removebgcard2.click();
         System.out.println(removebgcard2);
     }
     
     try {
     	Thread.sleep(1000);
     } catch (InterruptedException e) {
     	e.printStackTrace();
     }
     
     
      String mod = "return document.querySelector(\"body > active-overlay > x-quick-action-modal\").shadowRoot.querySelector(\"#body > quick-action-component\").shadowRoot.querySelector(\"qa-app-root > qa-app > qa-remove-background-editor\").shadowRoot.querySelector(\"qa-workspace > qa-file-upload\").shadowRoot.querySelector(\"#file-input\")";
      WebElement modal = (WebElement) js.executeScript(mod);
      
      String filepath = "/Users/abhdas/Downloads/553.jpg";
      modal.sendKeys(filepath);
      
      try {
      	Thread.sleep(10000);
      } catch (InterruptedException e) {
      	e.printStackTrace();
      }
      
      String dwnbtn = "return document.querySelector(\"body > active-overlay > x-quick-action-modal\").shadowRoot.querySelector(\"#body > quick-action-component\").shadowRoot.querySelector(\"qa-app-root > qa-app > qa-remove-background-editor\").shadowRoot.querySelector(\"qa-workspace > qa-export\").shadowRoot.querySelector(\"div > sp-button:nth-child(1)\")";
      WebElement dwonloadbutton = (WebElement) js.executeScript(dwnbtn);
      System.out.println(dwonloadbutton);
      dwonloadbutton.click();
      
      try {
       	Thread.sleep(5000);
       } catch (InterruptedException e) {
       	e.printStackTrace();
       }
      
      driver.quit();
	}
}
