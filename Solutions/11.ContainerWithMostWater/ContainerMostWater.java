class Solution {
    public int maxArea(int[] height) {
        int maxArea = 0;
        int left = 0;
        int right = height.length - 1;
        int minHeight = 0;

        while (left < right){
            minHeight = Math.min(height[left], height[right]);
            if ((right - left) * minHeight > maxArea)
                maxArea = (right - left) * minHeight;   
            
            if (height[left] < height[right])
                left++;
            else 
                right--;
        }
        return maxArea;    
    }
}