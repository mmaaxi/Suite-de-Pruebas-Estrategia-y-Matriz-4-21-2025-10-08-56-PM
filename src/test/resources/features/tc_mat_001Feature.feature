Feature: Generate Matrix

  Scenario: Execute generation of matrix
    Given I open the matrix generator page
    When I execute the matrix generation
    Then the matrix should be generated correctly