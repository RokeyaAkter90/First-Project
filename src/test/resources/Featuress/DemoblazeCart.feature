@cart
Feature: This feature is for validate Cart page creation


Scenario: Verify 	Cart 
Given Launch "<URL>" for demo
When Click on Cart Link   
Then Verify user can visit cart page


Scenario: Verify Products description (Pic, Title, Price sections)is added in  Cart page
Given Launch "<URL>" for demo
When Click on Cart Link   
Then Verify Products description Pic, Title, Price sections are added in  Cart page


Scenario: Verify About us & Get in Touch detail are added in Cart page
Given Launch "<URL>" for demo
When Click on Cart Link
Then Verify About us & Get in Touch detail are added in Cart page


Scenario: Verify user can add item by clicking Add to cart button
Given Launch "<URL>" for demo
When Click on Product and addtocartbutton
Then Verify item is added in cart page



Scenario: Verify Place Order button is present in cart page
Given Launch "<URL>" for demo
When Click on Cart Link
Then Verify Place Order button is present in cart page


Scenario: Verify user can purchase item using Place Order Credentials
Given Launch "<URL>" for demo
When Click on Product and addtocartbutton
When Click on Cart Link
When Click on Placeorderbutton
When Fillout purchase credentials correclty
When Click purchase button
Then Verify user can purchase item sucessfully


Scenario: Verify user cannot purchase item with empty Place Order Credentials
Given Launch "<URL>" for demo
When Click on Product and addtocartbutton
When Click on Cart Link
When Click on Placeorderbutton
When Click purchase button
Then User purchase is not sucessfull


Scenario: Verify user can delete item from cart
Given Launch "<URL>" for demo
When Click on Product and addtocartbutton
When Click on Cart Link
When Click on Delete link
Then Verify item removed from cart

