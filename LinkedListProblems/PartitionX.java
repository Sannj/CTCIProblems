package ctci.LinkedListProblems;

import java.util.Scanner;

/**
 * Created by sanjanabadam on 9/21/16.
 */
public class PartitionX {
    public static void main(String args[]) {
        LinkedList newList = new LinkedList();
        newList.add(3);
        newList.add(5);
        newList.add(8);
        newList.add(5);
        newList.add(10);
        newList.add(2);
        newList.add(1);
        newList.printList();
        Scanner scan = new Scanner(System.in);
        int partition = scan.nextInt();
        newList = partitionLinkedList(newList, partition);
        newList.printList();
    }

    public static LinkedList partitionLinkedList(LinkedList ll, int partition) {
        int size = ll.size();
        int highindex = 0;
        int lowindex = 0;
        int flag = 1;
        while (flag == 1) {
            for (int i = highindex; i < size; i++) {
                int val = ll.get(i);
                if (val >= partition) {
                    highindex = i;
                    break;
                }
            }
            int j;
            for (j = lowindex; j < size; j++) {
                int val = ll.get(j);
                if (val < partition) {
                    lowindex = j;
                    break;
                }

            }
            if(j == size){
                flag = 0;
                break;
            }
            if (highindex < lowindex) {
                int temp = ll.get(highindex);
                ll.remove(highindex+1);
                ll.insert(ll.get(lowindex-1), highindex+1);
                ll.insert(temp, lowindex+1);
                ll.remove(lowindex+2);

            }
        }
        return ll;
    }
}

