public class Q2433 {
    public int[] findArray(int[] pref) {
        int n = pref.length;
        int [] org = new int [n];
        org[0]=pref[0];
        for(int i=1;i<n;i++){
            org[i] = pref[i]^pref[i-1];
        }
        return org;
    }
}
