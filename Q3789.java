public class Q3789 {
    public long minimumCost(int cost1, int cost2, int costBoth, int need1, int need2) {
        long total=0;
        int first=0,sec=0;
        if(cost1+cost2>costBoth){
            while (first<need1&&sec<need2){
                if(need1<need2){
                    total+=(long)((long)costBoth*(long) need1);
                    first+=need1;
                    sec+=need1;
                }
                else {
                    total+=(long)((long)costBoth*(long)need2);
                    first+=need2;
                    sec+=need2;
                }
            }
            while (first<need1){
                if(cost1>costBoth){
                    total+=(long)((long)costBoth*((long)need1-first));
                    first=need1;
                }
                else{
                    total+=(long)((long)cost1*(long)(need1-first));
                    first=need1;
                }
            }
            while (sec<need2){
                if(cost2>costBoth){
                    total+=(long)((long)costBoth*(long)(need2-sec));
                    sec=need2;
                }
                else {
                    total+=(long)((long)cost2*(long)(need2-sec));
                    sec=need2;
                }
            }
        }
        else{
            while (first<need1){
                if(cost1>costBoth){
                    total+=(long)((long)costBoth*((long)need1-first));
                    first=need1;
                }
                else{
                    total+=(long)((long)cost1*(long)(need1-first));
                    first=need1;
                }
            }
            while (sec<need2){
                if(cost2>costBoth){
                    total+=(long)((long)costBoth*(long)(need2-sec));
                    sec=need2;
                }
                else {
                    total+=(long)((long)cost2*(long)(need2-sec));
                    sec=need2;
                }
            }
        }
        return total;
    }
}
