package stepdefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import pages.AndroidPages;

public class SearchDef {
    AndroidPages androidPages = new AndroidPages();
    public String searchedWord = null;

    @Given("User clicks on the search field on the homepage.")
    public void user_clicks_on_the_search_field_on_the_homepage() {
        androidPages.searchBox.click();
    }
    @Given("User writes {string} in the search field on the homepage.")
    public void user_writes_in_the_search_field_on_the_homepage(String string) {
        searchedWord = string;
        androidPages.searchBox.sendKeys(string);
    }
    @Given("User verifies that first result included searched word.")
    public void user_verifies_that_first_result_included_searched_word() {
        Assert.assertTrue(androidPages.search_firstResult.getText().contains(searchedWord));
    }
}
