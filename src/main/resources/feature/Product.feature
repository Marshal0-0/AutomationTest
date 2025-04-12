Feature: Product


  # Happy Scenario


  Scenario:  Product For Woman With Valid Data

    Given Open Site
    When LogIn To Buy Product
    And Go To Product
    And Go To Woman Category
    And Select Dress
    And Buy A Dress
    And Go Back
    And Select Tops
    And Buy A Tops
    And Go Back
    And Select Saree
    And Buy Saree
    And Go Back
    And Go To Cart
    Then Pay And Confirm Order





    # Bad Scenario


  Scenario:  Product For Woman With InValid Data

    Given Open Site
    When LogIn To Buy Product
    And Go To Product
    And Go To Woman Category
    And Select Dress
    And Buy A Dress
    And Go Back
    And Select Tops
    And Buy A Tops
    And Go Back
    And Select Saree
    And Buy Saree
    And Go Back
    And Go To Cart
    Then Pay And Confirm Order & InValid Data





    # Empty Scenario


  Scenario:  Product For Woman With Empty Data

    Given Open Site
    When LogIn To Buy Product
    And Go To Product
    And Go To Woman Category
    And Select Dress
    And Buy A Dress
    And Go Back
    And Select Tops
    And Buy A Tops
    And Go Back
    And Select Saree
    And Buy Saree
    And Go Back
    And Go To Cart
    Then Pay And Confirm Order & Empty Data





    # InValid Name Of Card


  Scenario:  Product For Woman With InValid Name Of Card

    Given Open Site
    When LogIn To Buy Product
    And Go To Product
    And Go To Woman Category
    And Select Dress
    And Buy A Dress
    And Go Back
    And Select Tops
    And Buy A Tops
    And Go Back
    And Select Saree
    And Buy Saree
    And Go Back
    And Go To Cart
    Then Pay And Confirm Order & InValid Name Of Card





 # Empty Name Of Card


  Scenario:  Product For Woman With Empty Name Of Card

    Given Open Site
    When LogIn To Buy Product
    And Go To Product
    And Go To Woman Category
    And Select Dress
    And Buy A Dress
    And Go Back
    And Select Tops
    And Buy A Tops
    And Go Back
    And Select Saree
    And Buy Saree
    And Go Back
    And Go To Cart
    Then Pay And Confirm Order & Empty Name Of Card





    # InValid Card Number


  Scenario:  Product For Man With InValid Card Number

    Given Open Site
    When LogIn To Buy Product
    And Go To Product
    And Go To Man Category
    And Select T_Shirt
    And Buy A T_Shirt
    And Go Back
    And Select Jeans
    And Buy A Jeans
    And Buy Another Jeans
    And Go Back
    And Go To Cart
    Then Pay And Confirm For Man & InValid Card Number





    # Empty Card Number


  Scenario:  Product For Man With Empty Card Number

    Given Open Site
    When LogIn To Buy Product
    And Go To Product
    And Go To Man Category
    And Select T_Shirt
    And Buy A T_Shirt
    And Go Back
    And Select Jeans
    And Buy A Jeans
    And Buy Another Jeans
    And Go Back
    And Go To Cart
    Then Pay And Confirm For Man & Empty Card Number





    # InValid Card Number


  Scenario:  Product For Man With InValid2 Card Number

    Given Open Site
    When LogIn To Buy Product
    And Go To Product
    And Go To Man Category
    And Select T_Shirt
    And Buy A T_Shirt
    And Go Back
    And Select Jeans
    And Buy A Jeans
    And Buy Another Jeans
    And Go Back
    And Go To Cart
    Then Pay And Confirm For Man & InValid2 Card Number Only Space





    # InValid CVC


  Scenario:  Product For Man With InValid CVC

    Given Open Site
    When LogIn To Buy Product
    And Go To Product
    And Go To Man Category
    And Select T_Shirt
    And Buy A T_Shirt
    And Go Back
    And Select Jeans
    And Buy A Jeans
    And Buy Another Jeans
    And Go Back
    And Go To Cart
    Then Pay And Confirm For Man & InValid CVC





    # InValid CVC (Only Space)


  Scenario:  Product For Man With InValid CVC Only Space

    Given Open Site
    When LogIn To Buy Product
    And Go To Product
    And Go To Man Category
    And Select T_Shirt
    And Buy A T_Shirt
    And Go Back
    And Select Jeans
    And Buy A Jeans
    And Buy Another Jeans
    And Go Back
    And Go To Cart
    Then Pay And Confirm For Man & InValid CVC Only Space





    # InValid Month (Char)


  Scenario:  Product For Kids With InValid Month

    Given Open Site
    When LogIn To Buy Product
    And Go To Product
    And Go To Kids Category
    And Select dress
    And Buy A dress
    And Buy Another dress
    And Go Back
    And Select Tops & Shirts
    And Buy A top1
    And Buy A top2
    And Buy Shirt
    And Buy Shirt2
    And Go Back
    And Go To Cart
    Then Pay And Confirm Order & InValid Month





    # InValid Month (Expired)


  Scenario:  Product For Kids With InValid Month With Expired

    Given Open Site
    When LogIn To Buy Product
    And Go To Product
    And Go To Kids Category
    And Select dress
    And Buy A dress
    And Buy Another dress
    And Go Back
    And Select Tops & Shirts
    And Buy A top1
    And Buy A top2
    And Buy Shirt
    And Buy Shirt2
    And Go Back
    And Go To Cart
    Then Pay And Confirm Order & InValid Month With Expired




    # InValid Month Only Space


  Scenario:  Product For Kids With InValid Month Only Space

    Given Open Site
    When LogIn To Buy Product
    And Go To Product
    And Go To Kids Category
    And Select dress
    And Buy A dress
    And Buy Another dress
    And Go Back
    And Select Tops & Shirts
    And Buy A top1
    And Buy A top2
    And Buy Shirt
    And Buy Shirt2
    And Go Back
    And Go To Cart
    Then Pay And Confirm Order & InValid Month Only Space




    # InValid Year (Char)


  Scenario:  Product For Kids With InValid Year Char

    Given Open Site
    When LogIn To Buy Product
    And Go To Product
    And Go To Kids Category
    And Select dress
    And Buy A dress
    And Buy Another dress
    And Go Back
    And Select Tops & Shirts
    And Buy A top1
    And Buy A top2
    And Buy Shirt
    And Buy Shirt2
    And Go Back
    And Go To Cart
    Then Pay And Confirm Order & InValid Year Char





    # InValid Year With Special Char


  Scenario:  Product For Kids With InValid Year Special Char

    Given Open Site
    When LogIn To Buy Product
    And Go To Product
    And Go To Kids Category
    And Select dress
    And Buy A dress
    And Buy Another dress
    And Go Back
    And Select Tops & Shirts
    And Buy A top1
    And Buy A top2
    And Buy Shirt
    And Buy Shirt2
    And Go Back
    And Go To Cart
    Then Pay And Confirm Order & InValid Year Special Char





    # InValid Year Only Space


  Scenario:  Product For Kids With InValid Year With Only Space

    Given Open Site
    When LogIn To Buy Product
    And Go To Product
    And Go To Kids Category
    And Select dress
    And Buy A dress
    And Buy Another dress
    And Go Back
    And Select Tops & Shirts
    And Buy A top1
    And Buy A top2
    And Buy Shirt
    And Buy Shirt2
    And Go Back
    And Go To Cart
    Then Pay And Confirm Order & InValid Year With Only Space