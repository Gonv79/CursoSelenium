package tests.examen.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import tests.examen.PageObjects.NetflixLandingPage;
import tests.examen.PageObjects.NetflixLoginPage;
import utilities.GetProperties;

import java.util.concurrent.TimeUnit;

public class prueba_netflix {

    GetProperties properties = new GetProperties();
    private static String NETFLIX_URL = "https://www.netflix.com/ ";
    WebDriver driver;
    private NetflixLandingPage netflixLandingPage;
    private NetflixLoginPage netflixLoginPage;

    @BeforeMethod (groups = "successTest")
    public void setup() {
        String chromeDriverUrl = properties.getString("CHROMEDRIVER_PATH");
        System.setProperty("webdriver.chrome.driver", chromeDriverUrl);
        driver = new ChromeDriver();
        driver.get(NETFLIX_URL);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        netflixLandingPage = new NetflixLandingPage (driver);
        driver.manage().window().maximize();
    }

    @Test (priority = 1, groups = "successTest")
    public void validarTituloTest () {
        Assert.assertEquals(netflixLandingPage.getTitle(),"Netflix Argentina: Ve series online, ve películas online");

    }

    @Test(priority = 2, groups = "successTest")
    public void  iniciarSesionPageTest() {
        netflixLoginPage = netflixLandingPage.iniciaSesionClick();
        Assert.assertEquals(netflixLoginPage.getTitle(),"Netflix");
        Assert.assertTrue(netflixLoginPage.validaTextoInicioSesion());
        Assert.assertEquals(netflixLoginPage.getFacebookText(),"Iniciar sesión con Facebook");

    }

    @Test (priority = 3, groups = "failTest")
    public void loginToNetflixErrorTest() {
        netflixLoginPage.completeFields("XXX", "holamundo");
        Assert.assertFalse(netflixLoginPage.rememberMeClick());
        netflixLoginPage.iniciarSesionClick();
        Assert.assertEquals(netflixLoginPage.imputError(), "Escribe un email válido.");
    }

    @Test (priority = 4, groups = "failTest")
    public void fakeEmailTest() {
        netflixLoginPage = netflixLandingPage.iniciaSesionClick();
        netflixLoginPage.completeFieldsFaker();
        netflixLoginPage.iniciarSesionClick();

    }

    @Test(priority = 5, groups = "failTest", dataProviderClass = NetflixDataProvider.class, dataProvider = "email")
    public void dataProviderEmailTest( String unemail, String unaPassword) {
        netflixLoginPage = netflixLandingPage.iniciaSesionClick();
        netflixLoginPage.completeFields(unemail, unaPassword);
        netflixLoginPage.iniciarSesionClick();
    }


    @AfterMethod (groups = "successTest")
    public void tearDown() throws InterruptedException {
        Thread.sleep(10000);
        driver.close();
    }

}
