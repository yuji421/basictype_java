import java.util.Scanner;

/**
 * Q2_DoubleAverage
 * 2つの実数を入力し、その平均を計算して表示するプログラム。
 */
public class Q02_DoubleAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("1つ目の実数を入力: ");
        double x = sc.nextDouble();
        System.out.print("2つ目の実数を入力: ");
        double y = sc.nextDouble();
        System.out.println("平均: " + ((x + y) / 2));
        sc.close();
    }
}

