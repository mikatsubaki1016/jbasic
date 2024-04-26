package kadai2;

import java.util.Scanner;

public class eee {

    public static void main(String[] args) {
        // Step8：パスワードの入力を受け付けます。for文を利用し、３回以内
        // に「himitu」が入力された場合は「ログインできました」と出力しま
        // す。間違えた場合は「不正解です」と出力しなさい。

        Scanner scan1 = new Scanner(System.in);
        String password = "himitu";

        boolean loggedIn = false;

        for (int i = 0; i < 3; i++) {
            System.out.print("パスワードを入力してください：");
            String input = scan1.next();
            if (input.equals(password)) {
                loggedIn = true;
                System.out.println("ログインできました");
                break;
            } else {
                System.out.println("不正解です");
            }
        }

        if (!loggedIn) {
            System.out.println("3回間違えたため、アクセスが拒否されました。");
        }
    }
}