package kadai4add;

public class Convert {
	static void reverse(int c) {
		char[] moji = String.valueOf(c).toCharArray();
		
		for (int i = moji.length - 1; i >= 0; i--) {
			System.out.print(moji[i]);
		}
		
		System.out.println();

	}

	static void reverse(double c) {
char[] moji = String.valueOf(c).toCharArray();
		
		for (int i = moji.length - 1; i >= 0; i--) {
			System.out.print(moji[i]);
		}
		
		System.out.println();
		

	}

	static void reverse(String c) {
		for (int i = c.length() - 1; i >= 0; i--) {
			System.out.print(c.charAt(i));
		}

	}

}
