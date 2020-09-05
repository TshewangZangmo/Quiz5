package am.iunetworks.TshewangZangmo.Week5;

/**
 * Created by zumo on 9/5/2020.
 */
public class Q10 {
    public static void main(String args[]){
        for(int i=1;i<=5;i++)
        {
            for(int space=1;space<=5-i;space++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i*2-1;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=4;i>0;i--)
        {
            for(int space=1;space<=5-i;space++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i*2-1;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
