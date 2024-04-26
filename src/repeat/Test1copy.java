package repeat;

import java.util.Scanner;

public class Test1copy {

	static int kokugo;
	static int sugaku;
	static int eigo;

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		

		System.out.println("平均は" +  kamoku()+ "点です");

	}

	static int kamoku() {
		Scanner scan = new Scanner(System.in);
		System.out.println(kokugo + "の点数を入力してください：");
		kokugo = scan.nextInt();
		System.out.println(sugaku + "の点数を入力してください：");
		sugaku = scan.nextInt();
		System.out.println(eigo + "の点数を入力してください：");
		eigo = scan.nextInt();
		
		int i =(kokugo + sugaku + eigo) / 3 ;
		return i;
	}
}
