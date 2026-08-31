public class Q60 {
    public String getPermutation(int n, int k) {
            int [] hash = new int [10];
            StringBuilder sb = new StringBuilder("");
            int temp = n;
            int count=0;
            while(sb.length()<n){
                for(int i=1;i<=n;i++){
                    if(hash[i]==1){
                        continue;
                    }
                    if(count+Fact(temp-1)>=k){
                        sb.append((char)(i+'0'));
                        temp--;
                        hash[i]=1;
                        break;

                    }
                    count+=Fact(temp-1);
                }
            }
            return sb.toString();
    }
    static int Fact(int n){
        if(n==0||n==1){
            return 1;
        }
        return n*Fact(n-1);
    }
}
