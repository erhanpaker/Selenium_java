package lesson_16;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class lesson_1 {
    static WebDriver driver;
    @BeforeClass

    public static void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(18));
        driver.manage().window().maximize();
        driver.get("https://bestbuy.com/");


    }

    @AfterClass

    public static void teardown(){
        driver.close();

    }

    public static void test01(){
        String excpectedurl = "https://bestbuy.com/";
        String actiualurl = driver.getCurrentUrl();
        Assert.assertEquals(excpectedurl,actiualurl);


    }

    @Test
    public static void test02(){
        String excpetedIcerik  = "Rest";
        String actualTitle = driver.getTitle();

        Assert.assertFalse(actualTitle.contains(excpetedIcerik));
    }

    @Test

    public void test03(){
        WebElement logoElementi = driver.findElement(By.xpath("(//img[@alt=‘Best Buy Logo’])[1]"));
        Assert.assertTrue(logoElementi.isDisplayed());

    }


}
