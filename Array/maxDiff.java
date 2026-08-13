public class maxDiff {
    public static void main(String args[]) {
        int arr[] = {2,4,10,20,11};
        int maxD = 0;
        int diff = 0;
        int i1=0,i2=0;;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                diff = arr[i] - arr[j];
                if(diff > maxD){
                    maxD = diff;
                    i1 = i;
                    i2 = j;
                }
            }
        }
        System.out.println("indesx are : "+i1+" and : "+i2);
        System.out.println(maxD);
    }
}
