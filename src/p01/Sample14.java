package p01;

public class Sample14 {

	public static void main(String[] args) {
		int data = 1;

		//switch
		switch (data) {
		case 1:
			System.out.println("1desu");
			break;
		case 2:
			System.out.println("2desu");
			break;
		case 3:
			System.out.println("3desu");
			break;
		default:
			System.out.println("無し");
			break;

		}
		
		//if

		if (data == 1) {
			System.out.println("1desu");

		} else if (data == 2) {
			System.out.println("2desu");

		} else if (data == 3) {
			System.out.println("3desu");

		} else {
			System.out.println("無し");

		}
	}
}
