import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Орест on 21.07.2016.
 */
public class NegativeTestClass {
    @Test
    public void Facebook () {
        System.setProperty("webdriver.chrome.driver","C://Users//Орест//IdeaProjects//untitled//lib//chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("email")).sendKeys("orest-1@yandex.ua");
        driver.findElement(By.id("pass")).clear();
        driver.findElement(By.id("pass")).sendKeys("werty");
        driver.findElement(By.id("u_0_m")).click();

        Assert.assertFalse(driver.findElement(By.xpath("//div[@id='content']/div")).getText().matches("^exact:The password you’ve entered is incorrect\\. Forgot Password[\\s\\S]$"));

        driver.close();
    }
    @Test
    public void Facebook2 () {
        System.setProperty("webdriver.chrome.driver", "C://Users//Орест//IdeaProjects//untitled//lib//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("email")).sendKeys("orest-1@");
        driver.findElement(By.id("pass")).clear();
        driver.findElement(By.id("pass")).sendKeys("werty");
        driver.findElement(By.id("u_0_m")).click();

        Assert.assertEquals("Эл. адрес или номер телефона, который вы указали, не соответствует ни одному аккаунту. Зарегистрируйте аккаунт.", driver.findElement(By.cssSelector("div._1tp8")).getText());

        driver.close();

    }
}
