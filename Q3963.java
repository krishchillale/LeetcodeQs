public class Q3963 {
    public String[] createGrid(int m, int n) {
        String [] arr = new String[m];
        for(int i=0;i<m;i++){
            StringBuilder sb = new StringBuilder();
            for(int j=0;j<n;j++){
                sb.append('#');
            }
            arr[i] = sb.toString();
        }
        for(int i=0;i<m;i++){
            arr[i] = '.' + arr[i].substring(1);
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<n;i++){
            sb.append('.');
        }
        arr[m-1]=sb.toString();
        return arr;
    }
}
