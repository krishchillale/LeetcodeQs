public class Q2114 {
    public int mostWordsFound(String[] sentences) {
        int max = Integer.MIN_VALUE;
        int n = sentences.length;
        for(int i=0;i<n;i++){
            int words=1;
            for(int j=0;j<sentences[i].length();j++){
                if(sentences[i].charAt(j)==' '){
                    words++;
                }
            }
            max=Math.max(words,max);
        }
        return max;
    }
}
