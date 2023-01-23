package Selenium_1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class lesson_1 {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com");

        Thread.sleep(200);

        driver.navigate().to("https://online.wisequarter.com/");
        Thread.sleep(200);

        driver.navigate().back();
        Thread.sleep(200);

        driver.navigate().forward();












    }
}
