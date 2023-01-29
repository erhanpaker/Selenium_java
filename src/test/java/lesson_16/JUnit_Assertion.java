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

import java.time.Duration;

public class JUnit_Assertion {
    static WebDriver driver;


    @BeforeClass
    public static void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();
        driver.get("https://www.bestbuy.com/");

    }

    @AfterClass
    public static void teardeown(){
        driver.close();

    }
    @Test
    public  void test01(){
        String expectedUrl = "https://www.bestbuy.com/";
        String actualUrl = driver.getCurrentUrl();

        // BU Metod kodu hata veriyor yazmadım
    }
    @Test
    public void test02(){
        // görev sayfa balığının

        String expectedıcerik = "REST";
        String actualTitle = driver.getTitle();

        Assert.assertFalse(actualTitle.contains(expectedıcerik));

    }
    @Test
    public void test03(){

        // görev; best buy logosunun göründüğünü test edin

        WebElement logo = driver.findElement(By.xpath("(//img[@class='logo'])[1]"));
        Assert.assertTrue(logo.isDisplayed());
    }
    @Test
    public void test04(){
        // linkin göründüğünü test edin

        WebElement link = driver.findElement(By.xpath("//*[text()='Français']"));
        Assert.assertTrue(link.isDisplayed());

    }


}
