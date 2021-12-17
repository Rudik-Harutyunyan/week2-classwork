package classwork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonTest {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\start\\Downloads\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");
        WebElement searchField = driver.findElement(By.id("twotabsearchtextbox"));
        searchField.sendKeys("Java");
        WebElement clickSearch = driver.findElement(By.id("nav-search-submit-button"));
        clickSearch.click();
        System.out.println(driver.getTitle());
        String firstElementDescription = driver.findElement(By.cssSelector(".a-link-normal.a-text-normal")).getText();
        String checkText = "Java";
        if (firstElementDescription.contains(checkText)){
            System.out.println("working ");
        }

    }
}
