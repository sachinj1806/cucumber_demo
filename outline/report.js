$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri('outline\outline.feature');
formatter.feature({
  "line": 1,
  "name": "Scenario Outline",
  "description": "",
  "id": "scenario-outline",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 10,
  "name": "Login functionality for a social networking site.",
  "description": "",
  "id": "scenario-outline;login-functionality-for-a-social-networking-site.;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "user navigates to Facebook",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I enter Username as \"testuser_1\" and Password as \"Test@153\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "login should be unsuccessful",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});