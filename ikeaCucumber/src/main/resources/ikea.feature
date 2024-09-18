Feature:ADD PRODUCTS TO THE CART AND COMPARE THEM
  Scenario: verify the user can add products to the cart
  Given OPEN THE WEBSITE
   When click on signup button
    And click on create account button
    And enter valid First name
    And enter valid Last name
    And enter valid Email address
    And enter valid Password
    And click on checkbox button
    And click on create Account
    And click on homepage icon
    And Scroll down to “Trending categories at New lower price“.
   And Click on “Sofas”.
   And CLICK ON SORT BUTTON
   And Sort products from “high to low”.
   And Added 3 random products to “cart”.
   And scroll up in home page
   And CLICK ON CART ICON
   And Compare every product in the cart with product details Price and Name.
   And Check that the total price in the cart is calculated correctly.
   And Move second product in the cart to favourites
   And Remove third product from the cart.
   And click on goto checkout button
   And enter fake data in Billing and Shipping Address
   And  click on continue button
