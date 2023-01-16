package selenium_6;

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
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.bestbuy.com/");

        List<WebElement>buttonlist= driver.findElements(By.tagName("button"));
        System.out.println(buttonlist.size());

        for (WebElement each:buttonlist){
            System.out.println(each.getText());

            // 5 video devam

        }


    }
}
