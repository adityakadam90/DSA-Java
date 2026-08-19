public class spiral {

    public static void printArr(int arr[][]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void spiralPrint(int arr[][]){
        int startCol = 0;
        int startRow = 0;
        int endCol = arr[0].length-1;
        int endRow = arr.length-1;

        while(startRow <=endRow && startCol <= endCol){
            //top
            for(int i=startCol;i<=endCol;i++){
                System.out.print(arr[startRow][i]+",");
            }
            //right
            for(int j=startRow+1;j<=endRow;j++){
                System.out.print(arr[j][endCol]+",");
            }
            //bottom
            for(int i=endCol-1;i>=startCol;i--){
                System.out.print(arr[endRow][i]+",");
            }
            //left
            for(int i=endRow-1;i>=startRow+1;i--){
                System.out.print(arr[i][startCol]+",");
            }
            startCol++;
            startRow++;
            endCol--;
            endRow--;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int mar[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        printArr(mar);
        ///System.out.println();
        spiralPrint(mar);
    }
}
