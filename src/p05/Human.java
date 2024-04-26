package p05;

public class Human {
	//メソッドの定義
	void eat(int money) {
		System.out.println(money +"円貰ったので、");
		System.out.println( "叙々苑で食べる");
	}
	void eat(String bento) {
		System.out.println(bento +"貰ったので、");
		System.out.println( "食べる");
	}

	void eat() {
		System.out.println("自腹で食べる");
	}


}
