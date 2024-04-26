package p03;

public class Start {

	public static void main(String[] args) {
		//インスタンスを生成
	TV t = new TV();
	
	//リモコンを利用してチャンネルを設定]
	t.changeChannel(1);
	t.displayChannnel();
	
	t.changeChannel(4);
	t.displayChannnel();
		
	}

}
