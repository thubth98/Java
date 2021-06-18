package hackerrank.loopII;

import java.util.Scanner;

public class loop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // the number of queries.
        int q = scan.nextInt();
        for(int i=0; i<q; i++) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            int n = scan.nextInt();
            // tong gia tri sau khi tinh toan
            int t = a;
            for(int j=0; j<n; j++) {
                int luyThuaBac2 = 1;
                for(int k=0; k<j; k++) {
                    luyThuaBac2 *= 2;
                }
                t += b*luyThuaBac2;
                System.out.printf("%d ", t);
            }
            System.out.printf("\n");
        }
        scan.close();
    }
}
