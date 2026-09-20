public class Q1401 {
    public boolean checkOverlap(int radius, int xCenter, int yCenter, int x1, int y1, int x2, int y2) {
        // Circle Inside the rectangle (Checking if the radius is inside the Rectangle)
        if(xCenter>=x1&&xCenter<=x2&&yCenter>=y1&&yCenter<=y2){
            return true;
        }
        // line 1
        for(int i=y1;i<=y2;i++){
            if(Math.pow((xCenter-x1),2)+Math.pow((yCenter-i),2)<=Math.pow(radius,2)){
                return true;
            }
        }
        // line 2
        for(int i=y1;i<=y2;i++){
            if(Math.pow((xCenter-x2),2)+Math.pow((yCenter-i),2)<=Math.pow(radius,2)){
                return true;
            }
        }
        // line 3
        for(int i=x1;i<x2;i++){
            if(Math.pow((xCenter-i),2)+Math.pow((yCenter-y1),2)<=Math.pow(radius,2)){
                return true;
            }
        }
        for(int i=x1;i<x2;i++){
            if(Math.pow((xCenter-i),2)+Math.pow((yCenter-y2),2)<=Math.pow(radius,2)){
                return true;
            }
        }
        return false;
    }
}
