package tests.Practico11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import utilities.GetProperties;

public class Practico11 {
    private String docusign = "https://www.spotify.com/uy/signup/";
    private WebDriver driver;

    private WebDriver iniciarWebDriver(String URL) {
        GetProperties properties = new GetProperties();
        String chromeDriverUrl = properties.getString("CHROMEDRIVER_PATH");
        System.setProperty("webdriver.chrome.driver", chromeDriverUrl);
        driver = new ChromeDriver();
        driver.get(URL);
        return driver;
    }

    @Test
    public void spotifyByName() {
        driver = iniciarWebDriver(docusign);
        driver.findElement(By.cssSelector("[placeholder='Introduce tu correo electrónico.']")).sendKeys("test@test.com");
        driver.findElement(By.cssSelector("[placeholder='Vuelve a introducir tu correo electrónico.']")).sendKeys("test@test.com");
        driver.findElement(By.cssSelector("[placeholder='Crea una contraseña.']")).sendKeys("123456789#");
        driver.findElement(By.cssSelector("[placeholder='Introduce un nombre de perfil.']")).sendKeys("JuanPerez79");
        driver.findElement(By.cssSelector("[placeholder='DD']")).sendKeys("27");
        Select meses = new Select(driver.findElement(By.cssSelector("[name=month]")));
        meses.selectByValue("09");
        driver.findElement(By.cssSelector("[placeholder='AAAA']")).sendKeys("1979");
        driver.findElement(By.xpath("//*[@id='__next']/main/div[2]/form/div[6]/div[2]/label[1]")).click();
        driver.findElement(By.xpath("//*[@id='__next']/main/div[2]/form/div[7]/label/span[1]")).click();
    }

}
