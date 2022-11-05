package arrays;

public class SearchElementSortedMatrix {
    private static void searchElement(int[][] matrix, int n, int x)
    {
        int p=0;
        int q=n-1;
        while(p<n && q>=0){
            if(matrix[p][q]==x){
                System.out.println("Element is in row : "+ (p+1) +" and column " + (q+1));
                return;
            }
            else if (matrix[p][q]<x){
                p++;
            }
            else{
                q--;
            }
        }
        System.out.println("Element not present in matrix");
    }

    public static void main(String[] args)
    {
        int matrix[][] = { { 10, 20, 30, 40 },
                { 15, 25, 36, 46 },
                { 28, 29, 37, 48 },
                { 32, 33, 39, 50 } };

        searchElement(matrix, 4, 37);
    }
}
