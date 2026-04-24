class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int rc=0,lc=0;
        for(int i=0;i<moves.length();i++){
            if(moves.charAt(i)=='L') lc++;
            if(moves.charAt(i)=='R') rc++;
        }
        int len=Math.min(rc,lc);
        return moves.length()-(2*len);
    }
}