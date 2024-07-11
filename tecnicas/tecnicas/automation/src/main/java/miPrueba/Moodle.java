package miPrueba;

import automation.YouTubeBuscarVideo;
import automation.YouTubeLogin;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Moodle {

    private WebDriver driver;
    private MoodleLogin moodleLogin;
    @BeforeClass
    public void initPageFactory() {
        driver = new ChromeDriver();
        moodleLogin = PageFactory.initElements(driver, MoodleLogin.class);

    }

    @Test(priority = 1)
    public void loadPage() {
        driver.navigate().to("https://moodle.exa.unicen.edu.ar/");
        System.out.println(driver.getTitle());
        Assert.assertEquals(driver.getTitle(), "Moodle - Facultad de Ciencias Exactas");

        // para simular un escape
        //Actions action = new Actions (driver);
        //action.sendKeys(Keys.ESCAPE).build().perform();
    }

    @Test(priority = 2)
    public void login() {
        moodleLogin.login("41969678",pass);
    }

    @Test(priority = 3)
    public void finishTest() {
        if (driver != null) {
            driver.close();
            driver = null;
        }
        System.out.println("Moodle terminó satisfactoriamente");
        Assert.assertNull(driver);
    }











































    private String pass = "00";
}
