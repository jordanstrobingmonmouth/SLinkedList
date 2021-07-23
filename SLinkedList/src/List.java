public class List {

	protected Node head; //head node of the list
	protected Node tail; //points to the last node of the list
	protected long size; //number of nodes in the list

	//Default constructor that creates an empty list
	public List(){
		head = null;
		tail = null;
		size = 0;
	}

	// ... add, update, search, delete, display methods go here ...

	public void addFirst(String s){
		//step 1: create a new node out of s
		Node n = new Node(s);
		
		if (head == null) {
			tail = n;
			head = n;
		}

		//step 2: store head to the new node n, by assigning head to the next of n
		n.setNext(head); // equals n.next = head;

		//step 3: make the new node head
		head = n;

		size++;
	}

	public void addLast(String s){
		Node temp = head;

		//step 1: create a node out of s
		Node n = new Node(s);

		//take care of empty list
		if (head == null) {
			head = n;
			size++;
			return;
		}


		//step 2: store the new node's address to the current last node in the list
		//2.1: find the tail's address
		while (temp.getNext() != null) {
			temp = temp.getNext();
		}
		//exit while loop with temp being the tail
		// 2.2: store the new node's address to the current last node in the list
		temp.setNext(n); 

	}
	
	public void addLastWithTail(String s) {
		Node n = new Node(s);
		
		if (head == null) {
			head = n;
			tail = n;
		}
		else {
			tail.setNext(n);
			tail = n;
		}
		
		size++;
		
		
		
	}

	public void addAfterHead(String s) {

		Node n = new Node(s);

		if (head == null) {
			head = n;
			tail = n;
			size++;
			return;
		}

		//step 1: get the second node's address and save it
		Node secondNode = head.getNext();

		//step 2: link head to the new node
		head.setNext(n);

		//step 3: link new node to second node
		n.setNext(secondNode);

		size++;

	}

	public void deleteHead() {
		
		// get 3rd node: head.getNext().getNext();
		// delete 3rd node: second.setNext(fourth);
		// find second to last: temp.getNext().getNext() while temp != null
		

		if (head == null) {
			return;
		}      

		head = head.getNext();

		size--;
	}

	public void deleteTail() {
		Node temp = head;

		if (head == null) {
			return;
		}
		else if (head.getNext() == null) {
			head = null;
			size--;
			return;
		}


		while (temp.getNext().getNext() != null) {
			temp = temp.getNext();
		}
		
		temp.setNext(null);
		tail = temp;
		size--;

	}
	
	public void swap() {
		
		Node temp = head;
		
		while (temp.getNext().getNext() != null) {
			temp = temp.getNext();
		}
		
		tail.setNext(head.getNext());
		temp.setNext(head);
		head.setNext(null);
		
		temp = head;
		head = tail;
		tail = temp;
		
	}


	public void display() {
		Node temp = head; 
		

		while (temp != null) {
			System.out.println(temp.getElement()); //temp.element
			temp = temp.getNext(); //temp.next
		}
	}
}
