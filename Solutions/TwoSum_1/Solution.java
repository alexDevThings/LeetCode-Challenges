class Solution {
    public static int[] twoSum(int[] nums, int target) {
        int[] result = { 0, 1 };
        if ((nums[0] + nums[1]) != target) {
            for (int i = 2; i <= nums.length - 1; i++) {
                if (((nums[result[0]] + nums[i]) == target) && (result[0] != i)) {
                    result[1] = i;
                    return result;
                }
                if (((nums[result[1]] + nums[i]) == target) && (result[1] != i)) {
                    result[0] = i;
                    return result;
                }
                if (i == (nums.length - 1)) {
                    result[0]++;
                    result[1]++;
                    i = 1;
                }
            }
        }
        return result;
    }
}