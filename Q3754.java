public class Q3754 {
    public long sumAndMultiply(int n) {
        String s = Integer.toString(n);
        long sum=0;
        long num=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='0'){
                continue;
            }
            sum+=s.charAt(i)-'0';
            num=num*10+s.charAt(i)-'0';
        }
        return sum*num;
    }
}
