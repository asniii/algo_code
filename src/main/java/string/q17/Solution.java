package string.q17;

import java.util.StringJoiner;

public class Solution {
    public static void main(String args[]){
        String input = "1-5, 8, 11-14, 18, 20, 26-29";

        String a[] = input.split(",");

        StringJoiner stringJoiner = new StringJoiner(",");

        for(int i  = 0;i<a.length;i++){
            String str = a[i];
            if(str.contains("-")){
                String b[] = str.split("-");
                String start = b[0].trim();
                String end = b[1].trim();
                for(int z = Integer.parseInt(start);z<=Integer.parseInt(end);z++){
                    stringJoiner.add(Integer.toString(z).trim());
                }
            }
            else {
                stringJoiner.add(a[i].trim());
            }
        }
        System.out.println(stringJoiner.toString());
    }
}
