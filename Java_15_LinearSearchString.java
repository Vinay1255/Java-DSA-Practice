package DSA_Learning;

public class Java_15_LinearSearchString {
	public static void main(String[] args) {
		String name = "Vinay";
		char target = 'n';
		
		System.out.println(linearSearch(name, target));
		System.out.println(linearSearch2(name, target));
	}
	
//Program 1
//	Search a char in String
	static boolean linearSearch(String str, char target) {
		if(str.length() == 0) {
			return false;
		}
		
		for (int i = 0; i < str.length(); i++) {
			if(target == str.charAt(i)) {
				return true;
			}
		}
		
		return false;
	}
	
//Program 2
//	Search a char in String using for each loop
	static boolean linearSearch2(String str, char target) {
		if(str.length() == 0) {
			return false;
		}
		
		for (char ch : str.toCharArray()) {
			if(ch == target) {
				return true;
			}
		}
		
		return false;
	}
}
