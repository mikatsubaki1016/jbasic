package p01;

public class Sample29 {
	public static void main(String[] args) {
		//メソッドの呼び出し
		int [] list = {10,20,30};
		kudo(list);
		
		
		int[] ary =endo();
		for(int data1 : ary) {
			System.out.println(data1);
		}

	}

//メソッドの定義
	static void kudo(int [] list2) {
		for(int data : list2) {
			System.out.println(data);
		}

	}
	static int[] endo(){
		int[] ary = {100,200,300};
		return ary;
		}

	
	

	}


