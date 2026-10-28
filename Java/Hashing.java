import java.util.*;
//* Hashing - Prestoring/Fetching *//
public class Hashing {
     public static void main(String args[]){
        // Declaration of array //
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        int a[] = new int [n];
        
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }

        // Precomputation //
        int hash[] = new int[13];
        for(int i=0;i<n;i++){
            hash[a[i]] ++;
        }

        System.out.print("Enter the number of queries: ");
        int q = sc.nextInt();
        while(q-- >0){
            System.out.print("Enter the number: ");
            int num=sc.nextInt();

        // Fetch //
        System.out.println(hash[num]);
        } 
     }
}
