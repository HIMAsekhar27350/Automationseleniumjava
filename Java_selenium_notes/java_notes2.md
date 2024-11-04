# 1. java program to print all n numbers
```java
class demo{
public static void main(String arg[]){
    int n,i;
    n=7;
    i=1;
    while(i<=n){
        System.out.println(i);
        i++;
     }
    }
}
// using the for loop
class demo{
    public static void main(String arg[]){
        int n,i;
        n=7;
        i=1;
        for(i=1;i<=n;i++){
            System.out.println(i);
        }
    }
}
```
```output
java -cp /tmp/6JUfcLo9GA/demo
1
2
3
4
5
6
7

=== Code Execution Successful ===
```
# 2.java program to display only even number.
```java
class demo{
    public static void main(String arg[]){
        int n,i;
        n=10;
        for(i=2;i<=n;i=i+2){
            System.out.println(i);
        }
    }
}
// using the while loop
class demo{
    public static void main(String arg[]){
        int n,i;
        n=10;
        i=2;
        while(i<=n){
            System.out.println(i);
            i=i+2;
        }
    }
}
```
```output
java -cp /tmp/12dXWozzuY/demo
2
4
6
8
10

=== Code Execution Successful ===
```
# 3.java program to display only odd number.
```java
class demo{
    public static void main(String arg[]){
        int n,i;
        n=10;
        i=1;
        while(i<=n){
            System.out.println(i);
            i=i+2;
        }
    }
}
//using the for loop
class demo{
    public static void main(String arg[]){
        int n,i;
        n=10;
        for(i=1;i<=n;i=i+2){
            System.out.println(i);
        }
    }
}
```
```output
java -cp /tmp/NY44Wlvtii/demo
1
3
5
7
9

=== Code Execution Successful ===
```
# 4.java program to find sum of all the number of up to n.
```java
class demo{
public static void main(String arg[]){
    int n,i,sum;
    n=5;
    i=1;
    sum=0;
    while(i<=n){
        sum=sum+i;
        i++;
     }
     System.out.println("sum ="+sum);
}
}
//using the for loop
class demo{
    public static void main(String arg[]){
        int n,i,sum;
        n=5;
        i=1;
        sum=0;
        for(i=1;i<=n;i++){
            sum=sum+i;
        }
        System.out.println("sum ="+sum);
    }
}
```
```output
java -cp /tmp/lXaOPAwvKz/demo
sum =15

=== Code Execution Successful ===
```
# 5.java program to find sum of even numbers.
```java
class demo{
public static void main(String arg[]){
    int n,i,sum;
    n=10;
    i=2;
    sum=0;
    for(i=2;i<=n;i=i+2){
        sum=sum+i;
     }
     System.out.println("sum of the even numbers ="+sum);
}
}
// uisng the while loop
class demo{
    public static void main(String arg[]){
        int n,i,sum;
        n=10;
        i=2;
        sum=0;
        while(i<=n){
            sum=sum+i;
            i=i+2;
        }
        System.out.println("sum of the even numbers ="+sum);
    }
}
```
```output
java -cp /tmp/vauV99xYaK/demo
sum of the even numbers =30

=== Code Execution Successful ===
```
# 6.java program to find n factoral.
```java
    class demo{
    public static void main(String arg[]){
        int n,i,f;
        n=5;
        i=1;
        f=1;
        while(i<=n){
            f=f*i;
            i++;
        }
        System.out.println("factoral ="+f);
    }
}
//using the for loop
class demo{
    public static void main(String arg[]){
        int n,i,f;
        n=5;
        i=1;
        f=1;
        for(i=1;i<=n;i++){
            f=f*i;
        }
        System.out.println("factoral ="+f);
    }
}
```
```output
java -cp /tmp/bnq38GQ6L1/demo
factoral =120

=== Code Execution Successful ===
```
# 7.java program to display perfect square up to n.
```java
class demo{
public static void main(String arg[]){
    int n,i,square;
    n=5;
    i=1;
    square=0;
    while(i<=n){
        square=i*i;
        i++;
     }
     System.out.println("square ="+square);
}
}
//using the for loop
class demo{
    public static void main(String arg[]){
        int n,i,square;
        n=5;
        i=1;
        square=0;
        for(i=1;i<=n;i++){
            square=i*i;

        }
        System.out.println("square ="+square);
    }
}
```
```output
java -cp /tmp/kb745VPyBD/demo
square =25

=== Code Execution Successful ===
```
# 8.java program tio display mulitpliaction table.
```java
    class demo{
    public static void main(String arg[]){
        int n=10;
        for (int i = 1; i <= n; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }
}
//using the whlie loop
class demo{
    public static void main(String arg[]){
        int n=10,i=1;
        while (i <= n) {
            System.out.println(n + " x " + i + " = " + (n * i));
            i++;
        }
    }
}
```
```output
java -cp /tmp/vJMurOjgtc/demo
10 x 1 = 10
10 x 2 = 20
10 x 3 = 30
10 x 4 = 40
10 x 5 = 50
10 x 6 = 60
10 x 7 = 70
10 x 8 = 80
10 x 9 = 90
10 x 10 = 100

=== Code Execution Successful ===
```
# 9.java program to calcuate sum of each digit.
```java
// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class sum {
    public static void main(String[] args) {
      int n,digit,sum;
      n=142;
      sum=0;
      while(n>0){
          digit=n%10;
          sum=sum+digit;
          n=n/10;
      }
      System.out.println("Sum of the each digit ="+sum);
    }
}
```
```output
java -cp /tmp/Jj43ABWe5q/sum
Sum of the each digit =7

=== Code Execution Successful ===
```
# 10.java program to display n values in revese.
```java
// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class reverse {
    public static void main(String[] args) {
      int n,digit,rev;
      n=127;
      rev=0;
      while(n>0){
          digit=n%10;
          rev=rev*10+digit;
          n=n/10;
      }
      System.out.println("reverse ="+rev);
    }
}
```
```output
java -cp /tmp/0Jbw9fvApL/reverse
reverse =721

=== Code Execution Successful ===
```
# 11.java program to display palindrome.
```java
class PalindromeCheck {
    public static void main(String[] args) {
        int n = 121; 
        int digit, rev = 0; 
        int original = n; 

        // Reverse the number
        while (n > 0) {
            digit = n % 10; 
            rev = rev * 10 + digit; 
            n = n / 10; // Remove the last digit
        }

        // Check if the original number is equal to the reversed number
        if (original == rev) {
            System.out.println(original + " is a palindrome.");
        } else {
            System.out.println(original + " is not a palindrome.");
        }
    }
}
```
```output
java -cp /tmp/H41YtcUncE/PalindromeCheck
121 is a palindrome.

=== Code Execution Successful ===
```
```java
class PalindromeCheck {
    public static void main(String[] args) {
        int n = 321; 
        int digit, rev = 0; 
        int original = n; 

        // Reverse the number
        while (n > 0) {
            digit = n % 10; 
            rev = rev * 10 + digit; 
            n = n / 10; // Remove the last digit
        }

        // Check if the original number is equal to the reversed number
        if (original == rev) {
            System.out.println(original + " is a palindrome.");
        } else {
            System.out.println(original + " is not a palindrome.");
        }
    }
}
```
```output
java -cp /tmp/PElxg5kL9m/PalindromeCheck
321 is not a palindrome.

=== Code Execution Successful ===
```
# 12.java program to check arm strong are not.
```java
class sum {
    public static void main(String[] args) {
        int n = 153; 
        int digit, sum = 0; 
        int m = n; 

        // Reverse the number
        while (n > 0) {
            digit = n % 10; 
            sum = sum+digit*digit*digit;
            n = n / 10; // Remove the last digit
        }
        if(m==sum){
            System.out.println(m+ " Arm strong");
        }else{
            System.out.println(m+ " Arm  not strong");
        }
    }
}
```
```output
java -cp /tmp/QOPsEd2xs4/sum
153 Arm strong

=== Code Execution Successful ===
```
```java
class sum {
    public static void main(String[] args) {
        int n = 453; 
        int digit, sum = 0; 
        int m = n; 

        // Reverse the number
        while (n > 0) {
            digit = n % 10; 
            sum = sum+digit*digit*digit;
            n = n / 10; // Remove the last digit
        }
        if(m==sum){
            System.out.println(m+ " Arm strong");
        }else{
            System.out.println(m+ " Arm  not strong");
        }
    }
}
//using the for loop
class sum {
    public static void main(String[] args) {
        int n = 453;
        int digit, sum = 0;
        int m = n;

        // Reverse the number
        for (;n > 0;) {
            digit = n % 10;
            sum = sum+digit*digit*digit;
            n = n / 10; // Remove the last digit
        }
        if(m==sum){
            System.out.println(m+ " Arm strong");
        }else{
            System.out.println(m+ " Arm  not strong");
        }
    }
}

```
```output
java -cp /tmp/FDUiPiF4V8/sum
453 Arm  not strong

=== Code Execution Successful ===
```
# 13.java program to find sum of cude.
```java
class sum {
    public static void main(String[] args) {
        int n = 5; 
        int digit, sum = 0; 
        int m = n; 

        // Reverse the number
        while (n > 0) {
            digit = n % 10; 
            sum = sum+digit*digit*digit;
            n = n / 10; // Remove the last digit
        }
        System.out.println("Sum of Cude = "+sum);
    }
}
//using the for loop
class sum {
    public static void main(String[] args) {
        int n = 5;
        int digit, sum = 0;
        int m = n;

        // Reverse the number
        for (;n > 0;) {
            digit = n % 10;
            sum = sum+digit*digit*digit;
            n = n / 10; // Remove the last digit
        }
        System.out.println("Sum of Cude = "+sum);
    }
}
```
```output
java -cp /tmp/7x6jFXkQaA/sum
Sum of Cude = 125

=== Code Execution Successful ===
```
# 14.java program to find whether it Prime or not.
```java
    class HelloWorld {
    public static void main(String[] args) {
        int n, i, count;
        n = 7;
        count = 0;

        for (i = 1; i <= n; i++) {
            if (n % i == 0) { // Check if 'n' is divisible by 'i'
                count++;
            }
        }

        // If count is 2, it means 'n' has only two divisors: 1 and itself
        if (count == 2) {
            System.out.println("Prime");
        } else {
            System.out.println("Not prime");
        }
    }
}

```
```output
java -cp /tmp/uk0gUDKdfc/HelloWorld
Prime

=== Code Execution Successful ===
```
# Nested for loop:
# Square Pattern.
```java
// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Demo {
    public static void main(String[] args) {
        int i,j,n;
        n=4;
        for(i=1;i<=n;i++){
            for(j=1;j<=n;j++){
                System.out.print("*");
            }
          System.out.println("");  
        }
    }
}
```
```output
java -cp /tmp/jGAdGgwl49/Demo
****
****
****
****

=== Code Execution Successful ===
```
```java
// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Demo {
    public static void main(String[] args) {
        int i,j,n;
        n=4;
        for(i=1;i<=n;i++){
            for(j=1;j<=n;j++){
                System.out.print(j);
            }
          System.out.println("");  
        }
    }
}
```
```output
java -cp /tmp/rsoCfb1tkD/Demo
1234
1234
1234
1234

=== Code Execution Successful ===
```
```java
// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Demo {
    public static void main(String[] args) {
        int i,j,n;
        n=4;
        for(i=1;i<=n;i++){
            for(j=1;j<=n;j++){
                System.out.print(i);
            }
          System.out.println("");  
        }
    }
}
```
```output
java -cp /tmp/vN8S0Yy5MM/Demo
1111
2222
3333
4444

=== Code Execution Successful ===
```
# Right-Angled Triangle Pattern.
```java
// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Demo {
    public static void main(String[] args) {
        int i,j,n;
        n=4;
        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++){
                System.out.print("*");
            }
          System.out.println("");  
        }
    }
}
```
```output
java -cp /tmp/zujq5fCMXH/Demo
*
**
***
****

=== Code Execution Successful ===
```
```java
// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Demo {
    public static void main(String[] args) {
        int i,j,n;
        n=4;
        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++){
                System.out.print(i);
            }
          System.out.println("");  
        }
    }
}
```
```output
java -cp /tmp/aKAFFHHiCq/Demo
1
22
333
4444

=== Code Execution Successful ===
```
```java
// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Demo {
    public static void main(String[] args) {
        int i,j,n;
        n=4;
        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++){
                System.out.print(j);
            }
          System.out.println("");  
        }
    }
}
```
```output
java -cp /tmp/HqxBaJaejK/Demo
1
12
123
1234

=== Code Execution Successful ===
```
```java
// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Demo {
    public static void main(String[] args) {
        int i,j,n;
        n=4;
        for(i=1;i<=n;i++){
            for(j=n;j>=i;j--){
                System.out.print("*");
            }
          System.out.println("");  
        }
    }
}
```
```output
java -cp /tmp/HYP0gH4pk3/Demo
****
***
**
*

=== Code Execution Successful ===
```
```java
// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Demo {
    public static void main(String[] args) {
        int i,j,n;
        n=4;
        for(i=1;i<=n;i++){
            for(j=n;j>=i;j--){
                System.out.print(j);
            }
          System.out.println("");  
        }
    }
}
```
```output
java -cp /tmp/2IUzvpjuXF/Demo
4321
432
43
4

=== Code Execution Successful ===
```
```java
// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Demo {
    public static void main(String[] args) {
        int i,j,n;
        n=4;
        for(i=1;i<=n;i++){
            for(j=n;j>=i;j--){
                System.out.print(i);
            }
          System.out.println("");  
        }
    }
}
```
```output
java -cp /tmp/I6c4uGx4R7/Demo
1111
222
33
4

=== Code Execution Successful ===
```
```java
// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Demo {
    public static void main(String[] args) {
        int i,j,n,k;
        n=4;
        for(i=1;i<=n;i++){
            for(j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
          for(k = 1; k<=i; k++){
            System.out.print("*");  
          } 
          System.out.println();
        }
    }
}
```
```output
java -cp /tmp/emkE5dITY0/Demo
   *
  **
 ***
****

=== Code Execution Successful ===
```
```java
// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Demo {
    public static void main(String[] args) {
        int i,j,n,k;
        n=4;
        for(i=1;i<=n;i++){
            for(j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
          for(k = 1; k<=i; k++){
            System.out.print(k);  
          } 
          System.out.println();
        }
    }
}
```
```output
java -cp /tmp/DBCkYJO1G1/Demo
   1
  12
 123
1234

=== Code Execution Successful ===
```
```java
// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Demo {
    public static void main(String[] args) {
        int i,j,n,k;
        n=4;
        for(i=1;i<=n;i++){
            for(j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
          for(k = 1; k<=i; k++){
            System.out.print(i);  
          } 
          System.out.println();
        }
    }
}
```
```output
java -cp /tmp/emGd2Di5Hq/Demo
   1
  22
 333
4444

=== Code Execution Successful ===
```
```java
// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Demo {
    public static void main(String[] args) {
        int i,j,n,k;
        n=4;
        for(i=1;i<=n;i++){
            for(j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            for(k = 1; k<=i; k++){
            System.out.print("*");  
          }
             for(int l=1;l<i;l++){
              System.out.print("*");
          }
          System.out.println();
        }
    }
}
```
```output
java -cp /tmp/Mo6vQ7QYN4/Demo
   *
  ***
 *****
*******

=== Code Execution Successful ===
```
```java
// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Demo {
    public static void main(String[] args) {
        int i,j,n,k;
        n=4;
        for(i=1;i<=n;i++){
            for(j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            for(k = 1; k<=i; k++){
            System.out.print(k);  
          }
             for(int l=1;l<i;l++){
              System.out.print(i);
          }
          System.out.println();
        }
    }
}
```
```output
java -cp /tmp/7gB1sySauq/Demo
   1
  122
 12333
1234444

=== Code Execution Successful ===
```
```java
// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Demo {
    public static void main(String[] args) {
        int i,j,n,k;
        n=4;
        for(i=1;i<=n;i++){
            for(j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            for(k = 1; k<=i; k++){
            System.out.print(k);  
          }
             for(int l=1;l<i;l++){
              System.out.print(l);
          }
          System.out.println();
        }
    }
}
```
```output
java -cp /tmp/QCLQAtKfAj/Demo
   1
  121
 12312
1234123

=== Code Execution Successful ===
```
```java
// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Demo {
    public static void main(String[] args) {
        int i,j,n,k;
        n=4;
        for(i=n;i>=1;i--){
            for(j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            for(k = 1; k<=i; k++){
                System.out.print("*");
            }
            for(int l=1;l<i;l++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
```
```output
java -cp /tmp/4EnQ6tW2Nu/Demo
*******
 *****
  ***
   *

=== Code Execution Successful ===
```
```java
// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Demo {
    public static void main(String[] args) {
        int i,j,n,k;
        n=4;
        for(i=1;i<=n;i++){
            for(j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            for(k = 1; k<=i; k++){
            System.out.print("*");  
          }
             for(int l=1;l<i;l++){
              System.out.print("*");
          }
          System.out.println();
        }
        for(i=n;i>=1;i--){
            for(j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            for(k = 1; k<=i; k++){
            System.out.print("*");  
          }
             for(int l=1;l<i;l++){
              System.out.print("*");
          }
          System.out.println();
        }
    }
}
```
```output
java -cp /tmp/2k2D62lBQ6/Demo
   *
  ***
 *****
*******
*******
 *****
  ***
   *

=== Code Execution Successful ===
```

