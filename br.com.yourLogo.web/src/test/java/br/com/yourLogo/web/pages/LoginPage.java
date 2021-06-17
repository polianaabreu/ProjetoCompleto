package br.com.yourLogo.web.pages;

import org.openqa.selenium.By;

public class LoginPage {

    By emailAddress = By.id("email");
    By password = By.id("passwd");
    By signIn = By.id("SubmitLogin");
    By mgsErro = By.xpath("//div[@class='alert alert-danger']/descendant::li");


    public By getEmailAddress() {
        return emailAddress;
    }

    public By getPassword() {
        return password;
    }

    public By getSignIn() {
        return signIn;
    }

    public By getMgsErro() {
        return mgsErro;
    }
}
