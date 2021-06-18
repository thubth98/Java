package hackerrank.stdInOut;

import java.util.Scanner;

public class stdInOut {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt(); // The first line contains an integer.
        double b = scan.nextDouble(); // The second line contains an double
        String whiteSpace = scan.nextLine(); 
        String c = scan.nextLine();//The third line contains a String.
       // On the first line, print String: followed by the unaltered String read from stdin.
       System.out.println("String: " + c);
       //On the second line, print Double: followed by the unaltered double read from stdin.
       System.out.println("Double: " + b);
       //On the third line, print Int: followed by the unaltered integer read from stdin.
       System.out.println("Int: " + a);
       scan.close();
    }
}
