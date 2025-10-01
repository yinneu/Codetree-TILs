import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();
        // Please write your code here.

        int[] days = new int[]{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int one = 0;
        for (int i = 1; i < m1; i++) {
            one += days[i];
        }
        one += d1;

        int two = 0;
        for (int i = 1; i < m2; i++) {
            two += days[i];
        }
        two += d2;

        System.out.println(two - one + 1);
    }
}