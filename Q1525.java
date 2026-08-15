import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Q1525 {
    public int numSplits(String s) {
        HashSet<Character> hashSet1 = new HashSet<>();
        HashSet<Character> hashSet2 = new HashSet<>();
        int n = s.length();
        int [] arr1 = new int [n];
        int [] arr2 = new int [n];
        int count1=0;
        int count2=0;
        for(int i=0;i<n;i++){
            if(!hashSet1.contains(s.charAt(i))){
                hashSet1.add(s.charAt(i));
                count1++;
            }
            arr1[i]=count1;
            if(!hashSet2.contains(s.charAt(n-i-1))){
                hashSet2.add(s.charAt(i));
                count2++;
            }
            arr2[n-1-i]=count2;
        }
        count1=0;
        for(int i=0;i<n-1;i++){
            if(arr1[i]==arr2[i+1]){
                count1++;
            }
        }
        return count1;
    }
}
