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

        WebElement logoelementi = driver.findElement(By.xpath("//img[@src='/static/images/home/logo.png']"));
        Assert.assertTrue(logoelementi.isDisplayed());

        WebElement login = driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a"));
        login.click();

        WebElement yazi = driver.findElement(By.xpath("//h2[text()= 'Login to your account']"));
        Assert.assertTrue(yazi.isDisplayed());

        WebElement adres =driver.findElement(By.xpath("//input[@data-qa= 'login-email']"));
        adres.sendKeys("erhanpaker@gmail.com");

        WebElement password = driver.findElement(By.xpath("//input[@data-qa= 'login-password']"));
        password.sendKeys("12345");

        WebElement buton = driver.findElement(By.xpath("//button[@data-qa= 'login-button']"));
        buton.click();

        WebElement log = driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[10]/a/text()"));
        Assert.assertTrue(log.isDisplayed());




    }
}
