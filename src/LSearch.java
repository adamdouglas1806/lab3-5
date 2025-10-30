public class LSearch {


	private class Node {
		private Entry value;
		private Node nextNode;

		public Node(Entry v) {
			value = v;
			nextNode = null;
		}

		public Entry getValue() {
			return value;
		}

		public Node getNextNode() {
			return nextNode;
		}

		// Sets the NextNode to the given Node
		public void setNextNode(Node n) {
			nextNode = n;
		}
	}

	// Holds a reference to the head of the list
	private Node headNode;

	public LSearch() {
		headNode = null;
	}

	public void addAtHead(Entry e) {
		Node newNode = new Node(e); 
		newNode.setNextNode(headNode); 
		headNode = newNode; 
	}
	
	/*
	 * Part 3: complete
	 */	
	/**
	 * Uses linear search to look up a given name in the catalogue and returns the
	 * number if the name is in the catalogue. Otherwise it returns -1.
	 * 
	 * Where N is the number of entries in the catalogue the (worst case) complexity is:
	 *
	 * O(N)
	 * 
	 * Because: The loop will continue to repeat until the end of the linked list. This means that the longer the linked list the more calculations will be required
	 * and the code compile time will increase.
	 *  
	 * @param name is the person name to look for in the catalogue
	 * @return the number of that person, otherwise -1 to indicate an error
	 */
	public int linearSearch(String name){
		// your code
		boolean found = false;
		//New variable which will be used to check if a name was found.
		Node current = headNode;
		//New variable which represents the current head of the linked list.
		Node position = null;
		//New variable which will be used to identify the position of the name and number in the linked list.
		
		while (current != null) {
			//A while loop which will continue to loop until the head is pointing towards null/the end of the list.
			if (current.getValue().getName().equals(name)) {
				//A condition which checks if the current node is equal to the passed through name.
				found = true;
				//If the condition is met then found will be set to true.
				position = current;
				//If the condition is met then the position is set to current (the current head).
			}
			current = current.getNextNode();
			//Current (the current head) is set to the next node in the linked list.
		}
		
		if (found == true) {
			//A condition which checks if found is equal to true/if a name was found.
			return position.getValue().getNumber();
			//If the condition is met then the code will return an integer value which is the number associated with the passed through name.
		}
		return -1;
		//If the condition was not met then -1 is returned.
	}
}
