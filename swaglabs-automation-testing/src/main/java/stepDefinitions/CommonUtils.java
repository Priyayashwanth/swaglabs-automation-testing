package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CommonUtils {
    public static void enterUsername(WebDriver driver, String username) {
        driver.findElement(By.id("user-name")).sendKeys(username);
    }
    public static void enterPassword(WebDriver driver, String password) {
        driver.findElement(By.id("password")).sendKeys(password);
    }
    public static void clickOnLogin(WebDriver driver) {
        driver.findElement(By.name("login-button")).click();
    }
}
