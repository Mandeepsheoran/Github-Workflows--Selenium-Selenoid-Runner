#Author: Mandeep.sheoran
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@Regression
Feature: Submitting personal details on demoqa website
  As a user on DemoQA website
  I want to submit my details on text form
  
  Background:
    Given User is already on text form page to submit details

  @Smoke
  Scenario: Type all the details in details form
    Given Full name and valid Email are entered in form along with other details
    When Submit button is clicked
    Then Submitted details should be displayed in bottom of page

  @NegativeTest
  Scenario Outline: Type invalid value in some field
    Given Incorrect email is entered "<email>"
    When Submit button is clicked with invalid details
    Then Field with invalid values should be highlighted

    Examples: 
      | email |
      | dd |
      | aa |
