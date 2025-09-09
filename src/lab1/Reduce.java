package lab1;

public class Reduce {
    public static void main(String[] args) {
        // prints how many steps starting at 100
        System.out.println(reduce(100));
    }

    // Correct helper method: matches what the tests expect
    public static int reduce(int n) {
        int steps = 0;

        while (n != 0) {
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = n - 1;
            }
            steps++;
        }

        return steps;  // return instead of print
    }
}
