#Senaryo :
#  Exam Formunun Çalışmasını test ediniz
#  1 sınav girişi yapıp
#  sonrasında silmesini yapınız

Feature: Entrance Exams Functionality

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login succesfully

  Scenario: Entrance Exams
    And Click on the element in LeftNav

      | entranceExamsOne |
      | setupTwo    |
      | entranceExamsTwo         |

    And Click on the element in Dialog
      | addButton |

    And User sending the keys in Dialog Content
      | nameInput       | dal8    |

    And Click on the element in Dialog
      | academicPeriod  |
      | academicPeriod1 |
      | gradeLevel  |
      | gradeLevel2 |

    And Click on the element in Dialog
      | saveButton |

    Then Success message should be displayed

    And Click on the element in LeftNav
      | entranceExamsOne |
      | setupTwo         |
      | entranceExamsTwo |

    And User delete item from Dialog Content
      | dal8 |

    Then Success message should be displayed

