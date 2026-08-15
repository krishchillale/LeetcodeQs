import java.util.Arrays;

public class Q950 {
    public int[] deckRevealedIncreasing(int[] deck) {
        int n = deck.length;
        int [] res = new int [n];
        Arrays.sort(deck);
        int i=0,k=0;
        while(k<n){
            while(res[i]!=0){
                i=(i+1)%n;
            }
            res[i]=deck[k++];
            if(k<n){
                while(res[i]!=0){
                    i=(i+1)%n;
                }
                i=(i+1)%n;
            }
        }
        return res;
    }
}
