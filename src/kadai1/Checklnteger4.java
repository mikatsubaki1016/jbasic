package kadai1;

import java.util.Scanner;

public class Checklnteger4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("数字を入力して下さい：");
		int i = scan.nextInt();


		

		if ( i>=0 && i%2==0) {
			System.out.println("正の偶数です");
		}  else if ( i%2==1) {
			System.out.println("正の奇数です");
		}  else if ( i%2==-1) {
			System.out.println("負の奇数です");
		} 
		 else {
			System.out.println("負の偶数です");
		}
		
		/*int data ;
		String judge1 = data >=0 ? "":"";
		String judge2 = data >=0 ? "":"";*/
		

	}

}
