package ctci.LinkedListProblems;

import java.util.HashMap;

/**
 * Created by sanjanabadam on 9/21/16.
 */
public class RemoveDuplicateValues {

    public static void main(String[] args) {
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
        //System.out.println(newList.get(7));
        newList = remove(newList);
        newList.printList();

    }

    public static LinkedList remove(LinkedList ll){
        int s = ll.size();
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i = 0; i < s ; i++){
            int key = ll.get(i);
            if(hm.containsKey(key)){
                ll.remove(i+1);
            }
            else{
                hm.put(key, i);
            }
        }
        return ll;
    }

}
