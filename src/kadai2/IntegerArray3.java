package kadai2;

public class IntegerArray3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		//Step7：「1, 7, 2, 7, 3」の要素をもつ整数の配列numbersを生成し、
		//拡張for文を利用して「7」がいくつ存在したかを出力しなさい
		
		int [] array={1, 7, 2,7,3};
		
		int count = 0;
		
		for (int i  : array) {
			if(i==7)
			count ++;
		}
			System.out.println(count + "個ありました");
		
		

	}

}
