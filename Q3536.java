public class Q3536 {
    public int maxProduct(int n) {
        int temp=n;
        int first = -1,sec=-1;
        while(temp>0){
            int digit=temp%10;
            if(first==-1){
                first=digit;
            }
            else if(sec==-1){
                if(first<digit){
                    sec=first;
                    first=digit;
                }
                else{
                    sec=digit;
                }
            }
            else{
                if(first<digit){
                    sec=first;
                    first=digit;
                }
                else if(sec<digit){
                    sec=digit;
                }
            }
            temp=temp/10;
        }
        return first*sec;
    }
}
