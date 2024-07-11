package automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class YouTubeBuscarVideo {
    private final WebDriver driver;
    private final WebDriverWait wait1, wait2;
    private final Duration time1;
    private final Duration time2;
    private WebElement btnAnuncio, btnPruebaGratis, searchBar, firstVideo;

    public YouTubeBuscarVideo(WebDriver driver) {
        this.driver = driver;
        time1 = Duration.ofMillis(8000);
        time2 = Duration.ofMillis(7000);
        wait1 = new WebDriverWait(this.driver, time1);
        wait2 = new WebDriverWait(this.driver, time2);
    }

    public void sacarAnuncios() {
        btnAnuncio= wait1.until(ExpectedConditions.visibilityOfElementLocated(By.className("ytp-ad-skip-button-icon")));
        btnAnuncio.click();
    }

    public void sacarPruebaGratis() {
        btnPruebaGratis= wait2.until(ExpectedConditions.visibilityOfElementLocated(By.id("dismiss-button")));
        btnPruebaGratis.click();
    }

    public void searchAndPlay(String video) {
        searchBar = wait2.until(ExpectedConditions.visibilityOfElementLocated(By.name("search_query")));
        searchBar.sendKeys(video);
        searchBar.submit();

        firstVideo = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("Automatización de Pruebas con Selenium WebDriver + Java | Tutorial paso a paso")));

        Actions action = new Actions(driver);
        action.doubleClick(firstVideo).perform();
    }
}
