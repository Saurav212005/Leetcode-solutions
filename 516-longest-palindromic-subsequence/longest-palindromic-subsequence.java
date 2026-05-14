class Solution {
    public int longestPalindromeSubseq(String s) {
    int m=s.length();
    String s1=new StringBuilder(s).reverse().toString();
    int n=s1.length();
    int two[][]=new int[m+1][n+1];
    for(int i=1;i<m+1;i++){
        for(int j=1;j<n+1;j++){
            if(s.charAt(i-1)==s1.charAt(j-1)){
                 two[i][j]=(two[i-1][j-1])+1;
            }
            else{
                two[i][j]=Math.max(two[i][j-1],two[i-1][j]);
            }
        }
    }return two[m][n];
    }
}