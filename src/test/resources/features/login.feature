Feature:  Sconto Login
  Login on page

  @validCredentials
  Scenario: Successful Login
    Given Navigate to HomePage
    When Click on Anmelden icon
    Then Login Page displayed

    When Enter the valid credentials
    And Click on Anmelden Button
    Then Home Page displayed

    When Click on Mein Konto icon
    Then Username displayed

    @invalidEmail
    Scenario Outline: Login with wrong email
      Given Navigate to HomePage
      When Click on Anmelden icon
      Then Login Page displayed

      When Enter the wrong Email and valid Password
      |  email  | password  |
      | <email> | <password>|
      And Click on Anmelden Button
      Then Error Email Message displayed
      Examples:
        | email         |     password |
        | test2@testcom | 1q2w3e$R%T   |
        | test2test.com | 1q2w3e$R%T   |
        | test2@test.om | 1q2w3e$R%T   |


  @emptyEmail
  Scenario Outline: Login with empty email
    Given Navigate to HomePage
    When Click on Anmelden icon
    Then Login Page displayed

    When Enter the empty Email and valid Password
      | email | password  |
      |<email>| <password>|
    And Click on Anmelden Button
    Then No Email Error displayed
    Examples:
      |email|     password |
      |     | 1q2w3e$R%T   |

  @emptyPassword
  Scenario Outline: Login with empty Password
    Given Navigate to HomePage
    When Click on Anmelden icon
    Then Login Page displayed

    When Enter the valid Email and empty Password
      | email | password  |
      |<email>| <password>|
    And Click on Anmelden Button
    Then Wrong Password Error displayed
    Examples:
      |email         |password |
      |test2@test.com|         |

