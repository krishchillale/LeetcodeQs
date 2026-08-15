public class Q201 {
    public int rangeBitwiseAnd(int left, int right) {
        StringBuilder s1 = new StringBuilder(Integer.toBinaryString(left));
        StringBuilder s2 = new StringBuilder(Integer.toBinaryString(right));
        while(s1.length()!=32&&s2.length()!=32){
            s1.insert(0,'0');
            s2.insert(0,'0');
        }
        while(s1.length()!=32){
            s1.insert(0,'0');
        }
        while (s2.length()!=32){
            s2.insert(0,'0');
        }
        int flag=0;
        StringBuilder s3 = new StringBuilder("");
        for(int i=0;i<32;i++){
            if(flag==1){
                s3.append('0');
            }
            else{
                if(s1.charAt(i)==s2.charAt(i)){
                    s3.append(s1.charAt(i));
                }
                else{
                    s3.append('0');
                    flag=1;
                }
            }
        }
        return Integer.parseInt(s3.toString(), 2);
    }
}
