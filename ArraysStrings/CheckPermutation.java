package ctci.ArraysStrings;
import java.io.*;
import java.util.HashMap;

public class CheckPermutation {
	public static void main(String args[]){
		String string1 = "aaaaaaaaaaaaaabq";
		String string2 = "ab";
		HashMap<Character, Integer> hm = new HashMap<>();
		int l1 = string1.length();
		int l2 = string2.length();
		int flag = 0;
		if(l1 > l2){
			char[] target = string1.toCharArray();
			for(char c : target){
				if(hm.containsKey(c)){
					int val = hm.get(c);
					hm.put(c,++val);
				}
				else
				hm.put(c,1);
			}
			for(int j = 0; j < l2; j++){
				char c = string2.charAt(j);
				if(hm.containsKey(c)){
					int val = hm.get(c);
					if(val < 0){
						flag = 1;
						break;
					}
					hm.put(c, --val);
				}
				else {
					flag = 1;
				break;
			}
			}

		}
		else {
			char[] target = string2.toCharArray();
			for(char c : target){
				if(hm.containsKey(c)){
					int val = hm.get(c);
					hm.put(c,++val);
				}
				else
				hm.put(c,1);
			}
						for(int j = 0; j < l1; j++){
				char c = string1.charAt(j);
				if(hm.containsKey(c)){
					int val = hm.get(c);
					if(val < 0){
						flag = 1;
						break;
					}
					hm.put(c, --val);
				}
				else {
					flag = 1;
				break;
			}
			}
		}

		if(flag == 1){
			System.out.println("No");
		}
		else
			System.out.println("Yes");

	}
}