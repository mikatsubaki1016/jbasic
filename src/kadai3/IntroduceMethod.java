package kadai3;

public class IntroduceMethod {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		introduce("田中太郎", 25);
		System.out.println("---");
		introduce("鈴木一郎", 30);

	}
	// 自己紹介と10年後の年齢を出力するメソッドを作りなさい
	
	static void introduce(String x,int y) {
		System.out.println(x + y+"歳です");
		System.out.println("10年後は"+ (y+10)+"歳です");
	}

	

}
