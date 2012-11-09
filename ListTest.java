import org.junit.*;
import static org.junit.Assert.*;

	public class ListTest {
		@Test
		public void testsAdd() {
			DoublyLinkedList<Integer> l = new DoublyLinkedListImpl<Integer>();
			int inputItem = 5;
			l.add(inputItem);
			int outputItem = l.getTail();
			int expectedItem = inputItem;
			assertEquals(outputItem, expectedItem);
		}
		
		/**
		@Test
		public void testsRemove() {
			DoublyLinkedList<Integer> l = new DoublyLinkedListImpl<Integer>();
			int inputItem1 = 7;
			int inputItem2 = 9;
			l.add(inputItem1);
			l.add(inputItem2);
			l.remove(inputItem2);
			int outputItem = l.getTail();
			int expectedItem = inputItem1;
			assertEquals(outputItem, expectedItem);
		}
		*/
		
}
		
		
		
		
		
		

		
		
		
		