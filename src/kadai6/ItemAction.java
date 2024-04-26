package kadai6;

public class ItemAction {
	public static void main(String[] args) {
		// Itemオブジェクト（ロボット掃除機/50000円）を生成
		Item item1 = new Item();
		item1.name = "ロボット掃除機";
		item1.price = 50000;
		// 商品情報を出力

		// Itemオブジェクト（洗濯機/200000円）を生成
		Item item2 = new Item();
		item2.name = "洗濯機";
		item2.price = 20000;
		
		// 商品情報を出力
		item1.showInfo();
		System.out.println("---");
		item2.showInfo();

	}

}
