public class Q2022 {
    public int[][] construct2DArray(int[] original, int m, int n) {
        if(m*n!=original.length){
            return new int [][]{};
        }
        int k=0;
        int [][] result = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                result[i][j]=original[k++];
            }
        }
        return  result;
    }
}
