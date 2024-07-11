package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MercadoLibreLogin {
    private WebDriver driver;
    private WebDriverWait wait;
    private Duration time;
    private WebElement userText, passwordText;

    public MercadoLibreLogin(WebDriver driver) {
        this.driver = driver;
        time = Duration.ofMillis(4000);
        wait = new WebDriverWait(this.driver, time);
    }

    public void login(String username, String password) {
        userText = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("user_id")));
        userText.sendKeys(username);
        userText.submit();

        passwordText = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("password")));
        passwordText.sendKeys(password);
        passwordText.submit();
    }
}
