package arrays;

public class MoveZeroesToEnd {
    static void MoveZeroToEnd(int array[], int n)
    {
        //Try yourself
        //Write your Code Here
        int p1=-1;

        for(int i=0;i<n;i++){
            if(array[i]!=0){
                if(i-p1>1){
                    array[++p1]=array[i];
                    array[i]=0;
                }
                else{
                    p1++;
                }

            }
        }
    }

    public static void main (String[] args)
    {
        int array[] = {0, 1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9};
        int n = array.length;
        MoveZeroToEnd(array, n);
        System.out.println("result is: ");
        for (int i=0; i<n; i++)
            System.out.print(array[i]+" ");
    }
}
