package arrays;

public class DiagonalPrint {
    private static void diagonalPrint(int matrix [][]) {

        //Write your code here
        int m=matrix.length;
        int n=matrix[0].length;

        for(int i=0;i<m;i++){
            int j=0;
            int k=i;
            while(k>=0 && j<n){
                System.out.print(matrix[k--][j++]+ " ");
            }
            System.out.println();
        }

        for(int i=1;i<n;i++){

            int j=i;
            int k=m-1;
            while(k>=0 && j<n){
                System.out.print(matrix[k--][j++]+ " ");
            }
            System.out.println();
        }

    }


    public static void main(String[] args)
    {
        int matrix[][] = {{1, 2, 3, 4,5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20},};

        diagonalPrint(matrix);
    }
}
