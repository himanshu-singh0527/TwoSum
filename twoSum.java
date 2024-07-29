import java.util.*;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }
}

public class twoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n = sc.nextInt();
        int[] nums = new int[n];  // Initialize the array
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println("Enter the target sum:");
        int target = sc.nextInt();
        Solution solution = new Solution();
        int[] result = solution.twoSum(nums, target);
        if (result.length == 2) {
            System.out.println("Indices of elements that add up to the target: " + result[0] + ", " + result[1]);
        } else {
            System.out.println("No two numbers add up to the target.");
        }
    }
}
