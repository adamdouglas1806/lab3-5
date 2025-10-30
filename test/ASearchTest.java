import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ASearchTest {

	ASearch as;
	/*
	 * Part 1: complete unit tests
	 */
	@Before
	public void setup(){
		as = new ASearch();
		as.addEntry(new Entry("Andrew",111));
		as.addEntry(new Entry("Ben", 543));
		as.addEntry(new Entry("Bob", 278));
		as.addEntry(new Entry("Brian", 419));;
		as.addEntry(new Entry("Ewen",321));
		as.addEntry(new Entry("Peter",123));
		as.addEntry(new Entry("Roger",222));
		
	}
	
	@Test
	public void testLinearSearchOK() {
		// test the linear search method for someone who's in the collection
		assertEquals("This person is in the collection", 123, as.linearSearch("Peter"));
		/*Test to make sure peter is in the list. It will call the linearSearch method in the ASearch class.
		 *The expected return result is 123 and it will check the number that is in the same entry at "Peter".
		 */
	}

	@Test
	public void testLinearSearchFail() {
		// test the linear search method for someone who's not in the collection
		assertEquals("This person is not in the collection", -1, as.linearSearch("Rob Stewart"));
		//Test to check if Rob Steward is not in the list. The expected return is -1 and it will check the result of the linearSearch method in ASearch class.
	}
	
	@Test
	public void testBinarySearchOK() {
		// test the binary search method for someone who's in the collection
		assertEquals("This person is in the collection", 111, as.binarySearch("Andrew"));
		//Test to check if Andrew is in the list. The expected result is 111 and it will check for the number in the same entry as Andrew. It will use the BianrySearch method in ASearch class.
	}
	
	@Test
	public void testBinarySearchFail() {
		// test the binary search method for someone who's not in the collection
		assertEquals("This person is not in the collection", -1, as.binarySearch("Stewart Rob"));
		//Test to check if Steward Rob is not in the list. The expected return is -1 and it will check the result of the BinarySearch method in ASearch class.
	}
	
	@Test
	public void testBinarySearchBen() {
		assertEquals(543,as.binarySearch("Ben"));
	}
	
	@Test
	public void testBinarySearchBob() {
		assertEquals(278,as.binarySearch("Bob"));
	}
	
	@Test
	public void testBinarySearchBrian() {
		assertEquals(419,as.binarySearch("Brian"));
	}

}
