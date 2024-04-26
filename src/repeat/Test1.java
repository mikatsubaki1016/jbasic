package repeat;
import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner (System.in);
		
		System.out.println("国語の点数を入力してください：");
		int kokugo = scan.nextInt();
		
		System.out.println("数学の点数を入力してください：");
		int sugaku = scan.nextInt();
		
		System.out.println("英語の点数を入力してください：");
		int eigo = scan.nextInt();
		
		System.out.println("平均は" +(kokugo + sugaku + eigo)/3+"点です");

	}

}
