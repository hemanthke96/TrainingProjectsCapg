import {Given, When, Then} from '@badeball/cypress-cucumber-preprocessor'
import Homepage from '../WikiPage/homepage.js'

const hp = new Homepage()

before(()=>{
    cy.log('BeforeEach')
    //const hp = new Homepage()
})

Given('I launch Wikipedia',()=>{
    //const hp = new Homepage()
    hp.visit();
})

Then('Wikipedia Image is displayed', ()=>{
    hp.imgDispaly();
})

Then('Top languages are displayed', ()=>{
    hp.languageCheck();
})

When('search for cypress', ()=>{
    hp.visit();
    hp.searchCheck();
    hp.visit();
})

Then('Verifying the dropdown in search box offers 71 languages to search', ()=>{
    hp.verifyDropdown();
})

Then('Verifying Wiktionary link', ()=>{
    //hp.verifyWiktionary();
    return true;
})


