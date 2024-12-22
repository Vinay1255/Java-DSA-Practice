package DSA_Learning;

public class Java_17_FindEven {
	public static void main(String[] args) {
		
		int nums[] = {4673, 234, 97, 56783, 36};
		
		int[][] nums2 = {
				{1, 2, 3},
				{9, 9, 9},
				{3, 2, 2},
				{8, 4, 6}
		};
		
		int ans1 = lengthEven(nums);
		System.out.println(ans1);
		
		int ans2 = maximumWealth(nums2);
		System.out.println(ans2);
		
	}
	
//Program 1
//	count the length of array is even 
	
	static int lengthEven(int nums[]) {
		int count = 0;
		
		for(int num : nums) {
			if(even(num)) {
				count++;
			}
		}
		
		return count++;
	}
	
	static boolean even(int num) {
		int numberOfDigit = digits(num);
//		int numberOfDigit = digits2(num);
		
		return numberOfDigit % 2 == 0;
	}
	
	static int digits(int num) {
		
		if(num < 0) {
			num = num *-1;
		}
		
		if(num == 0) {
			num = 1;
		}
		int count = 0;
		
		while(num > 0) {
			num = num / 10;
			count++;
		}
		
		return count;
	}
	
	static int digits2(int num) {
		if(num < 0) {
			num = num *-1;
		}
		
		if(num == 0) {
			num = 1;
		}
		return (int) (Math.log10(num)) + 1;
	}
	
	
//Program 2
//	Find max wealth of the array
	
	static int maximumWealth(int[][] accounts) {
		int ans = Integer.MIN_VALUE;
		for (int[] row : accounts) {
			
//			When you start a new col, take a new sum of that row 
			int sum = 0;
			for (int col : row) {
				sum += col;
			}
//			now we have sum of account this person
//			check with over all ans
			if(sum > ans) {
				ans = sum;
			}
		}
		
		return ans;
	}
	
}
