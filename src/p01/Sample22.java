package p01;

public class Sample22 {

	public static void main(String[] args) {
		String[] canon = {"田中","遠藤","椿"};
		
		for(int i = 0; i < canon.length; i++) {
			System.out.println(canon[i]);
		}
		
		//拡張for文→：
		for(String s : canon) {
			System.out.println(s);
		}
	

	}

}