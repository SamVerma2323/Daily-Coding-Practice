import java.util.*;
import java.util.zip.CRC32;
public class recursion{

// static void name(String userName){
//     System.out.println(userName);
//     name(userName);
// }
// public static void main(String args[]){
//     System.out.print("Enter the name: ");
//     Scanner sc = new Scanner(System.in);
//     String userName = sc.nextLine();
    
//     name(userName);
// }

// static int cnt = 0;
// static void print(){
//     if(cnt==3) return;
//     System.out.println(1);
//     cnt++;
//     print();
// }
// public static void main(String[] args) {
//     print();

// }


//// Print name 5 times ////
// static int cnt = 0;
// static void name(String Username){
//     if(cnt==5) return;
//     System.out.println(Username);
//     cnt++;
//     name(Username);
// }
// public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.print("Enter the name: ");
//     String Username = sc.nextLine();
//     name(Username);
// }

/// OR ///

// static void printName(String name, int i, int n){
//     if(i>n) return;
//     System.out.println(name);
//     printName(name,i+1,n);
// }
// public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.print("Enter the name: ");
//     String name = sc.nextLine();
//     printName(name, 1, 5);
// }

//// Print linearly from 1 to N ////

// static void numbers(int i, int n){
//     if(i>n) return;
//     System.out.print(i+" ");
//     numbers(i+1, n);
// }
// public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.print("Enter the value of n: ");
//     int n = sc.nextInt();
//     numbers(1,n);
// }


//// Print from N to 1 ////
// static void revNum(int i, int n){
//     if(i<1) return;
//     System.out.print(i+" ");
//     revNum(i-1, n);
// }
// public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.print("Enter the number: ");
//     int n = sc.nextInt();

//     revNum(n, n);
// }


//// Print 1 to n using backtracking ////
// static void back(int i, int n){
//     if(i<1) return;
//     back(i-1, n);
//     System.out.print(i+" ");
// }
// public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.print("Enter n: ");
//     int n = sc.nextInt();
//     back(n, n);
// }


//// Sum of first n numbers (Parameterised way) ////

// static void num(int i, int sum){
//     if(i<1){
//         System.out.println(sum);
//         return;
//     }
//     num(i-1,sum+i);
// }
// public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.print("Enter the number: ");
//     int n = sc.nextInt();

//     num(n,0);
// }

//// Sum of first n numbers (Functional Recursion) ////

    // static int sum(int n){
    //     if(n==0) return 0;
    //     return n+sum(n-1);
    // }
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.print("Enter the value of n: ");
    //     int n = sc.nextInt();

    //     System.out.println(sum(n));
    // }


//// Factorial of n using recursion ////
// static int fact(int n){
//     if(n==0) return 1;
//     return n*fact(n-1);
// }
// public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.print("Entet the value of n: ");
//     int n = sc.nextInt();
//     System.out.println(fact(n));
// }


//// Reverse an array using recursion ////
    // static int a[] ;
    // static void f(int l, int r){
    //     if(l>=r) return;
    //     int temp = a[l];
    //     a[l]=a[r];
    //     a[r]=temp;
    //     f(l+1,r-1);
    // }
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.print("Enter size: ");
    //     int n = sc.nextInt();

    //     a=new int[n];
    //     System.out.println("Enter array elements: ");
    //     for(int i=0;i<n;i++){
    //     a[i] = sc.nextInt();
    //     }
       
    //     f(0,n-1);
    //     System.out.println("Reversed array: ");
    //     for (int x:a){
    //         System.out.print(x+" ");
    //     }
    // }

    //// Using only single pointer ////

    // static int a[];
    // static int n;
    // static void f(int i){
    //     if(i>=n/2) return;
    //     int temp = a[i];
    //     a[i] = a[n-i-1];
    //     a[n-i-1] = temp;
    //     f(i+1);
    // }
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.print("Enter the size: ");
    //     n = sc.nextInt();
    //     a = new int[n];
    //     for(int i=0;i<n;i++){
    //         a[i] = sc.nextInt();
    //     }
    //     f(0);
    //     for(int x:a){
    //         System.out.print(x+" ");
    //     }
    // }

    //// Checking if a string is palindrome or not ////
    
    // Recursive approach //

    // static boolean f(String s, int i){
    //     if(i>=s.length()/2) return true;
    //     if(s.charAt(i)!=s.charAt(s.length()-i-1)) return false;
    //     return f(s,i+1);
    // }
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.print("Enter the string: ");
    //     String s = sc.nextLine();

    //     boolean result = f(s,0);
    //     if(result)
    //         System.out.println("Is palindrome");
    //     else 
    //         System.out.println("Not Palindrome");

    // }

    // Iterative approach //

    // static boolean f(String s){
    //     int i=0;
    //     int j=s.length()-i-1;
    //     if(i>s.length()/2) return true;
    //     if(s.charAt(i) != s.charAt(j)) return false;
    //     i++;
    //     j--;
    //     return true;

    // }
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.print("Enter a string: ");
    //     String s = sc.nextLine();
        
    //     boolean result = f(s);
    //     if(result) 
    //         System.out.println("Is palindrome");
    //     else
    //         System.out.println("Not a palindrome");
    // }


    //// Fibonacci (Understanding recursion tree) ////
    // * Time Complexity - 2^n * //
    // static int f(int n){
    //     if(n<=1) return n;
    //     int last = f(n-1);
    //     int slast = f(n-2);
    //     return last + slast;
    // }
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.print("Enter the number: ");
    //     int n = sc.nextInt();

    //     System.out.println(f(n));
    // }



}