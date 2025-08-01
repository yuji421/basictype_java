import java.util.Scanner;

/**
 * Q04_CharPrint
 * 1文字を入力し、それを表示するプログラム。
 */
public class Q04_CharPrint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("1文字を入力: ");
        char c = sc.next().charAt(0);
        System.out.println("入力された文字: " + c);
        sc.close();
    }
}
