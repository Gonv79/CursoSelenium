package tests.Practico11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import utilities.GetProperties;

public class Practico11 {
    private String DOCUSIGN = "https://www.spotify.com/uy/signup/";
    private WebDriver DRIVER;

    private WebDriver iniciarWebDriver(String URL) {
        GetProperties properties = new GetProperties();
        String chromeDriverUrl = properties.getString("CHROMEDRIVER_PATH");
        System.setProperty("webdriver.chrome.driver", chromeDriverUrl);
        DRIVER = new ChromeDriver();
        DRIVER.get(URL);
        return DRIVER;
    }

    @Test
    public void spotifyByName() {
        DRIVER = iniciarWebDriver(DOCUSIGN);
        DRIVER.findElement(By.cssSelector("[placeholder='Introduce tu correo electrónico.']")).sendKeys("test@test.com");
        DRIVER.findElement(By.cssSelector("[placeholder='Vuelve a introducir tu correo electrónico.']")).sendKeys("test@test.com");
        DRIVER.findElement(By.cssSelector("[placeholder='Crea una contraseña.']")).sendKeys("123456789#");
        DRIVER.findElement(By.cssSelector("[placeholder='Introduce un nombre de perfil.']")).sendKeys("JuanPerez79");
        DRIVER.findElement(By.cssSelector("[placeholder='DD']")).sendKeys("27");
        Select meses = new Select(DRIVER.findElement(By.cssSelector("[name=month]")));
        meses.selectByValue("09");
        DRIVER.findElement(By.cssSelector("[placeholder='AAAA']")).sendKeys("1979");
        DRIVER.findElement(By.xpath("//div[6]/div[2]/label[1]/span[1]")).click();
        DRIVER.findElement(By.xpath("//div[7]/label[1]/span[1]")).click();
    }

}
