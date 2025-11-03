class Solution {
    public boolean validMountainArray(int[] arr) {
        if(arr.length < 3) return false;
        
        int index = 0;
        for(int i = 0; i < arr.length - 1; i++) {
            if(arr[i] > arr[i+1]) {
                index = i;
                break;
            }
        }
        if(index == 0) return false;

        for(int i = 0; i < index; i++) {
            if(arr[i] >= arr[i+1]) return false;
        }

        for(int i = index+1; i < arr.length - 1; i++) {
            if(arr[i] <= arr[i+1]) return false;
        }

        return true;
    }
}