Feature: SearchProduct



  # Search Product For Kids


  Scenario: Search For Kids Product


    Given Open Site
    When LogIn To Buy Product
    And Go To Product
    And Search For Cotton Mull Embroidered Dress
    And Buy Cotton Mull Embroidered Dress
    And Search For Half Sleeves Top Schiffli Detailing - Pink
    And Buy Half Sleeves Top Schiffli Detailing - Pink
    And Go To Cart
    Then Pay And Confirm Order





    # Search Product For Women


  Scenario: Search For Woman Product


    Given Open Site
    When LogIn To Buy Product
    And Go To Product
    And Search For Stylish Dress
    And Buy Stylish Dress
    And Search Lace Top For Women
    And Buy Lace Top For Women
    And Go To Cart
    Then Pay And Confirm Order





    # Search Product For Men


  Scenario: Search For Men Product


    Given Open Site
    When LogIn To Buy Product
    And Go To Product
    And Search For Premium Polo T-Shirts
    And Buy Premium Polo T-Shirts
    And Search Grunt Blue Slim Fit Jeans
    And Buy Grunt Blue Slim Fit Jeans
    And Go To Cart
    Then Pay And Confirm Order