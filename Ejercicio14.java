import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio14 {

    @Test

    public void ejercicio1() {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.netflix.com");


        WebElement h1 = driver.findElement(By.tagName("h1"));
        List<WebElement> listaH1s = driver.findElements(By.tagName("h1"));
        System.out.println("Se impriminen las etiquetas h1s");
        for (WebElement elementoH1 : listaH1s) {
            System.out.println("******" + elementoH1.getText());
        }


        System.out.println("************************");
        WebElement h2 = driver.findElement(By.tagName("h2"));
        List<WebElement> listaH2s = driver.findElements(By.tagName("h2"));
        System.out.println("Se imprimen las etiquetas h2s");
        for (WebElement elementoH2 : listaH2s) {
            System.out.println("******" + elementoH2.getText());
        }

        driver.navigate().refresh();

        System.out.println("************************");
        WebElement button = driver.findElement(By.tagName("button"));
        List<WebElement> listabuttons = driver.findElements(By.tagName("button"));
        System.out.println("Se imprimen los textos  con etiqueta <button>");
        for (WebElement elementobutton : listabuttons) {
            if (button.getText().isEmpty() == false) {
                System.out.println("******" + elementobutton.getText());
            }
        }

        System.out.println("************************");
        WebElement div = driver.findElement(By.tagName("div"));
        List<WebElement> divElements = driver.findElements(By.tagName("div"));
        System.out.println(" la cantidad de elementos divs es: " + divElements.size());



        System.out.println("************************");
        System.out.println("SE MUESTRA TITULO DE LA PAGINA ");
        System.out.println("-------->" + driver.getTitle());


        System.out.println("************************");
        WebElement link = driver.findElement(By.tagName("link"));
        List<WebElement> listalinks = driver.findElements(By.tagName("link"));
        System.out.println(" la cantidad de elementos links es: " + listalinks.size());
        for (WebElement elementolink : listalinks) {
            if (link.getText().isEmpty() == false) {
                System.out.println("******" + link.getText());

            }
        }

    }
}

