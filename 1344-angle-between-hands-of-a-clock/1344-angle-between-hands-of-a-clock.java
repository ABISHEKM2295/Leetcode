class Solution {
    public double angleClock(int hour, int minutes) {
        double ans=Math.abs((30*hour)-(5.5*minutes));
        return Math.min(ans,Math.abs(ans-360));
    }
}