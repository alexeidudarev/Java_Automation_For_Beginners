import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class FirstTest {
    WebDriver driver;

    @Test
    public void searchGoogleTest() throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://www.google.com");
        driver.findElement(By.xpath(".//input[@name='q']")).sendKeys("cats");
        driver.findElement(By.xpath(".//div[@class='FPdoLc VlcLAe']//input[@name='btnK']")).click();
        driver.quit();
    }

}
