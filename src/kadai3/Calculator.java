package kadai3;

public class Calculator {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int a = add(3, 7);
		System.out.println(a);
		int b = sub(3, 7);
		System.out.println(b);
		
		double c = avg(3, 7);
		System.out.println(c);

	}
	// 足し算メソッドを作りなさい
	static int add(int x, int y) {
		return x + y;
	}
	
	// 引き算メソッドを作りなさい
	static int sub(int x, int y) {
		return x - y;
	}
	// 平均値メソッドを作りなさい
	static double avg(int x, int y) {
		return (x + y)/2;
	}


	

}
