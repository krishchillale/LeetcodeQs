import java.util.ArrayList;
import java.util.List;

public class Q93 {
    public List<String> restoreIpAddresses(String s) {
        List<String> result = new ArrayList<>();
        if(s.length()>12||s.length()<4){
            return result;
        }
        helper(s,0,result,3,"");
        return result;
    }
    static void helper(String s,int i,List<String> result, int dots,String ans){
        if(dots==0){
            if(i==s.length()||s.length()-i>3||(s.length()-i>1&&s.charAt(i)=='0')||Integer.parseInt(s.substring(i))>255) {
                return;
            }
            result.add(ans+s.substring(i,s.length()));
            return;
        }
        if(i>=s.length()){
            return;
        }
        if(s.charAt(i)=='0'){
               helper(s, i+1, result, dots-1, ans+"0.");
               return;
        }
        StringBuilder sb = new StringBuilder("");
        for(int j=i;j<i+3&&j<s.length();j++){
            sb.append(s.charAt(j));
            if(Integer.parseInt(sb.toString())<256){
                helper(s,j+1,result,dots-1,ans+sb.toString()+'.');
            }
        }
    }
}
