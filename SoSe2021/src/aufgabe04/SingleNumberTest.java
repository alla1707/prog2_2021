package aufgabe04;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SingleNumberTest {

	int [] nums = {5,1,2,1,2};
	int [] nums1 = {1,2,1,2};
	int [] nums2 = {1};
	
	
	@Test
	void testSingleNumber(){
		
		assertTrue(1==SingleNumber.singleNumber(nums2),"Input: [1] Expected output: 1");
		assertTrue(5==SingleNumber.singleNumber(nums),"Input: [5,1,2,1,2] Expected output: 5");
		assertTrue(-1==SingleNumber.singleNumber(nums1),"Input: [1,2,1,2] Expected output: -1");
		assertFalse(6==SingleNumber.singleNumber(nums), "Input: [5,1,2,1,2] Expected output: 5");	
		assertEquals(5, SingleNumber.singleNumber(nums), "Input: [5,1,2,1,2] Expected output: 5");
	}
	
}

