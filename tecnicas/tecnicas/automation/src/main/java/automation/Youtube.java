package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Youtube {
    private WebDriver driver;
    private YouTubeLogin YTBLogIn;
    private YouTubeBuscarVideo YTBSearchVideo;

    @BeforeClass
    public void initPageFactory() {
        driver = new ChromeDriver();
        YTBLogIn = PageFactory.initElements(driver, YouTubeLogin.class);
        YTBSearchVideo = PageFactory.initElements(driver, YouTubeBuscarVideo.class);
    }

    @Test (priority=1)
    public void loadPage() {
        driver.navigate().to("https://youtube.com");
        System.out.println(driver.getTitle());
        Assert.assertEquals(driver.getTitle(), "YouTube");

        // para simular un escape
        //Actions action = new Actions (driver);
        //action.sendKeys(Keys.ESCAPE).build().perform();
    }

	/*
	@Test (priority=2)
	public void login() {
		YTBLogIn.login("UUUU", "PPPP");
	}
	*/

    @Test (priority=3)
    public void searchVideo() {
        YTBSearchVideo.searchAndPlay("selenium tester");
        YTBSearchVideo.sacarAnuncios();
        YTBSearchVideo.sacarPruebaGratis();
    }

    @Test (priority=4)
    public void finishTest() {
        if(driver!=null) {
            driver.close();
            driver = null;
        }
        System.out.println("YouTube terminó satisfactoriamente");
        Assert.assertNull(driver);
    }

}

