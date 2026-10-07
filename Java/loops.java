import java.util.*;
public class loops{
    public static void main(String args[]){
        //// For Loop ////

        // for(int i=0;i<=6;i++){
        //     System.out.println("*");
        // }

        // for(int i=0;i<=10;i++){
        //     System.out.println(i);
        // }

        //// While Loop ////

        // int i=0;
        // while(i<=10){
        // System.out.println(i);
        // i++;
        // }


        //// Do While Loop ////
        
        // int i=0;
        // do{
        //     System.out.println(i);
        //     i++;
        // } while (i<=10);

        //// Sum of first n natural numbers ////
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        // int sum = 0;
        // for(int i=0;i<=n;i++){
        //     sum += i;
        // }
        // System.out.println(sum);

//// Printing 0 to 10 ////
        // for(int i=0;i<=10;i++){
        //     System.out.println(i);
        // }

        // int i = 0;
        // while(i<11){
        //     System.out.println(i);
        //     i++;
        // }


        // int i = 0;
        // do{
        //     System.out.println(i);
        //     i++;
        // } while(i<=10);


        ///// Sum of n natural numbers /////

        // int sum=0;
        // for(int i=0;i<=n;i++){
        //     sum+=i;
        // }
        // System.out.println(sum);


//// Printing table of a number ////

        for(int i=1;i<=10;i++){
            System.out.println(n*i);
        }

    }
}