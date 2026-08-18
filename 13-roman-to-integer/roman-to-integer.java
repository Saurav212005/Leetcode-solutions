class Solution {
    public int romanToInt(String s) {
        int t=0;int p=0;
        for(int i=s.length()-1;i>=0;i--){
            int c=0;
            switch(s.charAt(i)){
                case 'I':
                    c=1;
                    break;
                case 'V':
                    c=5;
                    break;
                case 'X':
                    c=10;
                    break;
                case 'L':
                    c=50;
                    break;
                case 'C':
                    c=100;
                    break;
                case 'D':
                    c=500;
                    break;
                case 'M':
                    c=1000;
                    break;

            }
            if(c<p){
                t=t-c;
            }
            else{
                t=t+c;
            }
            p=c;


        }
        return t;
    }
}