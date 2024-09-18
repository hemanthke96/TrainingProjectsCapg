class basicUtility{
    
    visit(){
        cy.visit("https://demowebshop.tricentis.com/")
    }
    checkURL(){
        cy.url().should('eq', 'https://demowebshop.tricentis.com/');
    }
    forceLogin(){
        cy.visit("https://demowebshop.tricentis.com/")
        cy.get(".ico-login").click()
        cy.get("#Email").type("hemanth31196@gmail.com")
        cy.get("#Password").type("Vinaya96@")
        cy.get("loginButton = input[value='Log in']").click()
    }
}

export default basicUtility;