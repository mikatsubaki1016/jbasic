package kadai3add;

import java.util.Random;
import java.util.Scanner;

public class bbb {

    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ
       Scanner scan = new Scanner(System.in);

       String randomer = "";

        String p = String.valueOf(randomer());
        String q = String.valueOf(randomer());
        String r = String.valueOf(randomer());
        int count = 0;

        System.out.println("コンピュータの数値"+p);

        do {
           System.out.print("数字を入力してください：");
            String randomy = scan.next();
             = randomy;
            count++;
//            a(p, q,r);
        } while (!p.equals(q) );

        System.out.println(count + "回で当たりました！");
    }

    // ランダムな数字を返すメソッド
    static int randomer() {
        Random comrandom = new Random();
         return comrandom.nextInt(9);
    }

    // 2つの数字の大小を比較するメソッド
//    static void a(String x, String y,String z) {
//        if (x.equals(y)) {
//            ;
//        } 

    }

}
