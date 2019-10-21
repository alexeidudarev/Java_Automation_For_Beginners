import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class RanyarTest {

    WebDriver driver;
    @BeforeMethod
    public void setup(){
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }
    @AfterMethod
    public void close(){
        driver.quit();
    }
    @Test
    public void findTicket() throws InterruptedException {
        driver.get("https://www.ryanair.com/gb/en/");
        //closing banner
        driver.findElement(
                By.xpath("//*[@id=\"cookie-popup\"]//*[@id=\"glyphs.close\"]")).click();

        //field from
        /*
        driver.findElement(
                By.xpath("//input[@placeholder='Departure airport']"))
                .clear();
        driver.findElement(
                By.xpath("//input[@placeholder='Departure airport']"))
                .sendKeys("Tel"+" "+"Aviv");

         */

        //field to
        driver.findElement(
                By.xpath("//input[@placeholder='Destination airport']"))
                .click();
        driver.findElement(
                By.xpath("//input[@placeholder='Destination airport']"))
                .sendKeys("Bologna");
        driver.findElement(
                By.xpath("//input[@placeholder='Destination airport']"))
                .sendKeys(Keys.RETURN);
        //date from
        driver.findElement(
                By.xpath("//div[@class='focused']//input[@placeholder='DD']"))
                .clear();
        driver.findElement(
                By.xpath("//div[@class='focused']//input[@placeholder='DD']"))
                .sendKeys("22");
        driver.findElement(
                By.xpath("//div[@class='focused']//input[@placeholder='MM']"))
                .clear();
        driver.findElement(
                By.xpath("//div[@class='focused']//input[@placeholder='MM']"))
                .sendKeys("01");
        driver.findElement(
                By.xpath("//div[@class='focused']//input[@placeholder='YYYY']"))
                .clear();
        driver.findElement(
                By.xpath("//div[@class='focused']//input[@placeholder='YYYY']"))
                .sendKeys("2020");

        //date to

        //
        //
        driver.findElement(
                By.xpath("//*[@id=\"row-dates-pax\"]/div[1]/div/div[2]/div/div[2]/label"))
                .click();
        driver.findElement(
                By.xpath("//div[@class='focused']//input[@placeholder='DD']"))
                .clear();
        driver.findElement(
                By.xpath("//div[@class='focused']//input[@placeholder='DD']"))
                .sendKeys("25");
        driver.findElement(
                By.xpath("//div[@class='focused']//input[@placeholder='MM']"))
                .clear();
        driver.findElement(
                By.xpath("//div[@class='focused']//input[@placeholder='MM']"))
                .sendKeys("01");
        driver.findElement(
                By.xpath("//div[@class='focused']//input[@placeholder='YYYY']"))
                .clear();
        driver.findElement(
                By.xpath("//div[@class='focused']//input[@placeholder='YYYY']"))
                .sendKeys("2020");
        //click on lets go button
        driver.findElement(By.xpath("//span[contains(text(),\"Let's go!\")]")).click();
        Thread.sleep(10000);

    }
}
