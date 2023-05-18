Feature: US003 - Search Functions

  @US003TC01 @US003
  Scenario Outline: TC01 - User should be able to search for products successfully on the home page.
    Given User verifies that she is on the homepage.
    * User clicks on the search field on the homepage.
    * User writes "<short word>" in the search field on the homepage.
    * User verifies that first result included searched word.
    * User writes "<full word>" in the search field on the homepage.
    * User verifies that first result included searched word.
    * User closes the application.

    Examples:
    |short word |full word |
    |nute       |nutella   |

  @US003TC02 @US003
  Scenario Outline: TC02 - User should be able to search for products successfully on the home page.
    Given User verifies that she is on the homepage.
    * User clicks on the search field on the homepage.
    * User writes "<word>" in the search field on the homepage.
    * User clicks on the first search result.
    * User verifies that she/he has seen a number of search results.
    * User verifies that as many products are listed in the search results as the number of search results.
    * User closes the application.

    Examples:
      |word |
      |nutella   |
