package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_mat_001Page {

    WebDriver driver;
    By generateMatrixButton = By.id("generateMatrix");
    By matrixResult = By.id("matrixResult");

    public tc_mat_001Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToGeneratorPage() {
        driver.get("http://example.com/matrix-generator");
    }

    public void clickGenerateMatrixButton() {
        driver.findElement(generateMatrixButton).click();
    }

    public boolean isMatrixGenerated() {
        return driver.findElement(matrixResult).isDisplayed();
    }
}