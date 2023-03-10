package selenium_4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class lesson_1 {

    public static void main(String[] args) {

    } {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://amazon.com");
        WebElement aramakutusu = driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));
        aramakutusu.sendKeys("nutella");
        aramakutusu.submit();

        WebElement sonucyazielementi = driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']"));
        System.out.println(sonucyazielementi.getText());

        driver.close();




    }
}
