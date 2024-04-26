package kadai2;

import java.util.Scanner;

public class Introduce2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		/*Step5：名前と趣味を登録できるプログラムを作成し、最後に自己紹
		介となるように出力してください。趣味は３つ登録を受け付けて配列
		に保存します。出力する際には拡張for文を利用して出力してくださ
		い。情報を登録します
		名前：田中太郎
		趣味1：ダンス
		趣味2：料理
		趣味3：Youtube鑑賞
		---
		こんにちは田中太郎です
		私の趣味は、
		・ダンス
		・料理
		・Youtube鑑賞
		です
		*/
		
		//String[] array = {"ダンス","映画","バイク" };
		
		//System.out.println("私の趣味は、");
		
		//int i=0; i<array.length; i++
		//for(int i=0; i<array.length; i++) {
			//System.out.println( "・"+ array[i]);
		//}
		//System.out.println( "です");
		System.out.println("情報を登録します");
		
		Scanner scan1 = new Scanner (System.in);
		System.out.print("名前：");
		String i= scan1.next();
		
		Scanner scan2 = new Scanner (System.in);
		System.out.print("趣味1：");
		String j= scan2.next();
		
		Scanner scan3 = new Scanner (System.in);
		System.out.print("趣味2：");
		String k= scan3.next();
		
		Scanner scan4 = new Scanner (System.in);
		System.out.print("趣味3：");
		String l= scan4.next();
		
		String[] syumi = {  j, k, l};
		System.out.println("---");
		System.out.println("こんにちは" + i + "です");
		
		for(String data : syumi) {
			System.out.println("・" +data);
			
		}
		System.out.print("です");
		
		

	}

}
