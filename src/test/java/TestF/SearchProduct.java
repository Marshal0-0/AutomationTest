package TestF;
import io.cucumber.java.en.And;
import org.openqa.selenium.By;

import static TestF.Hooks.driver;
public class SearchProduct {




    // TC 001 Search For Kids Product


    @And("Search For Cotton Mull Embroidered Dress")
    public void Search_For_Cotton_Mull_Embroidered_Dress() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("input#search_product.form-control.input-lg[name='search']")).sendKeys("Cotton Mull Embroidered Dress");
    }



    @And("Buy Cotton Mull Embroidered Dress")
    public void Buy_Cotton_Mull_Embroidered_Dress() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("button#submit_search.btn.btn-default.btn-lg")).click();
        Thread.sleep(4000);
        driver.findElement(By.cssSelector("a[data-product-id='20'].btn.btn-default.add-to-cart")).click();
        Thread.sleep(4000);
        driver.findElement(By.cssSelector("button.btn.btn-success.close-modal.btn-block[data-dismiss='modal']")).click();
        Thread.sleep(2000);
    }




    @And("Search For Half Sleeves Top Schiffli Detailing - Pink")
    public void Search_For_Half_Sleeves_Top_Schiffli_Detailing_Pink() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("input#search_product.form-control.input-lg[name='search']")).clear();
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("input#search_product.form-control.input-lg[name='search']")).sendKeys("Half Sleeves Top Schiffli Detailing - Pink");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("button#submit_search.btn.btn-default.btn-lg")).click();
    }



    @And("Buy Half Sleeves Top Schiffli Detailing - Pink")
    public void Buy_Half_Sleeves_Top_Schiffli_Detailing_Pink() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("a[data-product-id='12'].btn.btn-default.add-to-cart")).click();
        Thread.sleep(4000);
        driver.findElement(By.cssSelector("button.btn.btn-success.close-modal.btn-block[data-dismiss='modal']")).click();
        Thread.sleep(2000);
    }



    // TC 002 Search For Woman Product


    @And("Search For Stylish Dress")
    public void Search_For_Stylish_Dress() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("input#search_product.form-control.input-lg[name='search']")).sendKeys("Stylish Dress");
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("button#submit_search.btn.btn-default.btn-lg")).click();
        Thread.sleep(3000);
    }



    @And("Buy Stylish Dress")
    public void Buy_Stylish_Dress() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("a[data-product-id='4'].btn.btn-default.add-to-cart")).click();
        Thread.sleep(4000);
        driver.findElement(By.cssSelector("button.btn.btn-success.close-modal.btn-block[data-dismiss='modal']")).click();
        Thread.sleep(2000);
    }



    @And("Search Lace Top For Women")
    public void Search_Lace_Top_For_Women() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("input#search_product.form-control.input-lg[name='search']")).clear();
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("input#search_product.form-control.input-lg[name='search']")).sendKeys("Lace Top For Women");
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("button#submit_search.btn.btn-default.btn-lg")).click();
        Thread.sleep(3000);
    }



    @And("Buy Lace Top For Women")
    public void Buy_Lace_Top_For_Women() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("a[data-product-id='42'].btn.btn-default.add-to-cart")).click();
        Thread.sleep(4000);
        driver.findElement(By.cssSelector("button.btn.btn-success.close-modal.btn-block[data-dismiss='modal']")).click();
        Thread.sleep(2000);
    }



    // TC 004 Search For Men Product


    @And("Search For Premium Polo T-Shirts")
    public void Search_For_Premium_Polo_T_Shirts() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("input#search_product.form-control.input-lg[name='search']")).sendKeys("Premium Polo T-Shirts");
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("button#submit_search.btn.btn-default.btn-lg")).click();
    }



    @And("Buy Premium Polo T-Shirts")
    public void Buy_Premium_Polo_T_Shirts() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("a[data-product-id='30'].btn.btn-default.add-to-cart")).click();
        Thread.sleep(4000);
        driver.findElement(By.cssSelector("button.btn.btn-success.close-modal.btn-block[data-dismiss='modal']")).click();
        Thread.sleep(2000);
    }



    @And("Search Grunt Blue Slim Fit Jeans")
    public void Search_Grunt_Blue_Slim_Fit_Jeans() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("input#search_product.form-control.input-lg[name='search']")).clear();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input#search_product.form-control.input-lg[name='search']")).sendKeys("Grunt Blue Slim Fit Jeans");
        driver.findElement(By.cssSelector("button#submit_search.btn.btn-default.btn-lg")).click();
        Thread.sleep(2000);
    }



    @And("Buy Grunt Blue Slim Fit Jeans")
    public void Buy_Grunt_Blue_Slim_Fit_Jeans() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("a[data-product-id='37'].btn.btn-default.add-to-cart")).click();
        Thread.sleep(4000);
        driver.findElement(By.cssSelector("button.btn.btn-success.close-modal.btn-block[data-dismiss='modal']")).click();
        Thread.sleep(2000);
    }





}
