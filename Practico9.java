package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import utilities.GetProperties;

import java.util.List;

public class Practico9 {

    private WebDriver driver;

    private WebDriver iniciarWebDriver(String URL) {
        GetProperties properties = new GetProperties();
        String chromeDriverUrl = properties.getString("CHROMEDRIVER_PATH");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\nacho\\Desktop\\Drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(URL);
        return driver;
    }

    @Test
    private void Ejercicio15() {
        int maximo = 0;
        String max="";

        WebDriver driver = iniciarWebDriver("http://www.netflix.com/uy/");
        List<WebElement> h1 = driver.findElements(By.tagName("h1"));
        List<WebElement> h2 = driver.findElements(By.tagName("h2"));
        List<WebElement> h3 = driver.findElements(By.tagName("h3"));

        if (h1.size() > h2.size()) {
            if (h1.size() > h3.size()) {
                System.out.println("** La mayor cantidad de elementos es H1 con: " + h1.size());
                maximo = h1.size();
                max = "H1";
            } else {
                System.out.println("** La mayor cantidad de elementos es H3 con: " + h3.size());
                maximo = h3.size();
                max = "H3";
            }
        } else {
            if (h2.size() > h3.size()) {
                System.out.println("** La mayor cantidad de elementos es H2 con: " + h2.size());
                maximo = h2.size();
                max = "H2";
            } else {
                System.out.println("** La mayor cantidad de elementos es H3 con: " + h3.size());
                maximo = h3.size();
                max = "H3";
            }
        }

        driver.navigate().refresh();

        List<WebElement> botones = driver.findElements(By.tagName("button"));
        System.out.println("** Texto de botones: ");
        for (WebElement boton : botones) {
            try {
                System.out.println(boton.getText());
            } catch (Exception e) {
                System.out.println("Ha ocurrido un error: " + e.getMessage());
            }
        }
        if (botones.size() > maximo) {
            maximo = botones.size();
            max = "Button";
        }

        driver.manage().window().maximize();

        List<WebElement> divElements = driver.findElements(By.tagName("div"));
        System.out.println("** Cantidad elementos div: " + divElements.size());
        if (divElements.size() > maximo) {
            maximo = divElements.size();
            max = "Div";
        }

        System.out.println("** Titulo de Pagina: " + driver.getTitle());

        List<WebElement> inputElements = driver.findElements(By.tagName("input"));
        System.out.println("** Cantidad de input: " + inputElements.size());
        if (inputElements.size() > maximo) {
            maximo = inputElements.size();
            max = "Input";
        }

        List<WebElement> linkElements = driver.findElements(By.tagName("a"));
        System.out.println("** Cantidad de links: " + linkElements.size());
        if (linkElements.size() > maximo) {
            maximo = linkElements.size();
            max = "Link";
        }

        System.out.println("El elemento que mayormente se repite es: " + max + ". Se repite " + maximo + " veces.");

    }

    @Test
    private void Ejercicio16() {
        int maximo = 0;
        String max="";
        
        WebDriver driver = iniciarWebDriver("http://www.netflix.com/uy/");
        WebElement inicio = driver.findElement(By.linkText("Iniciar sesión"));
        inicio.click();

        List<WebElement> h1 = driver.findElements(By.tagName("h1"));
        System.out.println("-- Elementos H1 en la pagina --: ");
        for (WebElement uno : h1) {
            try{
                System.out.println(uno.getText());
            }catch(Exception e){
                System.out.println("Ha ocurrido un error:"+e.getMessage());
            }
        }
        List<WebElement> h2 = driver.findElements(By.tagName("h2"));
        System.out.println("-- Elementos H2 en la pagina --: ");
        for (WebElement dos : h2) {
            try{
                System.out.println(dos.getText());
            }catch(Exception e){
                System.out.println("Ha ocurrido un error:"+e.getMessage());
            }
        }

        driver.navigate().back();

        driver.navigate().refresh();

        List<WebElement> divElements = driver.findElements(By.tagName("div"));
        System.out.println("Elementos Div en la pagina: ");
        for (WebElement divElement : divElements) {
            try{
                System.out.println("-- "+divElement.getText());
            }catch(Exception e){
                System.out.println("Ha ocurrido un error:"+e.getMessage());
            }
        }
        if (divElements.size() > maximo) {
            maximo = divElements.size();
            max = "Div";
        }

        System.out.println("** Titulo de Pagina: " + driver.getTitle());

        List<WebElement> inputElements = driver.findElements(By.tagName("input"));
        System.out.println("Cantidad de Input en la pagina: "+inputElements.size());
        if (inputElements.size() > maximo) {
            maximo = inputElements.size();
            max = "Input";
        }

        List<WebElement> linkElements = driver.findElements(By.tagName("a"));
        System.out.println("Cantidad de links en la pagina: "+linkElements.size());
        if (linkElements.size() > maximo) {
            maximo = linkElements.size();
            max = "Link";
        }

        System.out.println("El elemento que mayormente se repite es: " + max + ". Se repite " + maximo + " veces.");

    }

}
