# OOPS:
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