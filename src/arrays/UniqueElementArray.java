package arrays;

public class UniqueElementArray {
    static int findSingle(int array[], int array_size)
    {
        int result=array[0];
        for(int i=1;i<array_size;i++){
            result=result^array[i];
        }
        return result;
    }

    public static void main (String[] args)
    {
        int array[] = {6,2,4,3,4,5,5,2,3};
        int n = array.length;
        System.out.println("Element is " +
                findSingle(array, n) + " ");
    }
}
