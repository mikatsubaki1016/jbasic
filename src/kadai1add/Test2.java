package kadai1add;

import java.util.Scanner;

public class Test2 {

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
		
		
		

			
			
			if(i>=80 && j>=75 && k>=70) {
				System.out.println("合格です");
			}else {
				System.out.println("不合格です");
			}
		
	}

	}


