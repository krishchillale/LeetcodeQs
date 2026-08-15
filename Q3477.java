public class Q3477 {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int unplaced=0;
        int n = fruits.length;
        int m = baskets.length;
        int start=0;
        for(int i=0;i<n;i++) {
            int flag=0;
            for(int j=start;j<m;j++){
                if(baskets[j]==0){
                    continue;
                }
                if(fruits[i]<=baskets[j]){
                    flag=1;
                    baskets[j]=0;
                    break;
                }
                else{
                    start=j;
                }
            }
            if(flag==0){
                unplaced++;
            }
        }
        return unplaced;
    }
}
