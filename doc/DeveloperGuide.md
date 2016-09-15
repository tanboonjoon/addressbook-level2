# Developer Guide

## Setting up

**Prerequisites**

* JDK 8 or later 
* Eclipse IDE

**Importing the project into Eclipse**

0. Fork this repo, and clone the fork to your computer
1. Open Eclipse
2. Click `File` > `Import`
3. Click `General` > `Existing Projects into Workspace` > `Next`
4. Click `Browse`, then locate the project's directory
5. Click `Finish`

## Design
<img src="images/mainClassDiagram.png"/>

## Testing

### System tests

**Windows**

1. Open a DOS window in the `test` folder
2. Run the `runtests.bat` script
3. If the script reports that there is no difference between `actual.txt` and `expected.txt`, 
   the test has passed.

**Mac/Unix/Linux**

1. Open a terminal window in the `test` folder
2. Run the `runtests.sh` script
3. If the script reports that there is no difference between `actual.txt` and `expected.txt`, 
   the test has passed.

### JUnit tests

* In Eclipse, right-click on the `test/java` folder and choose `Run as` > `JUnit Test`

### Troubleshooting test failures

* Problem: How do I examine the exact differences between `actual.txt` and `expected.txt`?<br>
  Solution: You can use a diff/merge tool with a GUI e.g. WinMerge (on Windows)
* Problem: The two files look exactly the same, but the test script reports they are different.<br>
  Solution: This can happen because the line endings used by Windows is different from Unix-based
  OSes. Convert the actual.txt to the format used by your OS using some [utility](https://kb.iu.edu/d/acux).
* Problem: Test fails during the very first time.<br>
  Solution: The output of the very first test run could be slightly different because the program
  creates a new storage file. Tests should pass from the 2nd run onwards.

## User Stories

*As a user, i would like to be able to modify my information anytime i want.

*As a admin, i want to make sure the addressbook are sorted by name at all time.

*As a user, i would like to only share my informations with people restricted by [tags]
 For example, only people with [Friend] tag and view my information

*As a admin, i want to make sure each user can only modify their own information whereas a [Admin]   tag individual is allowed to edit anyone information.

*As a user, i would like to see a history of some of my past commands i have entered so i can reenact them without typing all over again.

## Use Case

Software Syste,: Addressbook-level2
Use Case UC001: Rename Tag
Precondition: The tag must exist in the system
MSS:
    1.User will type in the Edit Tag Command including the name of a existing tag
    2.Address book will display the number of people that has that existing tag
    3.Address book will prompt for the new name for the existing tag
    4.User will enter the new name of the existing tag
    5.Address book will ask for confirmation for changing old name --> new name
    6.User will confirm with Address book
    7.Address book will display the number of people that has their tag changed
    Use case ends
Postcondition: Address book will prompt user to enter another command.


## Non-Functional Requirements

*Address book must be able to execute each command within 5 seconds

*Address book must be able to be run by different language

*Address book should be able to allow new enhancement at any point of time

*Address book should be open source

*Address book should be able to recover its data(addressbook) following a natural or human-induced disaster

*Address book must be capable of storing up to 1 million individual information




