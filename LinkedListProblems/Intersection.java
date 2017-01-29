package ctci.LinkedListProblems;

import java.util.Scanner;

/**
 * Created by sanjanabadam on 1/28/17.
 */
public class Intersection {
	static Node list1 = new Node(1);
	static Node list2 = new Node(10);
	static Node list3 = new Node(20);
	public static void main(String args[]){
		createLinkedLists();
		printList(list1);
		printList(list2);
		printList(list3);
		Node result = checkForIntersection(list1, list2);
		if(result != null){
			System.out.println("List 1 and List 2 are intersecting at "+ result.getData());
		}
		else{
			System.out.println("List 1 and List 2 are not intersecting.");
		}
		result = checkForIntersection(list1, list3);
		if(result != null){
			System.out.println("List 1 and List 3 are intersecting at "+ result.getData());
		}
		else{
			System.out.println("List 1 and List 3 are not intersecting.");
		}
	}

	public static Node checkForIntersection(Node l1, Node l2){
		int len1 = findLengthOfTheList(l1);
		int len2 = findLengthOfTheList(l2);
		int finalLength = 0;
		if(len1 > len2){
			int diff = len1 - len2;
			int i = 0;
			while(i < diff){
				l1 = l1.getNext();
				i++;
			}
			finalLength = len2;
		}
		else if(len2 > len1){
			int diff = len2 - len1;
			int i = 0;
			while(i < diff){
				l2 = l2.getNext();
				i++;
			}
			finalLength = len1;
		}

		int i = 0;
		while(i < finalLength){
			if(!l1.equals(l2)){
				l1 = l1.getNext();
				l2 = l2.getNext();
			}
			else{
				return l1;
			}
			i++;
		}
        return null;
	}

	public static int findLengthOfTheList(Node head){
		int count = 0;
		while(head != null){
			count++;
			head = head.getNext();
		}
		return count;
	}

	public static void printList(Node head){
		while(head != null){
			System.out.println(head.getData());
			head = head.getNext();
		}
	}
	public static void createLinkedLists(){
		System.out.println("Creating 3 static lists. Creating list1.");
		int i = 2;
		Node n;
		Node temp = list1;
		Node intersectingNode = new Node(6);
		while(i < 6){
			n = new Node(i);
			temp.setNext(n);
			temp = temp.getNext();
			i++;
		}
		temp.setNext(intersectingNode);
		System.out.println("Creating list 2");
		i = 11;
		temp = list2;
		while(i < 16){
			n = new Node(i);
			temp.setNext(n);
			temp = temp.getNext();
			i++;
		}
		System.out.println("Creating list 3");
		i = 21;
		temp = list3;
		while(i < 23){
			n = new Node(i);
			temp.setNext(n);
			temp = temp.getNext();
			i++;
		}
		temp.setNext(intersectingNode);
		temp = temp.getNext();
		while(i < 26){
			n = new Node(i);
			temp.setNext(n);
			temp = temp.getNext();
			i++;
		}

	}
}
