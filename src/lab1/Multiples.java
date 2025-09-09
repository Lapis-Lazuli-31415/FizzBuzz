package lab1;

public class Multiples {
    public static void main(String[] args) {
        int num = 0;
        for (int i = 1; i <= 1000; i++)
        {
            boolean divisible_by_3 = i % 3 == 0;
            boolean divisible_by_5 = i % 5 == 0;

            if (divisible_by_3 || divisible_by_5) {
                num++;
            }
        }
        System.out.println(num);
    }
}
