public class Q3633 {
    public static int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        ;
        // land first
        int n = landStartTime.length;
        int m = waterStartTime.length;
        int c1 = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            c1=Math.min(c1,landStartTime[i]+landDuration[i]);
        }
        int c2=Integer.MAX_VALUE;
        for(int i=0;i<m;i++){
            if(waterStartTime[i]>=c1){
                c2=Math.min(c2,waterDuration[i]+waterStartTime[i]);
            }
            else{
                c2=Math.min(c2,c1+waterDuration[i]);
            }
        }
        //  water first;
        int d1=Integer.MAX_VALUE;
        int d2=Integer.MAX_VALUE;
        for(int i=0;i<m;i++){
            d1=Math.min(d1,waterDuration[i]+waterStartTime[i]);
        }
        for(int i=0;i<n;i++){
            if(landStartTime[i]>=d1){
                d2=Math.min(d2,landDuration[i]+landStartTime[i]);
            }
            else{
                d2=Math.min(d2,d1+landDuration[i]);
            }
        }
        return Math.min(c2,d2);
    }
}
