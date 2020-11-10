package tests.Practico12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import utilities.GetProperties;

import java.util.List;

public class spotifyTestWithParameters {
    private WebDriver driver;
    GetProperties properties = new GetProperties();
    private static String SPOTIFY = "https://www.spotify.com/uy/";

    @BeforeMethod
    private void setUp() {
        String chromeDriverUrl = properties.getString("CHROMEDRIVER_PATH");
        System.setProperty("webdriver.chrome.driver", chromeDriverUrl);
        driver = new ChromeDriver();
    }

    @Test
    @Parameters(value = {"specificTag"})
    public void spotifyTags(@Optional("h1") String unH) {
        driver.get(SPOTIFY);
        Assert.assertTrue(driver.getCurrentUrl().equals(SPOTIFY));
        List<WebElement> todosH = driver.findElements(By.tagName(unH));
        for (WebElement h:todosH){
            System.out.println("--> "+h.getTagName()+" . text: "+h.getText());
        };

    }
}

