$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login.feature");
formatter.feature({
  "line": 2,
  "name": "OrangeHrm Application Test",
  "description": "",
  "id": "orangehrm-application-test",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@login"
    }
  ]
});
formatter.scenario({
  "comments": [
    {
      "line": 4,
      "value": "#without Examples Keyword"
    }
  ],
  "line": 5,
  "name": "Validate OrangeHrm Login Page Test",
  "description": "",
  "id": "orangehrm-application-test;validate-orangehrm-login-page-test",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "user open browser",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "user is on login page",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "check Forgot Your Password link is present and enabled",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user enter \"Admin\" and \"admin123\"",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "user clicks login button",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDef.user_open_browser()"
});
formatter.result({
  "duration": 38754871100,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDef.user_is_on_login_page()"
});
formatter.result({
  "duration": 653883200,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDef.check_Forgot_Your_Password_link_is_present_and_enabled()"
});
formatter.result({
  "duration": 2148181100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Admin",
      "offset": 12
    },
    {
      "val": "admin123",
      "offset": 24
    }
  ],
  "location": "LoginStepDef.user_enter_username_and_password(String,String)"
});
formatter.result({
  "duration": 10902196300,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDef.user_clicks_login_button()"
});
formatter.result({
  "duration": 78500,
  "status": "passed"
});
});