package kadai2add;

import java.util.Scanner;

public class CheckString1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.print("文字列を入力してください：");
		String a = scan .next();
		
		int count = 0;
		
		for(char b :a.toCharArray()) {
			count++;
		}
		
		System.out.println("文字列の長さは" +count+"です");

	}

}
