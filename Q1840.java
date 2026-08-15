import java.util.Arrays;
import java.util.Comparator;

public class Q1840 {
    public int maxBuilding(int n, int[][] restrictions) {
        Arrays.sort(restrictions, Comparator.comparingDouble(o->o[0]));
        int k=0;
        int height=0;
        int max=Integer.MIN_VALUE;
        int r = restrictions.length;
        for(int i=1;i<=n;i++){

        }
        return max;
    }
}
