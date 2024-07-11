package miPrueba;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class MoodleLogin {

    private final WebDriver driver;
    private final WebDriverWait wait1, wait2;
    private final Duration time1;
    private final Duration time2;
    private WebElement acceder, username, password;


    public MoodleLogin(WebDriver driver) {
        this.driver = driver;
        time1 = Duration.ofMillis(4000);
        time2 = Duration.ofMillis(8000);
        wait1 = new WebDriverWait(this.driver, time1);
        wait2 = new WebDriverWait(this.driver, time2);
    }

    @Test
    public void login(String user, String pass) {

        username = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"username\"]")));
        username.sendKeys(user);

        //wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"identifierNext\"]/div/button/span"))).click();

        password = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"password\"]")));
        password.sendKeys(pass);

        wait1.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("button"))).click();

    }
}
