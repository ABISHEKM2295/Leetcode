class Solution {
    public int[] sortByBits(int[] arr) {
        Integer[] nums=new Integer[arr.length];
        for(int i=0;i<arr.length;i++){
            nums[i]=arr[i];
        }
        Arrays.sort(nums,(a,b)->{
            int counta=Integer.bitCount(a);
            int countb=Integer.bitCount(b);
            if(counta==countb) return a-b;
            return counta-countb;
        });
        for(int i=0;i<arr.length;i++){
            arr[i]=nums[i];
        }return arr;
    }
}