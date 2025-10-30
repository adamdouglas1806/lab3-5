public class ASearch {


	private Entry[] catalogue;
	private int current;
	
	/*
	 * Assume 10 entries
	 */
	public ASearch(){
		catalogue = new Entry[10];
		current = 0;
	}
	
	/*
	 * Ignores adding if full (should really be handled by exception...)
	 */
	public void addEntry(Entry e){
		if(current < 10){
			catalogue[current++] = e;
		}
	}
	
	/*
	 * Part 2: complete implementation
	 */
	/**
	 * Uses linear search to look up a given name in the catalogue and returns the
	 * number if the name is in the catalogue. Otherwise it returns -1.
	 * 
	 * Where N is the number of entries in the catalogue the (worst case) complexity is:
	 *
	 * O(N)
	 * 
	 * Because: If the element we wanted to find was at the very end of the array then we would have to go through every element in the array. Meaning that the larger
	 * the array then the longer it will take to compile and calculate.
	 *  
	 * @param name is the person name to look for in the catalogue
	 * @return the number of that person, otherwise -1 to indicate an error
	 */
	public int linearSearch(String name){
		// your code
		boolean found = false;
		//Setting up a variable to check if the name has been found in the list.
		int position = 0;
		//Setting up the value which will hold the position of the name.
		
		for (int i = 1; i < current; i++) {
			//A for loop which will continue to loop as long as i is less then the current.
			if (catalogue[i].getName().equals(name)) {
				//Checks if the current indentation of catalogue is equal to the name which was passed through.
				found = true;
				//If the condition is met then change the found variable to true to indicate the name is in the list.
				position = i;
				//If the condition is met then the indentation will be stored to the variable position which will store the position where the name is in the array.
			}
		}
		
		if (found == true) {
			//Checks if the name was found in the linear search.
			return catalogue[position].getNumber();
			//If the condition is met then the number in the entry will be returned.
		}else {
			return -1;
			//Otherwise -1 will be returned if no name was found.
		}
	}

	/*
	 * Part 4: complete implementation
	 */
	/**
	 * Uses binary search to look up a given name in the catalogue and returns the
	 * number if the name is in the catalogue. Otherwise it returns -1.
	 * 
	 * Where N is the number of entries in the catalogue the (worst case) complexity is:
	 *
	 * O(log N)
	 * 
	 * Because: The time it takes to compile the code will be affected by the size of the array since more calculations will be required. However, the program cuts the
	 * size of array in half by each time which means there will be less steps when compared to the previous linear search, making the program more efficient.
	 *  
	 * @param first the array index of the start of search space
	 * @param last the array index of the end of the search space
	 * @param name the person name being searched for
	 * @return the persons phone number if their name is found or -1 otherwise
	 */
	private int binarySearch(int first,int last,String name){
		// your code		
		if (first > last) {
			return -1;
		}
		//Base case to stop the recursive function from infinite recursive.
		
		int middle = (first + (last - first) / 2);
		//The variable middle will represent the current middle of the binary search.
		
		if (catalogue[middle].getName().compareTo(name) < 0) {
			//A condition to check if the middle is smaller then the target.
			return binarySearch((middle + 1), last, name);
			//If the condition is met then the function will call itself but set the first to be the current middle + 1.
		}else if (catalogue[middle].getName().compareTo(name) > 0) {
			//A condition to check if the middle is larger then the target.
			return binarySearch(first, (middle - 1), name);
			//If the condition is met then the function will call itself but set the last to be the current middle - 1.
		}else if (catalogue[middle].getName().compareTo(name) == 0) {
			//A condition to check if the middle position is the position the target is located at.
			return catalogue[middle].getNumber();
			//If the condition is met then the number at the middle position will be returned.
		}else {
			return -1;
			//If the name does not exist then -1 is returned.
		}
	}

	// helper method exposed to the programmer
	public int binarySearch(String name){
		return binarySearch(0,current-1,name);
	}
	
	
}
