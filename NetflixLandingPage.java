package tests.examen.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class NetflixLandingPage {
    private WebDriver driver;

    public NetflixLandingPage (WebDriver remoteDriver) {
        driver = remoteDriver;
    }

    public String getTitle (){
        return driver.getTitle();
    }

    public NetflixLoginPage iniciaSesionClick () {
        driver.findElement(By.xpath("//*[@class='authLinks redButton']")).click();
        return new NetflixLoginPage(driver);
    }



}
