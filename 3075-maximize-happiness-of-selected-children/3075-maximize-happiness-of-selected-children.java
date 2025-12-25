class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        Arrays.sort(happiness);
        long res=happiness[happiness.length-1];
        int j=1;
        for(int i=happiness.length-2;i>=0 && j<k;i--){
            long curr=happiness[i]-j;
            if(curr<=0) break;
            res+=curr;
            j++;

        }return res;
    }
}