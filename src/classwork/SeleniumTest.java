package classwork;

import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
//comment the above line and uncomment below line to use Chrome
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
    public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\start\\Downloads\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.get("https://www.list.am/");
        WebElement elem = driver.findElement(By.id("idSearchBox"));
        Thread.sleep(1000);
        elem.clear();
        Thread.sleep(1000);
        elem.sendKeys("Iphone");
        Thread.sleep(1000);
        String actualTitle = driver.getTitle();
        System.out.print("******** " + actualTitle + " ********");
        Thread.sleep(2000);
        driver.quit();
    }

}

