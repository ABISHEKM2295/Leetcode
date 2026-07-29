class Solution {
    public int maxArea(int[] height) {
        int l=0,r=height.length-1,area=0;
        while(l<r){
            int le=Math.min(height[l],height[r]);
            int b=r-l;
            area=Math.max(area,le*b);
            if(height[l]<height[r])
            l++;
            else  r--;
        }return area;
    }
}