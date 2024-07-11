package automation;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SpotifyBuscarCancion {
    private final WebDriver driver;
    private final WebDriverWait wait1, wait2;
    private final Duration time1;
    private final Duration time2;;
    private WebElement btnCookies, searchButton, searchBar, firstSong;

    public SpotifyBuscarCancion(WebDriver driver) {
        this.driver = driver;
        time1=Duration.ofMillis(4000);
        time2= Duration.ofMillis(8000);
        wait1 = new WebDriverWait(this.driver, time1);
        wait2 = new WebDriverWait(this.driver, time2);
    }

    public void sacarCookies() {
        btnCookies= wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"onetrust-close-btn-container\"]/button")));
        btnCookies.click();
    }

    public void searchAndPlay(String song) {
        searchButton = wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"main\"]/div/div[2]/div[2]/nav/div[1]/ul/li[2]/a/span")));
        searchButton.click();

        searchBar = wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"main\"]/div/div[2]/div[1]/header/div[3]/div/div/form/input")));
        searchBar.sendKeys(song);

        firstSong = wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"searchPage\"]/div/div/section[2]/div[2]/div/div/div/div[2]/div[1]/div/div[1]/div[1]/img")));

        //Para hacer movimientos del mouse mas complejos! drag and drop
        Actions action = new Actions(driver);
        action.doubleClick(firstSong).perform();
    }
}
