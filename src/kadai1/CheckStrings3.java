package kadai1;

import java.util.Scanner;

public class CheckStrings3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.print("名前：");
		String i= scan.next();
		
	
		
		if(i.length()>20) {
			System.out.println("20文字以内で入力してください");
		}else {
			System.out.println("ようこそ" + i +"さん");
		}

	}

	


	}


