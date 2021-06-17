package br.com.yourLogo.web.funcs;

import br.com.yourLogo.web.commons.BaseTest;
import br.com.yourLogo.web.pages.HomePage;

public class HomeFunc extends BaseTest {

    HomePage homePage = new HomePage();

    public String getNomeUsuario(){
        return driver.findElement(homePage.getNomeUsuario()).getText();
    }

}
