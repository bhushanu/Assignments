import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MissingNumberTest {

	@Test
	public void testFindMissing()
	{
		int[] nums = {1,2,3,4,5,7,8,9};
		
		int missingNum = MissingNumber.findMissing(nums);
		
		assertEquals(6, missingNum);
	}
}
