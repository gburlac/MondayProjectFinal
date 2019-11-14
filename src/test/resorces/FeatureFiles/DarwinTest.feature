Feature:Practice order products on Darwin

  Scenario: Reserve Products on DarwinMd
    Given I am on the DarwinMd page
    When Go to Apple Option from menu
    And  Choose a product type
    And  From the right menu select at least three options
    And  Select a product
    And  Click cumpara
    And  Complete the fields with a data table
         |Bondari@mi6.com|Jora|Bondari|00000009|Dacia 09|
    And   Click cumpara buton
    Then  Check the success message displayed