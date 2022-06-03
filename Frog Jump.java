// "static void main" must be defined in a public class.
/*
Frog Jump : Given an Array we need to find wether frog can jump upto last index and also
consider values at particular index
*/
public class Main {
    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 0, 1};
        if(canJump(arr)){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
    // Optimal Solution
    public static boolean canJump(int[] nums) {
        if(nums.length==1)
            return true;
        if(nums[0]==0)
            return false;
        
        int reachable=0;
      
        for(int i=0;i<nums.length;i++){
          if(i>reachable)
              return false;

          reachable=Math.max(reachable,i+nums[i]);
          if(reachable>=nums.length-1)
              return true;
        }
      return false;    
    }
}
-----------
Output :
NO
