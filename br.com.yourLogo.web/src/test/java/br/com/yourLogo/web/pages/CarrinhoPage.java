package br.com.yourLogo.web.pages;

import org.openqa.selenium.By;

public class CarrinhoPage {

    By botaoWomen = By.xpath("//a[@title='Women']");
    By botaoQuickView = By.xpath("//*[@id=\"center_column\"]/ul/li[1]/div/div[1]/div/a[1]/img");
    By botaoAddToCart = By.xpath("//*[@id=\"center_column\"]/ul/li[1]/div/div[2]/div[2]/a[1]");
    By msg = By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[1]/h2");

    public By getBotaoWomen() {
        return botaoWomen;
    }

    public By getBotaoQuickView() {
        return botaoQuickView;
    }

    public By getBotaoAddToCart() {
        return botaoAddToCart;
    }

    public By getMsg() {
        return msg;
    }
}
