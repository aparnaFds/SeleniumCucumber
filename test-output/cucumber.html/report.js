$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "line": 1,
  "name": "Login functionality",
  "description": "",
  "id": "login-functionality",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "As a user I want to login to Flipkart site",
  "description": "",
  "id": "login-functionality;as-a-user-i-want-to-login-to-flipkart-site",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I am on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I enter \"acharya.aparna@gmail.com\", \"Cindrella1\" and click on Submit button",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I land on home page",
  "keyword": "Then "
});
formatter.match({
  "location": "Login.i_am_on_login_page()"
});
formatter.result({
  "duration": 23382923200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "acharya.aparna@gmail.com",
      "offset": 9
    },
    {
      "val": "Cindrella1",
      "offset": 37
    }
  ],
  "location": "Login.enter_username_password_submit(String,String)"
});
formatter.result({
  "duration": 1001120500,
  "status": "passed"
});
formatter.match({
  "location": "Login.i_land_on_home_page()"
});
formatter.result({
  "duration": 17924200,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "As a logged in user, I want to logout",
  "description": "",
  "id": "login-functionality;as-a-logged-in-user,-i-want-to-logout",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 10,
  "name": "I click logout button",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "I land on home page",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "I close browser",
  "keyword": "And "
});
formatter.match({
  "location": "Logout.i_click_logout_button()"
});
formatter.result({
  "duration": 305973600,
  "status": "passed"
});
formatter.match({
  "location": "Login.i_land_on_home_page()"
});
formatter.result({
  "duration": 14094500,
  "status": "passed"
});
formatter.match({
  "location": "Logout.i_close_browser()"
});
formatter.result({
  "duration": 1382126800,
  "status": "passed"
});
});