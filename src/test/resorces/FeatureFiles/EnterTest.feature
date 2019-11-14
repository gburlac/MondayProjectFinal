Feature:Practice order products on EnterOnline

  Scenario: Reserve Products on EnterOnline
    Given I am on the EnterOnline page
    When Go to Toate Categoriile menu
    And Go to PC si Periferice
    And  Click on Tastaturi
    And  Select at least three options from the side menu
    And  Add a product to the cart
    And  Click on the cart
    And  Click Vizualizati cosul
    And  Click Finalizare comanda
    And  Click Finalizare comanda fara inregistrare
    And  Complete the fields using a data table
         |James|Bond|bond@mi6.com|000000007|Chisinau|Dacia 07|
    And  Click Continuati
    And  Click Continuatii
    And  Click TRIMITE COMANDA MEA
    Then  Check the success message