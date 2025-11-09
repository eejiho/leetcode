class Solution {
    public int heightChecker(int[] heights) {
        int[] newHeights = new int[heights.length];
        
        for(int i = 0; i < heights.length; i++) {
            newHeights[i] = heights[i];
        }
        
        for(int i = 0; i < heights.length; i++) {
            for(int j = i+1; j < heights.length; j++) {
                if(heights[i] > heights[j]) {
                    int tmp = heights[i];
                    heights[i] = heights[j];
                    heights[j] = tmp;
                }
            }
        }
        
        
        int k = 0;
        for(int i = 0; i < heights.length; i++) {
            if(heights[i] != newHeights[i]) k++;
        }
        
        return k;
    }
}