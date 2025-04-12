Feature: User LogIn




  # Happy Scenario LogIn & LogOut



  Scenario: user LogIn With Valid Data And LogOut

    Given User on the LogIn page
    When User Can Add Valid Email & LogIn
    And User Can Add Valid Password & LogIn
    And User Can Click LogIn Button
    And User Can LogOut
    Then Verify User LogOut Successful




    # Happy Scenario LogIn & Delete Account



  Scenario: user LogIn With Valid Data And Delete Account

    Given User on the LogIn page
    When User Can Add Valid Email & LogIn\
    And User Can Add Valid Password & LogIn
    And User Can Click LogIn Button
    And User Can Delete Account
    Then Verify User Delete Successful





    # LogIn With Deleted Email


  Scenario: user LogIn With Deleted Email

    Given User on the LogIn page
    When User Can Add Deleted Email & LogIn
    And User Can Add Valid Password & LogIn
    And User Can Click LogIn Button
    Then Verify User Can Not LogIn Successful





    # LogIn With InValid Email



  Scenario: user LogIn With InValid Email

    Given User on the LogIn page
    When User Can Add InValid Email & LogIn
    And User Can Add Valid Password & LogIn
    And User Can Click LogIn Button
    Then Verify User Can Not LogIn Successful





    # LogIn With InValid Password



  Scenario: user LogIn With InValid Password

    Given User on the LogIn page
    When User Can Add Valid Email & LogIn
    And User Can Add InValid Password & LogIn
    And User Can Click LogIn Button
    Then Verify User Can Not LogIn Successful





    # LogIn With Valid Upper Case Email


  Scenario: user LogIn With Valid Upper Case Email

    Given User on the LogIn page
    When User Can Add Valid Upper Case Email & LogIn
    And User Can Add Valid Password & LogIn
    And User Can Click LogIn Button
    Then Verify User LogIn Successful





    # LogIn With Valid Lower Case Email


  Scenario: user LogIn With Valid Lower Case Email

    Given User on the LogIn page
    When User Can Add Valid Lower Case Email & LogIn
    And User Can Add Valid Password & LogIn
    And User Can Click LogIn Button
    Then Verify User LogIn Successful





    # LogIn With InValid Email & Password


  Scenario: user LogIn With InValid Email & Password

    Given User on the LogIn page
    When User Can Add InValid Email & LogIn
    And User Can Add InValid Password & LogIn
    And User Can Click LogIn Button
    Then Verify User Can Not LogIn Successful





    # LogIn With Empty Email


  Scenario: user LogIn With Empty Email

    Given User on the LogIn page
    When User Can Add Empty Email & LogIn
    And User Can Add Valid Password & LogIn
    And User Can Click LogIn Button
    Then Verify User Can Not LogIn Successful





    # LogIn With Empty Password


  Scenario: user LogIn With Empty Password

    Given User on the LogIn page
    When User Can Add Valid Email & LogIn
    And User Can Add Empty Password & LogIn
    And User Can Click LogIn Button
    And User Can LogOut
    Then Verify User Can Not LogIn Successful





    # LogIn With Empty Email & Password


  Scenario: user LogIn With Empty Email & Password

    Given User on the LogIn page
    When User Can Add Empty Email & LogIn
    And User Can Add Empty Password & LogIn
    And User Can Click LogIn Button
    And User Can LogOut
    Then Verify User Can Not LogIn Successful
