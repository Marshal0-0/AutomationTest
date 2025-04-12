Feature: Add Review And Subscription


  # Happy Scenario


  Scenario: Add Review And Subscription For Kids Product

    Given Open Site
    When Go To Product
    And Go To Kids Category
    And Select dress
    And Select Sleeveless Unicorn Patch Gown
    And Add Name
    And Add Email
    And Add Review To Sleeveless Unicorn Patch Gown
    And Click Button
    And Subscription
    Then Click Button Subscription





    # InValid Email Scenario


  Scenario: Add Review And Subscription For Women Product

    Given Open Site
    When Go To Product
    And Go To Woman Category
    And Select Dress
    And Select Stylish Dress
    And Add Name
    And Add Email Invalid
    And Add Review To Stylish Dress
    And Click Button
    And Subscription With InValid Email
    Then Click Button Subscription





    # InValid Email With Only Space


  Scenario: Add Review And Subscription For Men Product

    Given Open Site
    When Go To Product
    And Go To Man Category
    And Select T_Shirt
    And Select GRAPHIC DESIGN MEN T SHIRT - BLUE
    And Add Name0
    And Add Email Invalid Only Space
    And Add Review To GRAPHIC DESIGN MEN T SHIRT - BLUE
    And Click Button
    And Subscription With InValid Email Only Space
    Then Click Button Subscription