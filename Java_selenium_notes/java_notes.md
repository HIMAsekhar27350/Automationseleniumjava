# Java Programming:-
### we  have  to  learn  structure  of  java program:

```java
class ClassName{
    public  static  void  main(String args[]){
        decleration;
        input  statements;
        process  statements;
        output  statements;

    }
}

```
## Decleration:-
### we have  to  declare  variables  along  with  datatypes.
* ### 10 ---->int
* ### 4.6 ----->double
* ### madanapalli----->String
* ### int,double,String-------->datatypes
## input  statements:-
### assigning  the  value
### process  statement:
* ### formula /logic/  business  logic
### output  statement:-
```
  System.out.println()
  System.out.print()
  System.out.printf()
```
note:-System,String  (S---->must  be uppercase)
----------------------------------
* ### ()---->pair  of paranthysis
* ### (--->open paranthysis
* ### )--->close  paranthysis
its  function
-----------------------------------
* ### <>---->pair  of  angle  brackets
* ### <-->open  angle  bracket
* ### >--->close  angle  bracket
-----------------------------------
* ### {}--->pair  of  braces
* ### {-->open  brace
* ### }-->close brace
---------------------------------
* ### []---->pair  of brackets
* ### [--->open  bracket
* ### ]--->close bracker
* ### its  used  for arrays
-------------------------------
```
Alphabets  A  t z  including  _ (under score)
in  computers   _  is  also  one  alphabet
no .of alphabets: 27 a to z ,_
-----------------------------------------
<=   >=    !=
---------------------------------------

decleration;
input;
process;
output;

System.out.println("hi");
```

### 1. java  program  to  find  addition of  3  numbers?
``` java
add=a+b+c
class  Demo
{
public  static  void  main(String args[])
{
int    a,b,c,add;
a=6;
b=7;
c=2;
add=a+b+c;
System.out.println(add);
}
}
System.out.println("add="+add);
System.out.println("hi himashekar how r u="+add);
System.out.println("u wrost  java i am  not  feeling welu stipid="+add);
```
### 2.java   program  to  find  multiplication of  2  numbers?
```java
product=x*y

class Demo
{
public  static  void  main(String args[])
{
int x,y,product;
x=5;
y=6;
product=x*y;
System.out.println(product);
}
}
System.out.println("product="+product);
```
### 3.java  program  to  find  substraction of  2  numbers?
```java
sub=a-b
class Demo
{
public static void main(String args[])
{
int  a,b,sub;
a=70;
b=6;
sub=a-b;
System.out.println("substraction  of  2   numbers="+sub);
}
}
```
### 4.java  program  to  find?
```java
1.add  2.minus  3.product

add=a+b
sub=a-b
product=a*b

class Demo
{
public  static  void  main(String args[])
{
int a,b,add,sub,product;
a=10;
b=5;
add=a+b;
sub=a-b;
product=a*b;
System.out.println("addition="+add);
System.out.println("minus="+sub);
System.out.println("product="+product);

    }
}

System.out.print("addition="+add);
System.out.print("minus="+sub);
System.out.print("product="+product);
```
### 5.java  program  to  find  area  of  rectangle?
```
class Demo
{
public  static void main(String args[])
{
int l,b,area;
l=2;
b=5;
area=l*b;
System.out.println("area  of  rectangle="+area);
}
}
```
### 6.java  program  to  find  area of  triangle?
```java
class Demo
{
public  static  void  main(String args[]){
int b,h;
double area;
b=6;
h=7;
area=0.5*b*h;
System.out.println("area="+area);
}
}
```
### 7.java  program  to  find
```java
1.area  of  square
2.perimeter  of  square
class Demo
{
public  static  void  main(String args[]){
int  s,area,perimeter;
s=6;
area=s*s;
perimeter=4*s;
System.out.println("area="+area);
System.out.println("perimeter="+perimeter);

    }
}
```
### 8.java  program  to find
```java
1.area  of  circle
2.perimeter  of  circle
class Demo
{
public  static  void  main(String args[]){
int  r;
double  area,perimeter;
r=6;
area=3.14*r*r;
perimeter=2*3.14*r;
System.out.println("area="+area);
System.out.println("perimeter="+perimeter);

    }
}
```
### 9.java program  for PE n Ke
```java
class Demo
{
public  static  void  main(String args[]){
int m,g,h,v,pe;
double  ke;
m=7;
g=6;
h=5;
v=5;
pe=m*g*h;
ke=0.5*m*v*v;
System.out.println("pe="+pe);
System.out.println("ke="+ke);
    }
}
```
### 10. java  program  for  1.area of rectange  2.perimeter of  rectangle
### 11.java  program  for  volume  of  cylinder
### 12.java  program  for  volume  of  cone
### 13.java  program  for
1. inches  to  feet
2. feet  to  inches 
### 14.java  program  to  find
### 1.celcious  to  fareen heat
### 2.fareenheat  to  celcious

### arithmetic  operators:
## 1.+-->addition
## 2.-  --->substraction
## 3.* -->multiplication
## 4./  --->division
## 5.%   ---->division
### comprassion  operators:
* # < ,> ,<=,>=,!=,==



# Branching  statements  in JAVA:
# java  supports  following  braching statements
## 1.if  statement
## 2.if  else  statement
## 3.nested  if
## 4.switch statement

## comprassion  operators  /relational  operators
## <,>,<=,>=,!=,==
# logical  operators:
```text 
&&---->logic  AND(All conditions  must  satisify)
||--->logic  OR(any  one  condition can  satisify)
!---->logic  not
```
## if  statement:
```text 
if  is  a  keyword  that will checks  the  condition.
if  condition  is true,Then  true  block  of  statements  will be  execute.
if  condition  is  false ,then  the  true  block  of  statements  will not execute.
```
```java
syntax:
if(condition) T
{
true  block of  statements
to  be  execute;
}
```
# java  program  to  find  biggest  of   2  numbers?
```java
class HelloWorld {
public static void main(String[] args) {
int a,b;
a=8;
b=6;
if(a>b)
{
System.out.println("big is  a="+a);
}
if(b>a)
{
System.out.println("big is  b="+b);
}

        }
}
```
# java  program  to  check  n is  even r  odd?
```java 
class HelloWorld {
public static void main(String[] args) {
int n;
n=7;
if(n%2==0)
{
System.out.println("n is  even");
}
if(n%2!=0)
{
System.out.println("n is  odd");
}

        }
}
```
# java  program  to  check  person is  elegible  for  voting r not?
```java
class HelloWorld {
public static void main(String[] args) {
int age;
age=15;
if(age>=18)
{
System.out.println("person can  vote");
}
if(age<18)
{
System.out.println("person cannot vote");
}

        }
}
```
# java  program  to  find smallest  of 2  numbers?
# java  progam  to  check  student  is  pass r  fail?
```java
s,e,m
s>=35 && e>=35 && m>=35
pass

s<35 || e<35 ||  m<35

fail

class HelloWorld {
public static void main(String[] args) {
int e,s,m;
e=36;
s=67;
m=23;
if(e>=35 && s>=35 && m>=35)
{
System.out.println("student  is  pass");
}
if(e<35 ||  s<35 || m<35)
{
System.out.println("student is fail");
}

        }
}
```
# java  progam  to  accept  n
```output
output
1.if  n  is  +ve  ,then  am  positive
2.if  n  is  -ve  ,then  am  negtive
3.if  n  is  0  ,then  am  ZERO
```
# if  statement:
## interview question:
## what do u  understand by If?
### if  statement  is  one  way decission  making.
```java
if(con)
{
statements;
}

if else  statement:
if  is  a  keyword that  will  check  the  condition.
if  condition  is  true,then  the  true  block  of  statements  will execute.
if  condition is false,then the false block  of  statements  will execute(else part )
what do u  understand by If?
if else  statement  is  one  way decission  making.

its  two way decission making  statement.

if(condition)
{
true  block  of  statements;
}

else
{
false block  of  statements;
}
```
# java  programm to  find  biggest  of 2  numbers?
```java
class HelloWorld {
public static void main(String[] args) {
int  a,b;
a=6;
b=4;
if(a>b)
{
System.out.println("big is  a");
}
else
{
System.out.println("big is  b");
}
}
}
```
# program for even r odd?
```java
class HelloWorld {
public static void main(String[] args) {
int  n;
n=9;
if(n%2==0)
{
System.out.println("n is  even");
}
else
{
System.out.println("n is odd");
}
}
}
```
# program  for  person eligible  for  voting  r not?
```java
class HelloWorld {
public static void main(String[] args) {
int  age;
age=60;
if(age>=18)
{
System.out.println("person can vote");
}
else
{
System.out.println("person cannot vote");
}
}
}
```
# String :
### it  is  defined  as  group  of  characters
### represented  with  in  double  quots.
# Ex:
# "v4 institiue" ,"283782", "%%$%$%".
```java
in  java  String  can  be  defined in  2  ways:
1. using  new  keyword
2. using literal

using  new  keyword:-

String  name;
name=new  String("v4");
or
String  name=new String("v4");
class HelloWorld {
public static void main(String[] args) {
String name;
name=new  String("pallavi");
System.out.println(name);

    }
}
```
```java
using  literal:
String name="pallvai";
class HelloWorld {
public static void main(String[] args) {
String name="pallavi";
System.out.println(name);

    }
}


String  url;
url="https://www.google.com";
d.get(url);


String url=new String("https://www.google.com");

d.get(url);

memory:
what  is the meaning  of  string pool?

it's  a  memory  to  store  only  strings.




charAt();

Stringvariable.charAt(index);


String name="pallavi";
name.charAt(0);
class HelloWorld {
public static void main(String[] args) {
String name="pallvai";
System.out.println(name.charAt(5));

    }
}

String name="pallavi";
char ch;
ch=name.charAt(2);
System.out.println(ch);

class HelloWorld {
public static void main(String[] args) {
String name="pallavi";
char ch;
ch=name.charAt(4);
System.out.println(ch);

    }
}

length():
it  counts  no.of  characters  including  spaces.
String  name="pallavi";
int l;
l=name.length();

class HelloWorld {
public static void main(String[] args) {
String  name;
name="hema sekhar";
int  l;
l=name.length();
System.out.println(l);
}
}

```
# java  program  to  print  single characters  from String?
```java
class HelloWorld {
public static void main(String[] args) {
String  name;
int l;
name="pallavi";
l=name.length();
for(int i=0;i<l;i++){
System.out.println(name.charAt(i));
}
}
}


String url;
url="https://www.facebook.com";
```
# java  program  for
## 1.  finding  length  of url
## 2. print  character  by  character
# compareTo():-

# it  will  compare  2  strings  and  gets  boolean(t/f)  values;
```java
class HelloWorld {
public static void main(String[] args) {
String  n1="renuka";
String n2="ravi";
System.out.println(n1.compareTo(n2));

    }
}
```
# concat():
# it  will combined  two  string.
```java
class HelloWorld {
public static void main(String[] args) {
String  n1="hima";
String n2="ravi";
System.out.println(n1.concat(n2));

    }
}
```
# in  java  we  can  concate  two  strings  using  +  operator
```java
class HelloWorld {
public static void main(String[] args) {
String  n1="hima";
String n2="ravi";
System.out.println(n1+n2);

    }
}
class HelloWorld {
public static void main(String[] args) {
String  n1="hima";
String n2="ravi";
String n3="kumar";
System.out.println(n1+n2+n3);

    }
}
class HelloWorld {
public static void main(String[] args) {
String  n1=new String("hima");
String n2=new String("ravi");
String n3=new String("kumar");
System.out.println(n1+n2+n3);

    }
}




charAt()
length()
compareTo()
concat() / +

```
# equals():
# it  is  used  to compare  2  strings  togather  and  return boolean value.

```java
class HelloWorld {
public static void main(String[] args) {
String n1="dileep";
String n2="Dileep";
System.out.println(n1.equals(n2));




    }
}

class HelloWorld {
public static void main(String[] args) {
String n1="dileep";
String n2="anil";
System.out.println(n1.equals(n2));

    }
}
```
# can we use  equals() to compare  2  numbers?
# no,we should not  compare  2  numbers  using equals().
```java
class HelloWorld {
public static void main(String[] args) {
int a=9;
int b=8;
System.out.println(n1.equals(n2));

    }
}
```
# error
# can  we  compare  2  strings  with   ==?
# yes  we can  compare  2  string  with == and equals()
```java
class HelloWorld {
public static void main(String[] args) {
String n1="aaa";
String n2="aaa";
System.out.println(n1.equals(n2));
System.out.println(n1==n2);
    }
}

class HelloWorld {
public static void main(String[] args) {
String n1="aaa";
String n2=new String("aaa")
System.out.println(n1.equals(n2));
System.out.println(n1==n2);
    }
}
class HelloWorld {
public static void main(String[] args) {
String  n1="aaa";
String  n2="aaa";
String n3=new String("aaa");
System.out.println(n1==n2);
System.out.println(n1==n3);
System.out.println(n1.equals(n2));
System.out.println(n1.equals(n3));
System.out.println(n2.equals(n3));
System.out.println(n2==n3);
System.out.println(n1==n3);
System.out.println(n1.equals(n3));
    }
}
class HelloWorld {
public static void main(String[] args) {
String n1="aaa";
String n2=new String("aaa");
if(n1==n2)
System.out.println("both  are  equal");
else
System.out.println("both are not  equal");
    }
}
```
# equalsIgnoreCase():
# it will compare  2 strings by ignoring upper and lower cases.
```java
class HelloWorld {
public static void main(String[] args) {
String n1="dileep";
String n2="Dileep";
System.out.println(n1.equals(n2));
System.out.println(n1.equalsIgnoreCase(n2));
    }
}
```
# replace():-
# we  can  replace
# 1.single character  /  group of characters

```java 
class HelloWorld {
public static void main(String[] args) {
String n1="hi have a nice day";
System.out.println(n1.replace('a','b'));
}
}
class HelloWorld {
public static void main(String[] args) {
String n1="hi have a nice day";
System.out.println(n1.replace("nice","good"));
}
}
```
# substring():-
# it  is  uesd  to  display  part of the  string.
# user  have  to  provide  index(starting index n ending index).

```java 
class HelloWorld {
public static void main(String[] args) {
String n1="www.google.com";
System.out.println(n1);
System.out.println(n1.substring(4,10));
System.out.println(n1.substring(9,12));
    }
}
class HelloWorld {
public static void main(String[] args) {
String n1="FacebookFacebook helps you connect and share with the people in your life.";
System.out.println(n1);
System.out.println(n1.substring(4,10));
    }
}
class HelloWorld {
public static void main(String[] args) {
String n1="www.google.com";
System.out.println(n1);
System.out.println(n1.substring(4,10));
System.out.println(n1.substring(4));
    }
}
```
# toUpperCase() n toLoweCase():
# converts  given  string  into  upper to lower case n visversa.
```java
class HelloWorld {
public static void main(String[] args) {
String n1="www.google.com";
String n2="WWW.FACEBOOK.COM";
System.out.println(n1);
System.out.println(n1.toUpperCase());
System.out.println(n2);
System.out.println(n2.toLowerCase());
    }
}
```
# split():-
# startsWith(): endsWith():-
# results  boolean  value.
```java
class HelloWorld {
public static void main(String[] args) {
String n1="madanapalli";
System.out.println(n1);
System.out.println(n1.startsWith("mad"));
System.out.println(n1.startsWith("maf"));
System.out.println(n1.endsWith("lli"));
System.out.println(n1.endsWith("lle"));
    }
}
class HelloWorld {
public static void main(String[] args) {
String n1="https://www.facebook.com";
String n2="http://www.facebook.co.in";
System.out.println(n2.startsWith("http"));
System.out.println(n1.startsWith("https"));
System.out.println(n1.endsWith("com"));
System.out.println(n2.endsWith(".in"));
    }
}
https://www.google.com
https://www.google.co.in
http://www.google.com
http://www.google.co.in
```
# String  handling functions:
# 1.charAt() 
# 2.length()
# 3.equals()
# 4.equalsIgnorecase()
# 5.split()
# 6.touppercase(),
# 7.toLowerCase()
# 8.replace()
# 9.substring()
# 10.startsWith()
# 11.endsWith().
# converstion function:
## + int-->String
## + double--->String
## + char--->String