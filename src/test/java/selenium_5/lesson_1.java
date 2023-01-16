package selenium_5;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class lesson_1 {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // video

        driver.get("https://www.facebook.com/");
        WebElement epostakutusu = driver.findElement(By.xpath("//input[@id='email' ]"));
        epostakutusu.sendKeys("erjsömdösöx");

        WebElement passkutusu = driver.findElement(By.xpath("//input[@id='pass' ]"));
        passkutusu.sendKeys("fdk374394");

        WebElement loginButton = driver.findElement(By.xpath("//button[@name='login' ]"));
        loginButton.click();

    }
}
