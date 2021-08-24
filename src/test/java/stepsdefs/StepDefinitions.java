package stepsdefs;

import org.junit.Assert;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.*;
import pages.HomePageTricentis;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class StepDefinitions {

        static WebDriver driver;
        static WebDriverWait wait;
        HomePageTricentis pageTricentis;

        public static WebDriver getDriver() {
            return driver;
        }

        @Given("Que eu esteja na pagina Tricentis")
        public void que_que_estou_na_pagina_principal_do_Gmail () throws Exception
        {
            System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/main/resources/webdrivers/chromedriver.exe");
            driver = new ChromeDriver();
            pageTricentis = new HomePageTricentis();
            driver.navigate().to("http://sampleapp.tricentis.com/101/app.php");
//            driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
            driver.manage().window().maximize();
        }

        @When("^Preencho os campos da aba (Enter Vehicle Data|Enter Enter Insurant Data|Enter Product Data|Select Price Option|Send Quote)$")
        public void preencho_campos_da_aba_em_questao(String aba) throws Exception {
            SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
            switch (aba) {
                case "Enter Vehicle Data":
//                    pageTricentis.getTabEnterVehicleData().click();
                    new Select(pageTricentis.getSelectMake()).selectByValue("Mazda");
                    new Select(pageTricentis.getSelectModel()).selectByValue("Moped");
                    pageTricentis.getInputCylinderCapacity().sendKeys("150");
                    pageTricentis.getInputEnginePerformance().sendKeys("159");
                    pageTricentis.getDtManufacture().sendKeys(dateFormat.format(new Date()));
                    new Select(pageTricentis.getSelectNumberSeats()).selectByValue("6");
                    pageTricentis.getRadioRightHandDriveNO().click();
//                    pageTricentis.getRadioRightHandDriveYES().click();
                    new Select(pageTricentis.getSelectNumberSeatsMotorcycle()).selectByValue("2");
                    new Select(pageTricentis.getSelectFuelType()).selectByValue("Diesel");
                    pageTricentis.getInputPayload().sendKeys("89");
                    pageTricentis.getInputTotalWeight().sendKeys("1500");
                    pageTricentis.getInputListPrice().sendKeys("12500");
                    pageTricentis.getInputLicensePlateNumber().sendKeys("199");
                    pageTricentis.getInputAnnualMileage().sendKeys("50000");
                    pageTricentis.getBtNextEnterVehicleData().click();
                    break;
                case "Enter Enter Insurant Data":
//                    pageTricentis.getTabEnterInsurantData().click();
                    pageTricentis.getInputFirstName().sendKeys("Richard");
                    pageTricentis.getInputLastName().sendKeys("Garcia");
                    pageTricentis.getDtBirthDay().sendKeys("04/06/1989");
                    pageTricentis.getRadioGenderMale().click();
//                    pageTricentis.getRadioGenderFemale().click();
                    pageTricentis.getInputStreetAddress().sendKeys("Avenida Maria Josue");
                    new Select(pageTricentis.getSelectCountry()).selectByValue("Brazil");
                    pageTricentis.getInputZipCode().sendKeys("13575718");
                    pageTricentis.getInputCity().sendKeys("Sao Carlos");
                    new Select(pageTricentis.getSelectOccupation()).selectByValue("Farmer");
                    //Selenium os Checks
                    pageTricentis.getCheckHobbiesOther().click();
//                    pageTricentis.getCheckHobbiesSpeeding().click();
                    pageTricentis.getCheckHobbiesBungeeJumping().click();
//                    pageTricentis.getCheckHobbiesCliffDiving().click();
//                    pageTricentis.getCheckHobbiesSkydiving().click();
                    pageTricentis.getInputWebsite().sendKeys("https://www.google.com/");
                    //Seleciona arquivo na pasta imagens. Para testar altere o nome da imagem
                    //Copiado a url no clipBoard e colando na janela Windows com ajuda de robo já que não temos acesso a mesma
                    StringSelection ss = new StringSelection("C:\\Users\\richa\\OneDrive\\Imagens\\Crazy for Kitties.jpg");
                    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
                    pageTricentis.getBtInputPicture().click();
                    Thread.sleep(1000);
                    Robot robot = new Robot();
                    robot.keyPress(KeyEvent.VK_CONTROL);
                    robot.keyPress(KeyEvent.VK_V);
                    robot.keyRelease(KeyEvent.VK_V);
                    robot.keyRelease(KeyEvent.VK_CONTROL);
                    robot.keyPress(KeyEvent.VK_ENTER);
                    robot.keyRelease(KeyEvent.VK_ENTER);
                    pageTricentis.getBtNextEnterInsurantData().click();
//                    pageTricentis.getBtPreviousEnterInsurantData().click();
                    break;
                case "Enter Product Data":
                    pageTricentis.getDtStartDate().sendKeys("01/20/2022");
                    new Select(pageTricentis.getSelectInsuranceSum()).selectByValue("10000000");
                    new Select(pageTricentis.getSelectMeritRating()).selectByValue("Malus 10");
                    new Select(pageTricentis.getSelectDamageInsurance()).selectByValue("Full Coverage");
                    pageTricentis.getCheckOptionalProductsLegalDefenseInsurance().click();
                    pageTricentis.getCheckOptionalProductsEuroProtection().click();
                    new Select(pageTricentis.getSelectCourtesyCar()).selectByValue("No");
                    pageTricentis.getBtNextEnterProductData().click();
//                    pageTricentis.getBtPreviousEnterProductData().click();
                    break;
                case "Select Price Option":
                    pageTricentis.getRadioPlatinum().click();
//                    pageTricentis.getRadioGold().click();
//                    pageTricentis.getRadioSilver().click();
//                    pageTricentis.getRadioUltimate().click();

//                    Necessario sleep pois ao clicar no plano que o botao aparece
                    Thread.sleep(1500);
                    pageTricentis.getBtNextSelectPriceOptions().click();
//                    pageTricentis.getBtPreviousSelectPriceOptions().click();
                    break;
                case "Send Quote":
                    pageTricentis.getInputEmail().sendKeys("richard.bricio@gmail.com");
                    pageTricentis.getInputPhone().sendKeys("981479164");
                    pageTricentis.getInputUsername().sendKeys("bricio");
                    pageTricentis.getInputPassword().sendKeys("Cachorro1");
                    pageTricentis.getInputConfirmPassword().sendKeys("Cachorro1");
                    pageTricentis.getInputComments().sendKeys("Exemplo de comentario teste para automacao");
//                    pageTricentis.getBtPreviousSendQuote().click();
                    break;
                default:
                    break;
            }
        }

        @Then("^Envio o formulario preenchido$")
        public void envio_formulario_preenchido () throws Exception {
            pageTricentis.getBtEnviarSendQuote().click();
        }

        @Then("^Valido se email foi enviado$")
        public void valido_email_enviado () throws Exception {
            if (!esperarElementoComPolling(pageTricentis.getWindowConfirmSend()))
                Assert.fail("Formulario nao foi enviado");
            else
                System.out.println("Perfeito! Formulario enviado!!");
            driver.close();
        }

        public static boolean esperarElementoComPolling(WebElement we) {
            try {
                Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(40))
                        .pollingEvery(Duration.ofMillis(5)).ignoring(NoSuchElementException.class);
                wait.until(ExpectedConditions.elementToBeClickable(we));
                return true;
            } catch (Exception e) {
                System.out.println("WebElement is NOT visible, using By locator: " + "<" + we.toString() + ">");
                Assert.fail("WebElement is NOT visible, Exception: " + e.getMessage());
                return false;
            }
        }
}
