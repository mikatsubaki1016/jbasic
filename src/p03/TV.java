package p03;

public class TV {
	//フィールド（ﾒﾝﾊﾞ変数の定義）
	int ch; //チャンネル

	//メソッドの定義
	void changeChannel(int c) {
		ch = c;
	}

	void displayChannnel() {
		System.out.println("チャンネル：" + ch);
	}

}
