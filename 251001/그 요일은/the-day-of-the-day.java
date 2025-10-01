import java.util.*;

public class Main {

    static int calDays(int m, int d) {
        int[] days = new int[]{0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int sum = 0;
        for (int i = 1; i < m; i++) {
            sum += days[i];
        }
        sum += d;

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();
        String A = sc.next();
        // Please write your code here.

        Map<String, Integer> dayOfWeek = new HashMap<>();
        dayOfWeek.put("Mon", 0);
        dayOfWeek.put("Tue", 1);
        dayOfWeek.put("Wed", 2);
        dayOfWeek.put("Thu", 3);
        dayOfWeek.put("Fri", 4);
        dayOfWeek.put("Sat", 5);
        dayOfWeek.put("Sun", 6);

        int diff = calDays(m2, d2) - calDays(m1, d1);

        int count = diff / 7;
        
        int temp = diff & 7;
        if (temp < dayOfWeek.get(A)) {
            count++;
        }

        System.out.println(count);
    }
}