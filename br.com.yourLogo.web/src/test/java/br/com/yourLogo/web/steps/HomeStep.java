package br.com.yourLogo.web.steps;

import br.com.yourLogo.web.funcs.HomeFunc;
import io.cucumber.java.pt.Então;
import org.junit.Assert;

public class HomeStep {

    HomeFunc homeFunc = new HomeFunc();

    @Então("devo visualizar o nome {string}")
    public void visualizarNome(String usuario){
        Assert.assertEquals(usuario,homeFunc.getNomeUsuario());
    }
}
