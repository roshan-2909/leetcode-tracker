// Last updated: 7/9/2026, 10:08:09 AM
import java.util.*;

class Solution {
    public List<String> letterCombinations(String digits) {
        if (digits.length() == 0) return new ArrayList<>();

        String[] map = {
            "", "", "abc", "def", "ghi",
            "jkl", "mno", "pqrs", "tuv", "wxyz"
        };

        List<String> res = new ArrayList<>();
        backtrack(res, digits, map, 0, new StringBuilder());
        return res;
    }

    private void backtrack(List<String> res, String digits, String[] map, int idx, StringBuilder sb) {
        if (idx == digits.length()) {
            res.add(sb.toString());
            return;
        }

        String letters = map[digits.charAt(idx) - '0'];

        for (char c : letters.toCharArray()) {
            sb.append(c);
            backtrack(res, digits, map, idx + 1, sb);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}