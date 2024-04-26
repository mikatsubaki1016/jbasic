package kadai4;

public class UserAction1 {
	public static void main(String[] args) {
		User u = new User();
		
		// 田中太郎（20）の情報を登録して出力
		u.name = "田中太郎";
		u.age = 20;
		u.showInfo();
		System.out.println("---");
		// 鈴木一郎（25）の情報を登録して出力
		u.name = "鈴木一郎";
		u.age = 25;
		u.showInfo();
		
		}

}
