public class Q1524 {
    public int numOfSubarrays(int[] arr) {
            int mod = 1000000007;
            int even=0;
            int odd = 0;
            int sum=0;
            int count=0;
            int n = arr.length;
            for(int i=0;i<n;i++){
                sum+=arr[i];
                if(sum%2==0){
                    count=(count+odd)%mod;
                    even=(even)%mod+1;
                }
                else{
                    count=(count+even)%mod+1;
                    odd=(odd)%mod+1;
                }
            }
            return count;
    }
}
