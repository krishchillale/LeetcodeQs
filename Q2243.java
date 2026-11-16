public class Q2243 {
    public String digitSum(String s, int k) {
        StringBuilder ans = new StringBuilder(s);
        while (ans.length()>k){
            StringBuilder sub = new StringBuilder("");
            for(int i=0;i<ans.length();i++){
                int sum=0;
                int count=0;
                while (i<ans.length()&&count<k){
                    sum+=ans.charAt(i++)-'0';
                    count++;
                }
                if(i!=ans.length()){
                    i--;
                }
                sub.append(Integer.toString(sum));
            }
            ans=sub;
        }
        return ans.toString();
    }
}
