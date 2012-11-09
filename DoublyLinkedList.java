public interface DoublyLinkedList<T> {

	/**
	* Puts a new object in the list.  
	*/
	void add(ListNode<T> object);	
	
	/**
	* Removes an object from the list by
	* referencing contents.
	*/
	void remove(T contents);
	
	/**
	* Fully removes a node from the list. Called
	* from the remove(T contents) method.
	*/
	void remove(ListNode<T> node);
	
	/**
	* Returns head of list.
	*/
	ListNode<T> getHead();
	
	/**
	* Returns tail of list.
	*/
	ListNode<T> getTail();

	/**
	* Prints the contents of the list on the screen.
	*/
	void print();
	
}

	
	
	
/**
Modify the doubly-linked list that you have created in past weeks to make it generic, i.e. to allow it to have values
of its elements of any type. Use the TDD methodology (interface, test, production code, repeat. . . ).
Once you have it ready, create a class Company that keeps two linked lists, one with the names of the employees
and one with their National Insurance Number.
*/