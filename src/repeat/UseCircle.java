package repeat;

public class UseCircle {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Circle c1 = new Circle();
		Circle c2 = new Circle();
		Circle c3 = new add();

		c1.x = 0;
		c1.y = 0;
		c1.r = 10.0;
		
		c2.x =50;
		c2.y =10;
		c2.r =30.0;
		
		System.out.println("ｃ１の面積："+c1.area());
		System.out.println("ｃ２の面積："+c2.area());
		
		
		c3.a=3;
		c3.b =4;
		System.out.println(c3.add());

	}

}
