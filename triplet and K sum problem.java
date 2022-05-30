// "static void main" must be defined in a public class.
/*
Link - https://www.geeksforgeeks.org/find-a-triplet-that-sum-to-a-given-value/
Input: array = {12, 3, 4, 1, 6, 9}, sum = 24; 
Output: 12, 3, 9 
Explanation: There is a triplet (12, 3 and 9) present 
in the array whose sum is 24. 
Input: array = {1, 2, 3, 4, 5}, sum = 9 
Output: 5, 3, 1 
Explanation: There is a triplet (5, 3 and 1) present 
in the array whose sum is 9.
*/
public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int target = 9;
        System.out.println("With optimal Approach");
        threeSumOptimal(arr, target);
        System.out.println("With BruteForce Approach");
        threeSumBrute(arr, target);
    } 
    
    //Optimal Solution Time Complexity - O(N^2) Space Complexity - O(1)
    public static void threeSumOptimal(int[] arr, int target){
        Arrays.sort(arr);
        int k = arr.length-1;
        for(int i=0; i<arr.length-2; i++){
            int j=i+1; 
            while(j<k){
                int sum = arr[i] + arr[j] + arr[k];
                if(sum == target){
                    System.out.println(arr[i] + ", " + arr[j] + ", " +arr[k]);
                    j++;
                    k--;
                }
                else if(sum<target){
                    j++;
                }
                else{
                    k--;
                }
            }
        }
    }
    // Brute Force Soloution - Time Complexity - O(N^3) Space Complexity-O(1)
    public static void threeSumBrute(int[] arr, int target){
        Arrays.sort(arr);
        for(int i=0; i<arr.length-2; i++){
            for(int j=i+1; j<arr.length-1; j++){
                for(int k=j+1; k<arr.length; k++){
                    int sum = arr[i] + arr[j] + arr[k];
                    if(sum == target){
                        System.out.println(arr[i] + ", " + arr[j] + ", " +arr[k]);
                    }
                }
            }
        }
    }
}
--------------
Output - 
 With optimal Approach
1, 3, 5
2, 3, 4
With BruteForce Approach
1, 3, 5
2, 3, 4
