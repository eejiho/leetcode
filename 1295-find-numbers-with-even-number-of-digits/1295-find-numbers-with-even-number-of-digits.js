/**
 * @param {number[]} nums
 * @return {number}
 */
var findNumbers = function(nums) {
    let evenNum = 0;
    for(let i = 0; i <= nums.length; i++) {
        if(!nums[i]) continue;
        let bin = nums[i].toString();
        if(bin.length % 2 == 0) evenNum++;
    }
    
    return evenNum;
};