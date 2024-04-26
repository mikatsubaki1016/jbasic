package kadai2add;

import java.util.Scanner;

public class CheckString2 {

	public static void main(String[] args) {
		
		Scanner scan1 = new Scanner (System.in);
		
		System.out.print("1つ目の文字列を入力してください：");
		String a = scan1 .next();
		
		Scanner scan2 = new Scanner (System.in);
		
		System.out.print("2つ目の文字列を入力してください：");
		String b = scan2 .next();
		
		
		
	if(a.equals(b)) {
		System.out.println("2つの文字列は同じです");
	}else {
		System.out.println("2つの文字列は異なります");
	}

	}

}
