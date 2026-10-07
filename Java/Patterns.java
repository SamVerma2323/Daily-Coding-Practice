// import java.util.*;
// public class Patterns {
//     public static void main(String args[]){

//         Scanner sc = new Scanner(System.in);      
//         System.out.print("Enter n: ");
//         int n=sc.nextInt();
  
        // System.out.print("Enter m:");
        // int m=sc.nextInt();
      
        //// Print a rectangle ////
        
        // for(int i=0;i<4;i++){
        //     for(int j=0;j<5;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }


        //// Printing a hollow rectangle ////
        
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=m;j++){
        //         if(i==1||j==1||i==n||j==m){
        //             System.out.print("*");
        //         }
        //         else{
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }


        //// Right-Angled Triangle ////
        
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        //// Inverted Right-Angled Triangle ////
        
        // for(int i=n;i>=1;i--){
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        //// Right-Angled Triangle (Lateral Inversion) ////
        
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=n-i;j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        //// Printing number pyramid ////

        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }

        //// Inversing the above pattern ////
        
        // for(int i=n;i>=1;i--){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }

        //// Number pyramid with continuation ////
        // int number=1;
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(number);
        //         number++;
        //     }
        //     System.out.println();
        // }

    //// The 0-1 Triangle ////

    // for(int i=1;i<=n;i++){
    //     for(int j=1;j<=i;j++){
    //         if((i+j)%2==0){
    //             System.out.print("1");
    //         }else{
    //             System.out.print("0");
    //         }
    //     }
    //     System.out.println();
    // }


    //// Butterfly Pattern ////

    // for(int i=1;i<=n;i++){
    //     for(int j=1;j<=i;j++){
    //         System.out.print("*");
    //     }
    //     for(int j=1;j<=2*(n-i);j++){
    //         System.out.print(" ");
    //     }
    //     for(int j=1;j<=i;j++){
    //         System.out.print("*");
    //     }
    //     System.out.println();
    // }
    // for(int i=n;i>=1;i--){
    //     for(int j=1;j<=i;j++){
    //         System.out.print("*");
    //     }
    //     for(int j=1;j<=2*(n-i);j++){
    //         System.out.print(" ");
    //     }
    //     for(int j=1;j<=i;j++){
    //         System.out.print("*");
    //     }
    //     System.out.println();
    // }


    //// Rhombus ////

    // for(int i=1;i<=n;i++){
    //     for(int j=1;j<=n-i;j++){
    //         System.out.print(" ");
    //     }
    //     for(int j=1;j<=n;j++){
    //         System.out.print("*");
    //     }
    //     System.out.println();
    // }

    //// Number pyramid with same number of spaces and the number ////

    // for(int i=1;i<=n;i++){
    //     for(int j=1;j<=n-i;j++){
    //         System.out.print(" ");
    //     }
    //     for(int j=1;j<=i;j++){
    //         System.out.print(i+" ");
    //     }
    //     // for(int j=1;j<=n-i;j++){
    //     //     System.out.print(" ");
    //     // }
    //     System.out.println();
    // }


    //// Number pyramid but having 1 in between (Palindromic Pattern) ////

    // for(int i=1;i<=n;i++){
    //     for(int j=1;j<=n-i;j++){
    //         System.out.print(" ");
    //     }
    //     for(int j=i;j>=1;j--){
    //         System.out.print(j);
    //     }
    //     for(int j=2;j<=i;j++){
    //         System.out.print(j);
    //     }
    //     System.out.println();
    // }


    //// Diamond Pattern ////
    
    // for(int i=1;i<=n;i++){
    //     for(int j=1;j<=n-i;j++){
    //         System.out.print(" ");
    //     }
    //     for(int j=1;j<=2*i-1;j++){
    //         System.out.print("*");
    //     } 
    //     System.out.println();
    // }
    // for(int i=n;i>=1;i--){
    //     for(int j=1;j<=n-i;j++){
    //         System.out.print(" ");
    //     }
    //     for(int j=1;j<=2*i-1;j++){
    //         System.out.print("*");
    //     } 
    //     System.out.println();
    // }


    // for(int i=0;i<n;i++){
    //     for(int j=0;j<n;j++){
    //         System.out.print("*");
    //     }
    //     System.out.println();
    // }

     

//     }    
// }
import java.util.*;
class Patterns {
    public static void loops(int n){
    // for(int i=1;i<=n;i++){
    // 	for(int j=0;j<i;j++){
    //     	System.out.print("*");
    //     }	
    //     System.out.println();
    //     }

    // for(int i=1;i<=n;i++){
    //     for(int j=1;j<=i;j++){
    //         System.out.print(j+" ");
    //     }
    //     System.out.println();
    // }

        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(i);
        //     }
        //     System.out.println();
        // }

        // for(int i=n;i>=1;i--){
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // for(int i=0;i<n;i++){
        //     for(int j=0;j<i;j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=0;j<2*n-(2*i+1);j++){
        //         System.out.print("*");
        //     }
        //     for(int j=0;j<i;j++){
        //         System.out.print(" ");
        //     }
        //     System.out.println();            
        // }

            // for(int i=1;i<=2*n-1;i++){
            //     int stars = i;
            //     if(i>n){
            //         stars=2*n-i;
            //     }
            //     for(int j=1;j<=stars;j++){
            //         System.out.print("*");
            //     }
            //     System.out.println();
            // }


            // int start=1;
            // for(int i=0;i<n;i++){
            //     if(i%2==0)
            //         start=1;
            //     else start=0;       
            //     for(int j=0;j<=i;j++){
            //         System.out.print(start);
            //         start=1-start;
            //     }         
            //     System.out.println();
            // }

            // int space = 2*(n-1);
            // for(int i=1;i<=n;i++){
            //     for(int j=1;j<=i;j++){
            //         System.out.print(j);
            //     }
            //     for(int j=1;j<=space;j++){
            //         System.out.print(" ");
            //     }
            //     for(int j=i;j>=1;j--){
            //         System.out.print(j);
            //     }
            //     System.out.println();
            //     space -= 2;
            // }

            // int num=1;
            // for(int i=1;i<=n;i++){
            //     for(int j=1;j<=i;j++){
            //         System.out.print(num+" ");
            //         num+=1;
            //     }
            //     System.out.println();
            // }

            // for(int i=0;i<n;i++){
            //     for(char ch='A';ch<='A'+i;ch++){
            //         System.out.print(ch+" ");
            //     }
            //     System.out.println();
            // }
            
            // for(int i=0;i<n;i++){
            //     for(char ch='A';ch<='A'+(n-i-1);ch++){
            //         System.out.print(ch+" ");
            //     }
            //     System.out.println();
            // }
 

            // for(int i=1;i<=n;i++){
            //     for(char ch='A';ch<=i;ch++){
            //         System.out.print(ch+" ");
            //     }
            //     System.out.println();
            // }

            // for(int i=0;i<n;i++){
            //     char ch=(char)('A'+i);
            //     for(int j=0;j<=i;j++){
            //         System.out.print(ch+" ");
            //     }
            //     System.out.println();
            // }

            // for(int i=0;i<n;i++){
            //     for(int j=0;j<n-i-1;j++){
            //         System.out.print(" ");
            //     }
            //     char ch = 'A';
            //     int breakpoint = (2*i+1)/2;
            //     for(int j=1;j<=2*i+1;j++){
            //         System.out.print(ch);
            //         if(j<=breakpoint) ch++;
            //         else ch--;
            //     }
            //     for(int j=0;j<n-i-1;j++){
            //         System.out.print(" ");
            //     }
            //     System.out.println();
            // }

            // for(int i=0;i<n;i++){
            //     char ch = (char)('A' + i);
            //     for(int j=0;j<=i;j++){
            //         System.out.print(ch+" ");
            //     }
            //     System.out.println();
            // }

            // for(int i=0;i<n;i++){
                
            //     for(int j=0;j<n-i-1;j++){
            //         System.out.print(" ");
            //     }
            //     char ch='A';
            //     int breakpoint = (2*i+1)/2;
            //     for(int j=1;j<=2*i+1;j++){
            //         System.out.print(ch);
            //         if(j<=breakpoint) ch++;
            //         else ch--;
            //     }
            //     for(int j=0;j<n-i-1;j++){
            //         System.out.print(" ");
            //     }
            //     System.out.println();

            // for(int i=0;i<n;i++){
            //     for(char ch=(char)('E'-i);ch<='E';ch++){
            //         System.out.print(ch+" ");
            //     }
            //     System.out.println();
            // }

            

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n: ");
        int n=sc.nextInt();
        loops(n);
    }
}