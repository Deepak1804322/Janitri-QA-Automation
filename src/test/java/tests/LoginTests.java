
package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTests extends BaseTest {

    @Test
    public void testLoginButtonDisabledWhenFieldAreEmpty() {
        LoginPage login = new LoginPage(driver);
        Assert.assertFalse(login.isLoginButtonEnabled(), "Login button should be disabled when fields are empty.");
    }

    @Test
    public void testPasswordMaskedButton() {
        LoginPage login = new LoginPage(driver);
        Assert.assertTrue(login.isPasswordMasked(), "Password should be masked by default.");
        login.togglePasswordVisibility();
        Assert.assertFalse(login.isPasswordMasked(), "Password should be visible after toggle.");
    }

    @Test
    public void testInvalidLoginShowErrorMsg() {
        LoginPage login = new LoginPage(driver);
        login.enterCredentials("wrongUser", "wrongPass");
        login.clickLogin();
        Assert.assertTrue(login.getErrorMessage().contains("Invalid"), "Error message should show for invalid login.");
    }

    @Test
    public void testPageElementsVisible() {
        LoginPage login = new LoginPage(driver);
        Assert.assertTrue(login.areLoginElementsVisible(), "Login page elements should be visible.");
    }
}
