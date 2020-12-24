package tests.examen.PageObjects;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class NetflixLoginPage {
    private WebDriver driver;
    private Faker faker = new Faker();

    public NetflixLoginPage (WebDriver remoteDriver) {
        driver = remoteDriver;
    }

    public String getTitle (){
        return driver.getTitle();
    }

    public boolean validaTextoInicioSesion (){
        boolean inicia=false;
        List<WebElement> h1 = driver.findElements(By.tagName("h1"));
        for (WebElement h1s:h1) {
            if (h1s.getText().equals("Inicia sesión"))
                inicia=true;
        }
        return inicia;
    }
    public String getFacebookText (){
        return driver.findElement(By.xpath("//span[@class='fbBtnText']")).getText();
    }

    public void completeFields (String unMail, String unPassword){
        driver.findElement(By.id("id_userLoginId")).sendKeys(unMail);
        driver.findElement(By.id("id_password")).sendKeys(unPassword);

    }

    public boolean rememberMeClick (){
        driver.findElement(By.xpath("//*[@class='login-remember-me-label-text']")).click();
        WebElement rememberMe = driver.findElement(By.xpath("//*[@id='bxid_rememberMe_true']"));
        if (rememberMe.isSelected()){
            return true;
        }else{
            return false;
        }

    }

    public void iniciarSesionClick (){
        driver.findElement(By.xpath("//*[@class='btn login-button btn-submit btn-small']")).click();
    }

    public String imputError(){
        return driver.findElement(By.xpath("//*[@class='inputError']")).getText();
    }

    public void completeFieldsFaker (){
        driver.findElement(By.id("id_userLoginId")).sendKeys(faker.internet().emailAddress());
        driver.findElement(By.id("id_password")).sendKeys(faker.internet().password());

    }



}
