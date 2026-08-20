public class Q4024 {
    public int nearestDrone(int[][] drones, int[] target) {
        int x = target[0];
        int y = target[1];
        int min = Integer.MAX_VALUE,index=-1;
        for(int i=0;i<drones.length;i++){
            int manhattan = Math.abs(x-drones[i][0])+Math.abs(y-drones[i][1]);
            if(manhattan<=drones[i][2]){
                if(min>manhattan){
                    min=manhattan;
                    index=i;
                }
            }
        }
        return index;
    }
}
