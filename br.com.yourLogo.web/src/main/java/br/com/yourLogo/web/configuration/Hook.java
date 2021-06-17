package br.com.yourLogo.web.configuration;

import br.com.yourLogo.web.commons.BaseTest;
import br.com.yourLogo.web.enums.Web;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hook extends BaseTest {

    @Before
    public void beforeTest() {
    super.inicializardrive(Web.CHROME);

    }

    @After
    public void afterTest(){
    driver.quit();

    }
}
