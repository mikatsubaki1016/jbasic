package p15;

public class Start {

	public static void main(String[] args) {
		Oku o = new Oku();
		o.name="奥";
		o.age=22;
		Kudo k = new Kudo();
		k.name="工藤";
		k.age=20;
		
		o.eat();
		o.cook();
		System.out.println();
		k.eat();
		k.listenMusic();
	}

}
