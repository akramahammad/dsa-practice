package arrays;

import java.util.Arrays;

public class Sort012 {

    public static void Sort012(int[] array, int end) {
        //Practise Yourself : Write your code Here

        int low=0;
        int high=end;
        int mid=low+1;
        while(mid<=high){
            if(array[mid]==0){
                int temp =array[mid];
                array[mid]=array[low];
                array[low]=temp;
                low++;
            }
            else if(array[mid]==2){
                int temp =array[mid];
                array[mid]=array[high];
                array[high]=temp;
                high--;
            }
            else{
                mid++;
            }

        }
    }

    public static void main(String[] args) {
        int[] array = { 2,0,1};

        Sort012(array, array.length - 1);
        System.out.println(Arrays.toString(array));
    }
}
