package ctci.ArraysStrings;
import java.io.*;
import java.util.HashMap;

public class UniqueCharactersWithHashMap{

	public static void main(String args[]){
		String target = "abcdefgha";
		char[] charTarget = target.toCharArray();
		HashMap<Character, Integer> hm = new HashMap<>();
		int i =1;
		int flag = 0;
		for(char c : charTarget){
			if(hm.containsKey(c) != false){
				flag = 1;
				break;
			}
			hm.put(c,i);
		}

		if(flag == 1){
			System.out.println("not unique");
		}
		else 
			System.out.println("unique");
	}

}