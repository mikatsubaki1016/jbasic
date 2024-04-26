package kadai3;

import java.util.Scanner;

public class UserRegistration2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		System.out.print("名前を入力してください：");
		String name = scan.next();
		if (hasNameError(name)) {
			// 名前にエラーが存在した場合mainメソッドを終了する
			scan.close();
			return ;
		}
		System.out.print("年齢を入力してください：");
		int age = scan.nextInt();
		if (hasAgeError(age)) {
			// 年齢にエラーが存在した場合mainメソッドを終了する
			scan.close();
			return;
		}
		System.out.println("名前：" + name + "、年齢：" + age + "で登録しました。");
		scan.close();

	}

	// 名前エラーチェックメソッドを作りなさい
	static boolean hasNameError(String x) {
		if (x.equals("admin")) {
			System.out.println("利用できない名前です");
			return true;

		} else if (x.contains("㌔")) {
			System.out.println("名前に禁止文字が含まれています");
			return true;
		}
		else if (x.length()>20) {
			System.out.println("名前は20文字以内で入力してください\n"
					+ "");
			return true;
		}
		return false;
	}

	// 年齢エラーチェックメソッドを作りなさい
	static boolean hasAgeError(int y) {
		if (y < 0 || 130 <= y) {
			System.out.println("年齢は0以上130以下で入力してください\n"
					+ "");
			return true;
		}
		return false;
	}

}
