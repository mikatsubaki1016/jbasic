package p01;

public class Sample20 {

	public static void main(String[] args) {

		//配列の宣言と領域の確保とデータの設定
		//データ型[][]　配列名　＝　new データ型[階の数][部屋の数]
		String[][] canon = {
				{"田中","遠藤","椿"},
				{"薄い","菊水","木村","深沢","本間"}
		};
		
//		canon[0][0] = "田中";
//		canon[0][1] = "遠藤";
//		canon[0][2] = "椿";
//		canon[1][0] = "薄い";
//		canon[1][1] = "菊水";
//		canon[1][2] = "木村";
		
		System.out.println(canon[0][0]);
		System.out.println(canon[0][1]);
		System.out.println(canon[0][2]);
		System.out.println(canon[1][0]);
		System.out.println(canon[1][1]);
		System.out.println(canon[1][2]);
		System.out.println(canon[1][3]);
		System.out.println(canon[1][4]);
		
		System.out.println(canon.length); //要素数（フロア数）
		System.out.println(canon[0].length); //要素数（0階の部屋数）
		System.out.println(canon[1].length); //要素数（1階の部屋数）

	}

}