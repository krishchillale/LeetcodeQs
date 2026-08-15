public class Q1539 {
    public int findKthPositive(int[] arr, int k) {
        int count=0;
        int n = arr.length;
        int prev=0;
        for(int i=0;i<n;i++){
            if(arr[i]-prev>1){
                if(count+(arr[i]-prev)-1>=k){
                    return prev+(k-count);
                }
                else{
                    count+=arr[i]-prev-1;
                }
            }
            prev=arr[i];
        }
        return arr[n-1]+(k-count);
    }
}
