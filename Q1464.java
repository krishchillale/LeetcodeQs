public class Q1464 {
    public int maxProduct(int[] nums) {
        int first = -1,sec=-1;
        for(int x :nums){
            if(first==-1){
                first=x;
            }
            else if(sec==-1){
                if(x>first){
                    sec=first;
                    first=x;
                }
                else{
                    sec=x;
                }
            }
            else{
                if(x>first){
                    sec=first;
                    first=x;
                }
                else if (x>sec){
                    sec=x;
                }
            }
        }
        return (first-1)*(sec-1);
    }
}
