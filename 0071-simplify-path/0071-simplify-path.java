class Solution {
    public String simplifyPath(String path) {
        String[] s=path.split("/");
        Stack<String> st=new Stack<>();
        for(String a:s){
            if(a.equals("") || a.equals(".")){
                continue;
            }
            if(a.equals("..")){
                if(!st.isEmpty()){
                    st.pop();
                }
            }else{
                st.push(a);
            }
        }
        StringBuilder sb=new StringBuilder();
        while(!st.isEmpty()){
            sb.insert(0,"/"+st.pop());
        }
        return sb.length()==0?"/":sb.toString();
    }
}