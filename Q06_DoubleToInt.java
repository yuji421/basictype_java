import java.util.Scanner;

/**
 * Q06_DoubleToInt
 * 実数を入力し、小数点以下を切り捨てた整数部分を表示するプログラム。
 */
public class Q06_DoubleToInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("実数を入力: ");
        double d = sc.nextDouble();
        int i = (int) d;
        System.out.println("整数部分: " + i);
        sc.close();
    }
}

