package Solutions.IntegerToRoman_12;

public class Solution {
    public String intToRoman(int num) {
        int[] decNumbers = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] roman = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        StringBuilder sol = new StringBuilder();
        
        for (int i = 0; i < decNumbers.length; i++) {
            while (num >= decNumbers[i]) {
                sol.append(roman[i]);
                num -= decNumbers[i];
            }
        }
        return sol.toString();
    }
}
