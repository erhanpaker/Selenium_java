package seleneium_8;

import com.beust.ah.A;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class lesson_1 {

    @Test

    public void test1(){

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://automationexercise.com/");

       WebElement logo = driver.findElement(By.xpath("//img[@src='/static/images/home/logo.png']"));
       Assert.assertTrue(logo.isDisplayed());

       WebElement signup = driver.findElement(By.xpath(" //a[text()=' Signup / Login']"));
       signup.click();

       WebElement yazi = driver.findElement(By.xpath(" //h2[text()='Login to your account']"));
       Assert.assertTrue(yazi.isDisplayed());


       WebElement password = driver.findElement(By.xpath("//input[@data-qa='login-email']"));
       password.sendKeys("erhanpaker@gmail.com");

        WebElement login = driver.findElement(By.xpath("//input[@data-qa='login-password']"));
        login.sendKeys("12345");

        WebElement button = driver.findElement(By.xpath("//button[@data-qa='login-button']"));
        button.click();

        WebElement bulma = driver.findElement(By.xpath("//a[text()= ' Logged in as ']"));
        Assert.assertTrue(bulma.isDisplayed());

        driver.findElement(By.xpath("//a[text()=' Logout']")).click();
        String expectedurl = "https://automationexercise.com/login";
        String acturalurl = driver.getCurrentUrl();
        Assert.assertEquals(expectedurl,acturalurl);
        driver.close();
















    }
}
