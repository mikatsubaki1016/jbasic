package kadai2add;

import java.util.Scanner;

public class aaa04222 {

    public static void main(String[] args) {
        //      Step3：キーボードから繰り返し回数（整数）を入力します。繰り返し
        //      処理の中で文字列をキーボードから入力し、それらを連結していくプロ
        //      グラムを作成しなさい。

        Scanner scan4 = new Scanner(System.in);

        System.out.print("文字列の個数を入力してください：");
        int d = scan4.nextInt();

        String [] a = new String[d];

        for (int i=0; i<d; i++) {
            System.out.println(i + "つ目の文字列を入力してください：");
            a[i] = scan4.next();
        }
        String longest = "";
        for (int j=0; j<d; j++) {
            if (a[j].length() > longest.length()) {
                longest = a[j];
            }
        }
        System.out.println("最も長い文字列は「"+longest+"」です\n");

    }

}
