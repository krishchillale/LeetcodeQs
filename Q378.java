public class Q378 {
    public int kthSmallest(int[][] matrix, int k) {
        int count=0;
        int n = matrix.length;
        int m = matrix[0].length;
        int [] index = new int [n];
        int ans = -1;
        for(int i=0;i<k;i++){
            int min = Integer.MAX_VALUE;
            int x = -1;
            for(int j=0;j<n;j++){
                if(index[j]<m&&matrix[j][index[j]]<min){
                    min = matrix[j][index[j]];
                    x = j;
                }
            }
            ans = min;
            index[x]++;
        }
        return ans;
    }
}
