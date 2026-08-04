class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> li=new ArrayList<>();
        Set<Integer> s=new HashSet<>();
        int min=nums[0],max=nums[0];
        for(int n:nums){
            min=Math.min(n,min);
            max=Math.max(n,max);
            s.add(n);
        }
        for(int i=min;i<=max;i++){
            if(!s.contains(i)) li.add(i);
        }return li;
    }
}