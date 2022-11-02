package arrays;

public class SpiralPrint {
    static void spiralPrint(int m, int n, int matrix[][])
    {
        int k =m%2==0?((m/2)-1):m/2;
        for(int i=0;i<=k;i++){

            for(int p=i;p<n-1-i;p++){
                System.out.print(matrix[i][p]+ " ");
            }
            for(int p=i;p<m-1-i;p++){
                System.out.print(matrix[p][n-1-i]+ " ");
            }
            for(int p=n-1-i;p>i;p--){
                System.out.print(matrix[m-1-i][p]+ " ");
            }
            for(int p=m-1-i;p>i;p--){
                System.out.print(matrix[p][i]+ " ");
            }
        }
    }


    public static void main(String[] args)
    {
        int R = 4;
        int C = 4;
        int matrix[][] = {
                { 1, 2, 3, 4},
                { 5, 6, 7, 8},
                { 9, 10, 11, 12},
                { 13, 14, 15, 16 }
        };
        spiralPrint(R, C, matrix);
    }
}
