package ctci.LinkedListProblems;


public class LinkedList {

	Node head;
	int counter = 0;
	Node end;
	
	 LinkedList(){
		 head = null;
		 end = null;
	 }

	 public int size(){
		 int count = 0;
		 Node temp = head;
		 while(temp!= null){
			 count++;
			 temp = temp.next;
		 }
		 return count;
	 }

	 public int get(int i){
		 Node temp = head;
		 int index = 0;
		 while(temp!=null){
			 if(index == i){
				 return temp.data;
			 }
			 index++;
			 temp = temp.next;
		 }
		 return -1;
	 }

	public void add(int valToAdd){
		Node n = new Node(valToAdd);
		if(head == null){
			head = n;
			end = head;
			counter++;
			return;
		}
		else{
		end.next = n;
		end = end.next;
		counter++;
		}
	}
	
	public void printList(){
		if(head == null){
			System.out.println("Empty list");
			return;
		}
		Node nn = head;
		while(nn != null){
			System.out.print(nn.data+" ");
			nn = nn.next;
		}
		System.out.println("");
	}
	
	public void remove(int pos){
		if(head == null){
			System.out.println("Empty list");
			return;
		}
		if(pos>counter||pos<1){
			System.out.println("Position out of bounds -"+pos);
			return;
		}
		if(pos == 1){
			head = head.next;
			counter--;
			return;
		}
		Node n = head;
		for(int i =0;i<pos-2;i++){
			n = n.next;
		}
		Node temp = n.next;
		n.next = temp.next;
		counter--;
	}
	
	public void insert(int DataToBeAdded, int pos){
		if(pos>counter||pos<1){
			System.out.println("Position out of bounds - "+pos+" could not insert " +DataToBeAdded );
			return;
		}
		if(pos == 1){
			Node n = new Node(DataToBeAdded);
			n.next = head;
			head = n;
			counter++;
			return;
		}
		Node n = head;
		for(int i =0;i<pos-2;i++){
			n = n.next;
		}
		Node nn = new Node(DataToBeAdded);
		nn.next = n.next;
		n.next = nn;
		counter++;
	}
	
	public void reverse(){
		if(head == null){
			System.out.println("Empty list");
			return;
		}
		Node lastNode = head;
		Node prev = new Node();
	//	prev.next = lastNode;
		Node n =head;
		Node temp = null;
		for(int i =0;i<counter;i++){
			prev.data = n.data;
			prev.next = temp;
			temp = prev;
			prev = new Node();
			n = n.next;
			
		}
		Node nn = temp;
		while(nn != null){
			//System.out.print(nn.data+" ");
			nn = nn.next;
		}
		
	}
	
	public static void main(String args[]){
		LinkedList newList = new LinkedList();
		newList.add(5);
		newList.add(6);
		newList.add(7);
		newList.add(8);
		newList.add(9);
		newList.add(10);
		newList.add(11);
		newList.insert(20, 1);
		newList.insert(40, 20);
		newList.printList();
		System.out.println("");
		newList.reverse();
		System.out.println("\n");
		
		newList.printList();
		
	}
	
	}
	

	
	
	
