package kadai3add;

import java.util.Random;
import java.util.Scanner;

public class Game2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] array;
		String[] array1 = new String[3]; // 配列の初期化
		String p = randomer();
		for (int i = 0; i < p.length(); i++) {
			array1[i] = String.valueOf(p.charAt(i));
		}

		boolean judge = true;
		int count = 0;

		do {
			System.out.println(p);
			System.out.println("文字列を入力してください: ");
			String input = scanner.next();
			array = new String[input.length()];
			// 文字列の各文字を配列に格納
			for (int i = 0; i < input.length(); i++) {
				array[i] = String.valueOf(input.charAt(i));
			}

			// 配列の内容を出力
			for (int i = 0; i < array.length; i++) {
				System.out.println("配列の要素 " + i + ": " + array[i]);
			}
			judge = check(array1, array); // checkメソッドに適切な引数を渡す
			count++;
		} while (judge); // arrayではなくinputで判定
		
		System.out.println( count +"回で当たりました");

		scanner.close(); // Scannerをクローズ
	}

	static String randomer() {
		Random comrandom = new Random();
		StringBuilder result = new StringBuilder();

		for (int i = 0; i < 3; i++) {
			result.append(comrandom.nextInt(10)); // 0から9までの乱数を追加
		}

		return result.toString();
	}

	static boolean check(String[] x, String[] y) {
		int hit = 0;
		int brow = 0;

		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < y.length; j++) {
				if (i == j && x[i].equals(y[j])) {
					hit++;
				}
				if (i != j && x[i].equals(y[j])) {
					brow++;
				}
			}
		}
		System.out.println(hit + "ヒット・" + brow + "ブロー");

		boolean judge = true;
		if (hit == 3 && brow == 0) {
			judge = false;
		}
		return judge;
	}
}
