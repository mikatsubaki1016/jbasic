package p02;

public class Start {

	public static void main(String[] args) {
		//１，Humanクラスを操作するリモコン(参照変数)の宣言
		//クラス名　参照変数名;
		//Human h;

		//2,Humanクラスを元にインスタンスを生成して
		//  リモコンで操作ができる状態にする
		//参照変数名 = new クラス名();
		//h = new Human();
		
		//1と2を同時に行う
		//クラス名　参照変数名＝new クラス名();
		Human h = new Human();
		
		//Humanクラスのフィールド名」に値を設定
		//参照変数名.フィールド名
		h.name = "椿実佳";
		h.age = 22;
		
		//Humanクラスのメソッドを呼び出して実行
		//参照変数名.メソッド名([実引数,/・・・]);
		h.introduce();
		h.walk();
		h.eat();
	}

}
