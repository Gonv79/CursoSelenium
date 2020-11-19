package tests.Practico15.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class iFrameCotizacionesPage {

    private WebDriver driver;

    public iFrameCotizacionesPage(WebDriver unDriver) {
        driver = unDriver;
    }

    public String getTabActive() {
        return driver.findElement(By.className("Tab_Active")).getText();
    }

    public void selectTab(String unTab) {
        List<WebElement> tabs = driver.findElements(By.className("Tab"));
        for (WebElement tab : tabs) {
            if (tab.getText().equals(unTab)) {
                tab.click();
            }
        }
    }

    public void itemsValues() {
        WebElement dataCount = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div/div[1]/div[2]"));

        List<WebElement> dataRow = dataCount.findElements(By.className("DataRow"));
        for (WebElement row : dataRow) {
            System.out.println(row.findElement(By.className("DataItem")).getText() + ": " + row.findElement(By.className("DataValue")).getText());
        }
    }


}
