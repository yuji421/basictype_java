import java.util.Scanner;

/**
 * Q1_IntAdd
 * 2つの整数を入力し、その合計を表示するプログラム。
 */
public class Q01_IntAdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("1つ目の整数を入力: ");
        int a = sc.nextInt();
        System.out.print("2つ目の整数を入力: ");
        int b = sc.nextInt();
        System.out.println("合計: " + (a + b));
        sc.close();
    }
}
