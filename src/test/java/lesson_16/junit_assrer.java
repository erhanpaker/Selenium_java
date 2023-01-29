package lesson_16;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.management.DescriptorKey;
import java.time.Duration;

public class junit_assrer {
    static WebDriver driver;

    @BeforeClass

    public static void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://youTube.com/");
    }
    @AfterClass
    public static void teardown(){
        driver.close();
    }
    @Test
    public void test01(){
        // görev " sayfa başlığının youtube olduğunu test et

        String expectedTitle = "YouTube";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(expectedTitle,actualTitle);
    }
    @Test

    public void test02(){
        WebElement logoelent = driver.findElement(By.xpath("(//yt-icon[@id='logo-icon'])[1]"));
        Assert.assertTrue(logoelent.isDisplayed());

    }
    @Test
    public void test03(){
        WebElement search = driver.findElement(By.xpath("//input[@id='search']"));
        Assert.assertTrue(search.isEnabled());
    }
    @Test
    public void test04(){
        String expectedTitle = "YouTube";
        String actualTitle = driver.getTitle();

        Assert.assertNotEquals(expectedTitle,actualTitle);

    }




}
