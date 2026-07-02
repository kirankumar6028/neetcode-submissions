class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        int start = 0;
        int end = numbers.length-1;
        while(start < end){
            if(numbers[start]+numbers[end] == target){
                result[0] = numbers[start];
                result[1] = numbers[end];
                return result;
            }else if(numbers[start]+numbers[end] > target){
                end--;
            }else{
                start++;
            }
        }
        return result;
    }
}
