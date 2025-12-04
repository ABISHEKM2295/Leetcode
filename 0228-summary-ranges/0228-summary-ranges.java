class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> li=new ArrayList<>();
        if(nums.length==0) return li;
        int start=0;
        for(int i=0;i<nums.length;i++){
            if(i==nums.length-1 || nums[i]+1!=nums[i+1]){
                StringBuilder sb=new StringBuilder();
                if(start==i){
                    sb.append(nums[start]);
                }else{
                    sb.append(nums[start]).append("->").append(nums[i]);
                }
                li.add(sb.toString());
                start=i+1;
            }
        }return li;
    }
}