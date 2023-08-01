Feature: Shopping Test
  We are testing SauceLab

  @Testing @smoke
  Scenario: We logging into SauceLab and adding Bags to cart and Checking out
    Given I navigate to sauceLab url
    When User has given correct credentials
    And Click on Login Button
    Then Adding Bag to cart
    Then Check the cart for the item added
    And Order Successful! Check Message and Return To Home Page

  @Testing1
  Scenario: We logging into SauceLab and adding Bike to cart and Checking out
    Given I navigate to sauceLab url
    When User has given correct credentials
    And Click on Login Button
    Then Adding Bike to cart
    Then Check the cart for the item added
    And Order Successful! Check Message and Return To Home Page

  @Testing
  Scenario: We logging into SauceLab and adding T-Shirt to cart and Checking out
    Given I navigate to sauceLab url
    When User has given correct credentials
    And Click on Login Button
    Then Adding T-Shirt to cart
    Then Check the cart for the item added
    And Order Successful! Check Message and Return To Home Page

  @Testing
  Scenario: We logging into SauceLab and adding Jacket to cart and Checking out
    Given I navigate to sauceLab url
    When User has given correct credentials
    And Click on Login Button
    Then Adding Jacket to cart
    Then Check the cart for the item added
    And Order Successful! Check Message and Return To Home Page

  @Testing
  Scenario: We logging into SauceLab and adding Onesie to cart and Checking out
    Given I navigate to sauceLab url
    When User has given correct credentials
    And Click on Login Button
    Then Adding Onesie to cart
    Then Check the cart for the item added
    And Order Successful! Check Message and Return To Home Page

  @Testing
  Scenario: We logging into SauceLab and adding Red_T-Shirt to cart and Checking out
    Given I navigate to sauceLab url
    When User has given correct credentials
    And Click on Login Button
    Then Adding Red_T-Shirt to cart
    Then Check the cart for the item added
    And Order Successful! Check Message and Return To Home Page

