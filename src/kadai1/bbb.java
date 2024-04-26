package kadai1;

import java.util.Scanner;

public class bbb {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("数字を入力して下さい：");
        int i = scan.nextInt();

        if (i % 2 == 0) {
            if (i >= 0) {
                System.out.println("正の偶数です");
            } else {
                System.out.println("負の偶数です");
            }
        } else {
            if (i >= 0) {
                System.out.println("正の奇数です");
            } else {
                System.out.println("負の奇数です");
            }
        }
    }

}
