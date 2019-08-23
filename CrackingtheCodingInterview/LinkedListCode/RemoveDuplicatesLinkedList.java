package LinkedListCode;

import LinkedListCode.LinkedList;
import LinkedListCode.LinkedList.Node;


public class RemoveDuplicatesLinkedList {

	public static void main(String[] args) {
		
		LinkedList list = new LinkedList();
		
		list = LinkedList.insert(list, 3);
		list = LinkedList.insert(list, 5);
		list = LinkedList.insert(list, 6);
		list = LinkedList.insert(list, 1);
		list = LinkedList.insert(list, 17);
		list = LinkedList.insert(list, 92);
		list = LinkedList.insert(list, 19);
		list = LinkedList.insert(list, 4);
		list = LinkedList.insert(list, 39);
		
		LinkedList.printList(list);
		System.out.println("Second to last element in the list = "+findKthtoLastElement(list, 0));

	}
	
	public static int findKthtoLastElement(LinkedList list , int k) {
		
		Node fast = list.head;
		Node slow = list.head;
		
		while(k!=0) {
			fast = fast.next;
			k--;
		}
		
		while(fast.next!=null) {
			fast = fast.next;
			slow = slow.next;
		}
		
		return slow.data;
	
	}

}
