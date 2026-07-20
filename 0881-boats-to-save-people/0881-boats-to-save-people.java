class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int l=0,r=people.length-1,c=0;
        while(l<=r && r>=0 && l<people.length){
            if(people[r]+people[l]<=limit){
                l++;
                r--;
            }else{
                r--;
            }
            c++;
        }return c;
    }
}