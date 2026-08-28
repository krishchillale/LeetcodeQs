public class Q2904 {
    public String shortestBeautifulSubstring(String s, int k) {
        int n = s.length();
        int check=0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='1'){
                check++;
            }
        }
        if(check<k){
            return "";
        }
        int i=0,j=0;
        int count=0;
        String main = new String (s);
        while(i<n){
            while(i<n&&s.charAt(i)=='0'){
                i++;
            }
            while(j<n&&count<k){
                if(s.charAt(j)=='1'){
                    count++;
                }
                j++;
            }
            if(count==k){
                main = lex(s.substring(i,j),main);
            }
            i++;
            count--;
        }
        return main;
    }
    static String lex(String s,String p){
        if(s.length()<p.length()){
            return s;
        }
        else if(s.length()>p.length()){
            return p;
        }
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'&&p.charAt(i)=='0'){
                return p;
            }
            if(s.charAt(i)=='0'&&p.charAt(i)=='1'){
                return s;
            }
        }
        return p;
    }
}
