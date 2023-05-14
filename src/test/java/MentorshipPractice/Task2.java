package MentorshipPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Task2 {
    public static void main(String[] args) {


        //TC 2: Syntax Page URL Verification:
        //1. Open chrome browser
        System.setProperty("webdriver.chrome.driver", "src/resources/chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));

        //2. Navigate to “https://www.zillow.com/”
        driver.get("https://www.zillow.com/");


        //3. Navigate to “https://www.google.com/”
        driver.navigate().to("https://www.google.com/");

        //4. Navigate back to Zillow Page
        driver.navigate().back();

        //5. Refresh current page
        driver.navigate().refresh();

        //6. Verify url contains “Zillow”
        String expectedIcerik = "Zillow";
        String actualUrl = driver.getCurrentUrl();

        if (actualUrl.contains(expectedIcerik)) {
            System.out.println("TEST PASSED");
        } else {
            System.out.println("TEST FAILED");
        }
        driver.close();
    }
}
