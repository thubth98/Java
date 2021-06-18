package hackerrank.outputFormatting;

import java.util.Scanner;

public class output {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("================================");
        for(int i=0; i<3; i++) {
            String s = scan.next();
            int a = scan.nextInt();
            // chuyen int a thanh string
            String s2 = Integer.toString(a);
            if(0<=a && a<=9) {
                s2 = "00" + s2;
            }
            else if(10<=a && a<=99) {
                s2="0" + s2;
            }
            System.out.printf("%-14s %s\n", s, s2);
        }
        System.out.println("================================");
        scan.close();
    }
}
