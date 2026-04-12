class Solution {
    public int trap(int[] h) {
        int n=h.length;
        int[] maxl=new int[h.length];
        int[] maxr=new int[h.length];
        int max=-1;
        for(int i=0;i<n;i++){
            if(max<h[i]) max=h[i];
            maxl[i]=max;
        }
        max=-1;
        for(int i=n-1;i>=0;i--){
            if(max<h[i]) max=h[i];
            maxr[i]=max;
        }
        int tot=0;
        for(int i=0;i<n;i++){
            tot+=Math.min(maxl[i],maxr[i])-h[i];
        }return tot;
    }
}