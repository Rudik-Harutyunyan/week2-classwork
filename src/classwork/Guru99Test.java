package classwork;
import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Guru99Test {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\start\\Downloads\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://demo.guru99.com/V4/");
        WebElement loginField = driver.findElement(By.name("uid"));
        loginField.sendKeys("mngr373667");
        WebElement passwordField = driver.findElement(By.name("password"));
        passwordField.sendKeys("tEtetEr");
        WebElement loginButton = driver.findElement(By.name("btnLogin"));
        loginButton.click();
        System.out.println(driver.getTitle());
        Thread.sleep(1000);


    }
}
