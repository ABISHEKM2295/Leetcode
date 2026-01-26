class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> li=new ArrayList<>();
        Arrays.sort(arr);
        int diff=Integer.MAX_VALUE;
        for(int i=1;i<arr.length;i++){
            diff=Math.min(diff,Math.abs(arr[i]-arr[i-1]));
        }
        for(int i=1;i<arr.length;i++){
                if(Math.abs(arr[i-1]-arr[i])==diff){
                    List<Integer> ele=new ArrayList<>();
                    ele.add(arr[i-1]);
                    ele.add(arr[i]);
                    li.add(ele);
                }
        }return li;
    }
}