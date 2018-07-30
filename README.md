# projectassignment

# Project Title

Project Assessment

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for testing purposes.

### Prerequisites

We require following softwares to be provided on the system on which the automated tests would execute.

1) Android Studio - Android SDK
2) eclipse - Java SDE
3) Appium - Appium server
4) JDK
5) Jar files for execution- selenium,cucumber,junit,poi-api

```
1) Download the Android studio setup on your machine and follow the setup to get the android studio installed on your machine.
2) Setup a android emulator using SDK Manager AVD.
3) Download eclipse and JDK on your machine and install it on your machine.
4) Setup the Environment Variable for JAVA_HOME,ANDROID_HOME and Set JDK Path.
5) Download Appium for windows on your machine and follow the setup to install it in your machine.

```

### Installing

To install the Project on your machine follow the steps mentioned below.

1) Clone the repository uploaded on GitHub on your local machine i.e. the java Project from the link:(https://github.com/sahilroy03/projectassignment)
2) Open eclipse and Import the Java Project saved on your local machine.
3) Add external Jar files if required for selenium,cucumber,junit and poi-api in the imported project.

## Running the tests

To execute the automated test scenarios follow the following steps.

1) Run the configured Android emulator from the Android Studio SDK.
2) Go to command prompt and execute the command - "adb devices”, This will provide you list android emulators being running on your system.
3) Open the appium server and start a new session on it. Starting a new session would require following capailities
-platformName - Name of the platform on which the apk file would run. Enter "Android" in this.
-deviceName - Name of the device on which application would execute. Enter the device name found by running "adb devices" command.
-app - This is the path of the apk file stored on your system.
-appActivity - This is the appActivity which can be found in the manifest file of the apk file under test.
-appPackage - This is the appPackage which can be found in the manifest file of the apk file under test.
4) Open eclipse and go to the source folder to find the EnvironmentConfig file. Provide the above capability details in the EnvironmentConfig file.
Also provide the User ID of the user whose data would be used from the excel for test case execution.
5) A DataInput.xlsx file has been provided under Utility package which contains the test data based on UserID. Add this user id in EnvironmentConfig file
for test case execution.
6) There is a Runner.Java file provided under the TestRunner package.Right Click on the Runner.java file and run it as junit Test.

The automated test cases would execute and the execution results would be displayed in the left pannel of eclipse with number of
Scenarios executed and steps executed and their failure conditions.

### Break down into end to end tests

The approach used to automate the application is BDD Cucumber framework. The features which has been tested are provided in two
feature files.

1) ApplicationClose.feature
2) UserRegisteration.feature

ApplicationClose.feature contains two scenarios which are been tested i.e. 
1) Verification of the text message displayed on Application Close confirmation message.
2) Verification of the Application Close Cancel button.

UserRegisteration.feature contains one scenario which is being tested. i.e.
1) Verification of the User details on Registration Confirmation page after filling up the User Registration form.

##Approach used for creating framework.
- The approach used for designing the frameworks is BDD Cucumber where the scenarios needed to be automated are
provided in feature files kept under Features folder. The definition to the scenarios listed in feature files are provided in step definition files
kept under StepDefinition package. The mapping between the two files is done in Runner class file kept under TestRunner package.
The input data is captured from a Excel file-"InputData.xlsx" and all the utility methods required for reading data from the excel file
is provided in CommonUtils file kept under Utility package. The locators of different elements required to be located on a page
and the methods to access them is provided in corresponding Page file under ApplicationPages package.

## Authors

* **Sahil Roy** - *Initial work* - [projectassignment](https://github.com/sahilroy03/projectassignment)
