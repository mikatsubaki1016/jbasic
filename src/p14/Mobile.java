package p14;

public class Mobile extends Camera {
	//フィールド
	private String telNo;//電話番号

	//コンストラクタ
	public Mobile() {
		

	}

	public Mobile(String telNo, String maker) {
		super(maker);
		this.telNo = telNo;
//		setMaker(maker);

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
