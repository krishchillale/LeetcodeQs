public class Q394 {
   static class Pair{
        int end;
        String s;

        public Pair(int end,String s){
            this.end=end;
            this.s=s;
        }
    }
    public String decodeString(String s) {
       int n = s.length();
       StringBuilder sb = new StringBuilder();
       for(int i=0;i<n;i++){
           int alpha = (int) s.charAt(i)-97;
           if(alpha<0||alpha>25){
               StringBuilder num = new StringBuilder();
               while (s.charAt(i)!='['){
                   num.append(s.charAt(i++));
               }
               Pair p = helper(s,i+1,Integer.parseInt(num.toString()));
               sb.append(p.s);
               i=p.end;
           }
           else{
               sb.append(s.charAt(i));
           }

       }
       return sb.toString();
    }
    static Pair helper(String s,int i,int k){
        StringBuilder sb = new StringBuilder();
        while (s.charAt(i)!=']'){
            int alpha = (int) s.charAt(i)-97;
            if(alpha<0||alpha>25){
                StringBuilder num = new StringBuilder();
                while (s.charAt(i)!='['){
                    num.append(s.charAt(i++));
                }
                Pair p = helper(s,i+1,Integer.parseInt(num.toString()));
                sb.append(p.s);
                i=p.end;
            }
            else{
                sb.append(s.charAt(i));
            }
            i++;
        }
        String curr = sb.toString();
        for(int j=1;j<k;j++){
            sb.append(curr);
        }
        return new Pair(i,sb.toString());
    }
}
