/**
* Generic node interface to store data in a linked list (each node is an object with 
* pointers).
*/

public interface ListNode<T> {

	/**
	* Returns the contents of a node.
	*/
	T getContents();
	
	/**
	* Sets the next node.
	*/	
	void setNext(ListNode<T> node);
	
	/**
	* Sets the previous node.
	*/
	void setPrevious(ListNode<T> node);
	
	
	/**
	* Returns the next node.
	*/
	ListNode<T> getNext();
	
	/**
	* Returns the previous node.
	*/
	ListNode<T> getPrevious(); 
	
	/**
	* Sets the contents of a node.
	*/
	void setContents(T contents);
	
}
	
