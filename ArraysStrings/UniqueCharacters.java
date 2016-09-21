package ctci.ArraysStrings;

import java.util.Arrays;

/**
 * Created by sanjanabadam on 7/11/16.
 */
public class UniqueCharacters {
    public static void main(String args[]){
        String target = "abcdef";
        boolean[] arr = new boolean[26];
        Arrays.fill(arr,false);
        int flag = 0;
        for(int i = 0;i<target.length();i++){
            int position = ((int)target.charAt(i)-97);
            if(true==arr[position]){
                flag = 1;
            break;
            }
            else
                arr[position] = true;

        }
        if(flag == 0){
            System.out.println("Unique");
        }
        else
            System.out.println("Not unique");
    }
}
