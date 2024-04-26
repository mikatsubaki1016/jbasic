package p11;

public class Start {

	public static void main(String[] args) {
		//Cameraクラスを継承したMobileクラス(サブ)のインスタンスを生成
		Mobile m = new Mobile();
		
		//フィールドとメソッドにアクセス
		m.telNo = "08084401175";
		m.maker="富士通";
		
		m.talk();
		m.takePicture();
	}

}
