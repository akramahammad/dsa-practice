package arrays;

public class RotatedArraySearch {

    static int findNumber(int array[], int start, int end, int value)
    {
        //Write your code here
        //Result Index 7
        int pivot = findPivot(array,start,end);
        System.out.println(pivot);
        int result=-1;
        if(value >= array[0]){
            result = binarySearch(array,start,pivot, value);
        }
        else{
            result= binarySearch(array,pivot+1,end, value);
        }
        System.out.println(result);
        return result;
    }

    static int binarySearch(int array[], int start, int end, int value){
        if(start>end){
            return -1;
        }
        if(start==end){
            if(value==array[start]) return start;
            else return -1;
        }
        int mid= (start+end)/2;
        if(array[mid]==value){
            return mid;
        }
        if(array[mid]>value){
            return binarySearch(array,start,mid,value);
        }
        else{
            return binarySearch(array,mid+1,end,value);
        }
    }

    static int findPivot(int array[], int start , int end){
        if(start==end) return start;
        if(start==end-1){
            if(array[start]>array[end]){
                return start;
            }
            else{
                return end;
            }
        }
        int mid=(start+end)/2;
        if(array[mid] > array[mid+1] && array[mid] > array[mid-1]){
            return mid;
        }
        if(array[mid] < array[mid+1] && array[mid] > array[mid-1]){
            return findPivot(array,mid+1,end);
        }
        else{
            return findPivot(array,start,mid);
        }
    }

    public static void main(String args[])
    {
        int array[] = { 1, 5, 10, 50 ,60};
        int n = array.length;
        int value = 10;
        int i = findNumber(array, 0, n - 1, value);
        if (i != -1)
            System.out.println("Index: " + i);
        else
            System.out.println("Value not found");
    }
}
