class Solution {
    public int minimumRefill(int[] plants, int capacityA, int capacityB) {
        int tot=0;
        int l=0,r=plants.length-1;
        int rema=capacityA,remb=capacityB;
        while(l<r){
            if(plants[l]<=rema){
                rema-=plants[l];
                l++;
            }else{
                tot++;
                rema=capacityA;
                rema-=plants[l];
                l++;
            }
            if(plants[r]<=remb){
                remb-=plants[r];
                r--;
            }else{
                remb=capacityB;
                tot++;
                remb-=plants[r];
                r--;
            }
        }
        if(l==r){
            if(plants[l]>rema && plants[l]>remb){
                tot++;
            }
        }return tot;
    }
}