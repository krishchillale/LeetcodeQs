public class Q3838 {
    public String mapWordWeights(String[] words, int[] weights) {
        int n = words.length;;
        int m = weights.length;
        StringBuilder sb = new StringBuilder("");
        int start=0;
        for(int i=0;i<n;i++){
            int w=0;
            int k = words[i].length();
            for(int j=0;j<k;j++){
                w+=weights[words[i].charAt(j)-'a'];
            }
            w=w%26;
            start+=k;
            Character c = (char)(122-w);
            sb.append(c);
        }
        return sb.toString();
    }
}

