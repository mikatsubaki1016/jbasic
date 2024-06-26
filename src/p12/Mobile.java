package p12;

public class Mobile extends Camera {
	//フィールド
	private String telNo;//電話番号

	//コンストラクタ
	public Mobile() {

	}

	public Mobile(String telNo, String maker) {
		this.telNo = telNo;
		super.maker = maker;
	}

	//アクセッサ・メソッド
	public void talk() {
		System.out.println("メーカー：" + telNo);
		System.out.println("話し中です！");
	}

	//メソッド
	public String getTelNo() {
		return telNo;
	}

	public void setTelNo(String telNo) {
		this.telNo = telNo;
	}

}
