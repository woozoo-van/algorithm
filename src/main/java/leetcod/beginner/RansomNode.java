package leetcod.beginner;

import java.util.HashMap;

public class RansomNode {
    public boolean canConstruct(String ransomNote, String magazine) {
        char[] randomChars = ransomNote.toCharArray();
        int ransomNodeLength = ransomNote.length();
        char[] magazineChars = magazine.toCharArray();

        for (int i = 0; i < magazineChars.length; i++) {
            for (int j = 0; j < randomChars.length; j++) {
                if (randomChars[j] == magazineChars[i]) {
                    ransomNodeLength--;
                    randomChars[j] = 0;
                    magazineChars[i] = 0;
                    break;
                }
            }
            if (ransomNodeLength == 0) break;
        }

        return ransomNodeLength < 1;
    }

    public boolean canConstruct2(String ransomNote, String magazine) {
        // for Each 문은 O(n)의 공간을 추가로 사용한다.
        for (int i = 0; i < ransomNote.length(); i++) {
            char r = ransomNote.charAt(i);

            int matchingIndex = magazine.indexOf(r);

            if (matchingIndex == -1) {
                return false;
            }

            magazine = magazine.substring(0, matchingIndex) + magazine.substring(matchingIndex + 1);

        }
        return true;
        // time complexity = O(nm)
        // space complexity = O(m)
    }

    public boolean canConstructHashMap(String ransomNote, String magazine) {
        HashMap<Character, Integer> magazineLetters = new HashMap<>();

        for (int i = 0; i < magazine.length(); i++) {
            char m = magazine.charAt(i);

            int currentCount = magazineLetters.getOrDefault(m, 0);
            magazineLetters.put(m, currentCount + 1);
        }

        for (int i = 0; i < ransomNote.length(); i++) {
            char r = ransomNote.charAt(i);

            int currentCount = magazineLetters.getOrDefault(r, 0);
            if (currentCount == 0) {
                return false;
            }

            magazineLetters.put(r, currentCount - 1);
        }
        return true;
        // time complexity = O(m)
        // space complexity = O(1)
    }

}
