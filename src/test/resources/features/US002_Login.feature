Feature: US002 - User Logins

  @US002TC01 @US002
  Scenario: TC01 - User should be able to access the user login page.
    Given User verifies that she is on the homepage.
    * User clicks Profil button in homepage.
    * User verifies no login on user login page.
    * User clicks Giris Yap button in homapage.
    * User verify that Giris Yap Title is visible.
    * User closes the application.

  @US002TC02 @US002
  Scenario: TC02 - User cannot login with wrong username.
    Given User verifies that she is on the homepage.
    * User goes to log in page.
    * User "WrongUsername" enters in Username textbox.
    * User clicks Giris Yap button in username page.
    * User verifies that wrong username alerts is visible.
    * User "ValidUsername" enters in Username textbox.
    * User clicks Giris Yap button in username page.
    * User verifies that Password page is visible.
    * User closes the application.

  @US002TC03 @US002
  Scenario: TC03 - User cannot login with wrong password.
    Given User verifies that she is on the homepage.
    * User goes to log in page.
    * User "ValidUsername" enters in Username textbox.
    * User clicks Giris Yap button in username page.
    * User "WrongPassword" enters in Password textbox.
    * User clicks Giris Yap button in password page.
    * User verifies that wrong password alerts is visible.
    * User closes the application.

  @US002TC04 @US002
  Scenario: TC04 - User can login successfully with correct user informations.
    Given User verifies that she is on the homepage.
    * User goes to log in page.
    * User "ValidUsername" enters in Username textbox.
    * User clicks Giris Yap button in username page.
    * User "ValidPassword" enters in Password textbox.
    * User clicks Giris Yap button in password page.
    * User verifies that logged in.
    * User closes the application.