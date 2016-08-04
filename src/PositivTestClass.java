import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

/**
 * Created by Орест on 28.07.2016.
 */
public class PositivTestClass {
    @Test
    public void LogIn () {
        System.setProperty("webdriver.chrome.driver", "C://Users//Орест//IdeaProjects//untitled//lib//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");
        driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("email")).sendKeys("orest-1@yandex.ua");
        driver.findElement(By.id("pass")).clear();
        driver.findElement(By.id("pass")).sendKeys("werty1234");
        driver.findElement(By.id("u_0_m")).click();
        driver.close();
    }
    @Test
    public void LogOut () throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C://Users//Орест//IdeaProjects//untitled//lib//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");
        driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("email")).sendKeys("orest-1@yandex.ua");
        driver.findElement(By.id("pass")).clear();
        driver.findElement(By.id("pass")).sendKeys("werty1234");
        driver.findElement(By.id("u_0_m")).click();
        driver.findElement(By.id("userNavigationLabel")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[@id='BLUE_BAR_ID_DO_NOT_USE']/div/div/div/div/div/ul/li[12]/a/span/span")).click();
        driver.close();
    }
}
