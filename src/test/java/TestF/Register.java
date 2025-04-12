package TestF;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;
import static TestF.Hooks.driver;


public class Register {


    SoftAssert soft =new SoftAssert();




    // TC 001 Valid Data

    @Given("user on the SignUp&LogIn page")
    public void OpenSite() {
        driver.get("https://automationexercise.com/login");
    }


    @When("User Can Add Valid Name")
    public void ValidWomanName() throws InterruptedException {
        driver.findElement(By.name("name")).sendKeys("Rodina");
        Thread.sleep(2000);
    }


    @And("User Can Add Valid Email")
    public void ValidWomanEmail() throws InterruptedException {
        driver.findElement(By.cssSelector("input[type='email'][data-qa='signup-email'][placeholder='Email Address']")).sendKeys("RodinaMohamed000000@Gmail.com");
        Thread.sleep(2000);
    }


    @And("User Can Click SignUp Button")
    public void ClickButton() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("button[type='submit'][data-qa='signup-button'].btn.btn-default")).click();
    }


    @Then("User Can Enter Account Information")
    public void UserShouldSeeTheMessage(){
        soft.assertEquals(driver.getCurrentUrl(),"https://automationexercise.com/signup");
    }


    // SignUp Page


    @When("User Can Select Valid Title")
    public void SelectValidTitle(){
        driver.findElement(By.id("id_gender2")).click();
    }


    @And("User Can Edit Valid Name")
    public void EditAndAddName() throws InterruptedException {
        driver.findElement(By.id("name")).clear();
        Thread.sleep(2000);
        driver.findElement(By.id("name")).sendKeys("Rodaina");
    }


    @And("User Can Add Valid password")
    public void AddValidPass() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.id("password")).sendKeys("2o03M$");
    }


    @And("User Can Add Valid Date Of Birth")
    public void AddValidDOB() throws InterruptedException {
        new Select(driver.findElement(By.id("days"))).selectByValue("17");
        Thread.sleep(2000);
        new Select(driver.findElement(By.id("months"))).selectByValue("11");
        Thread.sleep(2000);
        new Select(driver.findElement(By.id("years"))).selectByValue("2003");
    }


    @And("User Can Select Valid Sign up for our newsletter & Receive special offers from our partners")
    public void ValidSelect() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.id("newsletter")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("optin")).click();
    }


    @And("User Can Add Valid FName")
    public void AddValidFName() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.id("first_name")).sendKeys("Rodaina");
    }


    @And("User Can Add Valid LName")
    public void AddValidLName() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.id("last_name")).sendKeys("Mohamed");
    }


    @And("User Can Add Valid Company")
    public void AddValidCompany() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.id("company")).sendKeys("C4");
    }


    @And("User Can Add Valid Address1")
    public void AddValidAddress1() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.id("address1")).sendKeys("GamalAbdElNaser");
    }


    @And("User Can Add Valid Address 2")
    public void AddValidAddress2() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.id("address2")).sendKeys("SidiBeshr");
    }


    @And("User Can Select Valid Country")
    public void SelectValidCountry() throws InterruptedException {
        Thread.sleep(2000);
        new Select(driver.findElement(By.id("country"))).selectByVisibleText("Australia");
    }


    @And("User Can Add Valid State")
    public void AddValidState() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.id("state")).sendKeys("Egypt");
    }


    @And("User Can Add Valid City")
    public void AddValidCity() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.id("city")).sendKeys("Alexandria");
    }


    @And("User Can Add Valid ZipCode")
    public void AddValidZipCode() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.id("zipcode")).sendKeys("1711200");
    }


    @And("User Can Add Valid Mobile Number")
    public void AddValidMobileNumber() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.id("mobile_number")).sendKeys("01030672677");
    }


    @And("User Can Click Create Account Button")
    public void ClickAccountButton() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("button[data-qa='create-account']")).click();
    }


    @Then("User Create Account Successful")
    public void  CreateAccountSuccessful(){
        soft.assertEquals(driver.getCurrentUrl(),"https://automationexercise.com/account_created");
    }




    // TC 002 InValid Data



    @When("User Can Add InValid Name")
    public void InValidWomanName() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.name("name")).sendKeys("@00");
    }


    @And("User Can Add InValid Email")
    public void InValidWomanEmail() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("input[type='email'][data-qa='signup-email'][placeholder='Email Address']")).sendKeys("RodinaMohamed00&Gmail,com");
    }


    @When("User Can Select InValid Title")
    public void SelectInValidTitle() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.id("id_gender2"));
    }


    @And("User Can Edit InValid Name")
    public void EditAndAddInValidName() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.id("name")).clear();
        Thread.sleep(2000);
        driver.findElement(By.id("name")).sendKeys("@_@");
    }


    @And("User Can Add InValid password")
    public void AddINValidPass() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.id("password")).sendKeys(",");
    }


    @And("User Can Add InValid Date Of Birth")
    public void AddInValidDOB() throws InterruptedException {
        Thread.sleep(2000);
        new Select(driver.findElement(By.id("days"))).selectByValue("17");
        Thread.sleep(2000);
        new Select(driver.findElement(By.id("months"))).selectByValue("11");
        Thread.sleep(2000);
        new Select(driver.findElement(By.id("years"))).selectByValue("2027");
    }


    @And("User Can Select InValid Sign up for our newsletter & Receive special offers from our partners")
    public void InValidSelect() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.id("newsletter"));
        Thread.sleep(2000);
        driver.findElement(By.id("optin"));
    }


    @And("User Can Add InValid FName")
    public void AddInValidFName() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.id("first_name")).sendKeys("^_^");
    }


    @And("User Can Add InValid LName")
    public void AddInValidLName() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.id("last_name")).sendKeys("0-0");
    }


    @And("User Can Add InValid Company")
    public void AddInValidCompany() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.id("company")).sendKeys("$_$");
    }


    @And("User Can Add InValid Address1")
    public void AddInValidAddress1() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.id("address1")).sendKeys("#");
    }


    @And("User Can Add InValid Address 2")
    public void AddInValidAddress2() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.id("address2")).sendKeys("!");
    }


    @And("User Can Add InValid State")
    public void AddINValidState() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.id("state")).sendKeys("(0-0)");
    }


    @And("User Can Add InValid City")
    public void AddInValidCity() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.id("city")).sendKeys("0 0");
    }


    @And("User Can Add InValid ZipCode")
    public void AddInValidZipCode() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.id("zipcode")).sendKeys("مشمش");
    }


    @And("User Can Add InValid Mobile Number")
    public void AddInValidMobileNumber() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.id("mobile_number")).sendKeys("UnKnown");
    }


    @Then("User UnCreate Account Successful")
    public void  UnCreateAccountSuccessful(){
        soft.assertEquals(driver.getCurrentUrl(),"https://automationexercise.com/login");
    }



    // TC 003 InValid Title



    @When("User Can Add Valid Name&1")
    public void AddValidName_1() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.name("name")).sendKeys("Rody");
    }



    @And("User Can Add Valid Email&1")
    public void AddValidEmail_1() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input[type='email'][data-qa='signup-email'][placeholder='Email Address']")).sendKeys("RodyMohamed01@Gmail.com");
    }



    @And("User Can Edit Valid Name&1")
    public void EditValidName_1() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.id("name")).clear();
        Thread.sleep(2000);
        driver.findElement(By.id("name")).sendKeys("R00dy");
    }


    @And("User Can Add Valid FName&1")
    public void ValidFName_1() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.id("first_name")).sendKeys("R00dy");
    }


    @And("User Can Add Valid LName&1")
    public void ValidLName_1() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.id("last_name")).sendKeys("Mohamed");
    }


    @Then("User Can Not Create Account Successful")
    public void UserCanNotCreateAccountSuccessful() throws InterruptedException {
        Thread.sleep(2000);
        soft.assertEquals(driver.getCurrentUrl(),"https://automationexercise.com/login");
    }




    // TC 004 Invalid Name


    @And("User Can Add Valid Email&2")
    public void ValidEmail_2() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input[type='email'][data-qa='signup-email'][placeholder='Email Address']")).sendKeys("R0dainaM0hamed@gmail.com");
    }



    @And("User Can Edit InValid Name&2")
    public void InValidName__2() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.id("name")).clear();
        Thread.sleep(2000);
        driver.findElement(By.id("name")).sendKeys("^_^");
    }



    // TC 005 Empty Name


    @And("User Can Add Valid Email&0")
    public void Email_0() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input[type='email'][data-qa='signup-email'][placeholder='Email Address']")).sendKeys("ROOdyMohamed01@gmail.com");
    }



    @And("User Can Edit Empty Name")
    public void EmptyName() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.id("name")).clear();
        Thread.sleep(2000);
        driver.findElement(By.id("name")).sendKeys("  ");
    }




    // TC 006 InValid Password


    @And("User Can Add Valid Email&3")
    public void ValidEmail_3() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input[type='email'][data-qa='signup-email'][placeholder='Email Address']")).sendKeys("R00dyMohamed0@gmail.com");
    }



    @And("User Can Add InValid password&1")
    public void InValidPassword_1() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.id("password")).sendKeys("  ");
    }


    // TC 007 Empty Password


    @And("User Can Add Valid Email&4")
    public void ValidEmail_4() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input[type='email'][data-qa='signup-email'][placeholder='Email Address']")).sendKeys("RodyyMohamed0@gmail.com");
    }



    @And("User Can Add Empty password&3")
    public void EmptyPassword_2() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.id("password")).clear();
        Thread.sleep(4000);
        driver.findElement(By.id("password")).sendKeys("");
    }



    // TC 008 Invalid Date Of Birth


    @And("User Can Add Valid Email&5")
    public void ValidEmail_5() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input[type='email'][data-qa='signup-email'][placeholder='Email Address']")).sendKeys("R0dyyM0hamed0@gmail.com");
    }


    @And("User Can Add INValid Date Of Birth")
    public void InValidDateOfBirth() throws InterruptedException {
        Thread.sleep(2000);
        new Select(driver.findElement(By.id("days"))).selectByValue("30");
        Thread.sleep(2000);
        new Select(driver.findElement(By.id("months"))).selectByValue("12");

    }


    // TC 009 Empty Date Of Birth


    @And("User Can Add Valid Email&6")
    public void ValidEmail_6() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input[type='email'][data-qa='signup-email'][placeholder='Email Address']")).sendKeys("RodyyMohamed60@gmail.com");
    }



    @And("User Can Add Empty Date Of Birth")
    public void EmptyDateOfBirth() throws InterruptedException {
        Thread.sleep(3000);
        Thread.sleep(2000);
    }


    // TC 010 InValid First Name


    @And("User Can Add Valid Email&7")
    public void ValidEmail_7() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input[type='email'][data-qa='signup-email'][placeholder='Email Address']")).sendKeys("RodyyMohamed7@gmail.com");
    }


    @And("User Can Add InValid FName&2")
    public void InValidFName() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.id("first_name")).clear();
        Thread.sleep(2000);
        driver.findElement(By.id("first_name")).sendKeys("$ $");
    }



    // TC 011 Empty First Name


    @And("User Can Add Valid Email&8")
    public void ValidEmail_8() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input[type='email'][data-qa='signup-email'][placeholder='Email Address']")).sendKeys("RodyyMohamed8@gmail.com");
    }



    @And("User Can Add Empty FName")
    public void EmptyFName() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.id("first_name")).clear();
        Thread.sleep(2000);
        driver.findElement(By.id("first_name")).sendKeys("");
    }



    // TC 012 InValid Last Name


    @And("User Can Add Valid Email&9")
    public void ValidEmail_9() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input[type='email'][data-qa='signup-email'][placeholder='Email Address']")).sendKeys("RodyyMohamed9@gmail.com");
    }



    @And("User Can Add InValid LName&2")
    public void InValidLName() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.id("last_name")).clear();
        Thread.sleep(2000);
        driver.findElement(By.id("last_name")).sendKeys("0_0");
    }



    // TC 013 Empty Last Name


    @And("User Can Add Valid Email&10")
    public void ValidEmail_10() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input[type='email'][data-qa='signup-email'][placeholder='Email Address']")).sendKeys("RodyyMohamed10@gmail.com");
    }



    @And("User Can Add Empty LName")
    public void EmptyLName() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.id("last_name")).clear();
        Thread.sleep(2000);
        driver.findElement(By.id("last_name")).sendKeys("");
    }




    // TC 014 Empty Selection 1


    @And("User Can Add Valid Email&11")
    public void ValidEmail_11() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input[type='email'][data-qa='signup-email'][placeholder='Email Address']")).sendKeys("RodyyMohamed11@gmail.com");
    }



    @And("User Can Select Empty Sign up for our newsletter & Valid Receive special offers from our partners")
    public void EmptySelect_1() throws InterruptedException {
        Thread.sleep(2000);
        Thread.sleep(2000);
        driver.findElement(By.id("optin")).click();
    }



    // TC 015 Empty Selection 2


    @And("User Can Add Valid Email&12")
    public void ValidEmail_12() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input[type='email'][data-qa='signup-email'][placeholder='Email Address']")).sendKeys("RodyyMohamed12@gmail.com");
    }


    @And("User Can Select Valid Sign up for our newsletter & Empty Receive special offers from our partners")
    public void EmptySelect2() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.id("newsletter")).click();
        Thread.sleep(2000);
    }



    // TC 016 Empty Selections 1 & 2


    @And("User Can Add Valid Email&13")
    public void ValidEmail_13() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input[type='email'][data-qa='signup-email'][placeholder='Email Address']")).sendKeys("RodyyMohamed13@gmail.com");
    }


    @And("User Can Select Empty Sign up for our newsletter & Empty Receive special offers from our partners")
    public void EmptySelect1_2() throws InterruptedException {
        Thread.sleep(2000);
        Thread.sleep(2000);
    }



    // TC 017 InValid Company


    @And("User Can Add Valid Email&14")
    public void ValidEmail_14() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input[type='email'][data-qa='signup-email'][placeholder='Email Address']")).sendKeys("RodyyMohamed14@gmail.com");
    }



    // TC 018 Empty Company


    @And("User Can Add Valid Email&15")
    public void ValidEmail_15() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input[type='email'][data-qa='signup-email'][placeholder='Email Address']")).sendKeys("RodyyMohamed15@gmail.com");
    }



    @And("User Can Add Empty Company")
    public void EmptyCompany() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.id("company")).sendKeys("");
    }



    // TC 019 InValid Address1


    @And("User Can Add Valid Email&16")
    public void ValidEmail_16() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input[type='email'][data-qa='signup-email'][placeholder='Email Address']")).sendKeys("RodyyMohamed16@gmail.com");
    }



    // TC 020 Empty Address 1


    @And("User Can Add Valid Email&17")
    public void ValidEmail_17() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input[type='email'][data-qa='signup-email'][placeholder='Email Address']")).sendKeys("RodyyMohamed17@gmail.com");
    }



    @And("User Can Add Empty Address1")
    public void EmptyAdd_1() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.id("address1")).clear();
        Thread.sleep(2000);
        driver.findElement(By.id("address1")).sendKeys("");
    }


    //


    // TC 021 InValid Address 2


    //




    // TC 022 Empty Address 2


    @And("User Can Add Valid Email&18")
    public void ValidEmail_18() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input[type='email'][data-qa='signup-email'][placeholder='Email Address']")).sendKeys("RodyyMohamed18@gmail.com");
    }



    @And("User Can Add Empty Address 2")
    public void EmptyAddress2() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.id("address2")).clear();
        Thread.sleep(2000);
        driver.findElement(By.id("address2")).sendKeys("");
    }



    // TC 023 InValid State


    @And("User Can Add Valid Email&19")
    public void ValidEmail_19() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input[type='email'][data-qa='signup-email'][placeholder='Email Address']")).sendKeys("RodyyMohamed19@gmail.com");
    }



    // TC 024 Empty State


    @And("User Can Add Valid Email&20")
    public void ValidEmail_20() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input[type='email'][data-qa='signup-email'][placeholder='Email Address']")).sendKeys("RodyyMohamed20@gmail.com");
    }


    @And("User Can Add Empty State")
    public void EmptyState() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.id("state")).clear();
        Thread.sleep(2000);
    }



    // TC 025 InValid City


    @And("User Can Add Valid Email&21")
    public void ValidEmail_21() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input[type='email'][data-qa='signup-email'][placeholder='Email Address']")).sendKeys("RodyyMohamed21@gmail.com");
    }



    // TC 026 Empty City


    @And("User Can Add Valid Email&22")
    public void ValidEmail_22() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input[type='email'][data-qa='signup-email'][placeholder='Email Address']")).sendKeys("RodyyMohamed22@gmail.com");
    }


    @And("User Can Add Empty City")
    public void EmptyCity() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.id("city")).clear();
        Thread.sleep(2000);
    }



    // TC 027 InValid ZipCode


    @And("User Can Add Valid Email&23")
    public void ValidEmail_23() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input[type='email'][data-qa='signup-email'][placeholder='Email Address']")).sendKeys("RodyyMohamed23@yahoo.com");
    }



    // TC 028 Empty ZipCode


    @And("User Can Add Empty ZipCode")
    public void EmptyZipCode() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.id("zipcode")).clear();
        Thread.sleep(2000);
    }



    // TC 029 InValid Mobile Number


    @And("User Can Add Valid Email&24")
    public void ValidEmail_24() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input[type='email'][data-qa='signup-email'][placeholder='Email Address']")).sendKeys("RodyyMohamed25@yahoo.com");
    }




    // TC 030 Empty Mobile Number


    @And("User Can Add Empty Mobile Number")
    public void EmptyMobileNumber() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.id("mobile_number")).clear();
        Thread.sleep(2000);
    }




    // Empty Data


    @And("User Can Add Valid Email&25")
    public void ValidEmail_25() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input[type='email'][data-qa='signup-email'][placeholder='Email Address']")).sendKeys("RodyyMohamed26@yahoo.com");
    }






}
