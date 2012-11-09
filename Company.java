public class Company {
			
	DoublyLinkedList<String> employees = new DoublyLinkedListImpl<String>();
	DoublyLinkedList<Integer> niNumbers = new DoublyLinkedListImpl<Integer>();
	
	
	public void createNode(String name) {
		ListNode<String> newNode = new ListNodeImpl<String>(name);
		employees.add(newNode);
	}	
	
	public void createNode(int number) {
		ListNode<Integer> newNode = new ListNodeImpl<Integer>(number);
		niNumbers.add(newNode);
	}
	
	public static void main(String[] args) {

	Company company = new Company();
	company.launch();
	
	}
	
	private void launch() {
		
		System.out.println("You can enter as many employees as you like. Please enter the employee's name followed by their National Insurance number.  To finish, type \"END\".");
		boolean finished = false;
		while (!finished) {
			System.out.println("Name: ");
			String name = System.console().readLine();
			if (name.equals("END")) {
				finished = true;
			}
			else {			
				System.out.println("NI Number: ");
				int ni = Integer.parseInt(System.console().readLine());
				createNode(name);
				createNode(ni);
			}		
		}
	
		System.out.println("Your employee list is as follows: ");
		employees.print();
		System.out.println("With the corresponding NI Numbers: ");
		niNumbers.print();		

		System.out.println("Please select an employee to remove: ");
		System.out.print("Name: ");
		String remove = System.console().readLine();
		employees.remove(remove);
		System.out.print("NI No.: ");
		int removeNI = Integer.parseInt(System.console().readLine());
		niNumbers.remove(removeNI);
		
		System.out.println("Your employee list is as follows: ");
		employees.print();
		System.out.println("With the corresponding NI Numbers: ");
		niNumbers.print();		
		
		
		
		
	}

	
		
		
		





/**
Once you have it ready, create a class Company that keeps two linked lists, one with the names of the employees
and one with their National Insurance Number.
*/

}