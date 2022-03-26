package com.tdea.parcial.gluecode;

import com.tdea.parcial.Utils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

    private WebDriver driver;

    void setUp() {

        System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");

    }

    String TiempoDelDia = "";
    int hora;

    @Given("la hora es {int}")
    public void la_hora_es1(Integer hora) {

        this.hora = hora;
    }
    @When("verificamos si es de Night")
    public void verificamos_si_es_de_night() {
        TiempoDelDia = Utils.getTimeOfDay(this.hora);

    }
    @Then("obtenemos que es de Night")
    public void obtenemos_que_es_de_night() {
        Assertions.assertEquals(TiempoDelDia, "Night");
    }



    @When("verificamos si es de Morning")
    public void verificamos_si_es_de_morning() {
        TiempoDelDia = Utils.getTimeOfDay(this.hora);
    }
    @Then("obtenemos que es de Morning")
    public void obtenemos_que_es_de_morning() {
        Assertions.assertEquals(TiempoDelDia, "Morning");
    }




    @When("verificamos si es de Afternoon")
    public void verificamos_si_es_de_afternoon() {
        TiempoDelDia = Utils.getTimeOfDay(this.hora);
    }
    @Then("obtenemos que es de Afternoon")
    public void obtenemos_que_es_de_afternoon() {
        Assertions.assertEquals(TiempoDelDia, "Afternoon");
    }



    @When("verificamos si es de Evening")
    public void verificamos_si_es_de_evening() {
        TiempoDelDia = Utils.getTimeOfDay(this.hora);
    }
    @Then("obtenemos que es de Evening")
    public void obtenemos_que_es_de_evening() {
        Assertions.assertEquals(TiempoDelDia, "Evening");
    }



    @When("verificamos si es Invalid hour")
    public void verificamos_si_es_invalid_hour() {
        TiempoDelDia = Utils.getTimeOfDay(hora);
    }
    @Then("obtenemos que es de Invalid hour")
    public void obtenemos_que_es_de_invalid_hour() {
        Assertions.assertEquals(TiempoDelDia, "Invalid hour");
    }


}
