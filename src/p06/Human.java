package p06;

public class Human {
	//フィールド（ﾒﾝﾊﾞ変数の定義）
	String name; //名前
	int age; //年齢
	
	//コンストラクタの定義

	public Human() {
		
	}
	public Human(String name, int age) {
		this.name = name;
		this.age = age;
	}


	//コンストラクタの定義 戻り値を定義しない
	//	public Human(){
	//		System.out.println("コンストラクタです");
	//	}

	//	Human(String name, int age) {
	//		this.name = name;
	//		this.age = age;
	//
	//	}

	//メソッドの定義
	void introduce() {
		System.out.println("名前： " + name);
		System.out.println("年齢：" + age);
	}


}
