package stepsdefs;

import Pages.HomePageTricentis;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

    public class StepDefinitions {

        WebDriver driver;
        HomePageTricentis pageTricentis;

        private HomePageTricentis getLoginPage() {
            if (pageTricentis == null)
                pageTricentis = PageFactory.initElements(driver, HomePageTricentis.class);
            return pageTricentis;
        }

        @Given("^Que eu estou na pagina Tricentis$")
        public void que_que_estou_na_pagina_principal_do_Gmail () throws Exception
        {
            System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/main/resources/Webdrivers/chromedriver.exe");
            driver = new ChromeDriver();
            driver.navigate().to("http://sampleapp.tricentis.com/101/app.php");
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        }

        @Given("^Preencho os campos necessarios e envio$")
        public void forneco_as_credenciais_validas () throws Exception {
            HomePageTricentis Login = PageFactory.initElements(driver, HomePageTricentis.class);
//            Login.Wait_and_Fill_txtemail("testingqab3@gmail.com");
//            Login.waitForbtnProximo();
//            Login.ClickOnNextButton();
//            Login.Wait_and_Fill_txtSenha("automation10");
//            Login.waitForEnterButton();
//            Login.ClickOnEnterButton();
            Thread.sleep(3000);
            driver.manage().window().maximize();
            Thread.sleep(3000);
        }

        @When("^Preencho os campos da aba (Enter Vehicle Data|Enter Enter Insurant Data|Enter Product Data|Select Price Option|Send Quote)$")
        public void preencho_campos_da_aba_em_questao(String aba) throws Exception {
            switch (aba) {
                case "Enter Vehicle Data":
//                    driver.

                    break;
                case "IE":

                    break;
                case "DOCKER_CHROME":

                    break;
                default:

                    break;
            }
        }

        @Then("^Envio o formulario preenchido$")
        public void envio_formulario_preenchido () throws Exception {
            HomePageTricentis Login = PageFactory.initElements(driver, HomePageTricentis.class);
//            Login.VerPerfilUsua();
//            Login.CapturaNome("Tadeu Silvio");
//            Login.Logoff();
        }

        @Then("^Valido se email foi enviado$")
        public void valido_email_enviado () throws Exception {
            HomePageTricentis Login = PageFactory.initElements(driver, HomePageTricentis.class);
//            Login.VerPerfilUsua();
//            Login.CapturaNome("Tadeu Silvio");
//            Login.Logoff();
        }
    }
