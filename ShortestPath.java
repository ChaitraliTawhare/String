public class ShortestPath {
    public static void main(String[] args) {
        String str = "WNEENESENNN";
        System.out.println(calculateShortDis(str));
    }
    public static float calculateShortDis(String str){
        float Dis=0;
        int x=0;
        int y=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='W' || str.charAt(i)=='w'){
                x--;
            }
            else if(str.charAt(i)=='E' || str.charAt(i)=='e'){
                x++;
            }
            else if(str.charAt(i)=='S'|| str.charAt(i)=='s'){
                y--;
            }
            else{
                y++;
            }
        }
        int x2=x;
        int y2=y;
        float x3pow = (float)Math.pow(x2,2);
        float y3pow= (float)Math.pow(y2,2);
        Dis=(float)Math.sqrt(x3pow+y3pow);

        return Dis;
    }

}
