// Last updated: 7/9/2026, 10:08:24 AM
class Solution {
    public boolean isPalindrome(int x) {
        // negative numbers are not palindrome
        // numbers ending in 0 (except 0 itself) are not palindrome
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int reversedHalf = 0;

        while (x > reversedHalf) {
            reversedHalf = reversedHalf * 10 + x % 10;
            x /= 10;
        }

        // even length -> x == reversedHalf
        // odd length -> x == reversedHalf/10
        return (x == reversedHalf) || (x == reversedHalf / 10);
    }
}