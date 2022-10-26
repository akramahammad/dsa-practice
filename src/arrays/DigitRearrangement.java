package arrays;

import java.util.Arrays;

public class DigitRearrangement {
    static void findNextNumber(int array[], int n)
    {
        int swap1=0;
        int swap2=0;
        for(int i=array.length-1;i>=1;i--){
            if(array[i]>array[i-1]){
                swap1=i-1;
                break;
            }
        }

        int min=Integer.MAX_VALUE;
        for(int i=swap1+1;i< array.length;i++){
            if(array[i]<min && array[i]>array[swap1]) swap2=i;
        }
        int temp =array[swap1];
        array[swap1]=array[swap2];
        array[swap2]=temp;

        Arrays.sort(array,swap1+1,array.length);
        System.out.println(Arrays.toString(array));
    }

    public static void main(String[] args)
    {
//        int array[] = { 2,1,8,7,6,5 };
//        int array[] = { 1,2,3,4};
//        int array[] = { 5,3,4,9,7,6 };
        int array[] = { 6,9,3,8,6,5,2};
        int n = array.length;
        findNextNumber(array, n);
    }

}
