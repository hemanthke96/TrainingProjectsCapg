@HnC
Feature: Homepage and Calender Functionality
Background:
	Given user launches the browser
	When user click on login link
	Then user navigates to Login Page
	When user enters email and password
	Then user clicks on Login button
	Then homepage is displayed
@Homepage
Scenario: Homepage Functionality
	Given user is on homepage
	When user click on calendar
	Then user navigates to calendar section
	When user click on Deals
	Then user navigates to deals section
	When user click on Tasks
	Then user navigates to Tasks section
	When user click on Contact
	Then user navigates to Contact section
	When user click on Company
	Then user navigates to Company section
@Calendarcreate
Scenario: Create Calendar Event
	Given user is on calendar page
	When user click on create new event
	And enter details about event
	Then click on save
@Calendaredit
Scenario: Edit Calendar Event
	Given user is on calendar page
	When user click on edit new event
	And edit details about event
	Then click on save
@Calendardelete
Scenario: Delete calendar event
	Given user is on calendar page
	When user click on event page
	And user click on delete
	Then click on confirm delete
