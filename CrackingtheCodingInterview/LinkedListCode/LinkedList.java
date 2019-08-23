package LinkedListCode;

public class LinkedList {
	
	Node head; 
	
	static class Node {
		int data; 
		Node next;
		
		public Node (int d) {
			data = d;
			next = null;
		}
	}
	
	public static LinkedList insert(LinkedList list , int data) {
		//Create node object
		Node new_node = new Node(data);
		new_node.next = null;
		
		if(list.head == null) 
			list.head = new_node;
		else
		{
			Node last = list.head;
			while(last.next!=null) 
				last = last.next;
			
			last.next = new_node;			
		}
		
		return list;		
	}
	
	public static void printList(LinkedList list) {
		
		Node current = list.head;
		while(current!=null) {
			System.out.print(current.data+" ");
			current = current.next;			
		}
		System.out.println();
	}
	
	public static LinkedList removeNodeByPos(LinkedList list , int pos) {
	
		if(pos == 0) {
			System.out.println("Removing node at head");
			list.head = list.head.next;
			return list;
		}
		else {
			Node current = list.head;
			int count = 0;
			while(current.next!=null) {
				if(count == pos - 1) {
					current.next = current.next.next;
					return list;
				}
				else {
					count++;
					current = current.next;
				}
			}
		}
		System.out.println("Node not found");
		return list;
		
	}
	
	public static LinkedList removeNodeByKey(LinkedList list , int key) {
		if(list.head.data == key) {
			System.out.println("Node found at head!");
			list.head = list.head.next;
			return list;
		}
		else
		{
			Node current = list.head;
			while( current.next!=null ) {
				if(current.next.data == key) {
					current.next = current.next.next;
					return list;
				}
				else
					current = current.next;
			}
		}
		System.out.println("Node not found");
		return list;
		
	}
	
	public static void main (String[] args) {
		LinkedList list = new LinkedList();
		
		list = insert(list, 3);
		list = insert(list, 5);
		list = insert(list, 10);
		list = insert(list, 4);
		list = insert(list, 9);
		
		printList(list);
		
		list = removeNodeByKey(list,5);
		System.out.println("Removing node with key = 5");
		printList(list);
		
		list = removeNodeByPos(list, 3);
		System.out.println("Removing node at pos = 3");
		printList(list);
				
	}

}
