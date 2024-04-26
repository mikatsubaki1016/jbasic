package kadai4;

public class Item {
	
	// フィールド（名前と価格を定義する）
//	商品名（name）：文字列
	String name;
//	価格（price）：整数
	int price;
	
	// 情報出力用showInfo()メソッド
	void showInfo() {
		
		
		System.out.println("名前："+ name);
		System.out.println("価格：" + price);
		
		System.out.println("価格：" + price*11/10);
	};

}
