package DSA_Learning;

public class Java_28_StringBuilder {
	public static void main(String[] args) {
		StringBuilder builder = new StringBuilder();
		
		for (int i = 0; i < 26; i++) {
			char ch = (char)('a' + i);
			builder.append(ch);
		}
		
		System.out.println(builder.toString());
	}
}
