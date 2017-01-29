package ctci.LinkedListProblems;

import java.util.Scanner;

/**
 * Created by sanjanabadam on 1/28/17.
 */
public class Palindrome {
	static Node head;
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        head = new Node();
        System.out.println("Enter the number of nodes");
        int len = scan.nextInt();
        System.out.println("Enter the values");
        head.setData(scan.nextInt());
        Node newNode = head;
        for(int i = 1; i < len; i++){
            Node n = new Node(scan.nextInt());
            newNode.setNext(n);
            newNode = n;
        }

        int i = 0;
        Node temp = head;
        while(i < len){
            System.out.println(temp.getData());
            temp = temp.getNext();
            i++;
        }
        System.out.println("Creating the linkedlist is done. Now checking if it is a palindrome.");
        checkPalindrome(head);
        if(recursiveCheckPalindrome(head)){
        	System.out.println("It is a palindrome");
        }
        else{
        	System.out.println("Not a palindrome");
        }
    }

    public static void checkPalindrome(Node n){
    	Node temp = n;
    	String values = "";
    	while(temp != null){
    		values += temp.getData();
    		temp = temp.getNext();
    	}
    	StringBuffer buffer = new StringBuffer(values);
      	buffer.reverse();
      	if(values.equals(buffer.toString())){
      		System.out.println("It is a palindrome");
      	}
      	else{
      		System.out.println("Not a palindrome");
      	}
    }
    static Node left;
    public static boolean recursiveCheckPalindrome(Node n){
    	left = head;

    	if(n==null){
    		return true;
    	}

    	boolean res2 = recursiveCheckPalindrome(n.getNext());
    	if(res2 == false){
    		return false;
    	}
    	boolean res1;
    	if(n.data == left.data){
    		res1 = true;
    	}
    	else{
    		res1 = false;
    	}
    	left = left.getNext();

    	return res1;
    }














}
