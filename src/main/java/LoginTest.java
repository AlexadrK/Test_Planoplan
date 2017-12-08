import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by 1 on 05.12.2017.
 */
public class LoginTest {

    @Test
    public void loginFormPositiveTest(){
        WebDriver webDriver = new ChromeDriver();
        webDriver.get ("http://testpage1.denga.pro/");
        webDriver.findElement(By.id("login")).sendKeys("test@testserver.com");
        webDriver.findElement(By.id("pass")).sendKeys("testtest");
        webDriver.findElement(By.cssSelector("button[type='submit']")).click();
        //тут будем проверять, что мы залогинились, т.е. мы видим страницу с логином
        String text=webDriver.findElement(By.tagName("h1")).getText();
        Assert.assertEquals(text,"Вы вошли как пользователь - test1@testserver.com");
        webDriver.quit();
    }

    }




