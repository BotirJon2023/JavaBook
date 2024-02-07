package org.example;

import java.util.Arrays;

public class Test {
    static boolean checkLength(String first, String second, String result) {
        if (first.length() + second.length() != result.length()) {
            return false;
        } else {
            return true;
        }
    }

    static String sortString(String str) {
        char[] charArray = str.toCharArray();
        Arrays.sort(charArray);
        str = String.valueOf(charArray);
        return str;
    }

    static boolean shuffleCheck(String first, String second, String result) {
        first = sortString(first);
        second = sortString(second);
        result = sortString(result);
        int i = 0, j = 0, k = 0;
        while (k != result.length()) {
            if (i < first.length() && first.charAt(i) == result.charAt(k))
                i++;
            else if (j < second.length() && second.charAt(j) == result.charAt(k))
                j++;
            else {
                return false;
            }
            k++;
        }
        if (i < first.length() || j < second.length()) {
            return false;
        }
        return true;
    }
}
