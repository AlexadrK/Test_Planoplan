

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class App00 {

    public static void main(String[] args) {
        WebDriver webDriver = new ChromeDriver();
        webDriver.get ("http://testpage1.denga.pro/");
        webDriver.findElement(By.id("login")).sendKeys("test@testserver.com");
        webDriver.findElement(By.id("pass")).sendKeys("testtest");
        webDriver.findElement(By.cssSelector("button[type='submit']")).click();

    }
}
