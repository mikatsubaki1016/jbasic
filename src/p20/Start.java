package p20;

public class Start {

	public static void main(String[] args) {
		//インスタンスを生成不可
		Controller c = new Controller;
		
		Controller[] list = { new Baseball(), new Mario() };

		for (Controller l : list) {
			l.pushA();
			l.pushB();
			System.out.println("===");
		}

	}

}
