package kadai1add;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		Scanner scan1 = new Scanner(System.in);
		System.out.print("国語の点数を入力してください:");
		int i = scan1.nextInt();

		Scanner scan2 = new Scanner(System.in);
		System.out.print("数学の点数を入力してください：");
		int j = scan2.nextInt();

		Scanner scan3 = new Scanner(System.in);
		System.out.print("英語の点数を入力してください：");
		int k = scan3.nextInt();

		if (i > j && i > k) {
			System.out.println("最高点は国語で" + i + "点です");
		} else if (j > i && j > k) {
			System.out.println("最高点は数学で" + j + "点です");
		} else if (k > j && k > i) {
			System.out.println("最高点は英語で" + k + "点です");
		} else if (i == j && j== k) {
			System.out.println("最高点は国語と数学と英語で" + i + "点です");
		} else if (i == j && i > k) {
			System.out.println("最高点は国語と数学で" + i + "点です");
		} else if (i > j && i == k) {
			System.out.println("最高点は国語と英語で" + i + "点です");
		} else if (i < j && j == k) {
			System.out.println("最高点は数学と英語で" + j + "点です");
		}

	}

}
