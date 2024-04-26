package p23;

public class Start {

	public static void main(String[] args) {
		
		
		Canon []c = {new Oku(),new Kudo()};
		for (Canon list:c) {
			list.work();
			list.salary();
			System.out.println();
		}

	}

}
