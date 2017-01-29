package ctci.LinkedListProblems;

import java.util.Scanner;

/**
 * Created by sanjanabadam on 1/28/17.
 */
public class DeleteMiddleNode {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Node head = new Node();
        System.out.println("Enter the number of nodes");
        int len = scan.nextInt();
        System.out.println("Enter the values");
        head.setData(scan.nextInt());
        Node newNode = head;
        int lastValue = head.getData();
        for(int i = 1; i < len; i++){
        	Node n = new Node(scan.nextInt());
        	newNode.setNext(n);
        	newNode = n;
        	if(i == len - 1){
        		lastValue = n.getData();
        	}
        }

        int i = 0;
        Node temp = head;
        while(i < len){
        	System.out.println(temp.getData());
        	temp = temp.getNext();
        	i++;
        }
        System.out.println("Creating the linkedlist is done. Now enter a middle value you wish to delete.");
        int valueToDelete = scan.nextInt();
        while(valueToDelete == head.getData() || valueToDelete == lastValue){
        	System.out.println("You need to enter a middle value to delete.");
        	valueToDelete = scan.nextInt();
        }
        temp = head.getNext();
        while(temp.getData() != valueToDelete){
        	temp = temp.getNext();
        }
        boolean success = deleteMiddle(temp);
        if(success){
        System.out.println("Successfully Deleted. The current linkedlist is : ");
        i = 0;
        temp = head;
        while(i < len-1){
        	System.out.println(temp.getData());
        	temp = temp.getNext();
        	i++;
        }
    }

    }

    public static boolean deleteMiddle(Node n){
    	Node temp = n;
    	while(temp.getNext() != null){
    		Node newNode = temp.getNext();
    		temp.setData(newNode.getData());
    		temp = temp.getNext();
    	}
    	temp.setNext(null);
    	return true;
    }
}
















