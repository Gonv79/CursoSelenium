package tests.Practico12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.GetProperties;

public class testngSalesforce {
    private WebDriver driver;
    GetProperties properties = new GetProperties();
    private static String SALESFORCE = "https://login.salesforce.com/";

    @BeforeMethod
    private void setUp() {
        String chromeDriverUrl = properties.getString("CHROMEDRIVER_PATH");
        System.setProperty("webdriver.chrome.driver", chromeDriverUrl);
        driver = new ChromeDriver();
    }

    @Test(priority = 1, groups = {"sucessText"})
    public void validateSalesforceLogoTest() {
        driver.get(SALESFORCE);
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id='logo']")).isDisplayed());
        WebElement logo = driver.findElement(By.xpath("//*[@id='logo']"));
        System.out.println("Tag: " + logo.getTagName());
        System.out.println("alt: " + logo.getAttribute("alt"));
    }

    @Test(priority = 4, groups = {"sucessText"}, enabled = false)
    public void RememberMeIsSelected() {
        driver.get(SALESFORCE + "?locale=eu");
        WebElement rememberMe = driver.findElement(By.xpath("//*[@id='rememberUn']"));
        rememberMe.click();
        Assert.assertTrue(rememberMe.isSelected());
    }

    @Test(priority = 2, groups = {"sucessText"})
    public void FooterIsValid() {
        driver.get(SALESFORCE + "?locale=eu");
        WebElement footer = driver.findElement(By.xpath("//*[@id='footer']"));
        Assert.assertTrue(footer.getText().contains("All rights reserved"));
    }

    @Test(priority = 3, groups = {"failText"})
    public void LoginFailureTest() {
        driver.get(SALESFORCE + "?locale=eu");
        WebElement logo = driver.findElement(By.xpath("//*[@id='logo']"));
        Assert.assertTrue(logo.isDisplayed());
        driver.findElement(By.xpath("//*[@id='username']")).sendKeys("test@test.com");
        driver.findElement(By.xpath("//*[@id='password']")).sendKeys("123466");
        driver.findElement(By.xpath("//*[@id='Login']")).click();
        WebElement mensajeError = driver.findElement(By.xpath("//*[@id='error']"));
        Assert.assertTrue(mensajeError.isDisplayed());
        System.out.println("Mensaje de error: "+mensajeError.getText());
    }

}
