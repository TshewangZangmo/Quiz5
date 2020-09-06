package am.iunetworks.TshewangZangmo.Week5;

/**
 * Created by zumo on 9/5/2020.
 */
class ReverseString {
    public void reverseWordInMyString(String str)
    {
	    String[] words = str.split(" ");
        String reversedString = "";
        for (int i = 0; i < words.length; i++)
        {
            String word = words[i];
            String reverseWord = "";
            for (int j = word.length()-1; j >= 0; j--)
            {

                reverseWord = reverseWord + word.charAt(j);
            }
            reversedString = reversedString + reverseWord + " ";
        }
        System.out.println(str);
        System.out.println(reversedString);
    }
}
class Q6{
    public static void main(String[] args)
    {
        ReverseString obj = new ReverseString();
        obj.reverseWordInMyString("hello");
        obj.reverseWordInMyString("Hannah");
    }
}
