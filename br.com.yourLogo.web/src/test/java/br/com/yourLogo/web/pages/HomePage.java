package br.com.yourLogo.web.pages;

import org.openqa.selenium.By;

public class HomePage {

    By nomeUsuario = By.xpath("//a[@class='account']/child::span");

    public By getNomeUsuario() {
        return nomeUsuario;
    }
}
