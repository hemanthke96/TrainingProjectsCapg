$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("./src/test/resources/Feature/HomeNcal.feature");
formatter.feature({
  "name": "Homepage and Calender Functionality",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@HnC"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "user launches the browser",
  "keyword": "Given "
});
formatter.match({
  "location": "Login_Test_Steps.launch_the_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on login link",
  "keyword": "When "
});
formatter.match({
  "location": "Login_Test_Steps.click_on_login_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user navigates to Login Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Login_Test_Steps.user_navigates_to_Login_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters email and password",
  "keyword": "When "
});
formatter.match({
  "location": "Login_Test_Steps.user_enters_email_and_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on Login button",
  "keyword": "Then "
});
formatter.match({
  "location": "Login_Test_Steps.user_clicks_on_Login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "homepage is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "Login_Test_Steps.homepage_is_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Create Calendar Event",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@HnC"
    },
    {
      "name": "@Calendarcreate"
    }
  ]
});
formatter.step({
  "name": "user is on calendar page",
  "keyword": "Given "
});
formatter.match({
  "location": "HomNcalen_Test_Steps.user_is_on_calendar_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on create new event",
  "keyword": "When "
});
formatter.match({
  "location": "HomNcalen_Test_Steps.user_click_on_create_new_event()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter details about event",
  "keyword": "And "
});
formatter.match({
  "location": "HomNcalen_Test_Steps.enter_details_about_event()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//input[@class\u003d\u0027calendarField react-datepicker-ignore-onclickoutside\u0027]\"}\n  (Session info: chrome\u003d103.0.5060.114)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027LIN20003731\u0027, ip: \u0027192.168.0.232\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002718.0.1\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 103.0.5060.114, chrome: {chromedriverVersion: 102.0.5005.61 (0e59bcc00cc4..., userDataDir: C:\\Users\\EADKUMAR\\AppData\\L...}, goog:chromeOptions: {debuggerAddress: localhost:56185}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: dcbb36d99474cea4480629a367df60ea\n*** Element info: {Using\u003dxpath, value\u003d//input[@class\u003d\u0027calendarField react-datepicker-ignore-onclickoutside\u0027]}\r\n\tat java.base/jdk.internal.reflect.DirectConstructorHandleAccessor.newInstance(DirectConstructorHandleAccessor.java:67)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:499)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:483)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat com.free.pages.CalendarPage.exceldataentry(CalendarPage.java:89)\r\n\tat step_definations.HomNcalen_Test_Steps.enter_details_about_event(HomNcalen_Test_Steps.java:121)\r\n\tat ✽.enter details about event(./src/test/resources/Feature/HomeNcal.feature:27)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "click on save",
  "keyword": "Then "
});
formatter.match({
  "location": "HomNcalen_Test_Steps.click_on_save()"
});
formatter.result({
  "status": "skipped"
});
});