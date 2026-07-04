class Solution {
    public int minScore(int n, int[][] roads) {
        List<List<int[]>> li=new ArrayList<>();
        for(int i=0;i<=n;i++){
            li.add(new ArrayList<>());
        }
        for(int[] a:roads){
            int u=a[0];
            int v=a[1];
            int w=a[2];
            li.get(u).add(new int[]{v,w});
            li.get(v).add(new int[]{u,w});
        }
        Queue<Integer> q=new LinkedList<>();
        int res=Integer.MAX_VALUE;
        boolean[] b=new boolean[n+1];
        b[1]=true;
        q.offer(1);
        while(!q.isEmpty()){
            int c=q.poll();
            for(int[] d:li.get(c)){
                int nei=d[0];
                int w=d[1];
                res=Math.min(res,w);
                if(!b[nei]){
                    b[nei]=true;
                    q.offer(nei);
                }
            }
        }return res;
    }
}