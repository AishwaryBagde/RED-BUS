package demo;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
//Selenium Imports
import org.openqa.selenium.Keys;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
///


public class TestCases {
    ChromeDriver driver;
    public TestCases()
    {
        System.out.println("Constructor: TestCases");
        WebDriverManager.chromedriver().timeout(30).setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }

    public void endTest()
    {
        System.out.println("End Test: TestCases");
        driver.close();
        driver.quit();

    }

    
    public  void testCase01()throws InterruptedException{
        System.out.println("Start Test case: testCase01");
        // boolean status = false;

        // Launch Chrome :
        // Load URL  https://www.redbus.in/
        driver.get("https://www.redbus.in/");
        // Wait for 30 seconds  
        Thread.sleep(6000);
        // Type text in the Text Field From Using Locator "ID":"src"
        driver.findElementById("src").sendKeys("Bangalore");
        ////Select the first result  Using Locator "XPath":"//li[@class='selected']"
        driver.findElementByXPath("//li[@class='selected']").click();
        // Type text in the Text Field To Destination Using Locator "ID" "dest"
        driver.findElementById("dest").sendKeys("Chennai");
         ////Select the first result  Using Locator "XPath":"//li[@class='selected']"
         driver.findElementByXPath("//li[@class='selected']").click();
        // Click on Date  Using Locator "ID" "onward_cal"
        driver.findElementById("onward_cal").click();
        // Select current date Using Locator "XPath" "//td[@class='current day']"
        driver.findElementByXPath("//td[@class='current day']").click();
        // Click on Search button Using Locator "XPath" "//button[contains(text(),'Search Buses')]"
        driver.findElementByXPath("//button[contains(text(),'Search Buses')]").click();
        // wait for 10 sec  
        Thread.sleep(8000);
        // Click on fair  Using Locator "XPath" "//a[contains(text(),'Fare')]"
        driver.findElementByXPath("//a[contains(text(),'Fare')]").click();
        // Print Top buss name Using Locator "XPath" "(//div[@class='travels lh-24 f-bold d-color'])[1]"
        String topBusName = driver.findElementByXPath("(//div[@class='travels lh-24 f-bold d-color'])[1]").getText();
        System.out.println("The Lowest Fair Bus Name is :" + topBusName);
        // Print Top buss with low fair Using Locator "XPath" "(//div[@class='seat-fare '])[1]"
        String fair = driver.findElementByXPath("(//div[@class='seat-fare '])[1]").getText();
        System.out.println("The Lowest Fair Bus is :" + fair);
        
        System.out.println("end Test case: testCase01");
    }


}
