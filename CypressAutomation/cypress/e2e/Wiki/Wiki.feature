Feature: Testing Wikipedia website

    Scenario: Checking all the language links

        Given I launch Wikipedia
        And Wikipedia Image is displayed
        And Top languages are displayed

    Scenario: Search box in Wikipedia

        When search for cypress
        Then Verifying the dropdown in search box offers 71 languages to search
    
    Scenario: Verifying Wikitionary and other links in that Category
        And Verifying Wiktionary link