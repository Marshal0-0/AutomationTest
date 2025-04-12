Feature: User Registration

  # Happy Scenario

  Scenario: Successful user registration Valid Data

    Given user on the SignUp&LogIn page
    When User Can Add Valid Name
    And User Can Add Valid Email
    And User Can Click SignUp Button
    Then User Can Enter Account Information

    # SignUp Page

    When User Can Select Valid Title
    And User Can Edit Valid Name
    And User Can Add Valid password
    And User Can Add Valid Date Of Birth
    And User Can Select Valid Sign up for our newsletter & Receive special offers from our partners
    And User Can Add Valid FName
    And User Can Add Valid LName
    And User Can Add Valid Company
    And User Can Add Valid Address1
    And User Can Add Valid Address 2
    And User Can Select Valid Country
    And User Can Add Valid State
    And User Can Add Valid City
    And User Can Add Valid ZipCode
    And User Can Add Valid Mobile Number
    And User Can Click Create Account Button
    Then User Create Account Successful



    # Bad Scenario



  Scenario: Successful user registration InValid Data


    Given user on the SignUp&LogIn page
    When User Can Add InValid Name
    And User Can Add InValid Email
    And User Can Click SignUp Button
    Then User Can Enter Account Information

    # SignUp Page

    When User Can Select InValid Title
    And User Can Edit InValid Name
    And User Can Add InValid password
    And User Can Add InValid Date Of Birth
    And User Can Select InValid Sign up for our newsletter & Receive special offers from our partners
    And User Can Add InValid FName
    And User Can Add InValid LName
    And User Can Add InValid Company
    And User Can Add InValid Address1
    And User Can Add InValid Address 2
    And User Can Select Valid Country
    And User Can Add InValid State
    And User Can Add InValid City
    And User Can Add InValid ZipCode
    And User Can Add InValid Mobile Number
    And User Can Click Create Account Button
    Then User UnCreate Account Successful




    # InValid Title


  Scenario: UnSuccessful user registration InValidTitle

    Given user on the SignUp&LogIn page
    When User Can Add Valid Name&1
    And User Can Add Valid Email&1
    And User Can Click SignUp Button
    Then User Can Enter Account Information

    # SignUp Page

    When User Can Select InValid Title
    And User Can Edit Valid Name&1
    And User Can Add Valid password
    And User Can Add Valid Date Of Birth
    And User Can Select Valid Sign up for our newsletter & Receive special offers from our partners
    And User Can Add Valid FName&1
    And User Can Add Valid LName&1
    And User Can Add Valid Company
    And User Can Add Valid Address1
    And User Can Add Valid Address 2
    And User Can Select Valid Country
    And User Can Add Valid State
    And User Can Add Valid City
    And User Can Add Valid ZipCode
    And User Can Add Valid Mobile Number
    And User Can Click Create Account Button
    Then User Can Not Create Account Successful





    # InValid Name


  Scenario:  user registration InValid Name

    Given user on the SignUp&LogIn page
    When User Can Add InValid Name
    And User Can Add Valid Email&2
    And User Can Click SignUp Button
    Then User Can Enter Account Information

    # SignUp Page

    When User Can Select Valid Title
    And User Can Edit InValid Name&2
    And User Can Add Valid password
    And User Can Add Valid Date Of Birth
    And User Can Select Valid Sign up for our newsletter & Receive special offers from our partners
    And User Can Add Valid FName
    And User Can Add Valid LName
    And User Can Add Valid Company
    And User Can Add Valid Address1
    And User Can Add Valid Address 2
    And User Can Select Valid Country
    And User Can Add Valid State
    And User Can Add Valid City
    And User Can Add Valid ZipCode
    And User Can Add Valid Mobile Number
    And User Can Click Create Account Button
    Then User Can Not Create Account Successful




    # Empty Name


  Scenario:  user registration Empty Name

    Given user on the SignUp&LogIn page
    When User Can Add Valid Name
    And User Can Add Valid Email&0
    And User Can Click SignUp Button
    Then User Can Enter Account Information

    # SignUp Page

    When User Can Select Valid Title
    And User Can Edit Empty Name
    And User Can Add Valid password
    And User Can Add Valid Date Of Birth
    And User Can Select Valid Sign up for our newsletter & Receive special offers from our partners
    And User Can Add Valid FName
    And User Can Add Valid LName
    And User Can Add Valid Company
    And User Can Add Valid Address1
    And User Can Add Valid Address 2
    And User Can Select Valid Country
    And User Can Add Valid State
    And User Can Add Valid City
    And User Can Add Valid ZipCode
    And User Can Add Valid Mobile Number
    And User Can Click Create Account Button
    Then User Can Not Create Account Successful




    # InValid Password


  Scenario: user registration InValid Password

    Given user on the SignUp&LogIn page
    When User Can Add Valid Name
    And User Can Add Valid Email&3
    And User Can Click SignUp Button
    Then User Can Enter Account Information

    # SignUp Page

    When User Can Select Valid Title
    And User Can Edit Valid Name
    And User Can Add InValid password&1
    And User Can Add Valid Date Of Birth
    And User Can Select Valid Sign up for our newsletter & Receive special offers from our partners
    And User Can Add Valid FName
    And User Can Add Valid LName
    And User Can Add Valid Company
    And User Can Add Valid Address1
    And User Can Add Valid Address 2
    And User Can Select Valid Country
    And User Can Add Valid State
    And User Can Add Valid City
    And User Can Add Valid ZipCode
    And User Can Add Valid Mobile Number
    And User Can Click Create Account Button
    Then User Can Not Create Account Successful





    # Empty Password


  Scenario:  user registration Empty Password

    Given user on the SignUp&LogIn page
    When User Can Add Valid Name
    And User Can Add Valid Email&4
    And User Can Click SignUp Button
    Then User Can Enter Account Information

    # SignUp Page

    When User Can Select Valid Title
    And User Can Edit Valid Name
    And User Can Add Empty password&3
    And User Can Add Valid Date Of Birth
    And User Can Select Valid Sign up for our newsletter & Receive special offers from our partners
    And User Can Add Valid FName
    And User Can Add Valid LName
    And User Can Add Valid Company
    And User Can Add Valid Address1
    And User Can Add Valid Address 2
    And User Can Select Valid Country
    And User Can Add Valid State
    And User Can Add Valid City
    And User Can Add Valid ZipCode
    And User Can Add Valid Mobile Number
    And User Can Click Create Account Button
    Then User Can Not Create Account Successful




    # InValid Date Of Birth


  Scenario: user registration InValid Date Of Birth

    Given user on the SignUp&LogIn page
    When User Can Add Valid Name
    And User Can Add Valid Email&5
    And User Can Click SignUp Button
    Then User Can Enter Account Information

    # SignUp Page

    When User Can Select Valid Title
    And User Can Edit Valid Name
    And User Can Add Valid password
    And User Can Add INValid Date Of Birth
    And User Can Select Valid Sign up for our newsletter & Receive special offers from our partners
    And User Can Add Valid FName
    And User Can Add Valid LName
    And User Can Add Valid Company
    And User Can Add Valid Address1
    And User Can Add Valid Address 2
    And User Can Select Valid Country
    And User Can Add Valid State
    And User Can Add Valid City
    And User Can Add Valid ZipCode
    And User Can Add Valid Mobile Number
    And User Can Click Create Account Button
    Then User Can Not Create Account Successful




    # Empty Date Of Birth


  Scenario: user registration Empty Date Of Birth

    Given user on the SignUp&LogIn page
    When User Can Add Valid Name
    And User Can Add Valid Email&6
    And User Can Click SignUp Button
    Then User Can Enter Account Information

    # SignUp Page

    When User Can Select Valid Title
    And User Can Edit Valid Name
    And User Can Add Valid password
    And User Can Add Empty Date Of Birth
    And User Can Select Valid Sign up for our newsletter & Receive special offers from our partners
    And User Can Add Valid FName
    And User Can Add Valid LName
    And User Can Add Valid Company
    And User Can Add Valid Address1
    And User Can Add Valid Address 2
    And User Can Select Valid Country
    And User Can Add Valid State
    And User Can Add Valid City
    And User Can Add Valid ZipCode
    And User Can Add Valid Mobile Number
    And User Can Click Create Account Button
    Then User Can Not Create Account Successful




    # InValid First Name


  Scenario: user registration InValid First Name

    Given user on the SignUp&LogIn page
    When User Can Add Valid Name
    And User Can Add Valid Email&7
    And User Can Click SignUp Button
    Then User Can Enter Account Information

    # SignUp Page

    When User Can Select Valid Title
    And User Can Edit Valid Name
    And User Can Add Valid password
    And User Can Add Valid Date Of Birth
    And User Can Select Valid Sign up for our newsletter & Receive special offers from our partners
    And User Can Add InValid FName&2
    And User Can Add Valid LName
    And User Can Add Valid Company
    And User Can Add Valid Address1
    And User Can Add Valid Address 2
    And User Can Select Valid Country
    And User Can Add Valid State
    And User Can Add Valid City
    And User Can Add Valid ZipCode
    And User Can Add Valid Mobile Number
    And User Can Click Create Account Button
    Then User Can Not Create Account Successful




    # Empty First Name


  Scenario: user registration Empty First Name

    Given user on the SignUp&LogIn page
    When User Can Add Valid Name
    And User Can Add Valid Email&8
    And User Can Click SignUp Button
    Then User Can Enter Account Information

    # SignUp Page

    When User Can Select Valid Title
    And User Can Edit Valid Name
    And User Can Add Valid password
    And User Can Add Valid Date Of Birth
    And User Can Select Valid Sign up for our newsletter & Receive special offers from our partners
    And User Can Add Empty FName
    And User Can Add Valid LName
    And User Can Add Valid Company
    And User Can Add Valid Address1
    And User Can Add Valid Address 2
    And User Can Select Valid Country
    And User Can Add Valid State
    And User Can Add Valid City
    And User Can Add Valid ZipCode
    And User Can Add Valid Mobile Number
    And User Can Click Create Account Button
    Then User Can Not Create Account Successful




    # InValid Last Name


  Scenario: user registration InValid Last Name

    Given user on the SignUp&LogIn page
    When User Can Add Valid Name
    And User Can Add Valid Email&9
    And User Can Click SignUp Button
    Then User Can Enter Account Information

    # SignUp Page

    When User Can Select Valid Title
    And User Can Edit Valid Name
    And User Can Add Valid password
    And User Can Add Valid Date Of Birth
    And User Can Select Valid Sign up for our newsletter & Receive special offers from our partners
    And User Can Add Valid FName
    And User Can Add InValid LName&2
    And User Can Add Valid Company
    And User Can Add Valid Address1
    And User Can Add Valid Address 2
    And User Can Select Valid Country
    And User Can Add Valid State
    And User Can Add Valid City
    And User Can Add Valid ZipCode
    And User Can Add Valid Mobile Number
    And User Can Click Create Account Button
    Then User Can Not Create Account Successful




    # Empty Last Name


  Scenario: user registration Empty Last Name

    Given user on the SignUp&LogIn page
    When User Can Add Valid Name
    And User Can Add Valid Email&10
    And User Can Click SignUp Button
    Then User Can Enter Account Information

    # SignUp Page

    When User Can Select Valid Title
    And User Can Edit Valid Name
    And User Can Add Valid password
    And User Can Add Valid Date Of Birth
    And User Can Select Valid Sign up for our newsletter & Receive special offers from our partners
    And User Can Add Valid FName
    And User Can Add Empty LName
    And User Can Add Valid Company
    And User Can Add Valid Address1
    And User Can Add Valid Address 2
    And User Can Select Valid Country
    And User Can Add Valid State
    And User Can Add Valid City
    And User Can Add Valid ZipCode
    And User Can Add Valid Mobile Number
    And User Can Click Create Account Button
    Then User Can Not Create Account Successful




    # Empty Selection 1


  Scenario: user registration Empty Selection 1

    Given user on the SignUp&LogIn page
    When User Can Add Valid Name
    And User Can Add Valid Email&11
    And User Can Click SignUp Button
    Then User Can Enter Account Information

    # SignUp Page

    When User Can Select Valid Title
    And User Can Edit Valid Name
    And User Can Add Valid password
    And User Can Add Valid Date Of Birth
    And User Can Select Empty Sign up for our newsletter & Valid Receive special offers from our partners
    And User Can Add Valid FName
    And User Can Add Valid LName
    And User Can Add Valid Company
    And User Can Add Valid Address1
    And User Can Add Valid Address 2
    And User Can Select Valid Country
    And User Can Add Valid State
    And User Can Add Valid City
    And User Can Add Valid ZipCode
    And User Can Add Valid Mobile Number
    And User Can Click Create Account Button
    Then User Create Account Successful




    # Empty Selection 2


  Scenario:  user registration Empty Selection 2

    Given user on the SignUp&LogIn page
    When User Can Add Valid Name
    And User Can Add Valid Email&12
    And User Can Click SignUp Button
    Then User Can Enter Account Information

    # SignUp Page

    When User Can Select Valid Title
    And User Can Edit Valid Name
    And User Can Add Valid password
    And User Can Add Valid Date Of Birth
    And User Can Select Valid Sign up for our newsletter & Empty Receive special offers from our partners
    And User Can Add Valid FName
    And User Can Add Valid LName
    And User Can Add Valid Company
    And User Can Add Valid Address1
    And User Can Add Valid Address 2
    And User Can Select Valid Country
    And User Can Add Valid State
    And User Can Add Valid City
    And User Can Add Valid ZipCode
    And User Can Add Valid Mobile Number
    And User Can Click Create Account Button
    Then User Create Account Successful




    # Empty Selection 1 & 2


  Scenario: user registration  Empty Selection 1 & 2

    Given user on the SignUp&LogIn page
    When User Can Add Valid Name
    And User Can Add Valid Email&13
    And User Can Click SignUp Button
    Then User Can Enter Account Information

    # SignUp Page

    When User Can Select Valid Title
    And User Can Edit Valid Name
    And User Can Add Valid password
    And User Can Add Valid Date Of Birth
    And User Can Select Empty Sign up for our newsletter & Empty Receive special offers from our partners
    And User Can Add Valid FName
    And User Can Add Valid LName
    And User Can Add Valid Company
    And User Can Add Valid Address1
    And User Can Add Valid Address 2
    And User Can Select Valid Country
    And User Can Add Valid State
    And User Can Add Valid City
    And User Can Add Valid ZipCode
    And User Can Add Valid Mobile Number
    And User Can Click Create Account Button
    Then User Can Not Create Account Successful




    # InValid Company


  Scenario: user registration InValid Company

    Given user on the SignUp&LogIn page
    When User Can Add Valid Name
    And User Can Add Valid Email&14
    And User Can Click SignUp Button
    Then User Can Enter Account Information

    # SignUp Page

    When User Can Select Valid Title
    And User Can Edit Valid Name
    And User Can Add Valid password
    And User Can Add Valid Date Of Birth
    And User Can Select Valid Sign up for our newsletter & Receive special offers from our partners
    And User Can Add Valid FName
    And User Can Add Valid LName
    And User Can Add InValid Company
    And User Can Add Valid Address1
    And User Can Add Valid Address 2
    And User Can Select Valid Country
    And User Can Add Valid State
    And User Can Add Valid City
    And User Can Add Valid ZipCode
    And User Can Add Valid Mobile Number
    And User Can Click Create Account Button
    Then User Create Account Successful




    # Empty Company


  Scenario: user registration Empty Company

    Given user on the SignUp&LogIn page
    When User Can Add Valid Name
    And User Can Add Valid Email&15
    And User Can Click SignUp Button
    Then User Can Enter Account Information

    # SignUp Page

    When User Can Select Valid Title
    And User Can Edit Valid Name
    And User Can Add Valid password
    And User Can Add Valid Date Of Birth
    And User Can Select Valid Sign up for our newsletter & Receive special offers from our partners
    And User Can Add Valid FName
    And User Can Add Valid LName
    And User Can Add Empty Company
    And User Can Add Valid Address1
    And User Can Add Valid Address 2
    And User Can Select Valid Country
    And User Can Add Valid State
    And User Can Add Valid City
    And User Can Add Valid ZipCode
    And User Can Add Valid Mobile Number
    And User Can Click Create Account Button
    Then User Create Account Successful




    # InValid Address1


  Scenario: user registration InValid Address1

    Given user on the SignUp&LogIn page
    When User Can Add Valid Name
    And User Can Add Valid Email&16
    And User Can Click SignUp Button
    Then User Can Enter Account Information

    # SignUp Page

    When User Can Select Valid Title
    And User Can Edit Valid Name
    And User Can Add Valid password
    And User Can Add Valid Date Of Birth
    And User Can Select Valid Sign up for our newsletter & Receive special offers from our partners
    And User Can Add Valid FName
    And User Can Add Valid LName
    And User Can Add Valid Company
    And User Can Add InValid Address1
    And User Can Add Valid Address 2
    And User Can Select Valid Country
    And User Can Add Valid State
    And User Can Add Valid City
    And User Can Add Valid ZipCode
    And User Can Add Valid Mobile Number
    And User Can Click Create Account Button
    Then User Can Not Create Account Successful




    # Empty Address 1


  Scenario:  user registration Empty Address 1

    Given user on the SignUp&LogIn page
    When User Can Add Valid Name
    And User Can Add Valid Email&17
    And User Can Click SignUp Button
    Then User Can Enter Account Information

    # SignUp Page

    When User Can Select Valid Title
    And User Can Edit Valid Name
    And User Can Add Valid password
    And User Can Add Valid Date Of Birth
    And User Can Select Valid Sign up for our newsletter & Receive special offers from our partners
    And User Can Add Valid FName
    And User Can Add Valid LName
    And User Can Add Valid Company
    And User Can Add Empty Address1
    And User Can Add Valid Address 2
    And User Can Select Valid Country
    And User Can Add Valid State
    And User Can Add Valid City
    And User Can Add Valid ZipCode
    And User Can Add Valid Mobile Number
    And User Can Click Create Account Button
    Then User Can Not Create Account Successful




    # InValid Address 2


  Scenario: user registration InValid Address 2

    Given user on the SignUp&LogIn page
    When User Can Add Valid Name
    And User Can Add Valid Email&17
    And User Can Click SignUp Button
    Then User Can Enter Account Information

    # SignUp Page

    When User Can Select Valid Title
    And User Can Edit Valid Name
    And User Can Add Valid password
    And User Can Add Valid Date Of Birth
    And User Can Select Valid Sign up for our newsletter & Receive special offers from our partners
    And User Can Add Valid FName
    And User Can Add Valid LName
    And User Can Add Valid Company
    And User Can Add Valid Address1
    And User Can Add InValid Address 2
    And User Can Select Valid Country
    And User Can Add Valid State
    And User Can Add Valid City
    And User Can Add Valid ZipCode
    And User Can Add Valid Mobile Number
    And User Can Click Create Account Button
    Then User Can Not Create Account Successful




    # Empty Address 2


  Scenario: user registration Empty Address 2

    Given user on the SignUp&LogIn page
    When User Can Add Valid Name
    And User Can Add Valid Email&18
    And User Can Click SignUp Button
    Then User Can Enter Account Information

    # SignUp Page

    When User Can Select Valid Title
    And User Can Edit Valid Name
    And User Can Add Valid password
    And User Can Add Valid Date Of Birth
    And User Can Select Valid Sign up for our newsletter & Receive special offers from our partners
    And User Can Add Valid FName
    And User Can Add Valid LName
    And User Can Add Valid Company
    And User Can Add Valid Address1
    And User Can Add Empty Address 2
    And User Can Select Valid Country
    And User Can Add Valid State
    And User Can Add Valid City
    And User Can Add Valid ZipCode
    And User Can Add Valid Mobile Number
    And User Can Click Create Account Button
    Then User Create Account Successful




    # InValid State


  Scenario: user registration InValid State

    Given user on the SignUp&LogIn page
    When User Can Add Valid Name
    And User Can Add Valid Email&19
    And User Can Click SignUp Button
    Then User Can Enter Account Information

    # SignUp Page

    When User Can Select Valid Title
    And User Can Edit Valid Name
    And User Can Add Valid password
    And User Can Add Valid Date Of Birth
    And User Can Select Valid Sign up for our newsletter & Receive special offers from our partners
    And User Can Add Valid FName
    And User Can Add Valid LName
    And User Can Add Valid Company
    And User Can Add Valid Address1
    And User Can Add Valid Address 2
    And User Can Select Valid Country
    And User Can Add InValid State
    And User Can Add Valid City
    And User Can Add Valid ZipCode
    And User Can Add Valid Mobile Number
    And User Can Click Create Account Button
    Then User Can Not Create Account Successful




    # Empty State


  Scenario: user registration Empty State

    Given user on the SignUp&LogIn page
    When User Can Add Valid Name
    And User Can Add Valid Email&20
    And User Can Click SignUp Button
    Then User Can Enter Account Information

    # SignUp Page

    When User Can Select Valid Title
    And User Can Edit Valid Name
    And User Can Add Valid password
    And User Can Add Valid Date Of Birth
    And User Can Select Valid Sign up for our newsletter & Receive special offers from our partners
    And User Can Add Valid FName
    And User Can Add Valid LName
    And User Can Add Valid Company
    And User Can Add Valid Address1
    And User Can Add Valid Address 2
    And User Can Select Valid Country
    And User Can Add Empty State
    And User Can Add Valid City
    And User Can Add Valid ZipCode
    And User Can Add Valid Mobile Number
    And User Can Click Create Account Button
    Then User Can Not Create Account Successful




    # InValid City


  Scenario: user registration InValid City

    Given user on the SignUp&LogIn page
    When User Can Add Valid Name
    And User Can Add Valid Email&21
    And User Can Click SignUp Button
    Then User Can Enter Account Information

    # SignUp Page

    When User Can Select Valid Title
    And User Can Edit Valid Name
    And User Can Add Valid password
    And User Can Add Valid Date Of Birth
    And User Can Select Valid Sign up for our newsletter & Receive special offers from our partners
    And User Can Add Valid FName
    And User Can Add Valid LName
    And User Can Add Valid Company
    And User Can Add Valid Address1
    And User Can Add Valid Address 2
    And User Can Select Valid Country
    And User Can Add Valid State
    And User Can Add InValid City
    And User Can Add Valid ZipCode
    And User Can Add Valid Mobile Number
    And User Can Click Create Account Button
    Then User Can Not Create Account Successful




    # Empty City


  Scenario: user registration Empty City

    Given user on the SignUp&LogIn page
    When User Can Add Valid Name
    And User Can Add Valid Email&22
    And User Can Click SignUp Button
    Then User Can Enter Account Information

    # SignUp Page

    When User Can Select Valid Title
    And User Can Edit Valid Name
    And User Can Add Valid password
    And User Can Add Valid Date Of Birth
    And User Can Select Valid Sign up for our newsletter & Receive special offers from our partners
    And User Can Add Valid FName
    And User Can Add Valid LName
    And User Can Add Valid Company
    And User Can Add Valid Address1
    And User Can Add Valid Address 2
    And User Can Select Valid Country
    And User Can Add Valid State
    And User Can Add Empty City
    And User Can Add Valid ZipCode
    And User Can Add Valid Mobile Number
    And User Can Click Create Account Button
    Then User Can Not Create Account Successful




    # InValid ZipCode


  Scenario: user registration InValid ZipCode

    Given user on the SignUp&LogIn page
    When User Can Add Valid Name
    And User Can Add Valid Email&23
    And User Can Click SignUp Button
    Then User Can Enter Account Information

    # SignUp Page

    When User Can Select Valid Title
    And User Can Edit Valid Name
    And User Can Add Valid password
    And User Can Add Valid Date Of Birth
    And User Can Select Valid Sign up for our newsletter & Receive special offers from our partners
    And User Can Add Valid FName
    And User Can Add Valid LName
    And User Can Add Valid Company
    And User Can Add Valid Address1
    And User Can Add Valid Address 2
    And User Can Select Valid Country
    And User Can Add Valid State
    And User Can Add Valid City
    And User Can Add InValid ZipCode
    And User Can Add Valid Mobile Number
    And User Can Click Create Account Button
    Then User Can Not Create Account Successful




    # Empty ZipCode


  Scenario: user registration Empty ZipCode

    Given user on the SignUp&LogIn page
    When User Can Add Valid Name
    And User Can Add Valid Email&23
    And User Can Click SignUp Button
    Then User Can Enter Account Information

    # SignUp Page

    When User Can Select Valid Title
    And User Can Edit Valid Name
    And User Can Add Valid password
    And User Can Add Valid Date Of Birth
    And User Can Select Valid Sign up for our newsletter & Receive special offers from our partners
    And User Can Add Valid FName
    And User Can Add Valid LName
    And User Can Add Valid Company
    And User Can Add Valid Address1
    And User Can Add Valid Address 2
    And User Can Select Valid Country
    And User Can Add Valid State
    And User Can Add Valid City
    And User Can Add Empty ZipCode
    And User Can Add Valid Mobile Number
    And User Can Click Create Account Button
    Then User Can Not Create Account Successful




    # InValid Mobile Number


  Scenario: user registration InValid Mobile Number

    Given user on the SignUp&LogIn page
    When User Can Add Valid Name
    And User Can Add Valid Email&24
    And User Can Click SignUp Button
    Then User Can Enter Account Information

    # SignUp Page

    When User Can Select Valid Title
    And User Can Edit Valid Name
    And User Can Add Valid password
    And User Can Add Valid Date Of Birth
    And User Can Select Valid Sign up for our newsletter & Receive special offers from our partners
    And User Can Add Valid FName
    And User Can Add Valid LName
    And User Can Add Valid Company
    And User Can Add Valid Address1
    And User Can Add Valid Address 2
    And User Can Select Valid Country
    And User Can Add Valid State
    And User Can Add Valid City
    And User Can Add Valid ZipCode
    And User Can Add InValid Mobile Number
    And User Can Click Create Account Button
    Then User Can Not Create Account Successful




    # Empty Mobile Number


  Scenario: user registration Empty Mobile Number

    Given user on the SignUp&LogIn page
    When User Can Add Valid Name
    And User Can Add Valid Email&24
    And User Can Click SignUp Button
    Then User Can Enter Account Information

    # SignUp Page

    When User Can Select Valid Title
    And User Can Edit Valid Name
    And User Can Add Valid password
    And User Can Add Valid Date Of Birth
    And User Can Select Valid Sign up for our newsletter & Receive special offers from our partners
    And User Can Add Valid FName
    And User Can Add Valid LName
    And User Can Add Valid Company
    And User Can Add Valid Address1
    And User Can Add Valid Address 2
    And User Can Select Valid Country
    And User Can Add Valid State
    And User Can Add Valid City
    And User Can Add Valid ZipCode
    And User Can Add Empty Mobile Number
    And User Can Click Create Account Button
    Then User Can Not Create Account Successful




    # Empty Data


  Scenario: user registration Empty Data

    Given user on the SignUp&LogIn page
    When User Can Add Valid Name
    And User Can Add Valid Email&25
    And User Can Click SignUp Button
    Then User Can Enter Account Information

    # SignUp Page


    When User Can Select InValid Title
    And User Can Edit Empty Name
    And User Can Add Empty password&3
    And User Can Add Empty Date Of Birth
    And User Can Select Empty Sign up for our newsletter & Empty Receive special offers from our partners
    And User Can Add Empty FName
    And User Can Add Empty LName
    And User Can Add Empty Company
    And User Can Add Empty Address1
    And User Can Add Empty Address 2
    And User Can Select Valid Country
    And User Can Add Empty State
    And User Can Add Empty City
    And User Can Add Empty ZipCode
    And User Can Add Empty Mobile Number
    And User Can Click Create Account Button
    Then User Create Account Successful