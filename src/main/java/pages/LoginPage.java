package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by 1 on 18.02.2018.
 */
public class LoginPage {
    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterLogin(String login){
        driver.findElement(By.id("login_mail")).sendKeys(login);
    }

    public void enterPassword(String password){
        driver.findElement(By.id("login_pass")).sendKeys(password);
    }

    public void clickLoginButton(){
        driver.findElement(By.id("login_submit")).click();
    }

    public void signIn(String login,String password){
        enterLogin(login);
        enterPassword(password);
        clickLoginButton();
    }
}
