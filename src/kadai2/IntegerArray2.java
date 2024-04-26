package kadai2;

public class IntegerArray2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		//Step6：「1, 7, 2, 7, 3」の要素をもつ整数の配列numbersを生成し、
		//拡張for文を利用してすべての値の合計値を計算し出力しなさい
		
		int [] array={1, 7, 2,7,3};
		
//		array = new int [5];
//		
//		array[0] = 1;
//		array[1] = 7;
//		array[2] = 2;
//		array[3] = 7;
//		array[4] = 3;
		
		int sum = 0;
		
		for (int i  : array) {
			sum +=i;
		}
			System.out.println("合計：" + sum);
		
		

	}

}
