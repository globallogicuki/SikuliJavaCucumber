@macos
Feature: Mac OS Calculator
  As an SDET
  I want to use spotlight to open the calculator
  I can check that pattern matching is working

  Scenario: Open calculator
    Given I have opened the launchpad
    When I enter "calculator"
    And I click calculator button 1
    And I click calculator button 3
    And I click calculator button 3
    And I click calculator button 7
    Then the calculator result 1337 is shown