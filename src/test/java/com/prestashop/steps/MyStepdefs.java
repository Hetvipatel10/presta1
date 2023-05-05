package com.prestashop.steps;

import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import com.prestashop.pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;

public class MyStepdefs {

   // HomePage homePage;

   // @BeforeMethod
   // public void inIt() {
      //  homePage = new HomePage();


    @Given("^User is on Home Page$")
    public void user_is_on_Home_Page() {

    }

    @When("^Displays seven popular products by default in home page$")
    public void displays_seven_popular_products_by_default_in_home_page()  {
    new HomePage().Verifysevenproducts();

    }

    @And("^I enter text Blouse in the search box$")
    public void iEnterTextBlouseInTheSearchBox() {
        new HomePage().clickonsesrchbox("Blouse");

    }

    @And("^I click on search button$")
    public void iClickOnSearchButton() {
        new HomePage().clickOnsearchnButton();
    }

    @Then("^I should verify text \"([^\"]*)\"$")
    public void iShouldVerifyText(String message){
        Assert.assertEquals(message, new HomePage().verifyblouseText(message));
    }



//    @When("^I clicked the product detailed page$")
//    public void i_clicked_the_product_detailed_page() {
//    new HomePage().clickOndetailedpage();
//
//    }
//
//    @When("^I verify the description of the product$")
//    public void i_verify_the_description_of_the_product() {
//        String expected="New product";
//        Assert.assertEquals(expected, homePage.verifydescriptionofproductText());
//
//
//    }
//
//    @When("^I adding the product to cart$")
//    public void i_adding_the_product_to_cart()  {
//      new HomePage().clickOnaddingproducttocart();
//
//    }
//
//
//    @And("^I open a detailed page on product when i clicked$")
//    public void iOpenADetailedPageOnProductWhenIClicked() {
//        new HomePage().clickonblouseimg();
//    }
//
//
//    @Then("^I informs the user There is (\\d+) item in your cart\\.$")
//    public void iInformsTheUserThereIsItemInYourCart(int arg0) {
//        String expected="there is 1 item in their cart";
//        Assert.assertEquals(expected, homePage.verifyTextinaddtocartpage());
//    }
}
