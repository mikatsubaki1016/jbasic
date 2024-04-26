package p17;

public class Start {

	public static void main(String[] args) {
		Human h;

		h = new Oku();
		h.name = "奥";
		h.age = 22;
		h.eat();
		
		Oku o = (Oku) h;
		o.cook();

		h = new Kudo();
		h.name = "工藤";
		h.age = 20;

		System.out.println();
		h.eat();
		//		h.listenMusic();
	}

}
