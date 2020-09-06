package am.iunetworks.TshewangZangmo.Week5;

/**
 * Created by zumo on 9/5/2020.
 */
class DotSeperator {
    public String thousandSeparator(int n) {
        String num = String.valueOf(n);
        if (num.length() <=3)
            return num;
        int count =0 ;
        String res = "";
        int index = num.length()-1;

        while (index>=0)
        {
            count++;
            res+=num.charAt(index);
            if (count==3 && index!=0) {
                res+=".";
                count=0;
            }
            index-=1;
        }
        String finres = "";

        for(int i =res.length()-1;i>=0;i--)
            finres+=res.charAt(i);

        return finres;
    }
}
public class Q11 {
    public static void main(String args[]){
        DotSeperator dot=new DotSeperator();
        int num=123456;
        System.out.println(dot.thousandSeparator(num));

    }
}
