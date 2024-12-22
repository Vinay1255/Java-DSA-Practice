package DSA_Learning;

public class Java_34_Recursion {
	public static void main(String[] args) {
		
//		Recursion1(5);
		
//		Recursion2(5);
		
//		Recursion3(5);
		
//		System.out.println(Factorail(5));

//		System.out.println(SumOfN(10));
		
//		System.out.println(SumOfDigits(966789));
		
//		System.out.println(MultiplyingOfDigits(12345));
		
//		PassingNumber(5);
		
//		ReverseNumber1(1234);
//		
//		System.out.println(sum);
		
//		System.out.println(ReverseNumber2(1234));
		
//		System.out.println(palindrom(12321));
		
//		System.out.println(CountZeros(100040, 0));
		
		System.out.println(NoOfSteps(41, 0));
		
	}
	

// Function 1 -> Print number n to 1 using Recursion
	static void Recursion1(int n) {
		
		if(n == 0) {
			return;
		}
		
		System.out.println(n);
		
		Recursion1(n - 1);
	}
	
// Function 2 -> Print number 1 to n using Recursion
	static void Recursion2(int n) {
		
		if(n == 0) {
			return;
		}
		
		Recursion2(n - 1);
		
		System.out.println(n);
	}
	
// Function 3 -> Print number n to 1 and 1 to n using Recursion
	static void Recursion3(int n) {
		
		if(n == 0) {
			return;
		}
		
		System.out.println(n);
		
		Recursion3(n - 1);
		
		System.out.println(n);
	}
	
// Function 4 -> Print factorail of a number 
	
	static int Factorail(int n) {
		if(n <= 1) {
			return 1;
		}
		
		return n * Factorail(n - 1);
	}
	
	
// Function 5 -> Sum of n to 1
	static int SumOfN(int n) {
		if(n == 0) {
			return 0;
		}
		
		return n + SumOfN(n - 1);
	}
	
	
// Function 6 -> Sum of Digits
	static int SumOfDigits(int n) {
		if(n == 0) {
			return 0;
		}
		
		return SumOfDigits(n / 10) + n % 10;
	}
	

// Function 7 -> Multiplying of Digits
	static int MultiplyingOfDigits(int n) {
		if(n % 10 == n) {
			return n;
		}
		
		return MultiplyingOfDigits(n / 10) * (n % 10);
	}
	
	
// Function 8 -> Passing numbers
	static void PassingNumber(int n) {
		if(n == 0) {
			return;
		}
		
		System.out.println(n);
		
		PassingNumber(--n);
	}
	

// Function 9 -> Reverse of a number
	
	static int sum = 0;
	
	static void ReverseNumber1(int n) {
		
		if(n == 0) {
			return;
		}
		
		int rem = n % 10;
		
		sum = sum * 10 + rem;
		
		ReverseNumber1(n / 10);
		
	}
	
	static int ReverseNumber2(int n) {
		
		int digits = (int) (Math.log10(n)) + 1;
		
		return helper(n, digits);
		
	}


	static int helper(int n, int digits) {
		if(n % 10 == n) {
			return n;
		}
		
		int rem = n % 10;
		
		return rem * (int) (Math.pow(10, digits - 1)) + helper(n / 10, digits -1);
	}
	

// Function 10 -> Check Palindrom Number
	static boolean palindrom(int n) {
		return n == ReverseNumber2(n);
	}
	
	

// Function 11 -> Count zeros 
	static int CountZeros(int n, int zeros) {
		if(n % 10 == n) {
			return zeros;
		}
		
		if(n % 10 == 0) {
			return CountZeros(n / 10, ++zeros);
		}
		else {
			return CountZeros(n / 10, zeros);
		}
	}
	
	
// Function 12 -> Count devide no of step
	static int NoOfSteps(int n, int steps) {
		if(n == 0) {
			return steps;
		}
		
		if(n % 2 == 0) {
			return NoOfSteps(n / 2 , ++steps);
		}
		else {
			return NoOfSteps(n - 1, ++steps);
		}
	}
	
}








