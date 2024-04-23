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
@tag
Feature: Calculate Basal Metabolic Rate
  I want to obtain the basal metabolic rate in accordance with the provided arguments

  @tag1
  Scenario Outline: Invalid gender
    Given I use a health calculator
    When I calculate the basal metabolic rate with an incorrect gender <g>
    Then the program throws an exception
    Examples: 
      | 6 |
      | "s" |
      | '*' |


  @tag2
  Scenario: Invalid height
    Given I use a health calculator
    When I calculate the basal metabolic rate with an incorrect height <h>
    Then the program throws an exception
    Examples: 
      | -3 |
      | 0 |
      | 'f' |
      
  @tag3
  Scenario: Invalid weight
    Given I use a health calculator
    When I calculate the basal metabolic rate with an incorrect weight <w>
    Then the program throws an exception
    Examples: 
      | -15 |
      | 0 |
      | 'f' |
      
  @tag4
  Scenario Outline: Invalid Age
    Given I use a health calculator
    When I calculate the basal metabolic rate for an age with negative value <a>
    Then the system throws an exception

    Examples: 
      | "-" |
      | -1 |
      | -69 |
      | u |
      
  @tag5
  Scenario Outline: valid arguments
    Given I have an health calculator
    When I calculate the basal metabolic rate for height <h> gender <g> age <a> and weight <w>
    Then the program provides an appropiate output <output>
    
   	Examples: 
      | g | h | a | w | output|
      | 'w' | 173 | 21 | 60 | '1415.3' |
      | 'm' | 169 | 18 | 59 | '1561.3' |
      | 'm' | 183 | 74 | 78 | '1558.8' |
      | 'w' | 150 | 30 | 40 | '1026.5' |
