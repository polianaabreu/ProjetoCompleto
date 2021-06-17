package br.com.yourLogo.web.funcs;

import br.com.yourLogo.web.commons.BaseTest;
import br.com.yourLogo.web.pages.CadastroPage;
import com.github.javafaker.Faker;
import org.openqa.selenium.support.ui.Select;

import java.util.Locale;

public class CadastroFunc extends BaseTest {

    CadastroPage cadastroPage = new CadastroPage();
    Faker faker = new Faker(new Locale("pt-BR"));


    public void emailValido() {
        String email = faker.internet().emailAddress();
        driver.findElement(cadastroPage.getEmail()).sendKeys(email);
        driver.findElement(cadastroPage.getBotaoCreate()).click();
    }
    public void cadastroPessoal() {
        driver.findElement(cadastroPage.getBotaoFirstName()).sendKeys(faker.name().firstName());
        driver.findElement(cadastroPage.getBotaoLastName()).sendKeys(faker.name().lastName());
        driver.findElement(cadastroPage.getBotaoPassword()).sendKeys("senhateste123");
        Select dia = new Select(driver.findElement(cadastroPage.getDiaAniversario()));
        dia.selectByValue("27");
        Select mes = new Select(driver.findElement(cadastroPage.getMesAniversario()));
        mes.selectByValue("10");
        Select ano = new Select(driver.findElement(cadastroPage.getAnoNascimento()));
        ano.selectByValue("1994");
    }

    public void cadastroEndereco() {
        driver.findElement(cadastroPage.getBotaoEndereco()).sendKeys("Rua teste mentoria");
        driver.findElement(cadastroPage.getBotaoCity()).sendKeys("Teste");
        Select estado = new Select(driver.findElement(cadastroPage.getBotaoState()));
        estado.selectByVisibleText("Alabama");
        driver.findElement(cadastroPage.getBotaoZip()).sendKeys("98765");
        driver.findElement(cadastroPage.getBotaoCountry()).click();
        driver.findElement(cadastroPage.getBotaoPhone()).sendKeys("11 656543098");
        driver.findElement(cadastroPage.getBotaoMyAddress()).click();
    }

    public void preencherDadosCadastrais() {
        this.cadastroPessoal();
        this.cadastroEndereco();
        driver.findElement(cadastroPage.getBotaoRegister()).click();
    }
}
