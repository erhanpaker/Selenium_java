package lesson_11;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class lesson_1 {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://automationexercise.com/");

        List<WebElement> Linkelementlerilistesi = driver.findElements(By.tagName("a"));
        int expectedLinksayisi  = 165;
        int actualLinksayisi = Linkelementlerilistesi.size();

        if (expectedLinksayisi==actualLinksayisi){
            System.out.println("link sayisi testi passed");

        }else {
            System.out.println("belirtilen sayida link yok test faild");

        }

        WebElement produclinki = driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[2]/a"));
        produclinki.click();

        WebElement special = driver.findElement(By.id("sale_image"));
        if (special.isDisplayed()){
            System.out.println("spiceal offer yazisi test passed");
        }else {

            System.out.println("special offer yazisi faild");
        }






    }
}
