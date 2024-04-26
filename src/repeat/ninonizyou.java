package repeat;
import java.util. Scanner;
public class ninonizyou {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner (System.in);
		 int base = 2; // 底
		 System.out.print("指数：");
	        int exponent = scan.nextInt();
	        int result = 1; // 結果を格納する変数

	        for (int i = 1; i <= exponent; i++) {
	            result *= base;
	        }

	        System.out.println("2の" + exponent + "乗は " + result + "です。");
		

	}

}
