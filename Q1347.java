public class Q1347 {
    public int minSteps(String s, String t) {
        int n = s.length();
        int [] hash1  = new int [26];
        int [] hash2  = new int [26];
        for(int i=0;i<n;i++){
            hash1[(int)s.charAt(i)-97]++;
            hash2[(int)t.charAt(i)-97]++;
        }
        int count=0;
        for(int i=0;i<26;i++){
            count+=Math.abs(hash1[i]-hash2[i]);
        }
        return count/2;
    }
}
// The logic overhere is that The number of alphabets which are the same of or the same number we won't change them
// we will only change the alphabets which are diff by the difference btw s and t
// While returning we are dividing it by 2 cuz we are changing the alphabet of which the count is not matched so if we have one mismatch for an alphabet then it is ibvio that therw will also be one mismtach for it.
// So we are returning it by dividing it by 2