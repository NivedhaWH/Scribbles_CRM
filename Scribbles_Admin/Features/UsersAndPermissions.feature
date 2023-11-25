Feature: Accessing the users and permission module CRM-admin application

  Background: common step
    Given User enters scribbles URL
    Given User enter valid username and password
    Then User clicks on login button
    And User verifies the dashboard page
    Then navigate to users and permission module

  @UserRoles_AddRoleSubmit
  Scenario: Adding new user role (User Roles - Submit)
    And click on add role under user roles categories
    Then enter role name and select user level
    And click on select all to give access for modules and features for the user role
    And click on submit button
    Then user closes the browser

  @UserRoles_AddRoleReset
  Scenario: Adding new user role (User Roles - Reset)
    And click on add role under user roles categories
    Then enter role name and select user level
    And click on select all to give access for modules and features for the user role
    And click on Reset button
    Then user closes the browser

  @UserRoles_SearchField
  Scenario: Searching the user roles (User role - Search)
    And click on the search field
    Then enter any partial words that you want to search for the role

  @UserList_AddUserScribblesUserSubmit
  Scenario: Adding new user (User List - scribbles user - submit)
    And Click on user list categories tab
    Then Click on Add user
    And Select scribbles user from the user type dropdown
    Then Enter name in name field
    And Select role from the role dropdown
    And Select department from the department dropdown
    Then Enter email in email field
    And Enter Mobile number in mobile number field

  @UserList_AddUserScribblesUserReset
  Scenario: Adding new user (User List - scribbles user - Reset)
    And Click on user list categories tab
    Then Click on Add user
    And Select scribbles user from the user type dropdown
    Then Enter name in name field
    And Select role from the role dropdown
    And Select department from the department dropdown
    Then Enter email in email field
    And Enter Mobile number in mobile number field
    And click on Reset button

  @UserList_AddUserSchoolAdminSubmit
  Scenario: Adding new user (User List - School Admin - submit)
    And Click on user list categories tab
    Then Click on Add user
    And Select school admin from the user type dropdown
    Then Enter name in name field SA
    And Select role from the role dropdown SA
    Then Enter email in email field SA
    And Enter Mobile number in mobile number field SA

  @UserList_AddUserSchoolAdminReset
  Scenario: Adding new user (User List - School Admin - reset)
    And Click on user list categories tab
    Then Click on Add user
    And Select school admin from the user type dropdown
    Then Enter name in name field SA
    And Select role from the role dropdown SA
    Then Enter email in email field SA
    And Enter Mobile number in mobile number field SA
    And click on Reset button

  @UserList_SearchField
  Scenario: Searching the user list (User list - Search)
    And Click on user list categories tab
    And click on the search field
    Then enter any partial words that you want to search for the user
    #facing error
