package arrays;

public class CelebrityProblem {
    static int matrix[][] = {
            { 0, 0, 1, 0 },
            { 0, 0, 1, 0 },
            { 0, 0, 0, 0 },
            { 0, 0, 1, 0 } };

    static boolean verifyIfCelebrity(int x)
    {
        boolean celebrity=true;
        for (int i=0;i< matrix.length;i++){
            if(matrix[x][i]!=0) celebrity=false;
        }
        for (int i=0;i< matrix.length;i++){
            if(i==x) continue;
            if(matrix[i][x]!=1) celebrity=false;
        }
        return celebrity;
    }
    // Returns -1 if celebrity is not present. If present,returns id (value from 0 to n-1).
    static int findCelebrity(int n)
    {
        int x=0;
        int y=n-1;
        while(x<y){
            if(matrix[x][y]==1){
                x++;
            }
            else{
                y--;
            }
        }
        boolean celebrity=verifyIfCelebrity(x);
        if (celebrity) return x;
        return -1;
    }

    public static void main(String[] args)
    {
        int n = 4;
        int result = findCelebrity(n);
        if (result == -1)
        {
            System.out.println("No Celebrity");
        }
        else
            System.out.println("Celebrity is " + result);
    }
}
