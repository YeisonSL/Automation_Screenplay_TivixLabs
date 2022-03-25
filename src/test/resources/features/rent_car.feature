#language: en
Feature: Rent a car in tivix
  Me as a usuer of tivix
  I need to look a car on the portal
  To make a reservation

  @RentCar
  Scenario: Validate that client can rent a car
    Given the user enters the tivix portal
    When the user looks for the car
      | country  | city    | model   | pickUpDate | dropUpDate |
      | Germainy | Berlin | Mazda 3 | 22-03-2022 | 25-03-2022 |
    And make the reservation
      | name    | lastName      | cardNumber       | email             |
      | Pruebas | qa-automation | 1234567891234567 | automation@qa.com |
    Then the user should see reservation information