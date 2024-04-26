package p11;

public class Mobile extends Camera{
	//フィールド
	String telNo;//電話番号
	
	//メソッド
	void talk() {
		System.out.println("メーカー："+telNo);
		System.out.println("話し中です！");
	}

}
