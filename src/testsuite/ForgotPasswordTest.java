package testsuite;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Utility;

public class ForgotPasswordTest extends Utility {

        String baseUrl = "https://opensource-demo.orangehrmlive.com/";

        @Before
        public void setUp () {
            openBrowser(baseUrl);
        }
        @Test
        public void userSholdLoginSuccessfullyWithValidCredentials() {
      clickOnElement(By.xpath("//p[@class = 'oxd-text oxd-text--p orangehrm-login-forgot-header']"));
            String expectedMessage = "Reset Password";

            String actualMessage = getTextFromElement(By.xpath("//h6[@class='oxd-text oxd-text--h6 orangehrm-forgot-password-title']"));

            Assert.assertEquals("Reset Password is not working", expectedMessage, actualMessage);
    }
}
