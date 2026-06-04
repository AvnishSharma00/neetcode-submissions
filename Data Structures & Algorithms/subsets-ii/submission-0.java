class Solution {

    public void generate(int[] nums, int start,
                         List<Integer> current,
                         List<List<Integer>> result) {

        result.add(new ArrayList<>(current));

        for(int i = start; i < nums.length; i++) {

            if(i > start && nums[i] == nums[i - 1]) {
                continue;
            }

            current.add(nums[i]);

            generate(nums, i + 1, current, result);

            current.remove(current.size() - 1);
        }
    }

    public List<List<Integer>> subsetsWithDup(int[] nums) {

        Arrays.sort(nums);

        List<List<Integer>> result = new ArrayList<>();

        generate(nums, 0, new ArrayList<>(), result);

        return result;
    }
}