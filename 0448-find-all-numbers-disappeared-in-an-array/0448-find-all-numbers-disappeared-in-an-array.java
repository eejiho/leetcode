class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        int result[] = new int[nums.length+1];
        for(int i=0; i<nums.length; i++) {
            result[nums[i]]++;
        }
        for(int i=0; i<nums.length+1; i++) {
            if(result[i]==0&&i!=0){
                list.add(i);
            }
        }
        return list;
    }
}