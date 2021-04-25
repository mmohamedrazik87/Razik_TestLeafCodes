Feature: Login to Leaftap application

Background: 
Given open the chrome browser
And Launch the leaftap URL

Scenario Outline:TC001_Login to Leaftap app wit postive credentials
Given Enter the user name as <username>
And Enter the password as <password>
When Click on the login button
Then Homepage should be displayed

Examples:
|username|password|
|'DemoSalesManager2'|'cmrsfa'|
|'DemoCSR2'|'crmsfa'|

Scenario: TC002_Login to Leaftap app wit postive credentials
Given Enter the user name as 'DemoSalesManager2'
And Enter the password as 'crmsfa123'
When Click on the login button
But error message be displayed
