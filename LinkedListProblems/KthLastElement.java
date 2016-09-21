package ctci.LinkedListProblems;

import java.util.Scanner;

/**
 * Created by sanjanabadam on 9/21/16.
 */
public class KthLastElement {

	public static void main(String args[]){
		LinkedList newList = new LinkedList();
        newList.add(5);
        newList.add(6);
        newList.add(7);
        newList.add(6);
        newList.add(8);
        newList.add(9);
        newList.add(10);
        newList.add(9);
        newList.insert(20, 1);
        newList.printList();
        Scanner scan = new Scanner(System.in);
        int k = scan.nextInt();
        int size = newList.size();
        if(k > size){
        	System.out.println("K value is out of bounds");
        }
        else{
        	System.out.println(newList.get(size-k));
        }
	}

}
