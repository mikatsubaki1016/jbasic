package kadai1;

import java.util.Random;

public class CheckRandom {

	public static void main(String[] args) {
		Random scan = new Random ();
		System.out.print("");
		int i= scan.nextInt(3) ;
		
	
		
		switch (i) {
		case 0 :
		System.out.println("グー");
		break;
		case 1 :
		System.out.println("チョキ");
		break;
		default  :
		System.out.println("パー");
		break;
		
		}
	}

	


	}


