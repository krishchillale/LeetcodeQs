public class Q3798 {
    public String largestEven(String s) {
        StringBuilder sb = new StringBuilder(s);
        int i = s.length()-1;
        while(!sb.isEmpty()){
            if((int)(sb.charAt(i)%2)==0){
                break;
            }
            else{
                sb.deleteCharAt(i--);
            }
        }
        return sb.toString();
    }
}
