class Solution {
    public void bak(int start,List<Integer> li,List<List<Integer>> res,int n,int k){
        if(li.size()==k){
            res.add(new ArrayList<>(li));
            return;
        }
        for(int num=start;num<=n;num++){
            li.add(num);
            bak(num+1,li,res,n,k);
            li.remove(li.size()-1);
        }
    }
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> li=new ArrayList<>();
        bak(1,li,res,n,k);
        return res;
    }
}