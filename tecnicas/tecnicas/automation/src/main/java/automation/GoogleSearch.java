package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class GoogleSearch {

        private WebDriver driver;

        public void launchBrowser() {
            // creamos una instancia del driver
            driver = new ChromeDriver();
        }
        public void launchTest() {
            driver.navigate().to("https://www.google.com.ar");
            String titulo = driver.getTitle();
            System.out.println("Entró en " + titulo);

            // definimos un tiempo máximo para la espera
            Duration time= Duration.ofMillis(4000);
            WebDriverWait wait = new WebDriverWait(driver, time);

            // definimos la forma de buscar el elemento en la página
            By elementLocator = By.name("q");

            //Esperamos a que cargue la barra de búsqueda
            WebElement element= wait.until(ExpectedConditions.visibilityOfElementLocated(elementLocator));

            //Escribimos en la barra de búsqueda "Los simpson"
            element.sendKeys("The Simpsons");

            //Por último, esperamos a que cargue el boton buscar y hacemos click
            element= wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("btnK")));
            element.click();
        }
        public void closeDriver() {
            if(driver!=null) {
                driver.close();
                System.out.println("Google terminó satisfactoriamente");
            }
        }

}
