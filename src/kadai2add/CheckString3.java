package kadai2add;

import java.util.Scanner;

public class CheckString3 {

	public static void main(String[] args) {
		//		Step3：キーボードから繰り返し回数（整数）を入力します。繰り返し
		//		処理の中で文字列をキーボードから入力し、それらを連結していくプロ
		//		グラムを作成しなさい。

		Scanner scan4 = new Scanner(System.in);

		System.out.print("繰り返す回数を入力してください：");
		int d = scan4.nextInt();

		String c = "";

		for (int i = 1; i <= d; i++) {

			System.out.print(i + "つ目の文字列を入力してください：");

			Scanner scan1 = new Scanner(System.in);
			String a = scan1.next();

			 c += a;

			System.out.println(c );
		}

	}

}
