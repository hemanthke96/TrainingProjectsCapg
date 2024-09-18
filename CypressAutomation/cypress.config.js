const { defineConfig } = require("cypress");

const {
  addCucumberPreprocessorPlugin,
} = require("@badeball/cypress-cucumber-preprocessor");

const {
  preprocessor,
} = require("@badeball/cypress-cucumber-preprocessor/browserify");

async function setupNodeEvents(on, config) {
  // This is required for the preprocessor to be able to generate JSON reports after each run, and more,
  await addCucumberPreprocessorPlugin(on, config);
  require('cypress-mochawesome-reporter/plugin')(on);
  on("file:preprocessor", preprocessor(config));
 
  // Make sure to return the config object as it might have been modified by the plugin.
  return config;
}

//require('cypress-mochawesome-reporter/plugin')(on);
 
module.exports = defineConfig({
  reporter: 'cypress-mochawesome-reporter',
  e2e: {   
    //chromeWebSecurity: false,
    specPattern: "**/*.feature",
    setupNodeEvents,
   
  },
});

module.exports = defineConfig({
  e2e: {
    setupNodeEvents(on, config) {
      // implement node event listeners here
    },
  },
});
