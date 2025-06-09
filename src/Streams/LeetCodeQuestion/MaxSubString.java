package Streams.LeetCodeQuestion;

import java.util.HashSet;
import java.util.Set;
//Find the length of Max sub String
public class MaxSubString {
    public static void main(String[] args) {
        String s="acdcgdjcdgsfacdac";
        int right=0;
        int left=0;
        int max=0;
        Set<Character> st=new HashSet<>();  //Set Always store Unique Data

        while (right < s.length())
        {
            if(st.add(s.charAt(right)))     //Adding unique Value
            {
                max=Math.max(max,right-left+1); //Check the Count
                right++;
            }
            else {
                st.remove(s.charAt(left));    //Remove value if they found Repeated
                left++;                       //Move on next chararcter
            }
        }
        System.out.println(max);
    }
}
