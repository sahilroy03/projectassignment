Feature: Application Close Pop Up

Scenario: Verification of message text on application close confirmation message

Given Launch the application

When Click on the application close button

Then verify the text displayed on the confirmation message


Scenario: Verification of cancel button on confirmation message

Given Launch the application

When Click on the application close button

And Click on the Cancel button

Then Verify the pop up is closed