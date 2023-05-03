Feature: DataTable Functionality
  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login succesfully

    Scenario: Create Country
      And Click on the element in LeftNav
        | setup      |
        | parameters |
        | countries  |

      And Click on the element in Dialog
        | addButton |
      And User sending the keys in Dialog Content
        | nameInput | ayse2502 |
        | codeInput | 1106     |

      And Click on the element in Dialog
        | saveButton |

      Then Success message should be displayed

      And User delete item from Dialog Content
      |ayse2502|

      Then Success message should be displayed
@Regression
  Scenario: Create Nationality

    And Click on the element in LeftNav
      | setup         |
      | parameters    |
      | nationalities |

    And Click on the element in Dialog
      | addButton |

    And User sending the keys in Dialog Content
      | nameInput | ayse202 |

    And Click on the element in Dialog
      | saveButton |

    Then Success message should be displayed

    And User delete item from Dialog Content
      |ayse202|

    Then Success message should be displayed

    Scenario: Fee Functionality

      And Click on the element in LeftNav
        | setup         |
        | parameters    |
        | fees |

      And Click on the element in Dialog
        | addButton |

      And User sending the keys in Dialog Content
        | nameInput | ayse99999 |
        | codeInput | 1067543     |
        | integrationCode | 252 |
        | priorityCode | 387     |

      And Click on the element in Dialog
        | toggleBar |
        | saveButton |

      Then Success message should be displayed

      And User delete item from Dialog Content
        |ayse99999|

      Then Success message should be displayed