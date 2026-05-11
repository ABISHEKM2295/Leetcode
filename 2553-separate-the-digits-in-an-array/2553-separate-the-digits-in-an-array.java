class Solution {
    public int[] separateDigits(int[] nums) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<nums.length;i++){
            sb.append(nums[i]);
        }
        String s=sb.toString();
        int[] arr=new int[s.length()];
        for(int i=0;i<s.length();i++){
            arr[i]=s.charAt(i)-'0';
        }
        return arr;
    }
}