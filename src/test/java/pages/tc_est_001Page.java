package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tc_est_001Page {
    private WebDriver driver;

    private By strategyAnalysisButton = By.id("executeStrategyAnalysis");
    private By strategyValidatedMessage = By.id("strategyValidated");

    public tc_est_001Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToStrategyAnalysisPage() {
        driver.get("https://example.com/strategy-analysis");
    }

    public void executeStrategyAnalysis() {
        WebElement executeButton = driver.findElement(strategyAnalysisButton);
        executeButton.click();
    }

    public boolean isStrategyValidated() {
        WebElement validationMessage = driver.findElement(strategyValidatedMessage);
        return validationMessage.isDisplayed();
    }
}