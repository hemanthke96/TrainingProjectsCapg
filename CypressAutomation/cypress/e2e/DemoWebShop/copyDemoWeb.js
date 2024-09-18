import { Given, When, Then, DataTable } from '@badeball/cypress-cucumber-preprocessor';

import locators from '../WebShopPages/selectors.js'

import basicUtility from '../WebShopPages/BasicFunctions.js';

import verifytext from '../WebShopPages/TextVerify.js'


//const loc = new locators();
const basic = new basicUtility();

Given(`I launch the DemoWebShop`, () => {
    // [Given] Sets up the initial state of the system.
    basic.visit()
});

Then(`I should see Homepage and Logo of the website`, () => {
    // [Then] Describes the expected outcome or result of the scenario.
    cy.get(locators.login.weblogo).should('be.visible')
});

//Scenario 1
When(`user is on homepage with logo`, () => {
    // [Given] Sets up the initial state of the system.
    basic.checkURL();
});

When(`User clicks on login Page`, () => {
    // [When] Describes the action or event that triggers the scenario.
    cy.get(locators.login.loginlink).click()
});

When(`user lands on login Page`, () => {
    // [When] Describes the action or event that triggers the scenario.
    cy.get(locators.login.welcomeLogin).invoke('text').then((text) => {
    cy.log(`The main heading text is: ${text}`);
    expect(text).to.eq(verifytext.login.verifylogintext);
        });
});

When(`user enters the following {string} and {string}`, (email , password) => {
    // [When] Describes the action or event that triggers the scenario.
    cy.get(locators.login.emailbox).type(email)
    cy.get(locators.login.passwordbox).type(password)
});

When(`user clicks on login button`, () => {
    // [When] Describes the action or event that triggers the scenario.
        cy.get(locators.login.loginbutton).click()
});

Then(`user's email is displayed on Homepage`, () => {
    // [Then] Describes the expected outcome or result of the scenario.
        cy.get(locators.login.verifyloginEmailDisp).invoke('text').then((text)=>{
        cy.log(`The email displayed is: ${text}`);
        expect(text).to.eq(verifytext.login.verifyLoginEmailDisplay);
        })
});

//Scenario 2
Given(`user is homepage`, () => {
    // [Given] Sets up the initial state of the system.
    basic.checkURL();
});

When(`user search for {string}`, (product_name) => {
    // [When] Describes the action or event that triggers the scenario.
    cy.get(locators.search.searchbox).type(product_name)
});

When(`click on search`, () => {
    // [When] Describes the action or event that triggers the scenario.
    cy.get(locators.search.searchbutton).click()
});

Then(`user should land on search page with Product Name on the top of the page`, () => {
    // [Then] Describes the expected outcome or result of the scenario.
    cy.get(locators.search.searchVerify).should('have.attr','value').and('eq', 'Laptop')
});

Given(`user is logged in`, () => {
    // [Given] Sets up the initial state of the system.
    basic.forceLogin();
    cy.get(locators.login.verifyloginEmailDisp).invoke('text').then((text)=>{
    cy.log(`The email displayed is: ${text}`);
    expect(text).to.eq(verifytext.login.verifyLoginEmailDisplay);
    })
});

When(`user clicks on Add to Cart on a product`, () => {
    // [When] Describes the action or event that triggers the scenario.
    cy.get(locators.cartpage.addtocart).click()
});


Then(`Shopping Cart's value should be updated`, () => {
    // [Then] Describes the expected outcome or result of the scenario.
    cy.get(locators.cartpage.shoppingcartverify).should('not.contain.text', '(0)')
});

When(`user clicks on Shopping Cart`, () => {
    // [When] Describes the action or event that triggers the scenario.
    cy.get(locators.cartpage.shoppingcartLink).click()
});

When(`lands on Shopping Cart Page`, () => {
    // [When] Describes the action or event that triggers the scenario.
    cy.get(locators.cartpage.shpppingcartPage).invoke('text').then((text) => {
    expect(text).to.eq(verifytext.login.verifyShoppingCartPage);
    })
});

When(`user selects the following {string}, {string} and {string}`, (country,  State, Zipcode) => {
    // [When] Describes the action or event that triggers the scenario.
    cy.get(locators.cartpage.countryselect).select(country);
    cy.get(locators.cartpage.stateSelect).select(State)
    cy.get(locators.cartpage.pincodeEnter).type(Zipcode)
});

When(`clicks on checkout`, () => {
    // [When] Describes the action or event that triggers the scenario.
    cy.get(locators.cartpage.termsofSvc).check()
    cy.get(locators.cartpage.checkout).click()
});

Then(`user should land on checkout page`, () => {
    // [Then] Describes the expected outcome or result of the scenario.
    cy.get(locators.cartpage.checkoutverify).invoke("text").then((text)=>{
        expect(text).to.eq(verifytext.login.verifyCheckout);
    })
});