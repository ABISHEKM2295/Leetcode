class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int[] arr=new int[A.length];
        Set<Integer> s=new HashSet<>();
        int count=0;
        for(int i=0;i<A.length;i++){
            if(s.contains(A[i])) count++;
            s.add(A[i]);
            if(s.contains(B[i])) count++;
            s.add(B[i]);
            arr[i]=count;
        }return arr;
    }
}