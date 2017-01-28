package ctci.ArraysStrings;

import java.util.Scanner;

/**
 * Created by sanjanabadam on 1/28/17.
 */
public class StringCompression {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String inputString = scan.nextLine();
        int len = inputString.length();
        String resultString = "";
        char prevChar = inputString.charAt(0); 
        int count = 1;
        resultString += prevChar;
        char currentChar = inputString.charAt(0);
        for(int i = 1; i < len; i++){
        	currentChar = inputString.charAt(i);
        	if(prevChar == currentChar){
        		count++;
        	}
        	else{
        		resultString += count;
        		resultString += currentChar;
        		prevChar = currentChar;
        		count = 1;
        	}
        }
        if(prevChar == currentChar){
        	resultString += count;
        }
        int resultLen = resultString.length();
        if(len <= resultLen){
        	System.out.println(inputString);
        }
        else{
        	System.out.println(resultString);
        }
    }
}
