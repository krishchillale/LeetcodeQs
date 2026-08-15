import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;

public class Q1288 {
    public int removeCoveredIntervals(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingDouble(o->o[0]));
        int count=0;
        int n = intervals.length;
        int prev1=-1,prev2=-1;
        for(int i=0;i<n;i++){
            if(prev1<intervals[i][0]&prev2>=intervals[i][1]){
                count++;
            }
            else if(prev1==intervals[i][0]&&prev2<=intervals[i][1]){
                count++;
                prev1=intervals[i][0];
                prev2=intervals[i][1];
            }
            else{
                prev1=intervals[i][0];
                prev2=intervals[i][1];

            }
        }
        return n-count;
    }
}
