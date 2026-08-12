class Solution {
    public int leastBricks(List<List<Integer>> wall) {
        Map<Integer,Integer> map=new HashMap<>();
        int best=0;
        for(List<Integer> li:wall){
            int sum=0;
            for(int i=0;i<li.size()-1;i++){
                sum+=li.get(i);
                map.put(sum,map.getOrDefault(sum,0)+1);
                best=Math.max(best,map.get(sum));
            }
        }return wall.size()-best;
    }
}