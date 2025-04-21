package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pages.tc_mat_001Page;
import static org.junit.Assert.assertTrue;

public class tc_mat_001Steps {

    WebDriver driver;
    tc_mat_001Page matrixPage;

    @Given("I open the matrix generator page")
    public void i_open_the_matrix_generator_page() {
        driver = new ChromeDriver();
        matrixPage = new tc_mat_001Page(driver);
        matrixPage.navigateToGeneratorPage();
    }

    @When("I execute the matrix generation")
    public void i_execute_the_matrix_generation() {
        matrixPage.clickGenerateMatrixButton();
    }

    @Then("the matrix should be generated correctly")
    public void the_matrix_should_be_generated_correctly() {
        assertTrue(matrixPage.isMatrixGenerated());
        driver.quit();
    }
}