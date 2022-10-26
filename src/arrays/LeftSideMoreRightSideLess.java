package arrays;

public class LeftSideMoreRightSideLess {

    public static void main(String[] args) {
//        int[] arr={6, 2, 5, 4, 7, 9, 11, 8, 10};
        int[] arr={5,1,4,4};
        System.out.println(findNumber(arr,arr.length));

    }

    static int findNumber(int [] array, int n){
        int[] left= new int[n];
        left[0]=Integer.MIN_VALUE;
        for(int i=1;i<n;i++){
            left[i]=Math.max(left[i-1],array[i-1]);
        }
        int right=Integer.MAX_VALUE;
        for(int i= array.length-2;i>=0;i--){
            if(array[i]>left[i] && right>array[i]) return array[i];
            right=Math.min(array[i],right);
        }

        return -1;
    }

}
