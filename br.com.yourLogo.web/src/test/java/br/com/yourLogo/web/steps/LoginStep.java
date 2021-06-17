package br.com.yourLogo.web.steps;

import br.com.yourLogo.web.commons.BaseTest;
import br.com.yourLogo.web.funcs.LoginFunc;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;

public class LoginStep extends BaseTest {

    LoginFunc loginFunc = new LoginFunc();

    @Dado("estiver na tela Login")
    public void  estiverTelaLogin(){
        driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
    }

    @Quando("inserir os dados do usuario {string}")
    public void inserirDadosDoUsuario(String usuario){
        loginFunc.realizarLogin(usuario);
    }

    @Então("devo visualizar a mensagem de erro {string}")
        public void mensagemErroLogin(String mensagemErro){
        Assert.assertEquals(mensagemErro,loginFunc.getMsgErro());
    }

}
