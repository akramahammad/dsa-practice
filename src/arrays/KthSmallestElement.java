package arrays;

public class KthSmallestElement {
    public static void main(String args[])
    {

//        int array[] = {54, 26, 93, 17, 77, 31, 44,20,55};
//        int array[] = {7, 10, 4, 3, 20, 15};
        int array[] = {12, 3, 5, 7, 19};
        int n = array.length,k = 2;
        System.out.println("K'th smallest element is "+
                KthSmallestElement.findKthElement(array, 0, n-1, k));
    }

    static int findKthElement(int array[], int low, int high, int k)
    {
        int index=divideArray(array,low,high);
        if(index==k-1){
            return array[index];
        }
        else if(index>k-1){
            return findKthElement(array,low,index-1,k);
        }
        else {
            return findKthElement(array,index+1,high,k);
        }
    }

    static int divideArray(int[] array,int low, int high){
        int j=-1;
        for(int i=low;i<high;i++) {
            if(array[i]>array[high] && j==-1){
                j=i;
            }
            if(array[i]<array[high]){
                if(j!=-1){
                    int temp=array[j];
                    array[j]=array[i];
                    array[i]=temp;
                    j++;
                }
            }
        }
        if(j==-1) return high;

        int temp=array[j];
        array[j]=array[high];
        array[high]=temp;
        return j;
    }


}
