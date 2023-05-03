package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _04_CitizenshipSteps {
    LeftNav ln=new LeftNav();
    DialogContent dc=new DialogContent();

    @And("Navigate to CitizenShip page")
    public void navigateToCitizenShipPage() {
        ln.clickFunction(ln.setup);
        ln.clickFunction(ln.parameters);
        ln.clickFunction(ln.citizenShip);
    }

    @When("User a CitizenShip name as {string} short name as {string}")
    public void userACitizenShipNameAsShortNameAs(String name, String shortName) {
        dc.clickFunction(dc.addButton);
        dc.sendKeysFunction(dc.nameInput, name);
        dc.sendKeysFunction(dc.shortName,shortName);
        dc.clickFunction(dc.saveButton);
    }

    @Then("Allready exist message should be displayed")
    public void allreadyExistMessageShouldBeDisplayed() {
        dc.verifyContainsFunction(dc.alreadyExists,"already");

    }

    @When("User delete the {string}")
    public void userDeleteThe(String searchText) {
        dc.deleteItem(searchText);

    }
}
