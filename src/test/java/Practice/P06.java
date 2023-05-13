package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class P06 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/resources/chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        String ht = "https://www.";
        driver.get(ht + "google.com");
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());
        driver.navigate().to(ht + "amazon.com");
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(2000);
        driver.navigate().forward();
        Thread.sleep(2000);
        System.out.println(driver.getWindowHandle());
        driver.navigate().refresh();
        System.out.println(driver.getTitle());
        System.out.println(driver.getWindowHandle());//AAA1F2B66D22E0BEE512573903011951
        driver.switchTo().newWindow(WindowType.TAB);
        driver.navigate().to(ht + "wisequarter.com");
        System.out.println(driver.getWindowHandle());//2D7941329B5FA815579477B2BBE32DCD
        System.out.println(driver.getWindowHandles());//[DAE6BAAAF1F8712F00A12490515BF5E7, 2D7941329B5FA815579477B2BBE32DCD]
        //driver.switchTo().window(handle);
        driver.close(); // açık olan son browser'ı kapatır.
        //driver.quit();// birden fazla açılmış browser'ların tümünü kapatır

    }
}

