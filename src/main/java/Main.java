import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String s = "leetcode";
        System.out.println(Solution.firstUniqChar(s));
    }

    public static class Solution {
        public static int firstUniqChar(String s) {
            if (s.length() == 1) {
                return 0;
            }
            boolean q = false;
            int x = -1;
            char[] schar = s.toCharArray();
            for (int i = 0; i < s.length(); i++) {
                if (!q) {
                    for (int j = 0; j < s.length(); j++) {
                        if (schar[i] == schar[j] && i != j) {
                            x = -1;
                            q = false;
                            break;
                        }
                        if ((schar[i] != schar[j] && i != j)) {
                            x = s.indexOf(schar[i]);
                            q = true;
                        }
                    }
                }
            }
            return x;

                // brute force: search array and for each element search the rest of the array for that element
                // would be really inefficient, with O(n^2) time
                //NOT ALWAYS A HASHMAP??
                // don't try to optimize right away okay? think of multiple basic solutions first then do the best one (but don't optimize yet!)

//                int[] letters = new int[26]; //array of all letters and their freqs
//                int minUniqueIndex = Integer.MAX_VALUE;
//                for (char c = 'a'; c <= 'z'; c++) {
//                    int index = s.indexOf(c);
//                    if (index != -1 && index == s.lastIndexOf(c)) {
//                        if (index < minUniqueIndex) minUniqueIndex = index;
 //                   }
                    // compare indexOf and lastIndexOf current letter
                    // if they are the same, compare the indexOf letter in s to current min
//                }
//                return minUniqueIndex == Integer.MAX_VALUE ? -1 : minUniqueIndex;
//            }
        }
    }
}
