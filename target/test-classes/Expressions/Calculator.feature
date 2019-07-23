Feature: Test Calculator
This file describes calculator functionality.

Scenario: Add two Numbers
Given I enter 100 in the calculator
And I press add
And I have entered 50 in the calculator
And I press equal symbol
Then The result should be 100 on the screen

Scenario: Sub two Numbers
Given I enter 50 in the calculator
And I press sub
And I have entered 50 in the calculator
And I press equals symbol
Then The result should be 0 on the screen