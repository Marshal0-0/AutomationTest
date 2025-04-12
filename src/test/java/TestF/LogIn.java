package TestF;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;
import static TestF.Hooks.driver;

public class LogIn {


    SoftAssert soft = new SoftAssert();




    //

    // User On Site


    @Given("User on the LogIn page")
    public void OpenLogInPage() throws InterruptedException {
        driver.get("https://automationexercise.com/login");
        driver.findElement(By.xpath("//a[@href='/login']")).click();
    }

    // TC 001 Valid LogIn Data


    @When("User Can Add Valid Email & LogIn")
    public void ValidEmail_LogIn() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input[data-qa='login-email']")).sendKeys("kazbar2003@gmail.com");
    }


    @And("User Can Add Valid Password & LogIn")
    public void ValidPassword_LogIn() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.name("password")).sendKeys("17112003");
    }


    @And("User Can Click LogIn Button")
    public void ClickLogInButton() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("button[data-qa='login-button']")).click();
    }


    @And("User Can LogOut")
    public void ClickLogOutButton() throws InterruptedException {
        Thread.sleep(5000);
        driver.findElement(By.cssSelector("a[href='/logout']")).click();
    }


    @Then("Verify User LogOut Successful")
    public void VerifyLogOut() throws InterruptedException {
        Thread.sleep(2000);
        soft.assertEquals(driver.getCurrentUrl(),"https://automationexercise.com/login");
    }



    // TC 002 LogIn And Delete Account


    @And("User Can Delete Account")
    public void DeleteAccount() throws InterruptedException {
        Thread.sleep(5000);
        driver.findElement(By.xpath("//a[@href='/delete_account']")).click();
    }


    @Then("Verify User Delete Successful")
    public void VerifyDeleteAccount() throws InterruptedException {
        Thread.sleep(3000);
        soft.assertEquals(driver.getCurrentUrl(),"https://automationexercise.com/delete_account");
    }



    // TC 003 Deleted Email


    @When("User Can Add Deleted Email & LogIn")
    public void DeletedEmail_LogIn() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input[data-qa='login-email']")).sendKeys("kazbar2003@gmail.com");
    }


    @Then("Verify User Can Not LogIn Successful")
    public void VerifyCanNotLogIn() throws InterruptedException {
        Thread.sleep(3000);
        soft.assertEquals(driver.getCurrentUrl(),"https://automationexercise.com/login");
    }



    // TC 004 InValid Email


    @When("User Can Add InValid Email & LogIn")
    public void InValidEmail_LogIn() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input[data-qa='login-email']")).sendKeys("kazbar&gmail,com");
    }



    // TC 005 InValid Password


    @And("User Can Add InValid Password & LogIn")
    public void InValidPassword_LogIn() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.name("password")).sendKeys("   ");
    }



    // TC 006 Valid Upper Case Email


    @When("User Can Add Valid Upper Case Email & LogIn")
    public void ValidUpperCaseEmail() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input[data-qa='login-email']")).sendKeys("KAZBAR2002@gmail.com");
    }


    @Then("Verify User LogIn Successful")
    public void VerifyLogInSuccessful() throws InterruptedException {
        Thread.sleep(3000);
        soft.assertEquals(driver.getCurrentUrl(),"https://automationexercise.com");
    }



    // TC 007 Valid Lower Case Email


    @When("User Can Add Valid Lower Case Email & LogIn")
    public void ValidLowerCaseEmail() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input[data-qa='login-email']")).sendKeys("kazbar2002@gmail.com");
    }



    //

    // TC 008 InValid Email & Password

    //



    // TC 009 Empty Email


    @When("User Can Add Empty Email & LogIn")
    public void EmptyEmail_LogIn() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input[data-qa='login-email']")).clear();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input[data-qa='login-email']")).sendKeys("");
        Thread.sleep(2000);
    }



    // TC 010 Empty Password


    @And("User Can Add Empty Password & LogIn")
    public void EmptyPassword_LogIn() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.name("password")).clear();
        Thread.sleep(2000);
        driver.findElement(By.name("password")).sendKeys("");
    }




    //


    // TC 011 Empty Email & Password


    //







}
