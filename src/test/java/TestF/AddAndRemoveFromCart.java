package TestF;

import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;
import java.util.List;
import static TestF.Hooks.driver;


public class AddAndRemoveFromCart {


    SoftAssert soft = new SoftAssert();


    @Then("Remove All From Cart")
    public void Remove_All_From_Cart() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("a[href='/view_cart']")).click();
        Thread.sleep(2000);
        List<WebElement> removeButtons = driver.findElements(By.cssSelector(".cart_quantity_delete"));

        for (WebElement button : removeButtons) {
            button.click();
            Thread.sleep(1000);
        }


        soft.assertEquals(driver.getCurrentUrl(),"https://automationexercise.com/view_cart");

    }






}
