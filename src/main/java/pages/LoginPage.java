
package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    WebDriver driver;

    By userIdInput = By.id("userId");
    By passwordInput = By.id("password");
    By loginButton = By.tagName("button");
    By passwordToggle = By.cssSelector("svg");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isLoginButtonEnabled() {
        return driver.findElement(loginButton).isEnabled();
    }

    public boolean isPasswordMasked() {
        WebElement passwordField = driver.findElement(passwordInput);
        return passwordField.getAttribute("type").equals("password");
    }

    public void togglePasswordVisibility() {
        driver.findElement(passwordToggle).click();
    }

    public void enterCredentials(String userId, String password) {
        driver.findElement(userIdInput).sendKeys(userId);
        driver.findElement(passwordInput).sendKeys(password);
    }

    public void clickLogin() {
        driver.findElement(loginButton).click();
    }

    public String getErrorMessage() {
        return driver.getPageSource().contains("Invalid") ? "Invalid credentials" : "";
    }

    public boolean areLoginElementsVisible() {
        return driver.findElement(userIdInput).isDisplayed() &&
               driver.findElement(passwordInput).isDisplayed() &&
               driver.findElement(passwordToggle).isDisplayed();
    }
}
