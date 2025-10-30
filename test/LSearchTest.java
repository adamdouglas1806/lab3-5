import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class LSearchTest {

	LSearch ls;
	/*
	 * Part 1: complete unit tests
	 */
	
	@Before
	public void setup(){
		ls = new LSearch();
		// doesn't have to be ordered!
		ls.addAtHead(new Entry("Andrew",111));
		ls.addAtHead(new Entry("Ewen",321));
		ls.addAtHead(new Entry("Peter",123));
		ls.addAtHead(new Entry("Roger",222));
		
	}
	
	@Test
	public void testLinearSearchOK() {
		// test the linear search method for someone who's in the collection
		LSearch l = new LSearch();
		//Creating a new instance of the class LSearch.
		assertEquals("This person is in the collection", 123, l.linearSearch("Peter"));
		//Tests if Peter is in the list by using a linear search. The expected result is 123 and the checked result is the number associated with peter entry.
	}

	@Test
	public void testLinearSearchFail() {
		// test the linear search method for someone who's not in the collection
		LSearch l = new LSearch();
		//Creating a new instance of the class LSearch.
		assertEquals("This person is in the collection", -1, l.linearSearch("Adam"));
		//Tests if Adam is not in the list by using a linear search. The expected result is -1 and it will try to check for an entry with the name Adam associated.
	}

}
