package block2;
import java.util.Arrays;

public class Block2 {
    public static String repeat(String str, int repeat) {
        String result = "";
        for(int i = 0; i < str.length(); i++)
            for(int j = 0; j < repeat; j++)
                result += str.charAt(i);

        return result;
    }
    public static int differenceMaxMin(int[] array) {

        Arrays.sort(array);
        return array[array.length - 1] - array[0];
    }

    public static boolean isAwgWhole(int[] array) {
        double sum = 0;
        for(int i = 0; i < array.length; i++)
            sum += array[i];
        double avg = sum / array.length;
        return avg % 1 == 0;
    }

    public static int[] culumativeSum(int[] array) {
        int[] resultArray = new int[array.length];

        for(int i = 0; i < array.length; i++) {
            int sum = 0;
            for(int j = i; j >= 0; j--) {
                sum += array[j];
            }
            resultArray[i] = sum;
        }
        return resultArray;
    }

    public static int getDecimalPlacec(String number) {
        if (number.contains(".")) {
            return number.length() - number.indexOf('.') - 1;
        }
        return 0;
    }

    public static int fibonacci(int number) {
        int a = 0;
        int b = 1;
        int result = b;

        if (number == 1) {
            return 0;
        }
        if (number == 2) {
            return 1;
        }

        for(int i = 2; i < number; i++) {
            result = b;
            result += a;
            a = b;
            b = result;
        }
        return result;
    }

    public static boolean isValid(String index) {
        for(int i = 0; i < index.length(); i++)
            if((int)index.charAt(i) < 48 || (int)index.charAt(i) > 57)
                return false;
        return index.length() == 5;
    }


    public static boolean isStrangePair(String first, String second) {
        return first.charAt(0) == second.charAt(second.length() - 1) && first.charAt(first.length() - 1) == second.charAt(0);
    }

    public static boolean isPrefix(String str, String prefix) {
        return str.substring(0, prefix.length() - 1).equals(prefix.substring(0, prefix.length() - 1));
    }

    public static boolean isSuffix(String str, String suffix) {
        return str.substring(str.length() - suffix.length() + 1, str.length()).equals(suffix.substring(1, suffix.length()));
    }

    public static int boxSeq(int n) {
        return n % 2 == 0 ? n : n + 2;
    }
}
