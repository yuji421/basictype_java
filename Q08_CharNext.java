import java.util.Scanner;

/**
 * Q08_CharNext
 * 1文字を入力し、その次の文字を表示するプログラム。
 */
public class Q08_CharNext {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("文字を入力: ");
        char c = sc.next().charAt(0);
        c++;
        System.out.println("次の文字: " + c);
        sc.close();
    }
}

