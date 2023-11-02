$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/features/SearchFunctionality.feature");
formatter.feature({
  "name": "Search Functionality",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@tag"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Validate Search Functionality",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Amey"
    }
  ]
});
formatter.step({
  "name": "user is on home page",
  "keyword": "Given "
});
formatter.step({
  "name": "user searches \"\u003cproduct\u003e\" in search field",
  "keyword": "When "
});
formatter.step({
  "name": "click Search",
  "keyword": "And "
});
formatter.step({
  "name": "user should see \"\u003cproduct\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "product"
      ]
    },
    {
      "cells": [
        "iPhone"
      ]
    },
    {
      "cells": [
        "MacBook"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Validate Search Functionality",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@tag"
    },
    {
      "name": "@Amey"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "user is on home page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinition.SearchStepDefinition.user_is_on_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "user searches \"iPhone\" in search field",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinition.SearchStepDefinition.user_searches_in_search_field(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "click Search",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinition.SearchStepDefinition.click_Search()"
});
formatter.result({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "user should see \"iPhone\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinition.SearchStepDefinition.user_should_see_product(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Validate Search Functionality",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@tag"
    },
    {
      "name": "@Amey"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "user is on home page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinition.SearchStepDefinition.user_is_on_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "user searches \"MacBook\" in search field",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinition.SearchStepDefinition.user_searches_in_search_field(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "click Search",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinition.SearchStepDefinition.click_Search()"
});
formatter.result({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "user should see \"MacBook\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinition.SearchStepDefinition.user_should_see_product(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});