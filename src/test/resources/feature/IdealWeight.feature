#Author: your.email@your.domain.com
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
@IdealWeight
Feature: Calculate Ideal Weight
	I want to obtain the ideal weight in accordance with the provided arguments

  @tag1
  Scenario Outline: Invalid gender
    Given I use a health calculator
    When I calculate the ideal weight with an incorrect gender <g>
    Then the program throws an exception
    Examples: 
      | 3 |
      | a |
      |'*'|


  @tag2
  Scenario: Invalid height
    Given I use a health calculator
    When I calculate the ideal weight with an incorrect height <h>
    Then the program throws an exception
    Examples: 
      | -3 |
      |  0 |
      | 'f'|
      
      
  @tag3
  Scenario Outline: Negative output
    Given I have an health calculator
    When I calculate the ideal weight for height <h> and gender <g> and the output is negative
    Then the program throws an exception
    
   	Examples: 
   		| g | h |
      |'w'| 29 |
      |'m'| 82 |
      |'m'| 39 |
      |'w'| 66 |
      
      
  @tag5
  Scenario Outline: valid arguments
    Given I have an health calculator
    When I calculate the ideal weight for height <h> and gender <g>
    Then the program provides an appropiate output <output>
    
   	Examples: 
      | g |  h  | output |
      |'w'| 173 | '63.8' |
      |'m'| 169 | '64.2' |
      |'m'| 183 | '74.7' |
      |'w'| 150 |  '50'  |
