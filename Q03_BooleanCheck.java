import java.util.Scanner;

/**
 * Q03_BooleanCheck
 * 合格か不合格か（true/false）を入力し、結果に応じて表示するプログラム。
 */
 
public class Q03_BooleanCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("合格なら true、不合格なら false を入力: ");
        boolean isPassed = sc.nextBoolean();
        if(isPassed == true) {
            System.out.println("合格です");
        } else if(isPassed == false) {
            System.out.println("不合格です");
        }
        sc.close();
    }
}
