package string.q31;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Solution {
    public static void main(String args[]){
        String str = "aaab";
        int k = 2;
        Map<Character,Integer> map = new HashMap<>();
        int a[] = new int[26];
        for(int i = 0;i<str.length();i++){
            a[str.charAt(i)-97]++;
        }
        PriorityQueue<Data> priorityQueue = new PriorityQueue<>((s1,s2)->s2.freq-s1.freq);
        for(int i = 0;i<26;i++){
            priorityQueue.add(new Data((char)(97+i),a[i]));
        }

        for(int i = 0;i<k;i++){
            Data d = priorityQueue.poll();
            d.freq = d.freq -1;
            priorityQueue.add(d);
        }
        long ans = 0;
        while(!priorityQueue.isEmpty()){
            Data d = priorityQueue.poll();
            ans += d.freq * d.freq;
        }

        System.out.println(ans);
    }
}
