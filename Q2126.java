import java.util.Arrays;

public class Q2126 {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        Arrays.sort(asteroids);
        int i=0;
        int j = asteroids.length-1;
        while(i<=j){
            if(asteroids[j]<=mass){
                mass+=asteroids[j--];
            }
            else if(asteroids[i]<=mass){
                mass+=asteroids[i++];
            }
            else{
                return false;
            }
        }
        return true;
    }
}