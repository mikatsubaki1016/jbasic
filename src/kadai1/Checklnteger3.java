package kadai1;

import java.util.Scanner;

public class Checklnteger3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("数字を入力して下さい：");
		int i = scan.nextInt();


		

		if (i<0 || 130<i) {
			System.out.println("0～130で入力してください");
		} 
		 else {
			System.out.println("正しい年齢です\n"
					+ "");
		}

	}

}
