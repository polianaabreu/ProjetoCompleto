package br.com.yourLogo.web.funcs;

import br.com.yourLogo.web.commons.BaseTest;
import br.com.yourLogo.web.enums.Autenticacao;
import br.com.yourLogo.web.pages.LoginPage;

public class LoginFunc extends BaseTest {

    LoginPage loginPage = new LoginPage();

    public void entrarTelaLogin() {
        driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
    }

    public void realizarLogin(String usuario) {
        String user = usuario.toUpperCase().replace(" ","_");
        String email = Autenticacao.valueOf(user).email();
        String senha = Autenticacao.valueOf(user).senha();
        driver.findElement(loginPage.getEmailAddress()).sendKeys(email);
        driver.findElement(loginPage.getPassword()).sendKeys(senha);
        driver.findElement(loginPage.getSignIn()).click();
    }

    public String getMsgErro(){
        return driver.findElement(loginPage.getMgsErro()).getText();
    }

}
