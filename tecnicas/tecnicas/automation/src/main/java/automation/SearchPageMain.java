package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchPageMain {

        private static WebDriver driver;
        public static void main(String[] args) {
            driver = new ChromeDriver();
            driver.get("https://google.com.ar");
            SearchPage searchPage = new SearchPage(driver);
            searchPage.buscar("The Simpsons");
            driver.quit();
        }
}
