package DSA_Learning;

public class Java_30_AdvancePattern {
	public static void main(String[] args) {
		Pattern1(5);
		System.out.println();
		Pattern2(5);
		System.out.println();
		Pattern3(5);
		System.out.println();
		Pattern4(5);
		System.out.println();
		Pattern5(4);
		System.out.println();
		Pattern5B(4);
		System.out.println();
		Pattern6(5);
		System.out.println();
		
		
	}
	
	static void Pattern1(int n) {
		for (int i = 0; i < 2 * n; i++) {
			
			int countStar = i > n ? 2 * n - i : i;
			int countBlank = n - countStar;
			
			for (int j = 0;j < countBlank ; j++) {
				System.out.print(" ");
			}
			
			for (int j = 0; j < countStar; j++) {
				System.out.print("* ");
			}
			
			System.out.println();
		}
	}
	
	static void Pattern2(int n) {
		for (int i = 1; i <= n; i++) {
			
			for (int j = 0; j < n - i; j++) {
				System.out.print("  ");
			}
			
			for (int j = i; j >= 1; j--) {
				System.out.print(j + " ");
			}
			for (int j = 2; j <= i; j++) {
				System.out.print(j + " ");
			}
			
			System.out.println();
		}
	}
	
	
	static void Pattern3(int n) {
		for (int i = 1; i < 2 * n; i++) {
			int countRow = i > n ? 2 * n - i : i;
			int space = 2 * n - countRow * 2 - 1;
			
			for (int j = 0; j < countRow; j++) {
				System.out.print("*");
			}
			
			for (int j = 0; j <= space; j++) {
				System.out.print(" ");
			}
			
			for (int j = 0; j < countRow; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
	
	static void Pattern4(int n) {
		for (int i = 0; i < 2 * n; i++) {
			int c = i > n ? 2 * n - i : i;
			int space = n - c;
			
			for (int j = 0; j < space; j++) {
				System.out.print("  ");
			}
			
			for (int j = c; j > 0; j--) {
				System.out.print(j + " ");
			}
			
			for (int j = 2; j <= c; j++) {
				System.out.print(j + " ");
			}
			
			System.out.println();	
		}

	}
	
	static void Pattern5(int n) {
		n = n * 2;
		
		for (int i = 0; i <= n; i++) {
			for (int j = 0; j <= n; j++) {
				int atEveryIndex = Math.max(Math.max(i, j), Math.max(n - i, n - j)) - n / 2;
				System.out.print(atEveryIndex + " ");
			}
			
			System.out.println();
		}
	}
	
	static void Pattern5B(int n) {
		n = n * 2;
		
		for (int i = 1; i < n; i++) {
			for (int j = 1; j < n; j++) {
				int atEveryIndex = Math.max(Math.max(i, j), Math.max(n - i, n - j)) - n / 2;
				System.out.print(atEveryIndex + 1 + " ");
			}
			
			System.out.println();
		}
	}
	
	static void Pattern6(int n) {
		for (int i = 0; i <= 2 * n; i++) {
			int space = i > n ? 2 * n - i : i;
			int atEveryIndex = n - space;
			
			for (int j = 0; j <= atEveryIndex; j++) {
				System.out.print("*");
			}
			
			for (int j = 0; j < space; j++) {
				System.out.print("  ");
			}
			
			for (int j = 0; j <= atEveryIndex; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
}
