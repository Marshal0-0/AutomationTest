package TestF;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;

import static TestF.Hooks.driver;
public class AddReviewAndSubscription {



    // TC 001 Add Review And Subscription With Valid Data


    @And("Select Sleeveless Unicorn Patch Gown")
    public void Select_Sleeveless_Unicorn_Patch_Gown() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("a[href='/product_details/19']")).click();
    }



    @And("Add Name")
    public void Add_Name() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.id("name")).sendKeys("Lyana Mina George");
    }



    @And("Add Email")
    public void Add_Valid_Email() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.id("email")).sendKeys("MeshMesh@Gmail.com");
    }



    @And("Add Review To Sleeveless Unicorn Patch Gown")
    public void Add_Review_To_Sleeveless_Unicorn_Patch_Gown() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.id("review")).sendKeys(" I bought this gown for my daughter, and it's absolutely perfect! The material is soft and comfortable, and the unicorn patch adds a fun and playful touch. The pink color is vibrant, and the fit is just right. It's ideal for both casual wear and special occasions. Highly recommend this for anyone looking for a stylish and comfy dress for their little one!");
    }



    @And("Click Button")
    public void Click_Button() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.id("button-review")).click();
    }



    @And("Subscription")
    public void Subscription() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.id("susbscribe_email")).sendKeys("MeshMesh@gmail.com");
    }



    @Then("Click Button Subscription")
    public void Click_Button_Subscription() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.id("subscribe")).click();
    }





    // TC 002 Add Review And Subscription With InValid Email


    @And("Select Stylish Dress")
    public void Select_Stylish_Dress() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[contains(@href, '/product_details/4')]")).click();
    }



    @And("Add Email Invalid")
    public void Add_Email_Invalid() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.id("email")).sendKeys("MeshMesh&Gmail,com");
    }



    @And("Add Review To Stylish Dress")
    public void Add_Review_To_Stylish_Dress() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.id("review")).sendKeys("This dress is a fantastic addition to any wardrobe. The design is both stylish and sophisticated, making it perfect for various occasions. The fabric feels high-quality, and the fit is flattering. At Rs. 1500, it offers great value for money. The only minor downside is that the color might be slightly different from what’s shown online, but overall, it’s a great buy!");
    }



    @And("Subscription With InValid Email")
    public void Subscription_With_InValid_Email() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.id("susbscribe_email")).sendKeys("MeshMesh&gmail,com");
    }




    // TC 003 Add Review And Subscription With InValid Email (Only Space)


    @And("Select GRAPHIC DESIGN MEN T SHIRT - BLUE")
    public void Select_GRAPHIC_DESIGN_MEN_T_SHIRT_BLUE() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[contains(@href, '/product_details/43')]")).click();
    }





    @And("Add Name0")
    public void Add_Name0() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.id("name")).sendKeys("Mina George Rezk");
    }



    @And("Add Email Invalid Only Space")
    public void Add_Email_Invalid_Only_Space() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.id("email")).sendKeys("             ");
    }



    @And("Add Review To GRAPHIC DESIGN MEN T SHIRT - BLUE")
    public void Add_Review_To_GRAPHIC_DESIGN_MEN_T_SHIRT_BLUE() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.id("review")).sendKeys("The Graphic Design Men T-Shirt in blue is a great choice for casual wear. The graphic print is eye-catching and stylish, and the blue color is vibrant. The material is soft and comfortable, making it ideal for everyday use. At Rs. 1389, it’s reasonably priced for the quality. My only small issue is that the sizing runs a bit larger than expected, so consider sizing down if you prefer a snug fit. Overall, it’s a solid purchase!");
    }



    @And("Subscription With InValid Email Only Space")
    public void Subscription_With_InValid_Email_Only_Space() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.id("susbscribe_email")).sendKeys("                ");
    }







}
