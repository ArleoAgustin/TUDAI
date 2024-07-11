package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SearchPage {

    @FindBy(name = "q")
    private WebElement q;

    @FindBy(name = "btnK")
    private WebElement btnK;

    private WebDriver driver;

    // Constructor
    public SearchPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }

    public void buscar(String busqueda) {
        q.sendKeys(busqueda);
        // espera ocupada (faltan las exceptions)
        //TimeUnit.SECONDS.sleep(3);

        // o usamos la espera de Selenium
        Duration time= Duration.ofMillis(4000);
        WebDriverWait wait = new WebDriverWait(driver, time);
        //Esperamos a que cargue el boton
        WebElement element= wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("btnK")));

        btnK.click();
    }
}