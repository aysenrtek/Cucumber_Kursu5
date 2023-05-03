#Senaryo
#CitizenShip sayfasına gidiniz.
#Create işlemini parameter yöntemi ile doğrulayınız.
#Daha sonra aynı bilgilerle tekrar Create yapılamadığını doğrulayınız.

Feature: Citizenship Functionality
  Background: #before senaryo
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login succesfully
    And Navigate to CitizenShip page

  Scenario Outline: CitizenShip create
    When User a CitizenShip name as "<name>" short name as "<short>"
    Then Success message should be displayed

    When User a CitizenShip name as "<name>" short name as "<short>"
    Then Allready exist message should be displayed

    When User delete the "<name>"
    Then Success message should be displayed

    Examples:
      | name | short |
      | ddmd | id58 |
      | ddmd | id67 |
      | ddmd | id76 |
      | ddmd | id85 |

   # testNG dataProvide burada Scenario Outline olarak karşımıza çıkıyor

