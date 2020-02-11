$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:Feature/demo2.feature");
formatter.feature({
  "name": "Login Functionality Testing",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Login with multiple sets of test data",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User is open the application",
  "keyword": "Given "
});
formatter.step({
  "name": "User click on  to signin link",
  "keyword": "When "
});
formatter.step({
  "name": "User enters \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "User will click on Login Button",
  "keyword": "Then "
});
formatter.step({
  "name": "Demo webshop homepage will display",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "aravind.guggilla57@gmail.com",
        "aravind"
      ]
    },
    {
      "cells": [
        "aravindkumarguggilla@gmail.com",
        "Aravind@123"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Login with multiple sets of test data",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User is open the application",
  "keyword": "Given "
});
formatter.match({
  "location": "Demo2.user_is_open_the_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click on  to signin link",
  "keyword": "When "
});
formatter.match({
  "location": "Demo2.user_click_on_to_signin_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters \"aravind.guggilla57@gmail.com\" and \"aravind\"",
  "keyword": "When "
});
formatter.match({
  "location": "Demo2.user_enters_and(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User will click on Login Button",
  "keyword": "Then "
});
formatter.match({
  "location": "Demo2.user_will_click_on_Login_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Demo webshop homepage will display",
  "keyword": "Then "
});
formatter.match({
  "location": "Demo2.demo_webshop_homepage_will_display()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Login with multiple sets of test data",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User is open the application",
  "keyword": "Given "
});
formatter.match({
  "location": "Demo2.user_is_open_the_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click on  to signin link",
  "keyword": "When "
});
formatter.match({
  "location": "Demo2.user_click_on_to_signin_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters \"aravindkumarguggilla@gmail.com\" and \"Aravind@123\"",
  "keyword": "When "
});
formatter.match({
  "location": "Demo2.user_enters_and(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User will click on Login Button",
  "keyword": "Then "
});
formatter.match({
  "location": "Demo2.user_will_click_on_Login_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Demo webshop homepage will display",
  "keyword": "Then "
});
formatter.match({
  "location": "Demo2.demo_webshop_homepage_will_display()"
});
formatter.result({
  "status": "passed"
});
});