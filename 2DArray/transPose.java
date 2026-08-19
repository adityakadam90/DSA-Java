public class transPose {
    public static void PrintArr(int arr[][]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int arr[][] = {{1,2,3},{4,5,6}};
        PrintArr(arr);
        int rows = arr.length;
        int col = arr[0].length;
        int trans[][] = new int[col][rows];

        for(int i=0;i<rows;i++){
            for(int j=0;j<col;j++){
                trans[j][i] = arr[i][j];
            }
        }
        System.out.println();
        for(int i=0;i<col;i++){
            for(int j=0;j<rows;j++){
                System.out.print(trans[i][j]+" ");
            }
            System.out.println();
        }
    }
}
