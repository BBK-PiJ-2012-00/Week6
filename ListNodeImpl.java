public class ListNodeImpl<T> implements ListNode<T> { //Generic node class to store data in a list - just an object with pointers. Like KeyStore.
	private T contents;
	private ListNode<T> next;
	private ListNode<T> previous;
	private static int nodeCount;
	
	public ListNodeImpl(T value) {
		this.contents = value;
		this.next = null;
		this.previous = null;
		nodeCount++;
	}
	
	public static int getCount() {
		return nodeCount;
	}
	
	public static void decCount() {
		nodeCount--;
	}
	
	public T getContents() {
		return contents;
	}
	
	public ListNode<T> getNode(T contents) {
		return this;
	}
	
	public void setNext(ListNode<T> node) {
		this.next = node;
	}
	
	public void setPrevious(ListNode<T> node) {
		this.previous = node;
	}
	
	public ListNode<T> getNext() {
		return this.next;
	}
	
	public ListNode<T> getPrevious() {
		return this.previous;
	}
	
	public void setContents(T contents) {
		this.contents = contents;
	}
	
}
	
	
	
	
	