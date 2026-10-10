class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        int num = nums.length;

        Arrays.sort(nums);

        for (int i = 0; i < num - 3; i++) {

            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            for (int j = i + 1; j < num - 2; j++) {

                if (j > i + 1 && nums[j] == nums[j - 1]) {
                    continue;
                }

                long target2 = (long) target - nums[i] - nums[j];

                int left = j + 1;
                int right = num - 1;

                while (left < right) {
                    long s = (long) nums[left] + nums[right];

                    if (s < target2) {
                        left++;
                    } else if (s > target2) {
                        right--;
                    } else {
                        ans.add(Arrays.asList(
                            nums[i], nums[j], nums[left], nums[right]
                        ));

                        int leftVal = nums[left];
                        int rightVal = nums[right];

                        while (left < right && nums[left] == leftVal) {
                            left++;
                        }

                        while (left < right && nums[right] == rightVal) {
                            right--;
                        }
                    }
                }
            }
        }

        return ans;
    }
}
