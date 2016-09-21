package ctci;
public class OneAway {
	public static void main(String args[]){
		String string1 = "pale";
		String string2 = "pakes";
		String string3 = "pales";
		String string4 = "bake";
		boolean result1 = check(string1, string2);
		boolean result2 = check(string1, string3);
		boolean result3 = check(string1, string4);
		System.out.println("It is "+result1+" for "+string1+" and "+string2);
		System.out.println("It is "+result2+" for "+string1+" and "+string3);
		System.out.println("It is "+result3+" for "+string1+" and "+string4);
	}
	public static boolean check(String s1, String s2){
		int l1 = s1.length();
		int l2 = s2.length();
		if(l1 == l2){
			int count = 0;
			for(int i = 0;i < l1; i++){
				char c1 = s1.charAt(i);
				char c2 = s2.charAt(i);
				if(c1 != c2){
					count++;
				}
				if(count > 1){
					return false;
				}
			}
		}
		else if(l1 > l2){
			return s1.toLowerCase().contains(s2.toLowerCase());
		}
		else { //l1 < l2
			return s2.toLowerCase().contains(s1.toLowerCase());
		}
		return false;
	}
}