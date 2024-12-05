package codingQuestion;

import java.util.HashMap;

public class TwoSumOpti {
    public static int[] twoSumBruteForce(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        throw new IllegalArgumentException("No solution found");
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = twoSumBruteForce(nums, target);
        System.out.println("Indices: " + result[0] + ", " + result[1]);

//	 public static int[] twoSumOptimized(int[] nums, int target) {
//	        HashMap<Integer, Integer> map = new HashMap<>();
//
//	        for (int i = 0; i < nums.length; i++) {
//	            int complement = target - nums[i];
//	            if (map.containsKey(complement)) {
//	                return new int[] { map.get(complement), i };
//	            }
//	            map.put(nums[i], i);
//	        }
//
//	        throw new IllegalArgumentException("No solution found");
//	    }
//
//	    public static void main(String[] args) {
//	        int[] nums = {2, 7, 11, 15};
//	        int target = 9;
//
//	        int[] result = twoSumOptimized(nums, target);
//	        System.out.println("Indices: " + result[0] + ", " + result[1]);
//		// TODO Auto-generated method stub

	}

}
