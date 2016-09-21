package ctci;

import java.util.HashMap;
import java.util.Map;

public class PalindromePermutation{
	public static void main(String args[]){
		String input = "Tact Coa";
		input = input.toLowerCase();
		HashMap<Character, Integer> hm = new HashMap<>();
		int len = input.length();
		int count = 0;
		for(int i = 0; i<len;i++){
			count++;
			char c = input.charAt(i);
			if(c == ' '){
				continue;
			}
			if(hm.containsKey(c)){
				int val = hm.get(c);
				hm.put(c,++val);
			}
			else
				hm.put(c,1);
		}
		int oCount = 0;
		for(Map.Entry<Character, Integer> e : hm.entrySet()){
			int val = e.getValue();
			if(val % 2 != 0){
				oCount++;
			}
		}
		if(oCount > 1){
			System.out.println("False");
		}
		else
			System.out.println("True");
	}
}