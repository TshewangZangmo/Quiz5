package am.iunetworks.TshewangZangmo.Week5;

import java.util.Scanner;

/**
 * Created by zumo on 9/5/2020.
 */
class Fibonacci {
    public int fib(int num) {
        if (num < 0) return -1;
        if (num == 0) return 0;
        if (num == 1) return 1;

        int[] F = new int[num + 1];
        F[0] = 0;
        F[1] = 1;
        for (int  i= 2; i < num + 1; i++) {
            F[i] = F[i - 1] + F[i - 2];
        }
        return F[num];
    }
}
public class Q8 {
    public static void main(String args[]){
        Fibonacci fab=new Fibonacci();
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num=scan.nextInt();

        int result=fab.fib(num);
        System.out.println("OUTPUT: "+result);
    }
}
