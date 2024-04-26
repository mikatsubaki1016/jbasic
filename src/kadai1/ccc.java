package kadai1;

import java.util.Scanner;

public class ccc {

    public static void main(String[] args) {
        String data = "";

        Scanner scanner = new Scanner(System.in);
        System.out.print("色を入力してください：");
        data = scanner.nextLine();

        switch (data) {
            case "red":
                System.out.println("「赤です」");
                break;
            case "green":
                System.out.println("「緑です」");
                break;
            case "blue":
                System.out.println("「青です」");
                break;
            default:
                System.out.println("「他の色を入力してください」");
                break;
        }
    }
}
