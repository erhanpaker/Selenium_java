package lesson_13;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class lesson_1 {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("http://zero.webappsecurity.com/");
        driver.findElement(By.xpath("//button[@id='signin_button']")).click();
        WebElement userName = driver.findElement(By.xpath("//input[@id='user_login']"));
        userName.sendKeys("username");

        WebElement login = driver.findElement(By.xpath("//input[@id='user_password']"));
        login.sendKeys("password");

        driver.findElement(By.xpath("//input[@type='submit']")).click();
        driver.navigate().back();

        driver.findElement(By.xpath("  //strong[text()='Online Banking']")).click();
        driver.findElement(By.xpath("//span[@id='pay_bills_link']")).click();

        WebElement PAY = driver.findElement(By.xpath("//input[@id='sp_amount']"));
        PAY.sendKeys("109090");

        driver.findElement(By.xpath("//input[@id='sp_amount']")).sendKeys("2020-09-10");
        WebElement buttonm = driver.findElement(By.xpath("//input[@class='btn btn-primary']"));
        buttonm.click();



    }
}
