import java.util.Scanner;

public class HashTable {
    public static void main(String[] args) {
        int n, i = 0, j = 0;
        char[] id_Array2 = new char[20];
        char ch;

        System.out.println("Input the expression ending with ; sign:");
        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        while (i < input.length() && input.charAt(i) != ';') {
            id_Array2[i] = input.charAt(i);
            i++;
        }
        n = i - 1;
        System.out.println("\nSymbol Table display");
        System.out.println("Symbol \t addr \t\t\t type");

        while (j <= n) {
            ch = id_Array2[j];

            if (Character.isLetter(ch)) {
                System.out.println("\n " + ch + " \t " + System.identityHashCode(ch) + " \t identifier");
                j++;
            } else {
                if (ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '%' || ch == '=' || ch == '<' || ch == '>') {
                    System.out.println("\n " + ch + " \t " + System.identityHashCode(ch) + " \t operator");
                    j++;
                }
            }
        }
    }
}
