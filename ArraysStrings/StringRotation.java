package ctci.ArraysStrings;
public class StringRotation {
	public static void main(String args[]){
		String s1 = "water";
		String s2 = "rewat";
		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();
		int l1 = s1.length();
		int flag = 0;
		int l2 = s2.length();
		if(l1 != l2){
			System.out.println("False");
			return;
		}
		else{
			for(int i = 0; i< l1; i++){
				if(s1.equals(s2)){
					flag = 1;
					break;
				}
				s1 = rotate(s1, l1);
			}
		}
		if(flag == 0){
			System.out.println("False");
		}
		else
			System.out.println("True");
	}

	public static String rotate(String s, int l1){
		char[] c = s.toCharArray();
		char temp = c[0];
		for(int i = 1; i < l1; i++){
			char t = c[i];
			c[i] = temp;	// temp  - w
			temp = t;
			  // wwterbottle
		}
		c[0] = temp;
		return String.valueOf(c);
	}
}