package tests.Practico10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import utilities.GetProperties;

public class ejercicio10 {
    private WebDriver driver;

    private WebDriver iniciarWebDriver(String URL) {
        GetProperties properties = new GetProperties();
        String chromeDriverUrl = properties.getString("CHROMEDRIVER_PATH");
        System.setProperty("webdriver.chrome.driver", chromeDriverUrl);
        driver = new ChromeDriver();
        driver.get(URL);
        return driver;
    }

    private void setBirthdate(WebDriver driver, int unDia, String unMes, int unAño) {
        Select day = new Select(driver.findElement(By.id("day")));
        day.selectByVisibleText(String.valueOf(unDia));
        Select month = new Select(driver.findElement(By.id("month")));
        month.selectByVisibleText(unMes);
        Select year = new Select(driver.findElement(By.id("year")));
        year.selectByValue(String.valueOf(unAño));
    }
    @Test
    public void fullRegistrationTest() throws InterruptedException {
        WebDriver driver = iniciarWebDriver("https://www.facebook.com/");
        driver.findElement(By.id("u_0_2")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("u_1_b")).sendKeys("Jhon");
        driver.findElement(By.id("u_1_d")).sendKeys("Smith");
        driver.findElement(By.name("reg_email__")).sendKeys("5555555");
        driver.findElement(By.cssSelector("[name='reg_passwd__'][autocomplete='new-password']")).sendKeys("123456789");
        setBirthdate(driver, 26, "ene", 1980);
        driver.findElement(By.cssSelector("[name='sex'][value='2']")).click();
    }
}
