package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_DriverGetMethodlari {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver_win32/chromedriver.exe");
        // sisteme webdriver'in ne olacagini ve bu driver'in hangi dosya yolunda oldugunu soyler
        WebDriver driver = new ChromeDriver();
        // bilgisayarimizdaki Chrome browser'in otomasyonla calisacak bir kopyasini olusturur
        // Chrome disinda bir browser kullanmak istersek o browser'in driver'ini indirip
        // System.setProperty("webdriver.safari.driver","safari driver'in dosya yolu")

        // Olusturdugumuz driver objesi bizim elimiz, gozumuz gibidir

        driver.get("https://www.wisequarter.com");// istenen url'e bizi goturur
        // www yazmasak da calisir ancak https:// yazmazsak calismaz

        System.out.println(driver.getTitle());// bize title'i dondurur
        // IT Bootcamp, Distance education method - Wise Quarter Course

        System.out.println(driver.getCurrentUrl());// istenen url'e bizi goturur
        // https://wisequarter.com/

        System.out.println(driver.getPageSource());
        // gidilen web sayfasinin kaynak kodlarini dondurur

        System.out.println(driver.getWindowHandle());// 41DA9965CC82108F91D790E821B98788
        // // acilan her bir pencereye verilen unique hash code degeridir

        System.out.println(driver.getWindowHandles());// [41DA9965CC82108F91D790E821B98788]
        // eger driver calisirken birden fazla pencere veya tab olusturduysa
        // acilan tum windows/tab'lerin unique hash code'larini bir set olarak dondurur


        Thread.sleep(3000);// mili saniye olarak yazdigimiz sayi suresince kodu bekletir
        driver.close();// acilan browser'i kapatir


    }
}
