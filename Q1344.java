public class Q1344 {
    public double angleClock(int hour, int minutes) {
        // position of minutes
        double ma = (double) 6*minutes;
        double addition = 0.5*minutes;
        double ha = 30.0*hour+addition;
        double ans;
        if(ha>ma){
            ans=Math.min(ha-ma,360-(ha-ma));
        }
        else{
            ans=Math.min(ma-ha,360-(ma-ha));
        }
        return ans;
    }
}