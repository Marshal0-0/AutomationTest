package TestF;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;
import static TestF.Hooks.driver;

public class Product {

    SoftAssert soft = new SoftAssert();



    @Given("Open Site")
    public void OpenSite_Product() throws InterruptedException {
        Thread.sleep(2000);
        driver.get("https://automationexercise.com/login");
    }



    @When("LogIn To Buy Product")
    public void LogInToBuy() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.name("email")).sendKeys("MeshMesh@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.name("password")).sendKeys("17112003");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("button[data-qa='login-button']")).click();
        Thread.sleep(2000);
    }



    @And("Go To Product")
    public void GoToProduct() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("a[href='/products']")).click();
    }


    @And("Go To Woman Category")
    public void GoToWomanCategory() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[@data-toggle='collapse' and @href='#Women']")).click();
    }


    @And("Select Dress")
    public void SelectDress() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[@href='/category_products/1' and text()='Dress ']")).click();
    }


    @And("Buy A Dress")
    public void Buy_A_Dress() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@data-product-id='38' and contains(text(),'Add to cart')]")).click();
    }


    @And("Go Back")
    public void GoBack() throws InterruptedException {
        Thread.sleep(3000);
        driver.navigate().back();
    }



    @And("Select Tops")
    public void SelectTops() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[@href='/category_products/2' and contains(text(),'Tops')]")).click();
    }



    @And("Buy A Tops")
    public void Buy_A_Tops() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@data-product-id='7' and contains(@class, 'add-to-cart')]")).click();
    }



    @And("Select Saree")
    public void SelectSaree() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[@href='/category_products/7' and text()='Saree ']")).click();
    }



    @And("Buy Saree")
    public void BuySaree() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@data-product-id='39' and contains(@class, 'add-to-cart')]")).click();
    }




    @And("Go To Cart")
    public void CheckOut() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("a[href='/view_cart']")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("a.btn.btn-default.check_out")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("message")).sendKeys("I want all my purchases in a small size");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("a.btn.btn-default.check_out")).click();
    }




    // TC 001 Valid Data



    @Then("Pay And Confirm Order")
    public void Pay_And_Confirm_Order() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.name("name_on_card")).sendKeys("Lyana Mina George");
        Thread.sleep(1000);
        driver.findElement(By.name("card_number")).sendKeys("6250941006528599");
        Thread.sleep(1000);
        driver.findElement(By.name("cvc")).sendKeys("738");
        Thread.sleep(1000);
        driver.findElement(By.name("expiry_month")).sendKeys("06");
        Thread.sleep(1000);
        driver.findElement(By.name("expiry_year")).sendKeys("2026");
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("button.form-control.btn.btn-primary.submit-button[data-qa='pay-button']")).click();
        Thread.sleep(4000);
        driver.findElement(By.cssSelector("a.check_out")).click();
        Thread.sleep(4000);
        soft.assertEquals(driver.findElement(By.tagName("b")).getText(), "Order Placed!");
    }





    // TC 002 InValid Data


    @Then("Pay And Confirm Order & InValid Data")
    public void Pay_And_Confirm_Order_InValidData() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.name("name_on_card")).sendKeys("^_^");
        Thread.sleep(1000);
        driver.findElement(By.name("card_number")).sendKeys("<0>_<0>");
        Thread.sleep(1000);
        driver.findElement(By.name("cvc")).sendKeys("ABC");
        Thread.sleep(1000);
        driver.findElement(By.name("expiry_month")).sendKeys("16");
        Thread.sleep(1000);
        driver.findElement(By.name("expiry_year")).sendKeys("1711");
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("button.form-control.btn.btn-primary.submit-button[data-qa='pay-button']")).click();
        Thread.sleep(4000);
        driver.findElement(By.cssSelector("a.check_out")).click();
        Thread.sleep(4000);
        soft.assertEquals(driver.getCurrentUrl(),"https://automationexercise.com/payment");
    }



    // TC 003 Empty Data


    @Then("Pay And Confirm Order & Empty Data")
    public void Pay_And_Confirm_Order_EmptyData() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.name("name_on_card")).sendKeys("");
        Thread.sleep(1000);
        driver.findElement(By.name("card_number")).sendKeys("");
        Thread.sleep(1000);
        driver.findElement(By.name("cvc")).sendKeys("");
        Thread.sleep(1000);
        driver.findElement(By.name("expiry_month")).sendKeys("");
        Thread.sleep(1000);
        driver.findElement(By.name("expiry_year")).sendKeys("");
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("button.form-control.btn.btn-primary.submit-button[data-qa='pay-button']")).click();
        Thread.sleep(4000);
        driver.findElement(By.cssSelector("a.check_out")).click();
        Thread.sleep(4000);
        soft.assertEquals(driver.getCurrentUrl(),"https://automationexercise.com/payment");
    }




    // TC 004 InValid Name Of Card


    @Then("Pay And Confirm Order & InValid Name Of Card")
    public void Pay_And_Confirm_Order_InValidNOC() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.name("name_on_card")).sendKeys("17112003");
        Thread.sleep(1000);
        driver.findElement(By.name("card_number")).sendKeys("6011000990099818");
        Thread.sleep(1000);
        driver.findElement(By.name("cvc")).sendKeys("333");
        Thread.sleep(1000);
        driver.findElement(By.name("expiry_month")).sendKeys("12");
        Thread.sleep(1000);
        driver.findElement(By.name("expiry_year")).sendKeys("2026");
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("button.form-control.btn.btn-primary.submit-button[data-qa='pay-button']")).click();
        Thread.sleep(4000);
        driver.findElement(By.cssSelector("a.check_out")).click();
        Thread.sleep(4000);
        soft.assertEquals(driver.getCurrentUrl(),"https://automationexercise.com/payment");
    }




    // TC 005 Empty Name Of Card


    @Then("Pay And Confirm Order & Empty Name Of Card")
    public void Pay_And_Confirm_Order_EmptyNameOfCard() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.name("name_on_card")).sendKeys("");
        Thread.sleep(1000);
        driver.findElement(By.name("card_number")).sendKeys("6011000990099818");
        Thread.sleep(1000);
        driver.findElement(By.name("cvc")).sendKeys("333");
        Thread.sleep(1000);
        driver.findElement(By.name("expiry_month")).sendKeys("12");
        Thread.sleep(1000);
        driver.findElement(By.name("expiry_year")).sendKeys("2026");
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("button.form-control.btn.btn-primary.submit-button[data-qa='pay-button']")).click();
        Thread.sleep(4000);
        driver.findElement(By.cssSelector("a.check_out")).click();
        Thread.sleep(4000);
        soft.assertEquals(driver.getCurrentUrl(),"https://automationexercise.com/payment");
    }



    // TC 006 InValid Card Number


    @And("Go To Man Category")
    public void Go_To_Man_Category() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("a[data-parent='#accordian'][href='#Men']")).click();
    }


    @And("Select T_Shirt")
    public void Select_T_Shirt() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("a[href='/category_products/3']")).click();
    }
    
    
    
    @And("Buy A T_Shirt")
    public void Buy_A_T_Shirt() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("a.btn.btn-default.add-to-cart[data-product-id='43']")).click();
    }



    @And("Select Jeans")
    public void Select_Jeans() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("a[href='/category_products/6']")).click();
    }



    @And("Buy A Jeans")
    public void Buy_A_Jeans() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("a[data-product-id='33'].btn.btn-default.add-to-cart")).click();
    }



    @And("Buy Another Jeans")
    public void Buy_Another_Jeans() throws InterruptedException {
        Thread.sleep(4000);
        driver.findElement(By.cssSelector("button.btn.btn-success.close-modal.btn-block[data-dismiss='modal']")).click();
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("a.btn.btn-default.add-to-cart[data-product-id='35']")).click();
        Thread.sleep(2000);
    }



    @Then("Pay And Confirm For Man & InValid Card Number")
    public void Pay_And_Confirm_For_Man_InValid_Card_Number() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.name("name_on_card")).sendKeys("Samael Mina George");
        Thread.sleep(1000);
        driver.findElement(By.name("card_number")).sendKeys("Six_Zero_One_Zero_Nine_Zero_Nine_Eight_One_Eight");
        Thread.sleep(1000);
        driver.findElement(By.name("cvc")).sendKeys("333");
        Thread.sleep(1000);
        driver.findElement(By.name("expiry_month")).sendKeys("12");
        Thread.sleep(1000);
        driver.findElement(By.name("expiry_year")).sendKeys("2026");
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("button.form-control.btn.btn-primary.submit-button[data-qa='pay-button']")).click();
        Thread.sleep(4000);
        driver.findElement(By.cssSelector("a.check_out")).click();
        Thread.sleep(4000);
        soft.assertEquals(driver.getCurrentUrl(),"https://automationexercise.com/payment");
    }




    // TC 007 Empty Card Number


    @Then("Pay And Confirm For Man & Empty Card Number")
    public void Pay_And_Confirm_For_Man_Empty_Card_Number() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.name("name_on_card")).sendKeys("Samael Mina George");
        Thread.sleep(1000);
        driver.findElement(By.name("card_number")).sendKeys("");
        Thread.sleep(1000);
        driver.findElement(By.name("cvc")).sendKeys("333");
        Thread.sleep(1000);
        driver.findElement(By.name("expiry_month")).sendKeys("12");
        Thread.sleep(1000);
        driver.findElement(By.name("expiry_year")).sendKeys("2026");
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("button.form-control.btn.btn-primary.submit-button[data-qa='pay-button']")).click();
        Thread.sleep(4000);
        driver.findElement(By.cssSelector("a.check_out")).click();
        Thread.sleep(4000);
        soft.assertEquals(driver.getCurrentUrl(),"https://automationexercise.com/payment");
    }




    // TC008 InValid Card Number (Only Space)


    @Then("Pay And Confirm For Man & InValid2 Card Number Only Space")
    public void Pay_And_Confirm_For_Man_InValid_2_Card_Number() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.name("name_on_card")).sendKeys("Samael Mina George");
        Thread.sleep(2000);
        driver.findElement(By.name("card_number")).sendKeys("           ");
        Thread.sleep(1000);
        driver.findElement(By.name("cvc")).sendKeys("333");
        Thread.sleep(1000);
        driver.findElement(By.name("expiry_month")).sendKeys("12");
        Thread.sleep(1000);
        driver.findElement(By.name("expiry_year")).sendKeys("2026");
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("button.form-control.btn.btn-primary.submit-button[data-qa='pay-button']")).click();
        Thread.sleep(4000);
        driver.findElement(By.cssSelector("a.check_out")).click();
        Thread.sleep(4000);
        soft.assertEquals(driver.getCurrentUrl(),"https://automationexercise.com/payment");
    }




    // TC 009 InValid CVC


    @Then("Pay And Confirm For Man & InValid CVC")
    public void Pay_And_Confirm_For_Man_InValid_CVC() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.name("name_on_card")).sendKeys("Samael Mina George");
        Thread.sleep(1000);
        driver.findElement(By.name("card_number")).sendKeys("6011000990099818");
        Thread.sleep(1000);
        driver.findElement(By.name("cvc")).sendKeys("^_^");
        Thread.sleep(1000);
        driver.findElement(By.name("expiry_month")).sendKeys("12");
        Thread.sleep(1000);
        driver.findElement(By.name("expiry_year")).sendKeys("2026");
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("button.form-control.btn.btn-primary.submit-button[data-qa='pay-button']")).click();
        Thread.sleep(4000);
        driver.findElement(By.cssSelector("a.check_out")).click();
        Thread.sleep(4000);
        soft.assertEquals(driver.getCurrentUrl(),"https://automationexercise.com/payment");
    }




    // TC 010 InValid CVC (Only Space)


    @Then("Pay And Confirm For Man & InValid CVC Only Space")
    public void Pay_And_Confirm_For_Man_InValid_CVC_Only_Space() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.name("name_on_card")).sendKeys("Samael Mina George");
        Thread.sleep(1000);
        driver.findElement(By.name("card_number")).sendKeys("6011000990099818");
        Thread.sleep(1000);
        driver.findElement(By.name("cvc")).sendKeys("         ");
        Thread.sleep(1000);
        driver.findElement(By.name("expiry_month")).sendKeys("12");
        Thread.sleep(1000);
        driver.findElement(By.name("expiry_year")).sendKeys("2026");
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("button.form-control.btn.btn-primary.submit-button[data-qa='pay-button']")).click();
        Thread.sleep(4000);
        driver.findElement(By.cssSelector("a.check_out")).click();
        Thread.sleep(4000);
        soft.assertEquals(driver.getCurrentUrl(),"https://automationexercise.com/payment");
    }




    // TC 011 InValid Month


    @And("Go To Kids Category")
    public void Go_To_Kids_Category() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("a[data-toggle='collapse'][href='#Kids']")).click();
    }



    @And("Select dress")
    public void Select_dress() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("a[href='/category_products/4']")).click();
    }



    @And("Buy A dress")
    public void Buy_A_dress() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("a[data-product-id='16'].btn.btn-default.add-to-cart")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("button.btn.btn-success.close-modal.btn-block[data-dismiss='modal']")).click();
        Thread.sleep(2000);
    }



    @And("Buy Another dress")
    public void Buy_Another_dress() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("a.btn.btn-default.add-to-cart[data-product-id='19']")).click();
    }



    @And("Select Tops & Shirts")
    public void Select_Tops_And_Shirts() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("a[href='/category_products/5']")).click();
    }



    @And("Buy A top1")
    public void Buy_A_top_1() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("a[data-product-id='11'].btn.btn-default.add-to-cart")).click();
        Thread.sleep(4000);
        driver.findElement(By.cssSelector("button.btn.btn-success.close-modal.btn-block[data-dismiss='modal']")).click();
        Thread.sleep(2000);
    }



    @And("Buy A top2")
    public void Buy_A_top_2() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("a[data-product-id='12'].btn.btn-default.add-to-cart")).click();
        Thread.sleep(4000);
        driver.findElement(By.cssSelector("button.btn.btn-success.close-modal.btn-block[data-dismiss='modal']")).click();
        Thread.sleep(2000);
    }



    @And("Buy Shirt")
    public void Buy_Shirt() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("a[data-product-id='18'].btn.btn-default.add-to-cart")).click();
        Thread.sleep(4000);
        driver.findElement(By.cssSelector("button.btn.btn-success.close-modal.btn-block[data-dismiss='modal']")).click();
        Thread.sleep(2000);
    }



    @And("Buy Shirt2")
    public void Buy_Shirt_2() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("a[data-product-id='24'].btn.btn-default.add-to-cart")).click();
    }




    @Then("Pay And Confirm Order & InValid Month")
    public void Pay_And_Confirm_Order_InValid_Month() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.name("name_on_card")).sendKeys("Regala Mina George");
        Thread.sleep(1000);
        driver.findElement(By.name("card_number")).sendKeys("6011000990099818");
        Thread.sleep(1000);
        driver.findElement(By.name("cvc")).sendKeys("112");
        Thread.sleep(1000);
        driver.findElement(By.name("expiry_month")).sendKeys("One");
        Thread.sleep(1000);
        driver.findElement(By.name("expiry_year")).sendKeys("2026");
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("button.form-control.btn.btn-primary.submit-button[data-qa='pay-button']")).click();
        Thread.sleep(4000);
        driver.findElement(By.cssSelector("a.check_out")).click();
        Thread.sleep(4000);
        soft.assertEquals(driver.getCurrentUrl(),"https://automationexercise.com/payment");
    }




    // TC 012 InValid Month Expired


    @Then("Pay And Confirm Order & InValid Month With Expired")
    public void Pay_And_Confirm_Order_InValid_Month_With_Expired() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.name("name_on_card")).sendKeys("Regala Mina George");
        Thread.sleep(1000);
        driver.findElement(By.name("card_number")).sendKeys("6011000990099818");
        Thread.sleep(1000);
        driver.findElement(By.name("cvc")).sendKeys("112");
        Thread.sleep(1000);
        driver.findElement(By.name("expiry_month")).sendKeys("07");
        Thread.sleep(1000);
        driver.findElement(By.name("expiry_year")).sendKeys("2024");
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("button.form-control.btn.btn-primary.submit-button[data-qa='pay-button']")).click();
        Thread.sleep(4000);
        driver.findElement(By.cssSelector("a.check_out")).click();
        Thread.sleep(4000);
        soft.assertEquals(driver.getCurrentUrl(),"https://automationexercise.com/payment");
    }



    // TC 013 InValid Month Only Space


    @Then("Pay And Confirm Order & InValid Month Only Space")
    public void Pay_And_Confirm_Order_InValid_Month_Only_Space() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.name("name_on_card")).sendKeys("Regala Mina George");
        Thread.sleep(1000);
        driver.findElement(By.name("card_number")).sendKeys("6011000990099818");
        Thread.sleep(1000);
        driver.findElement(By.name("cvc")).sendKeys("112");
        Thread.sleep(1000);
        driver.findElement(By.name("expiry_month")).sendKeys("          ");
        Thread.sleep(1000);
        driver.findElement(By.name("expiry_year")).sendKeys("2024");
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("button.form-control.btn.btn-primary.submit-button[data-qa='pay-button']")).click();
        Thread.sleep(4000);
        driver.findElement(By.cssSelector("a.check_out")).click();
        Thread.sleep(4000);
        soft.assertEquals(driver.getCurrentUrl(),"https://automationexercise.com/payment");
    }




    // TC 014 InValid Year Char


    @Then("Pay And Confirm Order & InValid Year Char")
    public void Pay_And_Confirm_Order_InValid_Year_Char() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.name("name_on_card")).sendKeys("Regala Mina George");
        Thread.sleep(1000);
        driver.findElement(By.name("card_number")).sendKeys("6011000990099818");
        Thread.sleep(1000);
        driver.findElement(By.name("cvc")).sendKeys("112");
        Thread.sleep(1000);
        driver.findElement(By.name("expiry_month")).sendKeys("11");
        Thread.sleep(1000);
        driver.findElement(By.name("expiry_year")).sendKeys("Two-thousand-twenty-four");
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("button.form-control.btn.btn-primary.submit-button[data-qa='pay-button']")).click();
        Thread.sleep(4000);
        driver.findElement(By.cssSelector("a.check_out")).click();
        Thread.sleep(4000);
        soft.assertEquals(driver.getCurrentUrl(),"https://automationexercise.com/payment");
    }




    // TC 015 InValid Year With Special Char


    @Then("Pay And Confirm Order & InValid Year Special Char")
    public void Pay_And_Confirm_Order_InValid_Year_Special_Char() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.name("name_on_card")).sendKeys("Regala Mina George");
        Thread.sleep(1000);
        driver.findElement(By.name("card_number")).sendKeys("6011000990099818");
        Thread.sleep(1000);
        driver.findElement(By.name("cvc")).sendKeys("112");
        Thread.sleep(1000);
        driver.findElement(By.name("expiry_month")).sendKeys("11");
        Thread.sleep(1000);
        driver.findElement(By.name("expiry_year")).sendKeys("@-@");
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("button.form-control.btn.btn-primary.submit-button[data-qa='pay-button']")).click();
        Thread.sleep(4000);
        driver.findElement(By.cssSelector("a.check_out")).click();
        Thread.sleep(4000);
        soft.assertEquals(driver.getCurrentUrl(),"https://automationexercise.com/payment");
    }




    // TC 016 InValid Year With Only Space


    @Then("Pay And Confirm Order & InValid Year With Only Space")
    public void Pay_And_Confirm_Order_InValid_Year_With_Only_Space() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.name("name_on_card")).sendKeys("Regala Mina George");
        Thread.sleep(1000);
        driver.findElement(By.name("card_number")).sendKeys("6011000990099818");
        Thread.sleep(1000);
        driver.findElement(By.name("cvc")).sendKeys("112");
        Thread.sleep(1000);
        driver.findElement(By.name("expiry_month")).sendKeys("11");
        Thread.sleep(1000);
        driver.findElement(By.name("expiry_year")).sendKeys("       ");
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("button.form-control.btn.btn-primary.submit-button[data-qa='pay-button']")).click();
        Thread.sleep(4000);
        driver.findElement(By.cssSelector("a.check_out")).click();
        Thread.sleep(4000);
        soft.assertEquals(driver.getCurrentUrl(),"https://automationexercise.com/payment");
    }





}