Feature: Contact Us



  # Happy Scenario


  Scenario: Contact Us With Valid Data


    Given Open Site
    When Go To Contact Us
    And Add name
    And Add email
    And Add Subject
    And Add Message
    Then Submit





    # InValid Email


  Scenario: Contact Us With InValid Email


    Given Open Site
    When Go To Contact Us
    And Add name
    And Add InValid email
    And Add Subject
    And Add Message
    Then Submit





    # InValid Email Only Space


  Scenario: Contact Us With InValid Email Only Space


    Given Open Site
    When Go To Contact Us
    And Add name
    And Add InValid email Only Space
    And Add Subject
    And Add Message
    Then Submit