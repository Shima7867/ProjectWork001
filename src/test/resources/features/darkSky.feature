@web @regression @darkSky
  Feature: DarkSky feature


  Background:
    Given  I am on DarkSky Home Page

  @darkSky-1
  Scenario: Verify invalid register page
    When I am on the darkSky Register page
    And I click on Register button
    Then I verify invalid register page "Fill out this field"


  @darkSky-2
  Scenario: Verify Current Temperature should not be greater or less than the Temperature from Daily Timeline
    Then I verify current temp is not greater or less then temps from daily timeline


  @darkSky-3
  Scenario: Verify individual day temp timeline
    When I expand today's timeline
    Then I verify lowest and highest temp is displayed correctly


  @darkSky-4
  Scenario: Verify timeline is displayed in correct format
    Then I verify timeline is displayed with two hours incremented



