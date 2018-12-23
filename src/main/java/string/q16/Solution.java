package string.q16;

import java.util.ArrayList;
import java.util.StringJoiner;

public class Solution {
    public static void main(String args[]){
        String input = "This is sparta";

        String lots[] = input.split(" ");
        StringJoiner stringJoiner = new StringJoiner(" ");

        for(int i = 0;i<lots.length;i++){
            StringBuilder a = new StringBuilder(lots[i]);
            char start = a.charAt(0);
            char end = a.charAt(a.length()-1);
            a.setCharAt(0,end);
            a.setCharAt(a.length()-1,start);
            stringJoiner.add(a.toString());

        }

        System.out.println(stringJoiner.toString());
    }
}
