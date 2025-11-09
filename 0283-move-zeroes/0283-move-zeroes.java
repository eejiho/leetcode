class Solution {
    public void moveZeroes(int[] nums) {
        int[] newArr = new int[nums.length];
        int index = 0;
        for(int num : nums) {
            if(num != 0) {
                newArr[index++] = num;
            }
        }

        for(int i = 0; i < nums.length; i++) {
            if(i < index) {
                nums[i] = newArr[i];
            } else {
                nums[i] = 0;
            }
            
        }
    }
}