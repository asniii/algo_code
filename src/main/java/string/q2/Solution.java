package string.q2;

public class Solution {

    public static void main(String args[]){
        String input = "The quick brown fox jumps over the lazy dog ";

        int arr[] = new int[26];

        input = input.toLowerCase();

        //System.out.println(input);
        char arr1[] = input.toCharArray();
        for(int i = 0;i<input.length();i++){
            if(arr1[i]>=97 && arr[1] <= 122){
                arr[arr1[i]-97] = arr[arr1[i]-97]+1;
            }
        }

        boolean check = true;

        for(int i = 0;i<26;i++){
            //System.out.println(arr[i]);
            if(arr[i]<1){
                check = false;
            }
        }
        System.out.println(check);

    }

}
