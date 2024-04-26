package p12;

public class Start {

	public static void main(String[] args) {
		//Cameraクラスを継承したMobileクラス(サブ)のインスタンスを生成
		Mobile m = new Mobile("08084401175", "富士通");

		//フィールドとメソッドにアクセス
		//		m.setTelNo("08084401175")  ;
		//		m.setMaker("富士通");
		//		
		m.talk();
		m.takePicture();
	}

}
