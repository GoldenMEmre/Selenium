package MentorshipPractice;

import dev.failsafe.internal.util.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Task1 {
    public static void main(String[] args) {


        //TC 1: Amazon Page Title Verification:

        //1. Open chrome browser
        System.setProperty("webdriver.chrome.driver", "src/resources/chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));

        //2. Go to “https://www.amazon.com/”
        driver.get("https://www.amazon.com/");

        //3. Verify Title “Amazon.com: Online Shopping for
        //Electronics, Apparel, Computers, Books, DVDs & more” is displayed
        String expectedTitle="Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more";
        String actualTitle= driver.getTitle();
        System.out.println(actualTitle);//Amazon.com. Spend less. Smile more.

        if (actualTitle.contains(expectedTitle)){
            System.out.println("TEST PASSED");
        }else{
            System.out.println("TEST FAILED");
        }
        driver.close();


    }
}
