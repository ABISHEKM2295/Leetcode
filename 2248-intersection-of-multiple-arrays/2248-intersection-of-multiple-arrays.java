class Solution {
    public List<Integer> intersection(int[][] nums) {
        List<Integer> li=new ArrayList<>();
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[i].length;j++){
                map.put(nums[i][j],map.getOrDefault(nums[i][j],0)+1);
            }
        }
        int n=nums.length;
        for(int num:map.keySet()){
            if(map.get(num)==n){
                li.add(num);
            }
        }Collections.sort(li);
        return li;
    }
}