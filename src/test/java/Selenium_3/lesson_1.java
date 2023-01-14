package Selenium_3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class lesson_1 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();

        System.out.println(driver.manage().window().getSize());
        System.out.println(driver.manage().window().getPosition());

        driver.manage().window().setPosition(new Point(15,15));
        driver.manage().window().setSize(new Dimension(900,600));


    }

}
