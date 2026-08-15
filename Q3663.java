public class Q3663 {
    public int getLeastFrequentDigit(int n) {
        int [] hash = new int [10];
        int temp = n;
        while(temp>0){
            hash[temp%10]++;
            temp/=10;
        }
        int min = 0;
        int mc=Integer.MAX_VALUE;
        for(int i=0;i<10;i++){
            if(hash[i]!=0&&mc>hash[i]){
                mc=hash[i];
                min=i;
            }
        }
        return min;
    }
}
