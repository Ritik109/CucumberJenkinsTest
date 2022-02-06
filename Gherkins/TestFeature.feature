Feature: Cucumber Test Feature

@Sanity
  Scenario Outline: Scenario 1 Of Test Feature
    Given Test Given
    Then Test Then
    And Test validation
    Examples:
    |URL|
    |URL|
    
    @Sanity
     Scenario Outline: Scenario 2 Of Test Feature
    Given Test Given
    Then Test Then
    And Test validation
    Examples:
    |URL|
    |URL|
    
      @Regression
     Scenario Outline: Scenario 3 Of Test Feature
    Given Test Given
    Then Test Then
    And Test validation
    Examples:
    |URL|
    |URL|
    
      @SchematicCheck
     Scenario Outline: Scenario 2 Of Test Feature
    Given Test Given
    Then Test Then
    And Test validation
    Examples:
    |URL|
    |URL|

