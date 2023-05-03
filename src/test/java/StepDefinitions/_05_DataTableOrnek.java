package StepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

import java.util.List;

public class _05_DataTableOrnek {
    @When("Write username{string}")
    public void writeUsername(String userName) {
        System.out.println("userName = " + userName);

    }

    @And("Write username and Password {string} and {string}")
    public void writeUsernameAndPasswordAnd(String userName, String password) {
        System.out.println("userName +pass = " + userName+" "+password);
    }

    @And("Write username as DataTable")
    public void writeUsernameAsDataTable(DataTable elemanlar) {
        List<String>listElemenlar=elemanlar.asList(String.class);

        for (String u: listElemenlar)
            System.out.println("u = " + u);

    }

    @And("Write username and password DataTable")
    public void writeUsernameAndPasswordDataTable(DataTable elemanalr) {
        List<List<String>> listElemenlar=elemanalr.asLists(String.class );

        for (int i = 0; i < listElemenlar.size(); i++) {
            System.out.println("listElemenlar = " + listElemenlar.get(i).get(0)+ " "
            + listElemenlar.get(i).get(1));
        }
    }
}
