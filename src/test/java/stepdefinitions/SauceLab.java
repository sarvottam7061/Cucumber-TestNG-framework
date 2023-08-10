package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
//import io.cucumber.java.en_scouse.An;
import org.testng.Assert;
import pageobjects.HomePage;
import utilities.TestContext;
import pageobjects.LoginPage;

public class SauceLab {
    HomePage homePage;
    LoginPage loginPage;
    TestContext testContext;

    public SauceLab(TestContext context) {
        testContext = context;
        homePage = testContext.getPageObjectManager().getHomePage();
        loginPage = testContext.getPageObjectManager().getLoginPage();
    }

    @Given("I navigate to sauceLab url")
    public void navigateToSauceLabUrl(){
        Assert.assertTrue(homePage.defaultSauceLabHomePageIsDisplayed());
    }

    @When("User has given correct credentials")
    public void userGivesCorrectCredentials() {
        loginPage.fillUserName("standard_user");
        loginPage.fillPassword("secret_sauce");
    }

    @And("Click on Login Button")
    public void clickLogonButton() throws InterruptedException {
        loginPage.clickLoginButton();
    }

    @Then("Adding Bag to cart")
    public void addingBagToCart() throws InterruptedException {
        Assert.assertTrue(loginPage.defaultSauceLabsBackpackDisplayed());
        loginPage.clickOnBagAddToCart();
    }
    @Then("Adding Bike to cart")
    public void addingBikeToCart() throws InterruptedException {
        Assert.assertTrue(loginPage.defaultSauceLabsBackpackDisplayed());
        loginPage.clickOnBikeAddToCart();
    }
    @Then("Adding T-Shirt to cart")
    public void addingTShirtToCart() throws InterruptedException {
        Assert.assertTrue(loginPage.defaultSauceLabsBackpackDisplayed());
        loginPage.clickOnTshirtAddToCart();
    }
    @Then("Adding Jacket to cart")
    public void addingJacketToCart() throws InterruptedException {
        Assert.assertTrue(loginPage.defaultSauceLabsBackpackDisplayed());
        loginPage.clickOnJacketAddToCart();
    }
    @Then("Adding Onesie to cart")
    public void addingOnesieToCart() throws InterruptedException {
        Assert.assertTrue(loginPage.defaultSauceLabsBackpackDisplayed());
        loginPage.clickOnOnesiAddToCart();
    }
    @Then("Adding Red_T-Shirt to cart")
    public void addingRedTShirtToCart() throws InterruptedException {
        Assert.assertTrue(loginPage.defaultSauceLabsBackpackDisplayed());
        loginPage.clickOnRedtshirtAddToCart();
    }

    @Then("Check the cart for the item added")
    public void checkingTheCart(){
        loginPage.clickOnCart();
        Assert.assertTrue(loginPage.OneSauceLabsBackpackDisplayed());
        loginPage.clickOnCheckout();
        loginPage.fillYourAddress("Manasi","Shinde","12345");
        loginPage.clickContinue();
        Assert.assertTrue(loginPage.PriceTotalDisplayed());
        loginPage.clickFinish();

    }

    @And("Order Successful! Check Message and Return To Home Page")
    public void checkFinalMessage(){
        Assert.assertTrue(loginPage.ThankyouforyourorderDisplayed());
        loginPage.returnHomePage();

    }



}
