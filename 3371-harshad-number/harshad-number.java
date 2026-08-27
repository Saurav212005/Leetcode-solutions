class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        if(x<10){
            return x;
        }
        if(x==100){
            return 1;
        }
        int v=x/10+x%10;
        if(x%v==0){
            return v;
        }
        return -1;
    }
}