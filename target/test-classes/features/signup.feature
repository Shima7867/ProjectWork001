@web @regression @signup
Feature: Verify Signup Feature

  Background:
    Given I am on facebook home page


  @signup-1
  Scenario Outline: Verify invalid signup
    When I enter mohammad into firstname text fields on facebook home screen
    And I enter muntakim into lastname text fields on home screen
    And I enter <mobileNumber> into mobile number text fields on facebook home screen
    #And I enter test1234 into new password text fields on home screen
    And I click on signup button on home screen
    Then I verify invalid signup error message

    Examples:
      | mobileNumber                  |
      | 1234567890                    |
      | chris@technosoftacademy.io    |
      | smithtechnosoftacademy.io     |



  @signup-2
  Scenario: Verify gender is selected
    Then I verify gender female is selected
    And I verify gender male is selected


