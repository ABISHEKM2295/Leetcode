class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> li=new ArrayList<>();
        for(int i=0;i<rowIndex+1;i++){
            List<Integer> a=new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j==0 || j==i) a.add(1);
                else{
                    List<Integer> prev=li.get(i-1);
                    a.add(prev.get(j-1)+prev.get(j));
                }
            }li.add(a);
        }
        return li.get(rowIndex);
    }
}