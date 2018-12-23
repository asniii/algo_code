package string.q29;

import java.util.Stack;

public class Solution {
    public static void main(String args[]){
        String text = "ABABCABCC";
        String pattern = "ABC";
        int lastCount = 0;
        int total =0;

        Stack<Data> stack = new Stack<>();
        for(int i = 0;i<text.length();i++){
            if(text.charAt(i) == pattern.charAt(0)){
                lastCount=1;
                stack.add(new Data(text.charAt(i),lastCount));
            } else if( pattern.contains(Character.toString(text.charAt(i)))){
                if(lastCount== pattern.indexOf(text.charAt(i))){
                    lastCount++;
                    stack.add(new Data(text.charAt(i),lastCount));
                } else {
                    lastCount = 0;
                    stack.add(new Data(text.charAt(i),lastCount));
                }
            }else {
                lastCount = 0;
                stack.add(new Data(text.charAt(i),lastCount));
            }
            if(lastCount == pattern.length()){
                total++;
                for(int j = 0;j<pattern.length();j++){
                    stack.pop();
                }
                if(stack.isEmpty()){
                    lastCount = 0;
                }else {
                    lastCount = stack.peek().level;
                }
            }
        }
        System.out.println(total);
    }
}
