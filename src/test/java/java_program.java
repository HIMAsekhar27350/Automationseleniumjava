// java program to print n number .
/*public class java_program {
    public static void main(String[] args) {
        int n=10,i=1;
        while (i<=n){
            System.out.println(i);
            i++;
        }
    }
}
//java program to display only even numbers
public class java_program {
    public static void main(String[] args) {
        int n=10,i=2;
        while (i<=n){
            System.out.println(i);
            i+=2;
        }
    }
}
//java program to display only odd numbers
public class java_program {
    public static void main(String[] args) {
        int n=10,i=1;
        while (i<=n){
            System.out.println(i);
            i+=2;
        }
    }
}
// java program to find all sum of n numebers.
public class java_program {
    public static void main(String[] args) {
        int n=5,i=1,sum=0;
        while (i<=n){
           sum=sum+i;
           i++;
        }
        System.out.println("Sum of the "+n+" = "+sum);
    }
}
//java program to find sum of even number.
public class java_program {
    public static void main(String[] args) {
        int n=10,i=1,sum=0;
        while (i<=n){
            sum+=i;
            i+=2;
        }
        System.out.println("Sum of "+n+" odd numbers = "+sum);
    }
}
// java program to find the n factoral
public class java_program {
    public static void main(String[] args) {
        int n=5,i=1,f=1;
        while (i<=n){
            f=f*i;
            i++;
        }
        System.out.println("Factoral = "+f);
    }
}
//java program to find perfect square up to n numbers
public class java_program {
    public static void main(String[] args) {
        int n=5,i=1,s_root=0;
        while (i<=n){
            s_root=i*i;
            i++;
            System.out.println(i);
        }
        System.out.println("Square root of "+n+" is "+s_root);
    }
}
//java program to print mulitplication table.
public class java_program {
    public static void main(String[] args) {
        int i=1,n=20;
        for(i=1;i<=n;i++){
            System.out.println("Muliplication table = "+i);
            for(int j=1;j<=10;j++) {
                System.out.println(i+" X "+j+" = "+(i*j));
            }
        }
    }
}
//java program to find the sum of each digit.
public class java_program {
    public static void main(String[] args) {
        int n=153,digit=0,sum=0,real=n,rev=0;
        while (n>0){
            digit=n%10;
            //rev=rev*10+digit;
             sum =sum+digit*digit*digit;
            n=n/10;
        }
        System.out.println("Given number is = "+real+" reversed number = "+rev);
        //System.out.println("to adding the each digit of "+real+" result = "+sum+" reminder = "+n);
        if(real==sum){
            System.out.println("it is arm strong numbers");
        }else {
            System.out.println("it is not arm strong numbers");
        }
    }

}
public class java_program {
    public static void main(String[] args) {
        int i=1,n=10,count=0;
        for(i=1;i<=n;i++){
            if(n%i==0){
                count++;
                System.out.println(i);
            }
        }
        System.out.println("count = "+count);
        if(count==2){
            System.out.println("It is prime number");
        }else {
            System.out.println("Its is not a prime number");
        }
    }
}*/
//java program to pattern
public class java_program {
    public static void main(String[] args) {
        int i, j, n = 4, k;
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            for (k = 1; k <= i; k++) {
                System.out.print("*");
            }
            for (int l = 1; l < i; l++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (i = n; i >= 1; i--) {
            for (j = 1; j <= (n - i);
            j++){
                System.out.print(" ");
            }
            for (k = 1; k <= i; k++) {
                System.out.print("*");
            }
            for (int l = 1; l < i; l++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
