package automation;

import static org.testng.Assert.assertEquals;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Spotify {
    private WebDriver driver;
    private SpotifyLogin SPFYLogIn;
    private SpotifyBuscarCancion SPFYSearchSong;

    @BeforeClass
    public void initPageFactory() {
        driver = new ChromeDriver();
        SPFYLogIn = PageFactory.initElements(driver, SpotifyLogin.class);
        SPFYSearchSong = PageFactory.initElements(driver, SpotifyBuscarCancion.class);
    }

    @Test (priority=1)
    public void loadPage() {
        driver.navigate().to("https://open.spotify.com");
        String titulo = driver.getTitle();
        String expectedTitle = "Reproductor web de Spotify: música para todo el mundo";
        System.out.println(titulo);
        //Comprobamos que realmente estamos en Spotify. Buena Practica!!!
        assertEquals(titulo, expectedTitle);
        SPFYSearchSong.sacarCookies();
    }

    @Test (priority=2)
    public void login() {
        SPFYLogIn.login("ek05gnv6k8v77xyfusx4tleq4", "nuevapassword");
    }

    @Test (priority=3)
    public void searchSong() {
        SPFYSearchSong.searchAndPlay("learning to fly");
    }

    @Test (priority=4)
    public void closeDriver() {
        if(driver!=null) {
            driver.close();
            driver=null;
        }
        System.out.println("Spotify terminó satisfactoriamente");
        Assert.assertNull(driver);
    }

}

