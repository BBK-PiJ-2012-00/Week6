public class DoublyLinkedListImpl<T> implements DoublyLinkedList<T> { 
	private ListNode<T> head;
	private ListNode<T> tail;
	private ListNode<T> traverse;
	
	public ListNode<T> getHead() {
		return head;
	}
	
	public ListNode<T> getTail() {
		return tail;
	}		
	
	public void add(ListNode<T> object) {
		if (head == null) {
			head = object;
			tail = object;
		}
		else {
			tail.setNext(object);
			object.setPrevious(tail);
			tail = object;
		}
	}	

	public void remove(T contents) {
		traverse = head;
		int i;
		for (i = 0; i < ListNodeImpl.getCount(); i++) {
			if (traverse.getContents().equals(contents)) {
				remove(traverse);
				break;
			}
			else if (traverse.getNext() != null) {
				traverse = traverse.getNext();
			
			}
			else {
				System.out.println("Item to delete not found.");
			}
		}
	}
	
	public void remove(ListNode<T> object) { //Diagnostics in comments.
		//System.out.println(head.getContents()); 
		//System.out.println(tail.getContents());
		//System.out.println(tail.getPrevious());
		if (object.getPrevious() == null) {
			//System.out.println("Entered head deletion.");
			head = object.getNext();
			object.getNext().setPrevious(null);
			object.setNext(null);
			ListNodeImpl.decCount();
		}
		else if (object.getNext() == null) {
			//System.out.println("Entered tail deletion.");
			tail = object.getPrevious();
			object.getPrevious().setNext(null);
			object.setPrevious(null);
			ListNodeImpl.decCount();
		}
		else {
			//System.out.println("Entered middle deletion.");
			object.getNext().setPrevious(object.getPrevious());
			object.getPrevious().setNext(object.getNext());
			ListNodeImpl.decCount();
		}
	}
	
	public void print() {
		traverse = head;
		if (head == null) {
			System.out.println("The list is empty.");
		}
		else while (traverse != null) {		
			System.out.println(traverse.getContents());
			traverse = traverse.getNext();
		}		
	}	
	
}

/**
	public void removeContents(T contents) { 	// Allows user to delete a node referencing contents.
		if (traverse.getContents().equals(contents)) {
			traverse.setContents(null);
		}
		else {
			traverse = traverse.getNext();
			removeContents(contents);
		}
	}
	*/
	
	/**
	public void sweepList() {	//Allows deletion of node by referencing contents: contents is set to null by removeContents(), list is then swept to delete nodes with null contents.
		while (traverse.getNext() != null) {
			if (traverse.getContents() == null) {
			remove(traverse);
			traverse = traverse.getNext();
			}
			else {
				traverse = traverse.getNext();
			}
		}
	}
	*/
			
			
	

	