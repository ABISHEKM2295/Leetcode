class Solution {
    public int compareVersion(String v1, String v2) {
        int i=0,j=0,n1=v1.length(),n2=v2.length();
        while(i< n1 || j<n2){
            int num1=0,num2=0;
            while(i<n1 && v1.charAt(i)!='.'){
                num1=num1*10+(v1.charAt(i)-'0');
                i++;
            }
            while(j<n2 && v2.charAt(j)!='.'){
                num2=num2*10+(v2.charAt(j)-'0');
                j++;
            }
            i++;
            j++;
            if(num1 > num2) return 1;
            else if(num2 > num1) return -1;
        }return 0;
    }
}