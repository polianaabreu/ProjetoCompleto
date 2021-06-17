package br.com.yourLogo.web.pages;

import org.openqa.selenium.By;

public class CadastroPage {

    By email= By.id("email_create");
    By botaoCreate = By.id("SubmitCreate");
    By botaoFirstName = By.id("customer_firstname");
    By botaoLastName = By.id("customer_lastname");
    By diaAniversario = By.id("days");
    By mesAniversario = By.id("months");
    By anoNascimento = By.id("years");
    By botaoPassword = By.id("passwd");
    By botaoEndereco = By.id("address1");
    By botaoCity = By.id("city");
    By botaoState = By.id("id_state");
    By botaoZip = By.id("postcode");
    By botaoCountry = By.id("id_country");
    By botaoPhone = By.id("phone_mobile");
    By botaoMyAddress = By.xpath("//input[@name='alias']");
    By botaoRegister = By.id("submitAccount");

    public By getEmail() {
        return email;
    }

    public By getBotaoCreate() {
        return botaoCreate;
    }

    public By getBotaoFirstName() {
        return botaoFirstName;
    }

    public By getBotaoLastName() {
        return botaoLastName;
    }

    public By getDiaAniversario() {
        return diaAniversario;
    }

    public By getMesAniversario() {
        return mesAniversario;
    }

    public By getAnoNascimento() {
        return anoNascimento;
    }

    public By getBotaoPassword() {
        return botaoPassword;
    }

    public By getBotaoEndereco() {
        return botaoEndereco;
    }

    public By getBotaoCity() {
        return botaoCity;
    }

    public By getBotaoState() {
        return botaoState;
    }

    public By getBotaoZip() {
        return botaoZip;
    }

    public By getBotaoCountry() {
        return botaoCountry;
    }

    public By getBotaoPhone() {
        return botaoPhone;
    }

    public By getBotaoMyAddress() {
        return botaoMyAddress;
    }

    public By getBotaoRegister() {
        return botaoRegister;
    }
}
