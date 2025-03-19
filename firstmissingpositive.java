public class firstmissingpositive {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            while (nums[i] > 0 && nums[i] <= n && nums[nums[i] - 1] != nums[i]) {
                int temp = nums[i];
                nums[i] = nums[nums[i] - 1];
                nums[temp - 1] = temp;
            }
        }
        for (int i = 0; i < n; i++) {
            if (nums[i] != i + 1) {
                return i + 1;
            }
        }
        return n + 1;
    }
    public static void main(String[] args) {
        firstmissingpositive solution = new firstmissingpositive();
        int[] nums1 = {1, 2, 0};
        System.out.println(solution.firstMissingPositive(nums1)); 
        int[] nums2 = {3, 4, -1, 1};
        System.out.println(solution.firstMissingPositive(nums2)); 
        int[] nums3 = {7, 8, 9, 11, 12};
        System.out.println(solution.firstMissingPositive(nums3)); 
    }
}
