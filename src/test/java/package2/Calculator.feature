Feature: Test Calculator
This file describes calculator functionality.

Scenario: Add two Numbers
Given I enter 50 in the calculator
And I press add
And I have entered 51 in the calculator
And I press equal symbol
Then The result should be 100 on the screen