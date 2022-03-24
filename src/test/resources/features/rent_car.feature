#language: en
Feature: Rent a car in tivix
  Me as a client of tivix
  I need to look a car on the portal
  To make a reservation

  @RentCar
  Scenario: Validate that client can rent a car
    Given the client enters the tivix portal
    When the customer looks for the car
      | country  | city    | model   | pickUpDate | dropUpDate |
      | Germainy | Berlin | Mazda 3 | 22-03-2022 | 25-03-2022 |
    And make the reservation
      | name    | lastName      | cardNumber       | email             |
      | Pruebas | qa-automation | 1234567891234567 | automation@qa.com |
    Then the client should see reservation information