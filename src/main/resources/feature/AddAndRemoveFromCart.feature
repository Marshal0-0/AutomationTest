Feature: AddAndRemoveFromCart



  # Add And Remove From Cart For Women


  Scenario: Add Some Product To Cart


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
    Then Remove All From Cart





    # Add And Remove From Cart For Men


  Scenario: Add And Remove From Cart For Men

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
    Then Remove All From Cart





    # Add And Remove From Cart For Kids


  Scenario: Add And Remove From Cart For Kids


    Given Open Site
    When LogIn To Buy Product
    And Go To Product
    And Go To Kids Category
    And Select dress
    And Buy A dress
    And Buy Another dress
    And Buy A top1
    And Buy A top2
    And Buy Shirt
    And Buy Shirt2
    And Go Back
    Then Remove All From Cart





  Scenario: Add And Remove From Cart For Men

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
    Then Remove All From Cart