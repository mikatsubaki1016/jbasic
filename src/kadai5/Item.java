package kadai5;

public class Item {
	// フィールド
	private int price;
	private String name;

	// コンストラクタ
	public Item(String name, int price) {
		this.name = name;
		this.price = price;
	}

	// ゲッターセッター
	public String getName() {
		
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {

		this.price = price;
	}

	// 情報出力用showInfoメソッド
	void showInfo() {
		System.out.println("商品名：" + name);
		System.out.println("価格：" + price+"円");
		System.out.println("---");
	}

}
