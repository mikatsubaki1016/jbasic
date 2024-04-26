package p13;

public class Mobile extends Camera{
	//フィールド
	private String telNo;//電話番号
	
	//コンストラクタ
	public Mobile() {
		super();
		System.out.println("Mobileコンストラクタ");
		
	}
	public Mobile(String telNo,String Maker) {
		super();
		this.telNo=telNo;
		System.out.println("Mobileコンストラクタ");
		
	}

	
	
	//アクセッサ・メソッド
	public void talk() {
		System.out.println("メーカー："+telNo);
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
