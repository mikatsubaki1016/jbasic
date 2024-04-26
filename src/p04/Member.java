package p04;

public class Member {
	//フィールド（ﾒﾝﾊﾞ変数の定義）
	String myGoal; //個人の目標
	static String teamGoal; //チームの目標(staticフィールド)

	//メソッドの定義
	void displayGoal() {
		System.out.println("個人の目標：" + myGoal);
		System.out.println("チームの目標：" + teamGoal);
		
		System.out.println("-------------");
	}
	
	static void test() {
		System.out.println("tsubaki");
		displayGoal();
	}

}
