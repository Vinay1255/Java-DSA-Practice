package DSA_Learning;

import java.util.Arrays;

public class Java_26_String {
	public static void main(String[] args) {
//		String a = "Vinay";
//		String b = "Vinay";
//		String c = new String("Vinay");
//		
//		System.out.println(a);
//		System.out.println(b);
//		System.out.println(c);
//		
//		System.out.println(a==b);
//		System.out.println(a==c);
//		System.out.println(b==c);
//		System.out.println(b.equals(c));
//		System.out.println(Arrays.toString(new int[] {1, 2, 3, 4}));
		
//		String series = "";
//		
//		for (int i = 0; i < 26; i++) {
//			char ch = (char)('a' + i);
//			series += ch;
//		}
//		
//		System.out.println(series);
		
//		String name = "Vinay";		
//		System.out.println(Arrays.toString(name.toCharArray()));
//		System.out.println(name.toLowerCase());
//		System.out.println(name.toUpperCase());
//		System.out.println(name.charAt(0));
//		System.out.println(name.concat(" Singh"));
//		System.out.println(name.indexOf('a'));
//		System.out.println(name.replace('n', 'j'));
//		System.out.println("   shadev     ".strip());
//		
//		String fullName = "Vinay Singh";
//		System.out.println(Arrays.toString(fullName.split(" ")));
		
		String check = ",.,";
		String ans = checkPalindrom(check);
		System.out.println(ans);
	}
	
	static String checkPalindrom(String s) {
		if(s == null || s.length() == 0) {
			return "Yes it,s Palindrom";
		}
		
		s = s.toLowerCase();
		int i = 0;
		int j = s.length() - 1;
		
		while(i < j) {
			if(s.charAt(i) == s.charAt(j)) {
				i++;
				j--;
			}
			else {
				return "It,s not Palindrom";
			}
		}
		
		return "Yes it,s Palindrom";
	}
	
}
