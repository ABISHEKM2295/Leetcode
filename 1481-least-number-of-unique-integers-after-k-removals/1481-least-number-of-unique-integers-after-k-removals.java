class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int num:arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int[] nums=new int[map.size()];
        int a=0;
        for(int num:map.values()){
            nums[a]=num;
            a++;
        }
        Arrays.sort(nums);
        int removed = 0;
        for (int f : nums) {
            if (k >= f) {
                k -= f;
                removed++;
            } else {
                break;
            }
        }return nums.length-removed;
    }
}