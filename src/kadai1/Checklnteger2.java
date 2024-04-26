package kadai1;

import java.util.Scanner;

public class Checklnteger2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("xの値を入力してください：");
		int i = scan.nextInt();

		Scanner scan1 = new Scanner(System.in);
		System.out.print("yの値を入力してください：");

		int j = scan1.nextInt();

		if (i < j) {
			System.out.println("xはyより小さいです");
		} else if (i > j) {
			System.out.println("xはyより大きいです");
		} else {
			System.out.println("xとyは等しいです\n"
					+ "");
		}

	}

}
