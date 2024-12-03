# **Testing  framework:**
##  1.testNG
##  2.POM
## 3.CUCUMBER
# CUCUMBER FRAMEWORK:
## Cucumber framework is  open source testing  framework.
## its  supports BDD automation testing framework  for web applications.
## BDD--->Behavior Driven Development .
## it  follows  GERKIN Language.

# what  is  GERKIN Language:-
## it is followed  with words  like  given,when ,then, and....

# files   in cucumber  framework:
# 1. Feature file   2.step defination file   3.runner file
# feature  file:
## words  in feature file
## feature,scenerio,scenerio outline,parameters,data tables,
# step defination file:
## it  contains method  definations for  every feature file.
# runner file:
## it is used  to  execute  framework.
# words  used in runner file:
## glue,feature,dryrun,taging
# in  cucumber  framrwork  we  have  to create  3  files
# 1.feature file
# 2.step defination  file
# 3.runner file
# **feature  file:**
## **feature  file  is  done  with  gerkin  language.**
## **gerkin  language is followed  by**  
```gherkin
Feature: 
  Scenario: 
  Given 
    When
    And 
    Then

```
# **creating  feature  file  for login  scenerio.**
```gherkin
Feature: login  for  facebook
Scenerio: Login  functioality  for  facebook
Given user lands  on website  called facebook.com
when  launching  chrome  browser
And the  user enters emailaddress  as "sharan.daretowild@gmail.com and password  as "SHARANKUMAR@90"
And  finally  click  on  Log in button
Then  login must be sucessful
```
# **Creating  feature  file  for  rediffmail log in**
```gherkin   
Feature: signin  into  rediffmail website
Scenerio: signin functionality  for rediffmail website
Given user lands on rediffmail.com wesite
When  launching  chrome  browser
And  clikcing  on sign in  link
And the user enters username as "sharan@rediffmail.com" and password  as "sharan@678"
And finally  click on  sign in button
Then  login  must  be  successful
```
## **Creating  fearure  file  for  icici  login**
```gherkin
Feature:login to icc bank webpage
Scenario:Login functionality  for icici banking website

Given user lands on icici banking website
When lanching the chrome brower
And user click on the Login button
And cilking the link Personal
And user enters the userid as "hima12345" and pasword as "7788922"
And click the startin dropdown select as "Bank Account"
And click the check box and click on Login button
Then finally login successfully
```
## **create  feture  file  for hsbc login**
```gherkin
Feature:login to hsbc bank webpage
Scenario:Login functionality  for hsbc banking website

Given user lands on hsbc banking website
When lanching the chrome brower
And user click on the Logon button
And click on continue logon the browser
And user enters username as "hima123" and click the check box
And click the Continue button and enters the password
Then Logon is successfully
```
## **Create  feature  file  for flipkart login**
```gherkin
Feature:login to flipkart webpage
Scenario:Login functionality  for flipkart shopping website

Given user lands on flipkart shopping website
When lanching the chrome brower
And user click on the Login button
And user enters mobile number and click on the Request OTP
And user gets OTP enters the OTP
And finally Click the Conitune
Then Filpkart login succeccfully
```
# **note:**
## **feature  file  can  be  understand  by  technical  n  non  technical  folks in the project**
