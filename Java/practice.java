import java.util.*;

public class practice {
    // // reverse the array //
    // // 1. Using Recursion //
    // static int a[];
    // static void f(int l, int r){
    //     if(l>=r) return;
    //     int temp = a[l];
    //     a[l]=a[r];
    //     a[r]=temp;
    //     f(l+1,r-1);
    // }
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("Enter the size of array: ");
    //     int n = sc.nextInt();
    //     a = new int[n];
    //     for(int i=0;i<n;i++){
    //         a[i]=sc.nextInt();
    //     }
    //     f(0,n-1);
    //     System.out.println("Reversed array: ");
    //     for(int x:a){
    //         System.out.print(x + " ");
    //     }
    // }

    // Reversing the array without recursion //

//     static int a[];
//     static void f(int i){
//         if(i>=a.length/2) return;
//         int temp = a[i];
//         a[i] = a[a.length-i-1];
//         a[a.length-i-1] = temp;

//     f(i+1);
//     }
// public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.println("Enter the size of array: ");
//     int n = sc.nextInt();

//     a=new int[n];
//     for(int i=0;i<n;i++){
//         a[i]=sc.nextInt();
//     }
//     f(0);
//     for(int x:a)
//         System.out.print(x+" ");
// }

// Checking if a string is palindrome //

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
//         System.out.println("It is a palindrome");
//     else
//         System.out.println("Not a palindrome");
// }

// Reverse a string ) //
// public static void main(String[] args) {
    
// Scanner sc = new Scanner(System.in);
// System.out.print("Enter the string: ");
// String s = sc.nextLine();

// for(int i=s.length()-1;i>=0;i--){
//     System.out.print(s.charAt(i));
// }
// }

// Reverse array using single index via recursion //

// static int a[];
// static void f(int i){
//     if(i>=a.length/2) return;

//     int temp = a[i];
//     a[i] = a[a.length-i-1];
//     a[a.length-i-1] = temp;
//     f(i+1);
// }
// public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     int n = sc.nextInt();
//     a=new int[n];
//     for(int i=0;i<n;i++){
//         a[i] = sc.nextInt();
//     }
//     f(0);
//     System.out.println("Reversed Array: ");
//     for(int x:a){
//         System.out.print(x+" ");
//     }
// }


// Hashing //

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the size of array: ");
    int n = sc.nextInt();
    int a[] = new int[n];
    System.out.print("Enter the elements of the array: ");
    for(int i=0;i<n;i++){
        a[i] = sc.nextInt();
    }

    // Pre-Computing

    int hash[] = new int[1001];
    for(int i=0;i<n;i++){
        hash[a[i]]++;
    }

    // Queries
    System.out.print("Enter the number of queries: ");
    int q = sc.nextInt();
    while(q-- >0){
        System.out.print("Enter the query: ");
        int num = sc.nextInt();
    // Fetch 
        System.out.println(hash[num]);
    }

}
}