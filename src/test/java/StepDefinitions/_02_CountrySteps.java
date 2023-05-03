package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.bytebuddy.utility.RandomString;
import org.apache.commons.lang3.RandomStringUtils;

public class _02_CountrySteps {
    LeftNav ln=new LeftNav();
    DialogContent dc=new DialogContent();
    @And("Navigate to country page")
    public void navigateToCountryPage() {
        ln.clickFunction(ln.setup);
        ln.clickFunction(ln.parameters);
        ln.clickFunction(ln.countries);
    }

    @When("create a country")
    public void createACountry() {
        String ulkeAdi= RandomStringUtils.randomAlphanumeric(8); // 4 harf
        String ulkeKodu= RandomStringUtils.randomNumeric(4); // 4 rakam
        dc.clickFunction(dc.addButton);
        dc.sendKeysFunction(dc.nameInput,ulkeAdi);
        dc.sendKeysFunction(dc.codeInput,ulkeKodu);
        dc.clickFunction(dc.saveButton);// TODO
    }

    @Then("Success message should be displayed")
    public void successMessageShouldBeDisplayed() {
        // TODO
        dc.verifyContainsFunction(dc.successMessage,"success");
    }

    @When("create a country name as {string} code as {string}")
    public void createACountryNameAsCodeAs(String name, String kod) {
        dc.clickFunction(dc.addButton);
        dc.sendKeysFunction(dc.nameInput,name);
        dc.sendKeysFunction(dc.codeInput,kod);
        dc.clickFunction(dc.saveButton);
    }
}
