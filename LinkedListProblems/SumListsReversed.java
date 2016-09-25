package ctci.LinkedListProblems;

/**
 * Created by sanjanabadam on 9/21/16.
 */
public class SumListsReversed {
    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();
        LinkedList l2 = new LinkedList();
        l1.add(9);
        l1.add(7);
        l1.add(8);
        l2.add(6);
        l2.add(8);
        l2.add(5);
        LinkedList ll  = add(l1,l2);
        ll.printList();
    }

    public static LinkedList add(LinkedList l1, LinkedList l2){
        LinkedList result = new LinkedList();
        l1.printList();
        l1.reverse();
        l2.reverse();
        l1.printList();
        int carry = 0;
        int i = 0;
        int len1 = l1.size();
        while(i < len1 ){
            int val1 = l1.get(i);
            int val2 = l2.get(i);
            int val = val1+val2+carry;
            if(val1+val2+carry > 9){
                carry = 1;
                val = val - 10;
            }
            result.add(val);
            i++;

        }
        if(carry == 1){
            result.add(carry);
        }
        result.reverse();
        return result;
    }
}
