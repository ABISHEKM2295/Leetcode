class Solution {
    public long minCost(String s, int[] cost) {
        if(s.length() == 1) return 0;
        long res=0;
        Map<Character,Long> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0L)+cost[i]);
        }
        if(map.size()==1) return 0;
        long[] arr=new long[map.size()];
        int j=0;
        for(long num:map.values()){
            arr[j++]=num;
        }
        Arrays.sort(arr);
        for(int i=0;i<arr.length-1;i++){
            res+=arr[i];
        }return res;
    }
}