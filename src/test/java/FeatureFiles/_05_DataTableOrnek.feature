Feature: DataTable Ornek
  Scenario: Users List
    When Write username"ayse"
    And Write username and Password "ayse" and "1234"
    And Write username as DataTable
    |ayse   |
    |faruk  |
    |mujgan |
    |nur    |
    And Write username and password DataTable
      |ayse   | 1234|
      |faruk  | 2547|
      |mujgan | 7896|
      |nur    | 9856|