import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import java.lang.String;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://humanbenchmark.com/");

        Actions actions = new Actions(driver);

        driver.findElement(By.xpath("/html/body/div[1]/div/div[4]/div[2]/div[2]/div[1]/a[3]")).click();
        Thread.sleep(1000);
        System.out.println("Waited");

        WebElement Target = driver.findElement(By.xpath("/html/body/div/div/div[4]/div[1]/div/div[1]/div[2]/div/div/div[1]"));
        actions.moveToElement(Target).click().perform();
        for(int i = 0; i < 30; i++) {
            Target = driver.findElement(By.xpath("/html/body/div[1]/div/div[4]/div[1]/div/div[1]/div/div/div/div[1]"));

            actions.moveToElement(Target).click().perform();

        }
        System.exit(0);

    }

}
