import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        // Please write your code here.

        int start = (11 * 24 * 60) + (11 * 60) + 11;
        int end =  (A * 24 * 60) + (B * 60) + C;

        int result = 0;

        if (end < start) {
            result = -1;
        } else {
            result = end - start;
        }

        System.out.println(result);
    }
}