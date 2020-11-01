package block3;

import java.util.Arrays;

public class Block3 {
    public static int solutions(int a, int b, int c) {
        int d = b * b - 4 * a * c;

        if(d == 0)
            return 1;
        if(d > 0)
            return 2;
        else
            return 0;
    }

    public static int findZip(String str) {
        return str.indexOf("zip", str.indexOf("zip") + 1);
    }

    public static boolean checkPerfect(int num) {
        int sum = 0;

        for(int i = 1; i < num; i++) {
            if(num % i == 0)
                sum += i;
        }
        return sum == num;
    }

    public static String flipEndChars(String str) {
        if(str.length() < 2)
            return "Incompatible.";
        if(str.charAt(0) == str.charAt(str.length() - 1))
            return "Two's a pair.";
        else
            return _swap(str, 0, str.length() - 1);
    }

    private static String _swap(String str , int i , int j ) {
        StringBuilder strB = new StringBuilder(str);
        char l = strB.charAt(i) , r = strB.charAt(j);
        strB.setCharAt(i,r);
        strB.setCharAt(j,l);
        return strB.toString();
    }

    public static boolean isValidHexCode(String str) {
        String hexKey = "#01zcd456gfdsve3abcdef";

        if(str.charAt(0) != '#')
            return false;
        if(str.length() != 7)
            return false;

        for(int i = 1; i < str.length(); i++)
            if(hexKey.indexOf(str.charAt(i)) == -1)
                return false;
        return true;
    }

    public static boolean same(int[] first, int[] second) {
        return _countOfUnique(first) == _countOfUnique(second);
    }

    private static int _countOfUnique(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++)
            {
                if (array[j] == array[i])
                {
                    count++;
                    break;
                }
            }
        }
        return array.length - count;
    }

    public static boolean isKaprekar(int number) {
        String str = String.valueOf(number * number);
        String left;
        String right;

        if(str.length() == 1)
        {
            right = str;
            left = "0";
        }
        else
        {
            left = str.substring(0, str.length() / 2);
            right = str.substring(str.length() / 2, str.length());
        }

        int letftToNumber = Integer.parseInt(left);
        int rightToNumber = Integer.parseInt(right);

        return (letftToNumber + rightToNumber) == number;
    }

    public static String longestZero(String str) {
        int maxZero = 0;
        for(int i = 0; i < str.length(); i++)
        {
            if(str.charAt(i) == '0')
            {
                int countOfZero = 1;
                while((i + 1) < str.length() && str.charAt(i + 1) == '0' )
                {
                    countOfZero++;
                    i++;
                }
                if(countOfZero > maxZero)
                    maxZero = countOfZero;
            }
        }

        String result = "";
        for(int i = 0; i < maxZero; i++) {
            result += "0";
        }
        return result;
    }

    public static int nextPrime(int num) {
        if(num < 2)
            num = 2;

        while(true) {
            boolean flag = false;
            for(int i = 2; i < num; i++) {
                if(num % i == 0)
                {
                    flag = true;
                    break;
                }
            }
            if(!flag)
                return num;
            else
                num++;
        }
    }

    public static boolean rightTriangle(int a, int b, int c) {
        int[] array = {a, b ,c};
        Arrays.sort(array);
        return Math.pow(array[0], 2) + Math.pow(array[1], 2) == Math.pow(array[2], 2);
    }


}
