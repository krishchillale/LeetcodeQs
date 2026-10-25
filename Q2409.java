public class Q2409 {
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int [] arr = {0,31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int AAM = Integer.parseInt(arriveAlice.substring(0,2));
        int AAD = Integer.parseInt(arriveAlice.substring(3,5));
        int BAM = Integer.parseInt(arriveBob.substring(0,2));
        int BAD = Integer.parseInt(arriveBob.substring(3,5));
        int ALM = Integer.parseInt(leaveAlice.substring(0,2));
        int ALD = Integer.parseInt(leaveAlice.substring(3,5));
        int BLM = Integer.parseInt(leaveBob.substring(0,2));
        int BLD = Integer.parseInt(leaveBob.substring(3,5));
        int days=0;
        if(ALM<BAM||(ALM==BAM&&ALD<BAD)){
            return 0;
        }
        if(BLM<AAM||(BLM==AAM&&BLD<AAD)){
            return 0;
        }
        if(AAM>BAM||(AAM==BAM&&AAD>BAD)){
            if(ALM<BLM||(ALM==BLM&&ALD<BLD)){
                int start = AAM;
                int day = AAD;
                for(int i = start;i<=ALM;i++){
                    if(i==ALM){
                        days+=ALD-day+1;
                    }
                    else{
                       days+=arr[i]-day+1;
                       day=1;
                    }
                }
            }
            else{
                int start = AAM;
                int day = AAD;
                for(int i = start;i<=BLM;i++){
                    if(i==BLM){
                        days+=BLD-day+1;
                    }
                    else{
                        days+=arr[i]-day+1;
                        day=1;
                    }
                }
            }
        }
        else{
            if(ALM<BLM||(ALM==BLM&&ALD<BLD)){
                int start = BAM;
                int day = BAD;
                for(int i = start;i<=ALM;i++){
                    if(i==ALM){
                        days+=ALD-day+1;
                    }
                    else{
                        days+=arr[i]-day+1;
                        day=1;
                    }
                }
            }
            else{
                int start = BAM;
                int day = BAD;
                for(int i = start;i<=BLM;i++){
                    if(i==BLM){
                        days+=BLD-day+1;
                    }
                    else{
                        days+=arr[i]-day+1;
                        day=1;
                    }
                }
            }
        }
        return days;
    }
}
