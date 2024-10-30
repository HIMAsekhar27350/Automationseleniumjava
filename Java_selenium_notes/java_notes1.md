# OOPS: Object-Oriented Programming
# Class:
## * Class can be Understand as blue print (or)plan (or) engitrring digram (or) logical representation for an object.
## * class is defined by using the keyword called "Class".
## * It is defined as combination of data memebers and method.
```java
class ClassName{
    data memebers;
    methods;
}
```
# Example:
```java
class Dog{
    String breed,colour;
    int cost;
    public void dogInput(String a,String b,int c){
        breed=a;
        colour=b;
        cost=c;
    }
    public void dogOutput(){
        System.out.println(breed+colour+cost);
    }

    public static void main(String[] args) {
        Dog d=new Dog();
        d.dogInput("gs","black",50000);
        d.dogOutput();
    }
}
```
```output
gsblack50000

=== Code Execution Successful ===
```
# Object:
- ##  It is a real world entitles.
- ## It can be understand as phyiscal representation.
- ## It is defined as " Hold data memebers and method".
- ## In java we have to use object as a new keyword.
```java
className obj=new className();
```
# Abstrations:
- ## It is defined as getting data members and methods to an object.
- ## Here partion memory will take place.
- ## if class is create with three object,then memory will allcoate thrice.
| d1 |        d2        |
|-------------|:----------------:|
| breed = "gs" |   breed = "gs"   |
| colour = "black" | colour = "black" |
| cost = 10000|   cost = 5000    |
# Encapsuation:
+ ## Wrapping of data members and method is called encapsuation.
+ ## It proved helding of data.
+ ## if program is disigned using class and object then we can anchieve encapsuation.
# Constructor:
+ ## Constructor is a special member function,whose name is same as className.
+ ## java supports two types of constructor.
## 1 . Default Constructor.
## 2 . Parameters Constructor.
#  Default Constructor:
+ ## It is also known as zero agruments constructor
+ ## it will be called automatilcal.whenever object is created for class.And stores default values.
+ ## String---------->null
+ ## int------------->0
+ ## double------------>0
+ ## boolean------------>false
# Parameters Constructor:
+ ## Hero programmer can send agruments
```java
class Dog{
    String breed,colour;
    int cost;
    Dog(String breed,String colour,int cost)
    {
        this.breed=breed;
        this.colour=colour;
        this.cost=cost;
    }
}
```
+ ## Above constructor will be invokled automatatically whenever object are created for class.
+ ## If there are two object then constructor will be called twice.
+ ## parameterized constructor can be called as follows
```java
Dog d1=new Dog("gs","black",5000);
```
# Points to be remeber:
+ ## Return type should be not be specfilyed
+ ## constructor name className should be the same
+ ## It is used to construct the values.
# About "this":
+ ## "this" is a keyword used to identity data memebers.
+ ## When parameters and data memebers same in such case.we have to use "this keyword".
```java
this.breed=breed;
this.colour=colour;
this.cost=cost;
```
# Catergers of method(or)Fuctions:
+ ## Method with Agruments and with return types.
+ ## Method with Agruments and without return types.
+ ## Method without Agruments and without return types.
+ ## Method with Agruments and with return types.
# About "void":
+ ## It means return nothing
# About "return":
+ ## It return something
# Static in java:
+ ## Static is an axis modifier
+ ## The keyword static is used to defined
+ ## 1.Variable 2.Method
# Static Variable:
+ ## The keyword static must be prefix before the variable. the default value for static is zero.
+ ## Memory will be allocates during complietion of a program.
+ ## Memory will ba allocates only once and keep on update
+ ## the updated value will be shared by all object
```java
static int count;
```
# Static Method:
+ ## the keyword static must be prefixed before the method.
+ ## Within static method only static variable must be used.
+ ## in non-static method both static and non-static variable used.
```java
public void allsalary();
```
+ ## static method can be involed with className (or)without className.(uses object also).
+ ## non-static method involed by using object.
# Polymorphism:
+ ## Ploy means many and morphism means formation that is one thing existing many forms is called polymorphism.
+ ## in java polymorphism is achieved by using method overloading.
# method overloading:
+ ## it is also known as functional polymorphism.
# Defination for method overloading:
+ ## A method os set to be overloading if the same method name is repeated more number of times by changing arguments list
```java

public class Ploy {
    public void sum(int x,int y,double z){
        System.out.println("Sum = "+(x+y+z));
    }
    public void sum(double x,int y,int z){
        System.out.println("Sum = "+(x+y+z));
    }
    public void sum(double x,double y,int z){
        System.out.println("Sum = "+(x+y+z));
    }
    public static void main(String[] args) {
        Ploy a=new Ploy();
        a.sum(5,5,5.5);
        a.sum(5.6,5,5);
        a.sum(5.6,5.7,5);
    }
}

```
+ ## in above two methods are called overloaded method
```java
 public void sum(double x,int y,int z){
        System.out.println("Sum = "+(x+y+z));
    }
    public void sum(double a,double b,int c){
        System.out.println("Sum = "+(a+b+c));
    }
```
+ ## the above two method are not overloaded method.
+ ## it leads to ambigious(doublefull ness).
# Method is set to be overloaded if it satiflying the follow
+ ## same method is repeated number of times with same data type.
+  ## same method is repeated number of times with different same data type.
+  ## same method is repeated number of times with sequenceof different data type.