package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class MercadoLibre {

        private WebDriver driver;
        private MercadoLibreBuscarProducto MLBuscar;
        private MercadoLibreLogin MLLogin;

        @BeforeClass
        public void initPageFactory() {
            driver = new ChromeDriver();
            MLBuscar = PageFactory.initElements(driver, MercadoLibreBuscarProducto.class);
            MLLogin= PageFactory.initElements(driver, MercadoLibreLogin.class);
        }

        @Test(priority=1)
        public void loadPage() {
            driver.navigate().to("https://mercadolibre.com.ar");
            System.out.println(driver.getTitle());
         //   Assert.assertEquals(driver.getTitle(), "Mercado Libre Argentina - Envíos Gratis en el día");
            MLBuscar.sacarCookies();
      //      MLBuscar.eliminarUbicacion();
        }

	/*
	@Test (priority=2)
	public void login() {
		Duration time=Duration.ofMillis(4000);
		WebDriverWait wait = new WebDriverWait(driver, time);
		WebElement btnIngresar= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"nav-header-menu\"]/a[2]"))); /html/body/div[2]/div[1]/div/div[2]/button[1]
		btnIngresar.click();
		MLLogin.login("pepe", "pepe");
	}*/

        @Test (priority=3)
        public void searchProduct() {
            final String textoAbuscar="Placa de video Nvidia MSI Ventus GeForce RTX 20 Series RTX 2060 SUPER GEFORCE RTX 2060 SUPER VENTUS GP OC OC Edition 8GB";
            MLBuscar.search("GPU");
            MLBuscar.scrolear(textoAbuscar);
        }

        @Test(priority=4)
        public void finishTest() {
            if(driver!=null) {
                driver.close();
                driver = null;
            }
            System.out.println("Mercado Libre terminó satisfactoriamente");
            Assert.assertNull(driver);
        }
    }

