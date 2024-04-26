package kadai3add;

import java.util.Random;
import java.util.Scanner;

public class aaa {

    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ
       Scanner scan = new Scanner(System.in);
       
       int randomer = 0;

        int p = randomer();
        int count = 0;
        int q;
        System.out.println("コンピュータの数値"+p);

        do {
           System.out.print("数字を入力してください：");
            int randomy = scan.nextInt();
            q = randomy;
            count++;
            a(p, q);
        } while (p != q);

        System.out.println(count + "回で当たりました！");
    }

    // 0から99のランダムな数字を返すメソッド
    static int randomer() {
        Random comrandom = new Random();
        return comrandom.nextInt(100);
    }

    // ランダムな数字とキーボードから入力した入力した数字を引数として2つの数字の大小判定をするメソッド
    static void a(int x, int y) {
        if (x < y) {
            System.out.println("** 大きすぎです **");
        } 
        if (x > y) {
            System.out.println("** 小さすぎです **");
        }
    }
}
