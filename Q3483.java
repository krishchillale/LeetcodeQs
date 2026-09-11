public class Q3483 {
        public int totalNumbers(int[] digits) {
            int [] hash = new int [10];
            for(int i=0;i< digits.length;i++){
                hash[digits[i]]++;
            }
            int ans=0;
            for(int i=1;i<10;i++){
                if(hash[i]!=0){
                    hash[i]--;
                    for(int j=0;j<10;j++){
                        if(hash[j]!=0){
                            hash[j]--;
                            for(int k=0;k<9;k++){
                                if(hash[k]!=0){
                                    ans++;
                                }
                            }
                            hash[j]++;
                        }
                    }
                    hash[i]++;
                }
            }
            return ans;
        }
}
