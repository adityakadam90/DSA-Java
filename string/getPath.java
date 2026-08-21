public class getPath {
    public static float shortestPath(String path){
        int x = 0,y=0;

        for(int i=0;i<path.length();i++){
            if(path.charAt(i) == 'N'){
                y = y + 1;
            }else if(path.charAt(i) == 'S'){
                y = y - 1;
            }else if(path.charAt(i) == 'W'){
                x = x - 1;
            }else {
                x = x + 1;
            }
        }
        int x2 = x * x;
        int y2 = y * y;
        return (float)Math.sqrt(x2+y2);
    }
    public static void main(String args[]){
        String path ="WNEENESENNN";

        System.out.println(shortestPath(path));
    }
}
