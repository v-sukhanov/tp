package block1;

public class Block1 {

    public static int remainder(int a, int b) {
        return a % b;
    }

    public static double triArea(int base, int height) {
        return base * height * 0.5;
    }
    public static int animals(int chikens, int cows, int pigs) {
        return chikens * 2 + cows * 4 + pigs * 4;
    }

    public static boolean profitableGamble(double N, double a, double b) {
        return N * a > b;
    }

    public static String operation(double n, double a, double b) {
        if (a + b == n) {
            return "added";
        }
        else if (a - b == n) {
            return "subtracted";
        }
        else if (a * b == n) {
            return "multiply";
        }
        else if (a / b == n) {
            return "split";
        }
        return "none";
    }

    public static int ctoa(char symbol) {
        return (int)symbol;
    }

    public static int addUpTo(int number) {
        int sum = 0;
        for(int i = 0; i <= number; i++)
            sum += i;
        return sum;
    }

    public static int nextEdge(int a, int b) {
        return a + b - 1;
    }

    public static int sumOfCubes(int[] array) {
        int sum = 0;
        for(int i = 0; i < array.length; i++)
            sum += Math.pow(array[i], 3);
        return sum;
    }

    public static boolean abcmath(int a, int b, int c) {
        int sum = a;
        for(int i = 0; i < b; i++) {
            sum += sum + a;
        }
        return sum % c == 0;
    }
}
