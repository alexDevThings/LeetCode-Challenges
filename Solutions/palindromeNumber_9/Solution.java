package Solutions.PalindromeNumber_9;
public class Solution {
    public boolean isPalindrome(int x) {
        int revertedNumber = 0, temp = 0;
        if (x < 0 || (x % 10 == 0 && x != 0)) return false;

        while (x > revertedNumber) {
            temp = x % 10;
            revertedNumber = revertedNumber * 10 + temp;
            x /= 10;
        }
        return x == revertedNumber || x == revertedNumber / 10;
    }
}