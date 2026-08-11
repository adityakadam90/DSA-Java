public class eocount{
    public static boolean checkeo(int n){
        if(n % 2 == 0){
            return true;
        }
        return false;
    }
    public static void main(String args[]){
        int arr [] = {12,3,4,4,5,21,30,20};
        int ec = 0;
        int oc = 0;
    
        for(int i=0;i<arr.length;i++){
            
            if(checkeo(arr[i])){
                ec++;
            }else {
                oc++;
            }
        }
        System.out.println("count of even is  = "+ec);
        System.out.println("count of odd is = "+oc);
    }
}