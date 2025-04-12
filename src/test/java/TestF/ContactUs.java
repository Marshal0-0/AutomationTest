package TestF;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

import static TestF.Hooks.driver;
public class ContactUs {





    // TC 001 Contact Us With Valid Data



    @When("Go To Contact Us")
    public void Go_To_Contact_Uskosomal() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[contains(@href, '/contact_us')]")).click();
    }



    @And("Add name")
    public void Add_name() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.name("name")).sendKeys("Mina George");
    }



    @And("Add email")
    public void Add_email() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.name("email")).sendKeys("MeshMesh@gmali.com");
    }



    @And("Add Subject")
    public void Add_Subject() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.name("subject")).sendKeys(" Inquiry About Product Availability");
    }



    @And("Add Message")
    public void Add_Message() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.id("message")).sendKeys("Hello,\n" +
                "I would like to inquire about the availability of the Graphic Design Men T-Shirt in other colors. Additionally, could you confirm if there are any ongoing discounts for bulk purchases?\n" +
                "Looking forward to your response.\n" +
                "Best regards,\n" +
                "John Doe");
    }





    @Then("Submit")
    public void Submit(){
        driver.findElement(By.cssSelector("input[data-qa='submit-button']")).click();
    }




    // TC 002 InValid Email


    @And("Add InValid email")
    public void Add_InValid_email() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.name("email")).sendKeys("MeshMesh&gmali,com");
    }




    // TC 003 InValid Email Only Space


    @And("Add InValid email Only Space")
    public void Add_OnlySpace_email() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.name("email")).sendKeys("          ");
    }










}
