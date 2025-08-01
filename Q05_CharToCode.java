import java.util.Scanner;

/**
 * Q05_CharToCode
 * 入力された文字のUnicodeコード（数値）を表示するプログラム。
 */
public class Q05_CharToCode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("文字を1つ入力: ");
        char c = sc.next().charAt(0);
        int code = (int) c;
        System.out.println("文字コード: " + code);
        sc.close();
    }
}

