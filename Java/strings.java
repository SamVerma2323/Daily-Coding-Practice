import java.util.*;
public class strings {
    public static void main(String args[]){
        // String name = "Sam";
        // String fullName = "Sanyam Verma";
        // String sentence = "My name is Sanyam Verma";

        // Scanner sc = new Scanner(System.in);
        // String name = sc.nextLine();

        // System.out.println("The name is: "+name);

        // String firstName = "Tony";
        // String lastName = "Stark";
        // String fullName = firstName+lastName;

        ////  Length of a string ////
        // System.out.println(fullName.length());

        //// charAt ////
        // for(int i=0;i<fullName.length();i++){
        //     System.out.println(fullName.charAt(i));
        // }

        //// Compare the strings ////
        // String name1="Tony";
        // String name2="Stark";

        //1. s1>s2 : +ve value
        //2. s1=s2 : 0
        //3. a1<s2 : -ve value
        // if(name1.compareTo(name2)>0){
        //     System.out.println("name1 is greater.");
        // }else if(name1.compareTo(name2)<0){
        //     System.out.println("name2 is greater.");
        // }else{
        //     System.out.println("Both sstrings are equal.");
        // }

        // String sentence="My name is Tony Stark.";
        // System.out.println(sentence.substring(0,5));

        //// NOTE -> Strings are immutable. ////
        
        //// String Builder ////

        // StringBuilder sb = new StringBuilder("Tony");
        // System.out.println(sb);

        // charAt //

        // System.out.println(sb.charAt(0));

        //// set chat at
        // sb.setCharAt(0,'S');
        // System.out.println(sb);

        //// insert
        // sb.insert(0,'S');
        // System.out.println(sb);

        //// delete
        // sb.delete(0,0);
        // System.out.println(sb);

        //// append
        // sb.append(" ");
        // sb.append("S");
        // sb.append('t');
        // sb.append('a');
        // sb.append('r');
        // sb.append('k');
        // System.out.println(sb);

        //// length
        // System.out.println(sb.length()); 

         ///////  Reverse a String  ///////
        
        StringBuilder sb = new StringBuilder("hello");
        for(int i=0;i<sb.length()/2;i++){
            int front = i;
            int back = sb.length()-1-i;

            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);

            sb.setCharAt(front,backChar);
            sb.setCharAt(back,frontChar);

            }
            System.out.println(sb);
    }
}
