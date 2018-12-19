package string.q6;

import java.util.PriorityQueue;

public class Solution {
    public static void main(String args[]){
        String input = "aaabaaacddd";

        int arr[] = new int[26];

        input = input.toLowerCase();


        char arr1[] = input.toCharArray();
        for(int i = 0;i<input.length();i++){
            if(arr1[i]>=97 && arr[1] <= 122){
                arr[arr1[i]-97] = arr[arr1[i]-97]+1;
            }
        }

        PriorityQueue<point>  pq = new PriorityQueue<point>((s1,s2)-> {return s2.freq-s1.freq;});

        for(int i = 0;i<26;i++){
            //System.out.println(arr[i]);
            if(arr[i]>=1){
                pq.add(new point((char)(i+97),arr[i]));
            }

        }
        String str ="";

        point prev =null;
        while(pq.isEmpty()!=true){
            point a = pq.poll();
            if(a.freq>0) {
                str = str + a.ch;
                if(prev!=null){
                    pq.add(prev);
                }
                a.freq = a.freq-1;
                prev = a;
            }

        }
        if(input.length() == str.length()) {
            System.out.println(str);
        } else {
            System.out.println("not possible");
        }
    }
}
