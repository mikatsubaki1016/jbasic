package kadai2;

public class Introduce1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		//Step4：「ダンス、映画、バイク」の要素をもつ文字列の配列hobby
		//Listを生成し、拡張for文を利用してすべて出力しなさい
		
		String[] array = {"ダンス","映画","バイク" };
		
		System.out.println("私の趣味は、");
		
		//int i=0; i<array.length; i++
		for(String i: array) {
			System.out.println( "・"+ i);
		}
		System.out.println( "です");

	}

}
