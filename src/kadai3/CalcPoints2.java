package kadai3;

import java.util.Scanner;

public class CalcPoints2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		System.out.print("購入金額：");
		int price = scan.nextInt();
		System.out.println("1:プレミア会員, 2:無料会員");
		System.out.print("会員ランク：");
		int rank = scan.nextInt();
		// 会員ランクによる判定
		scan.close();
		
		a(price,rank);


	}
	// ポイント計算メソッド

	static void a(int x,int y) {
		if(y==1) {
			String b ="プレミア会員";
		System.out.println(b  +"には" + (x*1/5) + "ポイント付与されます");
		}
		else {
			String b ="無料会員";
			System.out.println(b  +"には" + (x*1/10) + "ポイント付与されます");
		}
	}
	
	

}
