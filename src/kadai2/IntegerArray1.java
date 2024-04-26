package kadai2;

public class IntegerArray1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		//Step3：「1, 7, 2, 7, 3」の要素をもつ整数の配列numbersを生成し、
		//拡張for文を利用してすべての値を出力しなさい
		
		int [] array;
		
		array = new int [5];
		
		array[0] = 1;
		array[1] = 7;
		array[2] = 2;
		array[3] = 7;
		array[4] = 3;
		
		for (int i = 0 ; i < 5 ; i++) {
			System.out.println(array[i]);
		}
		

	}

}
