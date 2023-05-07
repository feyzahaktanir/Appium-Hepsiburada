Feature: US001 - Homepage Accessibility

  @US001TC01 @US001
  Scenario: TC01 - Homepage must be accessible.
    Given User allows permissions.
    * User verifies that fullsize advert is visible.
    * User closes fullsize advert.
    * User verifies that hepsiburada logo is visible.
    * User closes the application.