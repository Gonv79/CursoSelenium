package tests.Practico15.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class TelefonicaLandingPage {

    private WebDriver driver;

    public TelefonicaLandingPage(WebDriver unDriver) {
        driver = unDriver;
    }

    public String getTitleTest() {
        return driver.getTitle();
    }

    public void PrintPageTitleTest(){
        System.out.println("Titulo: " + getTitleTest());
    }

    public void aceptarCookies() {
        driver.findElement(By.xpath("//*[@id='onetrust-accept-btn-handler']")).click();
    }

    public WebElement iframeCotizaciones() {
        WebElement iframeCotizaciones = driver.findElement(By.xpath("//*[@id='euroland-ticker-es']"));
        return iframeCotizaciones;
    }

    public iFrameCotizacionesPage switchCotizaciones(WebDriver unDriver) {
        driver.switchTo().frame(iframeCotizaciones());
        return new iFrameCotizacionesPage(unDriver);
    }

}
