$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("darkSky.feature");
formatter.feature({
  "line": 2,
  "name": "DarkSky feature",
  "description": "",
  "id": "darksky-feature",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@web"
    },
    {
      "line": 1,
      "name": "@regression"
    },
    {
      "line": 1,
      "name": "@darkSky"
    }
  ]
});
formatter.before({
  "duration": 4884653767,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "I am on DarkSky Home Page",
  "keyword": "Given "
});
formatter.match({
  "location": "DarkSkySD.iAmOnDarkSkyHomePage()"
});
formatter.result({
  "duration": 725139521,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "Verify invalid register page",
  "description": "",
  "id": "darksky-feature;verify-invalid-register-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 8,
      "name": "@darkSky-1"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "I am on the darkSky Register page",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "I click on Register button",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I verify invalid register page \"Fill out this field\"",
  "keyword": "Then "
});
formatter.match({
  "location": "DarkSkySD.iAmOnDarkskyRegisterPage()"
});
formatter.result({
  "duration": 2673927298,
  "status": "passed"
});
formatter.match({
  "location": "DarkSkySD.clickOnRegisterButton()"
});
formatter.result({
  "duration": 2069163594,
  "status": "passed"
});
formatter.match({
  "location": "DarkSkySD.verifyRegisterPage()"
});
formatter.result({
  "duration": 2042702909,
  "status": "passed"
});
formatter.after({
  "duration": 168765532,
  "status": "passed"
});
formatter.before({
  "duration": 2911926444,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "I am on DarkSky Home Page",
  "keyword": "Given "
});
formatter.match({
  "location": "DarkSkySD.iAmOnDarkSkyHomePage()"
});
formatter.result({
  "duration": 12718703,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "Verify Current Temperature should not be greater or less than the Temperature from Daily Timeline",
  "description": "",
  "id": "darksky-feature;verify-current-temperature-should-not-be-greater-or-less-than-the-temperature-from-daily-timeline",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 15,
      "name": "@darkSky-2"
    }
  ]
});
formatter.step({
  "line": 17,
  "name": "I verify current temp is not greater or less then temps from daily timeline",
  "keyword": "Then "
});
formatter.match({
  "location": "DarkSkySD.verifyCurrentTempGreat()"
});
formatter.result({
  "duration": 2407371427,
  "status": "passed"
});
formatter.after({
  "duration": 178254640,
  "status": "passed"
});
formatter.before({
  "duration": 2972865155,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "I am on DarkSky Home Page",
  "keyword": "Given "
});
formatter.match({
  "location": "DarkSkySD.iAmOnDarkSkyHomePage()"
});
formatter.result({
  "duration": 16433213,
  "status": "passed"
});
formatter.scenario({
  "line": 21,
  "name": "Verify individual day temp timeline",
  "description": "",
  "id": "darksky-feature;verify-individual-day-temp-timeline",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 20,
      "name": "@darkSky-3"
    }
  ]
});
formatter.step({
  "line": 22,
  "name": "I expand today\u0027s timeline",
  "keyword": "When "
});
formatter.step({
  "line": 23,
  "name": "I verify lowest and highest temp is displayed correctly",
  "keyword": "Then "
});
formatter.match({
  "location": "DarkSkySD.iExpandTodaysTimeline()"
});
formatter.result({
  "duration": 4087095129,
  "status": "passed"
});
formatter.match({
  "location": "DarkSkySD.verifyLowestAndHighest()"
});
formatter.result({
  "duration": 113277746,
  "status": "passed"
});
formatter.after({
  "duration": 149675418,
  "status": "passed"
});
formatter.before({
  "duration": 2881839629,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "I am on DarkSky Home Page",
  "keyword": "Given "
});
formatter.match({
  "location": "DarkSkySD.iAmOnDarkSkyHomePage()"
});
formatter.result({
  "duration": 14007322,
  "status": "passed"
});
formatter.scenario({
  "line": 27,
  "name": "Verify timeline is displayed in correct format",
  "description": "",
  "id": "darksky-feature;verify-timeline-is-displayed-in-correct-format",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 26,
      "name": "@darkSky-4"
    }
  ]
});
formatter.step({
  "line": 28,
  "name": "I verify timeline is displayed with two hours incremented",
  "keyword": "Then "
});
formatter.match({
  "location": "DarkSkySD.timelineIsDisplayedTwoHoursIncremented()"
});
formatter.result({
  "duration": 2740789539,
  "status": "passed"
});
formatter.after({
  "duration": 149243402,
  "status": "passed"
});
});