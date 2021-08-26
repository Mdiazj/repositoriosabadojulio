package clase10;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.awt.*;
import java.util.List;


public class registrationFacebookTest {



    public WebDriver getChromeDriver(String URL) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(URL);
        return driver;
    }

    @Test
    public void fullRegistrationTest() throws InterruptedException {
        WebDriver driver = getChromeDriver("https://www.facebook.com/");

        driver.findElement(By.linkText("Crear cuenta nueva")).click();

        Thread.sleep(1500);
        driver.findElement(By.name("firstname")).sendKeys("John");
        driver.findElement(By.name("lastname")).sendKeys("Smith");
        driver.findElement(By.name("reg_email__")).sendKeys("5555555");
        driver.findElement(By.id("password_step_input")).sendKeys("123456789");


        WebElement elementoDias = driver.findElement(By.name("birthday_day"));
        Select dropdownDias = new Select(elementoDias);
        dropdownDias.selectByValue("26");



        driver.findElement(By.name("birthday_month")).sendKeys("jun");
        driver.findElement(By.name("birthday_year")).sendKeys("1980");


        List<WebElement> listaGeneros = driver.findElements(By.name("sex"));
        WebElement mujerRadioButton = listaGeneros.get(0);
        mujerRadioButton.click();


    }
}
