package br.com.yourLogo.web.commons;

import br.com.yourLogo.web.interfaces.AplicacaoWeb;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BaseTest {


    private static WebDriver getDriver(){
        WebDriver webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(160, TimeUnit.SECONDS);
        return webDriver;
    }
    public static WebDriver driver;

    protected void inicializardrive(AplicacaoWeb aplicacaoWeb){

        driver= aplicacaoWeb.getdriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);


    };


}
