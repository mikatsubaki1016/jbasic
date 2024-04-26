package p12;

public class Camera {
	//フィールド
//	protected ＝　同じパッケージ内
	protected String maker;//メーカー

	//コンストラクタ
	public Camera() {
		
		System.out.println("Cameraコンストラクタ1");
	}
	public Camera(int a ) {
		System.out.println("Cameraコンストラクタ2");
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
