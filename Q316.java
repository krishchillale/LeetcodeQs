import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Q316 {
    public String removeDuplicateLetters(String s) {
        int distinct=0;
        int n = s.length();
        // Option A: Array of Queues
        @SuppressWarnings("unchecked")
        Queue<Integer>[] arr = (Queue<Integer>[]) new Queue[26];
        for (int i = 0; i < 26; i++) {
            arr[i] = new LinkedList<>();
        }
        int [] ar = new int[26];
        for(int i=0;i<26;i++){
            ar[i]=-1;
        }
        for(int i=0;i<n;i++){
            if(ar[s.charAt(i)-97]==-1){
                distinct++;
            }
            ar[s.charAt(i)-97]=i;
            arr[s.charAt(i)-97].add(i);
        }
        StringBuilder sb = new StringBuilder("");
        int start=0;
        while (sb.length()!=distinct){
            for(int i=0;i<26;i++){
                if(!arr[i].isEmpty()){
                    if(IsSafe(arr[i].peek(),i,ar)){
                        sb.append((char) (i+97));
                        start=arr[i].peek();
                        ar[i]=-1;
                        arr[i].clear();
                        break;
                    }
                }
            }
            for(int i=0;i<26;i++){
                while(!arr[i].isEmpty()&&arr[i].peek()<start){
                    arr[i].remove();
                }
            }
        }
        return sb.toString();
    }
    static boolean IsSafe(int idx,int start,int [] ar){
        int index=start+1;
        for(int i=0;i<25;i++){
            if(ar[(index+i)%26]!=-1&&idx>ar[(index+i)%26]){
                return false;
            }
        }
        return true;
    }
}
