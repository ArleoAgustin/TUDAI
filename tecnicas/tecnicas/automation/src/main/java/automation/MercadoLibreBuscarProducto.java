package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class MercadoLibreBuscarProducto {
    private final WebDriver driver;
    private final WebDriverWait wait;
    private final Duration time;
    private WebElement searchbar, btnCookies, btnUbicacion;

    public MercadoLibreBuscarProducto(WebDriver driver) {
        this.driver = driver;
        time=Duration.ofMillis(4000);
        wait = new WebDriverWait(this.driver, time);
    }

    public void search(String busqueda) {
        searchbar = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("nav-search-input")));
        searchbar.clear();
        searchbar.sendKeys(busqueda);
        searchbar.submit();
    }

    public void sacarCookies() {
        btnCookies= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[2]/div[1]/div/div[2]/button[1]")));
        btnCookies.click();
    }

    public void eliminarUbicacion() {
        btnUbicacion = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/div[2]/button[2]/span")));
        btnUbicacion.click();
    }

    public void scrolear(String textoABuscar) {
        //Scroleamos, para ello es necesario ejecutar funcionalidad Javascript
        JavascriptExecutor js = (JavascriptExecutor) driver;
        boolean findElement=false;
        while (findElement == false) {
            js.executeScript("window.scrollBy(0,350)", ""); //scroleamos
            try {
                Duration time= Duration.ofMillis(8000);
                WebDriverWait wait = new WebDriverWait(driver, time);
                WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText(textoABuscar)));
                findElement = true;
                element.click();
            }
            catch(Exception e){
                findElement = false;
            }
        }
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
