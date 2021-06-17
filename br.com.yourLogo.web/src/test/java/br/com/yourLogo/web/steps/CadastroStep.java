package br.com.yourLogo.web.steps;

import br.com.yourLogo.web.funcs.CadastroFunc;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;

public class CadastroStep {

    CadastroFunc cadastroFunc = new CadastroFunc();

    @Quando("preencher o cadastro de um novo usuario")
        public void preencherNovoCadastro(){
        cadastroFunc.emailValido();
    }

    @Então("deve exibir o cadastro de um novo usuario")
        public void exibirNovoCadastro(){
        cadastroFunc.preencherDadosCadastrais();
    }
}
