package kadai1;

import java.util.Scanner;

public class Checklnteger1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.print("数字を入力して下さい:");
		int i= scan.nextInt();
		
	
		
		if(i==7) {
			System.out.println("大当たり！");
		}else {
			System.out.println("ハズレ");
		}

	}

}


