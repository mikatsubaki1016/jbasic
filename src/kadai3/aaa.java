package kadai3;

import java.util.Scanner;

public class aaa {

    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ
        Scanner scan = new Scanner(System.in);
        System.out.print("名前を入力してください：");
        String name = scan.next();
        // 名前が20文字より大きい場合エラー
        // 名前が「admin」に一致する場合エラー
        // 名前に禁止文字「㌔」が含まれている場合エラー
        name(name);
        System.out.print("年齢を入力してください：");
        int age = scan.nextInt();
        // 年齢が0未満、または、130より大きい場合エラー
        age(age);
        System.out.println("名前：" + name + "、年齢：" + age + "で登録しました。");
        scan.close();

    }

    // 名前を検証するメソッド
    static void name(String x) {
        if( x.equals("admin")) {
            System.out.println("利用できない名前です");
        } else if(x.contains("㌔")) {
            System.out.println("名前に禁止文字が含まれています");
        } 
    }

    // 年齢を検証するメソッド
    static void age(int y) {
        if(y < 0 || y > 130) {
            System.out.println("年齢は0以上130以下で入力してください");
        }
    }

}