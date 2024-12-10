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
# 1.static
# 2.final
# 3.abstract
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
## final method:
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
## when ever expection take place immeditly try with report to catch block.
```java
try{
    default code under observation;
    }catch(excution e){
    
    }
```
# finally:
## finally block of statement will excutes whether expection may or may takes places.
# Note:
- ## if try catch is immpilmented then no need to use throws.
- ## if throws is implimented no need to use try catch.
# java excaption:
## io excaption
## arithmatic excaption
## numberformat excaption
## array index out of bounds excaption.
## nyll pointer excaption.
## negative array index excapton.
# 1 java program of arithmatic expcation.
```java
import java.io.IOException;
public class java_Excaption {
    public static void main(String[] args) {
    try{
        int a[] = {10, 0};
        int div;
        div = a[0] / a[1];
        System.out.println("div = "+div);
    } catch(ArithmeticException e){
        System.out.println("Denometer is zero");
    }
    finally{
        System.out.println("Thank you");
    }
    }
}
```
# 2.java program array index out of bounds.
```java
import java.io.IOException;

public class java_Excaption {
    public static void main(String[] args) {
    try{
        int a[] = {10, 0};
        int div;
        div = a[0] / a[-1];
        System.out.println("div = "+div);
    } catch(ArithmeticException e){
        System.out.println("Denometer is zero");
    }catch (ArrayIndexOutOfBoundsException e){
        System.out.println("Array Index is incorrect");
    }
    finally{
        System.out.println("Thank you");
    }
    }
}
```
# 3.java program for numberformat excaption.
```java
import java.io.IOException;

public class java_Excaption {
    public static void main(String[] args) {
    try{
        int a[] = {10, 2};
        int div;
        div = a[0] / a[1];
        Integer b=Integer.parseInt("10hikma");
        System.out.println(b);
        System.out.println("div = "+div);
    } catch(ArithmeticException e){
        System.out.println("Denometer is zero");
    }catch (ArrayIndexOutOfBoundsException e){
        System.out.println("Array Index is incorrect");
    }
    catch (NegativeArraySizeException e){
        System.out.println("Array Size is negative");
    }
    catch (NumberFormatException e){
        System.out.println("Dont enter string instand of integer");
    }
    finally{
        System.out.println("Thank you");
    }
    }
}
```
# Mutiple catch block
## in java mutiple catch blocks apply based on different user input.
# Single try with muitple catch block makes program to identify the exact issue.
## Syatax:
```java
try{
    doubtfull code under observation
        }catch(excaption e){
    exception handler
            }
```
# is it possble to implement mulitple catch blocks in java?
## Yes ,we can implenment.
# Selenium Excaption:
## 1.Stele Element Excaption.
## 2.Element not found Excaption.
## 3.Element not visable Excaption.
## 4.Null pointer excaption.
## 5.Interrupater excaption
## 6.Alert not presented excaption
## 7.Frame not presented excaption
## 8.Window not presented excaption
## 9.No Such Element excaption.
# Wapper class:
## Integer-------->int
## Float-------->float
## Doudle-------->double
## Boolean-------->boolean
## Character-------->char
## Long
## short
## Converting from any data to string
## To Convert from any data to string,we can use to string method.After we need not to perfrom any calcaution.
```java
// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        int x=20;
        String y;
        y=Integer.toString(x);
        System.out.println(y);
    }
}
```
# properties file:
## We can store text data in properties file with key-value file
## example:

**url=https://www.google.com**

**place=Bangalore**

**name=q**

**t=2000**
## to abstruct properties file into java
## step 1:
## create object for file input stream And send path of properties file
## FileInputStream fis=new FileInputStream();
## Step 2:
## create object of properties
## Properties p=new Properties();
## step  3:
## load the data load method
## p.load(fis);
## step 4:
## to get key into java file use properties method
## driver.get(p.getProperty("url"));

## Test NG:

## what  is  testNg?
## Test Ng  is  test Next  Generation .
## its  a  testing  framework which is  used  to  organize  our test cases.
## here  annotations plays important role.
## with out  using main(),test cases can be  designed using annotations.
## About  Annotations:
## its  starts  with  @ symbol.
## it  will centerilized  the  flow.when we  use  annotations then we should  not  use main()
## annotations in testNG are
## @beforeSuit  @AfterSuite
## @BeforeTest   @AfterTest
## @BeforeClass   @AfterClass
## @BeforeMethod   @AfterMethod
## @Test

## how  the  execution flow:
## bs->bt->bc->bm->@Test->Am->Ac->At->As
## what do u ment by groping?

## we can  do grouping  with  the  help  of  @Test annotaion.
## by using  "groups"  with  particular name we will group for methods
## Ex:
```java
@Test(groups={"dillep","leelakanth"});
public void  input()
{
}

@Test(groups={"leelakanth"});
public  void output()
{
}
@Test(groups={"dillep"})
public  void  get()
{
}
```
## can  we  achive  parallel  execution?
## yes we can
## in testng.xml  file  we  have  to  use parallel="classes"

## is there any  annotaion to  execute  same  method  multiple times ?
## yes,the  annotaion called  InvocationCount is  used
```java
@Test(InvocationCount=10)
public  void  input()
{
}
```
## what  is the use of DependsOn ?
## Assertions?
## hard  assertion--->serious issues
## soft assertion---> cosmotic isssues
## go through with  notes

## where u get testNG dependency ?
## there  is  mvn repository, from here we will search for test ng dependency.
## select new version ,copy it and past it in pom.xml file

## which  version of testng?
## 7.2.0
## what  is  data provider?

-----------------------------------------------------------------------
## selenium
## where u get selenium dependency ?
## there  is  mvn repository, from here we will search for selenium dependency.
## select new version ,copy it and past it in pom.xml file.

## which version of selenium?
## selenium 4

## what  are advantages  in selenium 4  when  compare to selenium 3?
## which  test  build u r using?

## maven test build.
## y maven?
## we can easily  add the dependencies.

## any  other  test builds?
## gradle

## external lib?
## where we write testing code?

## can  u launch  chrome browser?

## how can  u  check  website  title n given title is same or not?
## using  assetion we can do
## code

## how to get   title of web page
## diver.getTitle()
## how to get   current url of web page
## diver.getCurrentUrl()

## how to get   sourcecode of web page
## diver.getpageSource()

## what  are  basic  methods  in selenium?
## getTitle()
## getCurrenturl()
## getPageSource()

## what  are locators  in selenium?
```java
id,
name,
classname
linktext
partial link text
tagname
xpath
css selector
```
## go  to some  site  find  xpath for mobiles from flipkart?

## go to  amazon and search for samsumg phone and write  code to get price of it?

## same loactors  like id,
## name,
## classname which  u will prefer?

## id ,because  its unique