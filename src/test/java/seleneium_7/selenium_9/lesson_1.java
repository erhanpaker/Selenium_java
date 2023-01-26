package seleneium_7.selenium_9;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class lesson_1 {
    @Test
    public void test01() {
        //1. Launch browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //2. Navigate to url 'http://automationexercise.com'
        driver.get("http://automationexercise.com");

        WebElement signup = driver.findElement(By.xpath(" //a[text()= ' Signup / Login']"));
        Actions actions =new Actions(driver);
        actions.click(signup).perform();

        WebElement name = driver.findElement(By.xpath("//input[@data-qa='signup-name']"));
        actions.click(name);





    }
}