Feature: Ordering In room Delivery order ASAP and Paying by Credit/Debit Card

  Scenario: Placing a In Room Delivery ASAP Order and Paying by Credit/Debit Card
    Given I am on the restaurant's website
    When I click on the IRDelivery order type
    And I click on ASAP
    And I select an item
    #And I add modifiers to the item
    And I enter "Make it spicy" in the text field
    And I click on the Add to Cart button
    And I click on the Checkout button
    And I click on continue as a guest
    And I enter mobile number "9322050503" into mobile number field
    And I click on continue button
    And I enter my name as "Krupal sonkusare"
    And I enter my email as "krupal9098@gmail.com"
    And I enter the room number
    #And I enter instructions as "Please deliver to the front door"
    And I click on Payment mode
    And I select visa as the payment type
    And I enter my card number as "4321000000001119"
    And I enter the expiration date as "04/25"
    And I enter the CVC as "123"
    And I enter the billing street address as "123 Main Street"
    And I enter the billing postal code as "65000"
    And I click on Pay and Process Order
    Then I should be on the confirmation page
    
    
   
    Scenario: Placing a In room Delivery Future Order and Paying by Credit/Debit Card
    Given I am on the restaurant's website
    When I click on the IRDelivery order type
    And I click on Future Slot
    And I select an item
    #And I add modifiers to the item
    And I enter "Make it spicy" in the text field
    And I click on the Add to Cart button
    And I click on the Checkout button
    And I click on continue as a guest
    And I enter mobile number "9322050503" into mobile number field
    And I click on continue button
    And I enter my name as "Krupal sonkusare"
    And I enter my email as "krupal9098@gmail.com"
    And I enter the room number
    #And I enter instructions as "Please deliver to the front door"
    And I click on Payment mode
    And I select visa as the payment type
    And I enter my card number as "4321000000001119"
    And I enter the expiration date as "04/25"
    And I enter the CVC as "123"
    And I enter the billing street address as "123 Main Street"
    And I enter the billing postal code as "65000"
    And I click on Pay and Process Order
    Then I should be on the confirmation page
    
    
    Scenario: Placing a In room Delivery Order and Paying at counter
    Given I am on the restaurant's website
    When I click on the IRDelivery order type
    And I click on ASAP
    And I select an item
    #And I add modifiers to the item
    And I enter "Make it spicy" in the text field
    And I click on the Add to Cart button
    And I click on the Checkout button
    And I click on continue as a guest
    And I enter mobile number "9322050503" into mobile number field
    And I click on continue button
    And I enter my name as "Krupal sonkusare"
    And I enter my email as "krupal9098@gmail.com"
    And I enter the room number
    #And I enter instructions as "Please deliver to the front door"
    And I click on Pay At Counter or Cash on delivery
    And I click on place Order
    Then I should be on the confirmation page
    
    
    Scenario: Placing a In room Delivery Order with tips.
    Given I am on the restaurant's website
    When I click on the IRDelivery order type
    And I click on ASAP
    And I select an item
    #And I add modifiers to the item
    And I enter "Make it spicy" in the text field
    And I click on the Add to Cart button
    And I click on the Checkout button
    And I click on continue as a guest
    And I enter mobile number "9322050503" into mobile number field
    And I click on continue button
    And I apply tips
    And I enter my name as "Krupal sonkusare"
    And I enter my email as "krupal9098@gmail.com"
    And I enter the room number
    #And I enter instructions as "Please deliver to the front door"
    And I click on Payment mode
    And I select visa as the payment type
    And I enter my card number as "4321000000001119"
    And I enter the expiration date as "04/25"
    And I enter the CVC as "123"
    And I enter the billing street address as "123 Main Street"
    And I enter the billing postal code as "65000"
    And I click on Pay and Process Order
    Then I should be on the confirmation page
    