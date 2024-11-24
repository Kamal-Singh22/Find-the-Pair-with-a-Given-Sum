import java.util.HashMap;

public class PairWithGivenSum {

    public static int[] findPair(int[] nums, int target) {
        // HashMap to store the complement and its index
        HashMap<Integer, Integer> complementMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            // Calculate complement
            int complement = target - nums[i];

            // Check if the complement exists in the HashMap
            if (complementMap.containsKey(complement)) {
                return new int[] {complementMap.get(complement), i};
            }

            // Otherwise, store the number and its index in the HashMap
            complementMap.put(nums[i], i);
        }

        // If no pair is found, return [-1, -1]
        return new int[] {-1, -1};
    }

    public static void main(String[] args) {
        // Example 1
        int[] nums1 = {2, 7, 11, 15};
        int target1 = 9;
        int[] result1 = findPair(nums1, target1);
        System.out.println("Indices of the pair: [" + result1[0] + ", " + result1[1] + "]");

        // Example 2
        int[] nums2 = {1, 4, 5, 6, 10};
        int target2 = 15;
        int[] result2 = findPair(nums2, target2);
        System.out.println("Indices of the pair: [" + result2[0] + ", " + result2[1] + "]");

        // Example 3 (No pair found)
        int[] nums3 = {1, 2, 3};
        int target3 = 10;
        int[] result3 = findPair(nums3, target3);
        System.out.println("Indices of the pair: [" + result3[0] + ", " + result3[1] + "]");
    }
}
