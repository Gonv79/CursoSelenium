package tests.Practico15.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import tests.Practico15.pageObjects.TelefonicaLandingPage;
import tests.Practico15.pageObjects.iFrameCotizacionesPage;
import utilities.GetProperties;
import java.util.concurrent.TimeUnit;

public class telefonicaTest {
    GetProperties properties = new GetProperties();
    private static String TELEFONICA_URL = "https://www.telefonica.es/es/";
    WebDriver driver;
    private TelefonicaLandingPage telefonicaLandingPage;

    @BeforeMethod
    public void setup() {
        String chromeDriverUrl = properties.getString("CHROMEDRIVER_PATH");
        System.setProperty("webdriver.chrome.driver", chromeDriverUrl);
        driver = new ChromeDriver();
        driver.get(TELEFONICA_URL);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        telefonicaLandingPage = new TelefonicaLandingPage(driver);
    }

    @Test
    public void telefonicaTest() throws InterruptedException {
        telefonicaLandingPage.PrintPageTitleTest();
        telefonicaLandingPage.aceptarCookies();
        Thread.sleep(2000);
        iFrameCotizacionesPage iframe = telefonicaLandingPage.switchCotizaciones(driver);
        Assert.assertEquals(iframe.getTabActive(), "BME");
        iframe.selectTab("NYSE");
        Assert.assertEquals(iframe.getTabActive(), "NYSE");
        iframe.itemsValues();

    }
}
