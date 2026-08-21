class Solution {
    public int[] resultArray(int[] nums) {
        int[] arr=new int[nums.length];
        List<Integer> l1=new ArrayList<>();
        List<Integer> l2=new ArrayList<>();
        l1.add(nums[0]);
        l2.add(nums[1]);
        for(int i=2;i<nums.length;i++){
            if(l1.get(l1.size()-1) >= l2.get(l2.size()-1)) l1.add(nums[i]);
            else l2.add(nums[i]);
        }
        int k=0;
        for(int num:l1){
            arr[k++]=num;
        }
        for(int num:l2){
            arr[k++]=num;
        }return arr;
    }
}