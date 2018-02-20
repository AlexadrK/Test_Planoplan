package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by 1 on 18.02.2018.
 */
public class MainPage {
    private WebDriver driver;

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    public LoginPage clickLogin(){
        driver.findElement(By.cssSelector("a[data-template='#login_box']")).click();
        return new LoginPage(driver);
    }
}
