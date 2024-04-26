package kadai4add;

public class Customer {
	
	int id;
	String name;
	

	 void setData(String a) {
		
		name=a;
		

	}

	void setData(int b, String a) {
		
		id=b;
		name=a;

	}

	void showData() {
		
		
		System.out.println(id +":" + name);

	}

}
