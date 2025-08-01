import java.util.Scanner;

/**
 * Q07_ScoreCheck
 * 点数を入力し、80点以上ならtrue、未満ならfalseを出力するプログラム。
 */
public class Q07_ScoreCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("点数を入力してください: ");
        int score = sc.nextInt();
        boolean isPassed = score >= 80;
        System.out.println("合格？: " + isPassed);
        sc.close();
    }
}

