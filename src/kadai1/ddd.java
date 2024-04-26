package kadai1;

import java.util.Scanner;

public class ddd {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("名前：");
        String input = scan.next();

        if(input.length() > 20) {
            System.out.println("20文字以内で入力してください\n");
        } else {
            System.out.println("ようこそ" + input + "さん");
        }

    }

}