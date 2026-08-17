class Solution {
    public void fun(List<String> res,int l,int r,String s,int n){
        if(s.length()==n*2){
            res.add(s);
            return;
        }
        if(l<n){
            fun(res,l+1,r,s+"(",n);
        }
        if(r<l){
            fun(res,l,r+1,s+")",n);
        }
    }
    public List<String> generateParenthesis(int n) {
        List<String> res=new ArrayList<>();
        fun(res,0,0,"",n);
        return res;
    }
}