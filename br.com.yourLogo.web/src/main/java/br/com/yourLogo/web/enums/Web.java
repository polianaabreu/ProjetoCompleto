package br.com.yourLogo.web.enums;

import br.com.yourLogo.web.interfaces.AplicacaoWeb;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public enum Web implements AplicacaoWeb {


    CHROME{
        @Override
        public WebDriver getdriver() {
            return new ChromeDriver();
        }
    },

    FIREFOX{
    @Override
    public WebDriver getdriver() {
            return  new FirefoxDriver();
        }
    }

}
