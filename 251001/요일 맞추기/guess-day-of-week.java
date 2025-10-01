import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();
        // Please write your code here.

        int[] days = new int[]{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] week = new String[]{"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};

        int start = 0;
        for (int i = 1; i < m1; i++) {
            start += days[i];
        }
        start += d1;

        int end = 0;
        for (int i = 1; i < m2; i++) {
            end += days[i];
        }
        end += d2;

        int idx = (end - start) % 7;
        if (idx < 0) {
            idx = 7 + idx;
        }

        System.out.println(week[idx]);
    }
}