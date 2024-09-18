class Homepage{
    
    visit(){
        cy.visit('https://www.wikipedia.org/')
    }

    imgDispaly(){
        cy.get(".central-featured-logo").should('be.visible')
        return this
    }

    languageCheck(){
        const topLanguages = [
            { name: 'English', selector: 'a#js-link-box-en' },
            { name: 'Español', selector: 'a#js-link-box-es' },
            { name: '日本語', selector: 'a#js-link-box-ja' },
            { name: 'Deutsch', selector: 'a#js-link-box-de' },
            { name: 'Русский', selector: 'a#js-link-box-ru' },
            { name: 'Français', selector: 'a#js-link-box-fr' },
            { name: 'Italiano', selector: 'a#js-link-box-it' },
            { name: '中文', selector: 'a#js-link-box-zh' },
            { name: 'Português', selector: 'a#js-link-box-pt' },
            { name: 'فارسی', selector: '#js-link-box-fa' }
          ];
      
          // Check that each language is displayed
          topLanguages.forEach(language => {
            cy.get(language.selector).should('be.visible');
            cy.get(language.selector).contains(language.name);
          });
          return this
    }

    searchCheck(){
            cy.get('input#searchInput').type('Cypress');
            cy.get('button[type="submit"]').click();
            cy.url().should('include', '/wiki/Cypress');
            cy.contains('Cypress').should('be.visible');
            return this
    }
    verifyWiktionary(){
        cy.get('a#js-link-box-wikt').should('have.attr', 'href').and('include', 'wiktionary.org');
        cy.get('a#js-link-box-wikt').click();
        cy.url().should('include', 'wiktionary.org');
    }

    verifyDropdown(){
        cy.get('#searchLanguage').then(($dropdown) => {
            const languageCount = $dropdown.find('option').length;
            cy.log(`Number of languages in the search box dropdown: ${languageCount}`);
            expect(languageCount).to.eq(71);
        })
    }
}

export default Homepage;