class Solution {
    public double myPow(double x, int n) {
        long pow=n;
        if(pow<0){
            x=1/x;
            pow=-pow;

        }
        double result=1;
        while(pow>0){
            if(pow%2==1){
                result *=x;

            }
            x *=x;
            pow /=2;
        }
        return result;
    }
}