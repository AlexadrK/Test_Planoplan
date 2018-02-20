

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.LoginPage;
import pages.MainPage;

import java.util.concurrent.TimeUnit;

public class Login_test {

    public static void main(String[] args) {
        WebDriver webDriver = new ChromeDriver();
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        webDriver.get ("https://planoplan.com/");
        MainPage mainPage = new MainPage(webDriver);
        LoginPage loginPage= mainPage.clickLogin();
        loginPage.signIn("for_testbox_1@mail.ru","123456");
        webDriver.findElement(By.linkText("Редактирование")).click();
    }
}
