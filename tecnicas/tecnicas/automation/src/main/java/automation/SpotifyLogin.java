package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SpotifyLogin {
    private final WebDriver driver;
    private final WebDriverWait wait;
    private final Duration time;
    private WebElement username, password, loginBtn;

   // @FindBy(xpath="/html/body/div[3]/div/div[2]/div[1]/header/div[5]/button[2]/span")
    private WebElement initSession; //Otra alternativa!

	/* tener cuidado con este tipo de inicializaciones cuando no se cargaron los elementos aun
	@FindBy(id="login-username") WebElement loginUsr; //Otra alternativa!
	@FindBy(id="login-password") WebElement loginPsw; //Otra alternativa!
	@FindBy(id="login-button") WebElement loginBtn; //Otra alternativa!
	*/


    public SpotifyLogin(WebDriver driver) {
        this.driver = driver;
        time= Duration.ofMillis(8000);
        wait = new WebDriverWait(this.driver, time);
    }

    public void login(String user, String pass) {
        initSession = wait. until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"main\"]/div/div[2]/div[3]/header/div[6]/button[2]")));
        initSession.click();

        // en este caso esperamos a que se carguen porque puede fallar sino
        username = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("login-username")));
        username.sendKeys(user);

        password = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("login-password")));
        password.sendKeys(pass);

        loginBtn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("Button-sc-qlcn5g-0 fyugtm")));
        loginBtn.click();
    }
}

