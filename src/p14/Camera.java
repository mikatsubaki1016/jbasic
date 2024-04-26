package p14;

public class Camera {
	//フィールド
	private String maker;//メーカー

	//コンストラクタ
	public Camera() {
		
		
	}
	public Camera(String maker ) {
		this.maker=maker;
	}


	//アクセッサ・メソッド
	public void takePicture() {
		System.out.println("電話番号：" + maker);
		System.out.println("撮影中です！");
	}

	//メソッド
	public String getMaker() {
		return maker;
	}

	public void setMaker(String maker) {
		this.maker = maker;
	}

}
