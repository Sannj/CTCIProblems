package ctci;

public class URLify {

	public static void main(String args[]){
		String input = "My John Smith ";
		input = input.trim();
		int len = input.length();
		char[] cinput = new char[len];
		cinput = input.toCharArray();
		int count = 0;
		for(int i = 0; i < len ; i++){
			if(input.charAt(i) == ' '){
				count++;
			}
		}
		int k = len - 1;
		char[] result = new char[len+(2*count)];
		for(int i = len+(2*count) - 1; i > -1 ; i--){
			if(cinput[k] == ' '){
				result[i] = '0';
				result[i-1] = '2';
				result[i-2] = '%';
				i = i - 2;
			}
			else{
				result[i] = cinput[k];
			}
			k--;
		}

		System.out.println(result);


	}

}