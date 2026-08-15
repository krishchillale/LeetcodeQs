import java.util.HashSet;

public class Q3043 {
        public static  int longestCommonPrefix(int[] arr1, int[] arr2) {
            HashSet<Integer> set = new HashSet<>();
            for(int i=0;i< arr1.length;i++){
                int temp=arr1[i];
                while(temp>0){
                    set.add(temp);
                    temp/=10;
                }
            }
            int max= 0;
            for(int i=0;i<arr2.length;i++) {
                int temp = arr2[i];
                int count=0;
                while(temp>0){
                    count++;
                    temp/=10;
                }
                temp=arr2[i];
                while(temp>0){
                    if(set.contains(temp)){
                        max=Math.max(max,count);
                        break;
                    }
                    temp/=10;
                    count--;
                }
            }
            return max;
        }

    public static void main(String[] args) {
        int  [] arr1 = {1,10,100};
        int  [] arr2 = {1000};
        System.out.println(longestCommonPrefix(arr1,arr2));
    }
}
