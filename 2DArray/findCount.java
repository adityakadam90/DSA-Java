public class findCount {
    public static void main(String[] args) {
        int arr[][] = {{1,2,3},{3,5,6}};
        int count = 0;
        int key = 3;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(key == arr[i][j]){
                    count++;
                }
            }
        }
        System.out.println("count of "+key+" is = "+count);
    }
}
