/**
 * @param {number[]} nums
 * @return {number[]}
 */
var sortedSquares = function(nums) {
    var resultArr = [];
    for(num of nums) {
        resultArr.push(num * num);
    }

    return resultArr.sort(function(a, b)  {
        return a - b;
    });
};