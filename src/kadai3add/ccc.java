package kadai3add;

import java.util.Random;
import java.util.Scanner;

public class ccc {

    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ
    	Scanner scanner = new Scanner(System.in);
    	
        String p = randomer();
        System.out.println(p);
        System.out.println("文字列を入力してください: ");
        String input = scanner.nextLine();
        String[] array = new String[input.length()];

        // 文字列の各文字を配列に格納
        for (int i = 0; i < input.length(); i++) {
            array[i] = String.valueOf(input.charAt(i));
        }

        // 配列の内容を出力
        for (int i = 0; i < array.length; i++) {
            System.out.println("配列の要素 " + i + ": " + array[i]);
        }
    }

    static String randomer() {
        Random comrandom = new Random();
        StringBuilder result = new StringBuilder();

        for(int i=0; i<3; i++) {
            result.append(comrandom.nextInt(10)); // 0から9までの乱数を追加
        }

        return result.toString();
    }
}