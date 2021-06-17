package br.com.yourLogo.web.steps;

import br.com.yourLogo.web.commons.BaseTest;
import br.com.yourLogo.web.funcs.CarrinhoFunc;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;

public class CarrinhoStep {

    CarrinhoFunc carrinhoFunc = new CarrinhoFunc();

    @Dado("estiver na tela women")
    public void telaWomen() {
        carrinhoFunc.entrarTelaWomen();
    }

    @E("o usuário escolher o produto desejado")
    public void escolherProdutoDesejado() {
        carrinhoFunc.produtoDesejado();
    }

    @Quando("clicar no botão {string}")
    public void botaoAddToCart(String mensagem) {
        carrinhoFunc.addToCart();
    }

    @Então("devo visualizar a msg {string}")
    public void inserirProdutoCart(String msgErro) {
    Assert.assertTrue(carrinhoFunc.verificaMsgErro());

    }

}
