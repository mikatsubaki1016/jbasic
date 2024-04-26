package kadai5add;

public class Customer {
	//	 コンストラクタ
	private String name;
	private int id;

	//	 デフォルトコンストラクタ
	
	//	 名前だけを指定するコンストラクタ
	//	 IDと名前を指定するコンストラクタ

	//	 カプセル化

	//ゲッターセッター
	

	


	public Customer(String name) {
		this.name = name;
		
	}

	

	public Customer(int id,String name) {

		this.id = id;
		this.name = name;
		
	}
	
	// ゲッターセッター
		public String getName() {
			
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {

			this.id = id;
		}

	
	void showData(){
		System.out.println(id + "：" +name);
	}
}
