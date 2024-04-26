package kadai2;

import java.util.Scanner;

public class CheckPassword2 {

	public static void main(String[] args) {
//		Step9：パスワードの入力を受け付けます。while文を利用して「him
//		itu」が入力された場合は「ログインできました」と出力します。間違
//		えた場合は「再入力してください」と出力し、再入力をさせて下さ
//		い。

		
		Scanner scan1 = new Scanner (System.in);
		
		String a  ;
		
		System.out.print("パスワードを入力して下さい：");
		a = scan1.next();
		
		if(a.equals("himitu")) {
			System.out.println("ログインできました");
		}else {
		
		do {System.out.print("再入力して下さい：");
		a = scan1.next();
			
		}while(! a.equals("himitu"));
		
		System.out.println("ログインできました\n"
				+ "");
		
	
		}
		

	}

}
