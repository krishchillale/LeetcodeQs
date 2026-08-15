import java.util.ArrayList;
import java.util.List;

public class Q1441 {
    public List<String> buildArray(int[] target, int n) {
        int i=1;
        int j=0;
        List<String> l = new ArrayList<>();
        while(i<=n&&j<target.length){
            l.add("Push");
            if(i!=target[j]){
                i++;
                l.add("Pop");
            }
            else{
                i++;
                j++;
            }
        }
        return l;
    }
}
