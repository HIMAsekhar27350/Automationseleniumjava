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
# java supports two types of inheritances
# single inheritances:
## creating a new class from only with one old class.
```java
class old{
    ---------
}
class new extends old{
    ----------
}
```
# multi-level inheritances:
## creating a new from another new class.
```java
class grandparents{----------------}
class parents extends grandparents{-----------}
class child extends parents{-----------}
```
# Access modifaiyers:
# static
# final
# abstract
# final:
## Final can be appilyed to class,variable,method.
## Final variable:
## final variable are context.once they asigned
## it should not be change during program exection.
```java
final int x=10;
x=4;
```
## once class is declare as final then.it should not be inheratance to other class.
```java
final class a{
    --------
}
class d extends a{
    -------
}
```
## final method
## if method is declare final then,it should not be override into anotherclass.
```java
class a{
    final public void display();
    {---------}
    class b extends a{
        public void display(){
            ----------
        }
    }
}
```
# Access specifer
## 1 Default
## 2 public
## 3 private
## 4 protected
# Default:
## default will work in entire project.
# public:
## public will work with in the package.
# private:
## private will be access with in the class.
# Protected:
## Protected will work in parent,child and classes(inheritances).
# Exeception handling:
## expection is runtime error.it can be handling by excepections handling keywords.if expections not implemented then project will be ABRUPTLY GET ABORTED.
# try and catch block:
## try is a keyword used in expection handling.
## program under observaton must be places under try block.
## when ever expection