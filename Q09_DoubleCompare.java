import java.util.Scanner;

/**
 * Q09_DoubleCompare
 * 3つの実数 a, b, c を入力し、a + b と c がほぼ等しいかを誤差を考慮して比較するプログラム。
 */
public class Q09_DoubleCompare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("aを入力: ");
        double a = sc.nextDouble();
        System.out.print("bを入力: ");
        double b = sc.nextDouble();
        System.out.print("cを入力: ");
        double c = sc.nextDouble();

        double epsilon = 1e-10;
        boolean result = Math.abs((a + b) - c) < epsilon;
        System.out.println("a + b == c ? " + result);
        sc.close();
    }
}

