public class Q1247 {
    public int minimumSwap(String s1, String s2) {
        StringBuilder sb1 = new StringBuilder(s1);
        StringBuilder sb2 = new StringBuilder(s2);
        int n = sb1.length();
        int swap=0;
        int xy=0,yx=0;
        for (int i = 0; i <= n; i++) {
            if(sb1.charAt(i)=='x'&& sb2.charAt(i)=='y'){
                xy++;
            }
            else if (sb1.charAt(i)=='y'&&sb2.charAt(i)=='x'){
                yx++;
            }
        }
        swap+=xy/2;
        swap+=yx/2;
        if((xy%2==1&&yx%2==0)||(yx%2==1&&xy%2==1)){
            return -1;
        }
        if(xy%2==1&&yx%2==1){
            swap+=2;
        }
        return swap;
    }
}
