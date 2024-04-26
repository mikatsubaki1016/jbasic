package kadai6;

public class Book extends Item {
	private String author;
	
	public Book(){
//		引数からすべてのフィールド（商品名、価格、著者）を初期化するコン
//		ストラクタ
		

	}
	
public Book(String name, int price,String author) {
		super(name,price);
		this.author = author;
	}

public void showInfo() {
		super.showInfo();
		System.out.println("著者："+author);
		
	}
	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	
	

}
