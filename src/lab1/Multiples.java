package lab1;

public class Multiples {
    public static void main(String[] args) {
        System.out.println(multiples(1000, 3, 5));
    }

    public static int multiples(int n, int a, int b) {
        int count = 0;
        for (int i = 1; i < n; i++)
        {
            boolean divisible_by_a = i % a == 0;
            boolean divisible_by_b = i % b == 0;

            if (divisible_by_a || divisible_by_b) {
                count++;
            }
        }
        return count;
    }
}
