package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.tc_est_001Page;

public class tc_est_001Steps {
    private tc_est_001Page strategyPage = new tc_est_001Page();

    @Given("el usuario está en la página de análisis de estrategia")
    public void usuarioEnPaginaDeAnalisisDeEstrategia() {
        strategyPage.navigateToStrategyAnalysisPage();
    }

    @When("el usuario ejecuta el análisis de estrategia")
    public void usuarioEjecutaAnalisisDeEstrategia() {
        strategyPage.executeStrategyAnalysis();
    }

    @Then("la estrategia debe ser validada")
    public void estrategiaDebeSerValidada() {
        Assert.assertTrue(strategyPage.isStrategyValidated());
    }
}