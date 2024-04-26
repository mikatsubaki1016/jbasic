package kadai1add;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		Scanner scan1 = new Scanner (System.in);
		System.out.print("国語の点数を入力してください:");
		int i= scan1.nextInt();
		
		Scanner scan2 = new Scanner (System.in);
		System.out.print("数学の点数を入力してください：");
		int j= scan2.nextInt();
		
		Scanner scan3 = new Scanner (System.in);
		System.out.print("英語の点数を入力してください：");
		int k= scan3.nextInt();
		
		
		
	double s =(int )i+j+k;
		
	
			System.out.println("平均は" + s/3 + "点です");
		
	}

	}


