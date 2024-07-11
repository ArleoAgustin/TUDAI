package automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class YouTubeLogin {
    private final WebDriver driver;
    private final WebDriverWait wait1, wait2;
    private final Duration time1;
    private final Duration time2;
    private WebElement acceder, username, password;

    public YouTubeLogin(WebDriver driver) {
        this.driver = driver;
        time1 = Duration.ofMillis(4000);
        time2 = Duration.ofMillis(8000);
        wait1 = new WebDriverWait(this.driver, time1);
        wait2 = new WebDriverWait(this.driver, time2);
    }

    public void login(String user, String pass) {
        acceder = wait2.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("Acceder")));
        acceder.click();

        username = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"identifierId\"]")));
        username.sendKeys(user);

        wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"identifierNext\"]/div/button/span"))).click();

        password = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input")));
        password.sendKeys(pass);

        wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"passwordNext\"]/div/button/span"))).click();
    }
}
