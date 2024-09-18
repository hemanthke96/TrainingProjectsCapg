@Loginfeature
Feature: Login Functionality

  @SuccessLogin
  Scenario: Login into the FreeCRM Application
    Given user launches the browser
    When user click on login link
    Then user navigates to Login Page
    When user enters email and password
    Then user clicks on Login button
    Then homepage is displayed

  @UnsuccessfulLogin
  Scenario Outline: Login without credentials
    Given user launches the browser
    When user click on Login link
    Then user navigates to Login Page
    When user clicks on Login button without entering email and password
    Then user gets a 'message' as <message>

    Examples: 
      | message         |
      | Invalid Request |
