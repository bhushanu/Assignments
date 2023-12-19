
public class MissingNumber {

	public static int findMissing(int[] nums) {
		
		int[] numbers = {1,2,3,4,5,7,8,9};
		int n = numbers.length + 1;
		
		int expectedSum = (n*(n+1))/2;
		
		int actualSum = 0;
		for(int num : numbers) {
			actualSum += num;
		}
		
		return expectedSum - actualSum;
	}

}
