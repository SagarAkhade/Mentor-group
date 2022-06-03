// "static void main" must be defined in a public class.
/* 
LeetCode Link - https://leetcode.com/problems/subarray-sum-equals-k/
560. Subarray Sum Equals K (Medium)
Given an array of integers nums and an integer k, return the total number of subarrays whose sum equals to k.
A subarray is a contiguous non-empty sequence of elements within an array.
Example 1:
Input: nums = [1,1,1], k = 2
Output: 2
Example 2:
Input: nums = [1,2,3], k = 3
Output: 2
*/
public class Main {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        int k=3;
        System.out.println(subarraySum(nums, k));
    }
    public static int subarraySum(int[] nums, int k) {
        int ans = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int sum=0;
        
        for(int i=0; i<nums.length; i++){
            sum = sum + nums[i];
            if(map.containsKey(sum - k)){
                ans = ans + map.get(sum - k);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return ans;
    }
}
------
Output :
2
