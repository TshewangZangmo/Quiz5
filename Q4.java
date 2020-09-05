package am.iunetworks.TshewangZangmo.Week5;

/**
 * Created by zumo on 9/5/2020.
 */
class Solution {
    public String sortString(String s) {
        if(s == null) return "";

        char[] charString = s.toCharArray();
        int[] charMap = new int[26];

        for(int i = 0; i < charString.length; i++){
            charMap[(int)(charString[i]) - (int)'a']++;
        }
        int j = 0;
        while(j < charString.length){
            for(int i = 0; i < charMap.length; i++){
                if(charMap[i] != 0){
                    charString[j] = (char)(i + 'a');
                    charMap[i]--;
                    j++;
                }
            }
            for(int i  = charMap.length-1; i >= 0; i--){
                if(charMap[i] != 0){
                    charString[j] = (char)(i + 'a');
                    charMap[i]--;
                    j++;
                }
            }
        }
        return new String(charString);
    }
}
class Q4{
    public static void main(String args[]){
        Solution sol=new Solution();
        String s="aaabbbccc";
        String result=sol.sortString(s);
        System.out.println("OUTPUT: "+result);
    }
}