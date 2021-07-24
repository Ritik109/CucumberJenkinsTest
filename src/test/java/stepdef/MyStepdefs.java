package stepdef;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;


import org.junit.Assert;

public class MyStepdefs {



    @Given("^Test Given$")
    public void testGiven() {
        Assert.assertTrue(true);
    }

    @Then("Test Then")
    public void method1(){
        Assert.assertTrue(true);

    }

    @And("^Test validation$")
    public void testValidation() {
        Assert.assertTrue(false);

    }
}
