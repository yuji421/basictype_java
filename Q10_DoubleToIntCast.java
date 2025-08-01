import java.util.Scanner;

/**
 * Q10_DoubleToIntCast
 * 実数を入力し、整数型へキャストして表示するプログラム。
 */
public class Q10_DoubleToIntCast {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("実数を入力: ");
        //double型の入力はnextDouble()を使う
        double d = sc.nextDouble();
        //大きい型から小さい型はキャストする必要がある
        int i = (int) d;
        System.out.println("整数に変換した値: " + i);
        sc.close();
    }
}


