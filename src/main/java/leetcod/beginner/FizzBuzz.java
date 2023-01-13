package leetcod.beginner;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public List<String> fizzBuzz(int n) {
        final String FIZZ = "Fizz";
        final String BUZZ = "Buzz";

        List<String> result = new ArrayList<>(n);
        for (int i = 1; i <= n; i++) {
            String current = "";
            if (i % 3 == 0) {
                current += FIZZ;
            }
            if (i % 5 == 0) {
                current += BUZZ;
            }
            if (current.isEmpty()) {
                current += String.valueOf(i);
            }

            result.add(current);
        }
        return result;

        // time complexity = O(n)
        // space complexity = O(1)
    }

    public List<String> fizzBuzz2(int n) {
        List<String> result = new ArrayList<>(n);
        for (int i = 1; i <= n; i++) {
            boolean divisibleBy3 = i % 3 == 0;
            boolean divisinleBy5 = i % 5 == 0;

            if (divisibleBy3 && divisinleBy5) {
                result.add("FizzBuzz");
            } else if (divisibleBy3) {
                result.add("Fizz");
            } else if (divisinleBy5) {
                result.add("Buzz");
            } else {
                result.add(String.valueOf(i));
            }
        }
        return result;
    }
}
