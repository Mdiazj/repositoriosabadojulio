package clase11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

public class SpotifyWithCssSelectorTest {

    public WebDriver getChromeDriver(String URL) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(URL);
        return driver;
    }

    //atributo id
    @Test

    public void registrationTestById() {
        WebDriver driver = getChromeDriver("https://www.spotify.com");

        WebElement registrarseBtn = driver.findElement(By.cssSelector("[href='https://www.spotify.com/cl/signup/']"));
        registrarseBtn.click();

        driver.findElement(By.cssSelector("#email")).sendKeys("testting@test.com");
        driver.findElement(By.cssSelector("#confirm")).sendKeys("testting@test.com");
        driver.findElement(By.cssSelector("#password")).sendKeys("hola mundo");
        driver.findElement(By.cssSelector("#displayname")).sendKeys("automation");
        driver.findElement(By.cssSelector("#day")).sendKeys("12");


    }

    //atributo name
    @Test

    public void registrationTestByName() throws InterruptedException {
        WebDriver driver = getChromeDriver("https://www.spotify.com");

        Thread.sleep(2000);


        WebElement registrarseBtn = driver.findElement(By.cssSelector("[href='https://www.spotify.com/cl/signup/']"));
        registrarseBtn.click();

        driver.findElement(By.cssSelector("[name='email']")).sendKeys("testing@test.com");
        driver.findElement(By.cssSelector("[name='confirm']")).sendKeys("testing@test.com");
        driver.findElement(By.cssSelector("[name='password']")).sendKeys("holamundo");
        driver.findElement(By.cssSelector("[name='displayname']")).sendKeys("automation");
    }

    //atributo placeholder
    @Test
    public void registrationTestByPlaceHolder() throws InterruptedException {
        WebDriver driver = getChromeDriver("https://www.spotify.com");

        Thread.sleep(2000);

        WebElement registrarseBtn = driver.findElement(By.cssSelector("[href='https://www.spotify.com/cl/signup/']"));
        registrarseBtn.click();

        driver.findElement(By.cssSelector("[placeholder='Introduce tu correo electrónico.']")).sendKeys("testing@test.com");
        driver.findElement(By.cssSelector("[placeholder='Vuelve a introducir tu correo electrónico.']")).sendKeys("testing@test.com");
        driver.findElement(By.cssSelector("[placeholder='Crea una contraseña.']")).sendKeys("holamundo");
        driver.findElement(By.cssSelector("[placeholder='Introduce un nombre de perfil.']")).sendKeys("automation");


    }

    @Test
    public void registrationTestXpathName() throws InterruptedException {
        WebDriver driver = getChromeDriver("https://www.spotify.com");

        Thread.sleep(2000);

        driver.findElement(By.xpath("//*[@href='https://www.spotify.com/cl/signup']")).click();
        driver.findElement(By.xpath("//*[@name='email']")).sendKeys("xpath@xpath.com");
        driver.findElement(By.xpath("//*[@name='confirm']")).sendKeys("xpath@xpath.com");
        driver.findElement(By.xpath("//*[@name='password']")).sendKeys("xpath@xpath.com");
        driver.findElement(By.xpath("//*[@id='displayname']")).sendKeys("xpath@xpath.com");


    }

    //Ejercicio Git Practico 11 ejercicio 7

    @Test
    public void spotifyByPlaceHolder() throws InterruptedException {
        WebDriver driver = getChromeDriver("https://www.spotify.com");

        Thread.sleep(2000);

        WebElement registrarseBtn = driver.findElement(By.cssSelector("[href='https://www.spotify.com/cl/signup/']"));
        registrarseBtn.click();

        driver.findElement(By.cssSelector("[placeholder='Introduce tu correo electrónico.']")).sendKeys("maribel.diaz.j@gmail.com");
        driver.findElement(By.cssSelector("[placeholder='Vuelve a introducir tu correo electrónico.']")).sendKeys("maribel.diaz.j@gmail.com");
        driver.findElement(By.cssSelector("[placeholder='Crea una contraseña.']")).sendKeys("cursoSelenium");
        driver.findElement(By.cssSelector("[placeholder='Introduce un nombre de perfil.']")).sendKeys("Maribel");

        driver.findElement(By.cssSelector("[placeholder='DD']")).sendKeys("06");
        Select drpMonth = new Select(driver.findElement(By.cssSelector("#month")));
        drpMonth.selectByValue("10");
        driver.findElement(By.cssSelector("[placeholder='AAAA']")).sendKeys("1986");

        List<WebElement> radio = driver.findElements(By.name("gender"));
        radio.get(1).sendKeys(" ");
        driver.findElement(By.cssSelector("#marketing-opt-checkbox")).sendKeys(" ");

        driver.findElement(By.cssSelector("[method='POST']")).submit();





    }




}










