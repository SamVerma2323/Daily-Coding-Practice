import java.util.*;
//* Hashing - Prestoring/Fetching *//
public class Hashing {
     public static void main(String args[]){
        // Declaration of array //
    //     Scanner sc = new Scanner(System.in);
    //     System.out.print("Enter the size of array: ");
    //     int n = sc.nextInt();

    //     int a[] = new int [n];
        
    //     for(int i=0;i<n;i++){
    //         a[i]=sc.nextInt();
    //     }

    //     // Precomputation //
    //     int hash[] = new int[13];
    //     for(int i=0;i<n;i++){
    //         hash[a[i]] ++;
    //     }

    //     System.out.print("Enter the number of queries: ");
    //     int q = sc.nextInt();
    //     while(q-- >0){
    //         System.out.print("Enter the number: ");
    //         int num=sc.nextInt();

    //     // Fetch //
    //     System.out.println(hash[num]);
    //     } 
    
    // Character Hashing //

    // // Input
    // Scanner sc = new Scanner(System.in);
    // System.out.print("Enter the String: ");
    // String s = sc.nextLine();

    // // Precompute
    // int hash[] = new int[26];
    // for(int i=0;i<s.length();i++){
    //     hash[s.charAt(i)-'a']++;
    // }

    // System.out.print("Enter the number of queries: ");
    // int q = sc.nextInt();
    // while(q-- >0){
    //     System.out.print("Enter the query: ");
    //     char c = sc.next().charAt(0);
    
    // // Fetch
    //     System.out.println(hash[c-'a']);
    // }
    


    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the string: ");
    String s = sc.nextLine();

    int hash[] = new int[26];
    for(int i=0;i<s.length();i++){
        hash[s.charAt(i)-'a']++;
    }

    System.out.print("Enter the number of queries: ");
    int q = sc.nextInt();

    while(q-- > 0){
        System.out.print("Enter the query: ");
        char c = sc.next().charAt(0);

    System.out.println(hash[c-'a']);
    }
    }
}
