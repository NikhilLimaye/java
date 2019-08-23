package LinkedListCode;

import LinkedListCode.LinkedList;
import LinkedListCode.LinkedList.Node;


public class PartitionList {

	public static void main(String[] args) {
		
		LinkedList list = new LinkedList();
		
		list = LinkedList.insert(list, 23);
		list = LinkedList.insert(list, 5);
		list = LinkedList.insert(list, 6);
		list = LinkedList.insert(list, 1);
		list = LinkedList.insert(list, 17);
		list = LinkedList.insert(list, 92);
		list = LinkedList.insert(list, 19);
		list = LinkedList.insert(list, 4);
		list = LinkedList.insert(list, 39);
		
		System.out.println("Original List - ");
		LinkedList.printList(list);
		
		
		list = partitionList(list, 23);
		System.out.println("Partitioned List - ");
		LinkedList.printList(list);
		
	}
	
	/*
	 * Create 2 linked Lists with values divided among them
	 * ListLeft has values smaller than pivot
	 * Merge both in the end
	 */
	public static LinkedList partitionList(LinkedList list , int pivot) {
		
		LinkedList listLeft = new LinkedList();
		LinkedList listRight = new LinkedList();
		
		Node current = list.head;		


		while(current!=null) {
			if(current.data >= pivot) {
				System.out.println("Adding to right "+current.data);
				listRight = LinkedList.insert(listRight , current.data);					
			}
			else {
				System.out.println("Adding to left "+current.data);	
				listLeft = LinkedList.insert(listLeft , current.data);	
			}
			current = current.next;
		}

		
		//merge lists
		Node headRight = listRight.head;
		Node currentLeft = listLeft.head;
		while(currentLeft.next!=null) {
			currentLeft = currentLeft.next;
		}
		currentLeft.next = headRight;
		return listLeft;		
	}

}
