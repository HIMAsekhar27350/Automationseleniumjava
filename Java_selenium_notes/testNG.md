# TestNG Asseration
+ ## Asserations makes test case is enther True OR false.we have to provied actual and expected value.
+ ## if actual and expected are both same then test case result pass.
+ ## TestNG support two types of assertions.
+ ## 1 Hard Assert  
+ ## 2 Soft Assert 
#  Hard Assert :
+ ## we have to use assert class directly.
+ ## need not create any object.
+ ## if hard false then remaining lines on code won't excutes.
```java
String actural,expected;
actural="Hima";
expected="Hima;
Assert.assertEquals(actural,expected);
```
# Soft Assert:
+ ## We have to create object for soft assert class
+ ## if soft assert false,but remaining lines of code will excutes.And the end it will shoe error message.
+ ## we have to use assertAll().
```java
String actural,expected;
actural="Hima";
expected="Hima;
SoftAssert sa=new SoftAssert();
sa.assertEquals(actural,expected);
```
# Inheritance:
+ ## creating a new class based on the feature of an existing class.
+ ## here new class is also known as child class,slave class,sub class.
  + ## existing class is also known as master class,parent class,base class.
  + ## inheritance makes relationship between two are more classes.The keyword extends is use to the maintain the relationship.