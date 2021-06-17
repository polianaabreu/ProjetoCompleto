package br.com.yourLogo.web.funcs;

import br.com.yourLogo.web.commons.BaseTest;
import br.com.yourLogo.web.pages.CarrinhoPage;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class CarrinhoFunc extends BaseTest {

    CarrinhoPage carrinhoPage = new CarrinhoPage();

    public void entrarTelaWomen(){
        driver.get("http://automationpractice.com/index.php");
        driver.findElement(carrinhoPage.getBotaoWomen()).click();
    }

    public void produtoDesejado(){
       Actions actions = new Actions(driver);
       actions.moveToElement(driver.findElement(carrinhoPage.getBotaoQuickView())).build().perform();
    }

    public void addToCart(){
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(carrinhoPage.getBotaoAddToCart()).click();

    }
    public Boolean verificaMsgErro(){
      return driver.getPageSource().contains("Product successfully added to your shopping cart");

    }

}
