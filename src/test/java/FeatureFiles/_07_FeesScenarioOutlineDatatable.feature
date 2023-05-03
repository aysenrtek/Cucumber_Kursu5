#Senaryo :
#  Daha önceki Fee Functionality Senaryosunu
#  name, code, intCode ve priority için 5 farklı kombinasyon için çalıştırınız.

Feature: Fee Functionality multiple values functionality

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login succesfully
  @Regression
  Scenario Outline: Fee Functionality

    And Click on the element in LeftNav
      | setup      |
      | parameters |
      | fees       |

    And Click on the element in Dialog
      | addButton |

    And User sending the keys in Dialog Content
      | nameInput       | <name>     |
      | codeInput       | <code>     |
      | integrationCode | <intCode>  |
      | priorityCode    | <priority> |

    And Click on the element in Dialog
      | toggleBar  |
      | saveButton |

    Then Success message should be displayed

    And User delete item from Dialog Content
      | <name> |

    Then Success message should be displayed

    Examples:
      | name  | code | intCode | priority |
      | opp23 | 1133 | asel1   | 78547    |
      | opp24 | 1134 | asel2   | 78547    |
      | opp25 | 1135 | asel3   | 78548    |
      | opp26 | 1136 | asel4   | 78549    |
      | opp27 | 1137 | asel5   | 78549    |



