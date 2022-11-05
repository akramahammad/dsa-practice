package arrays;

public class MaxSumSubarray {
    public static void main (String[] args)
    {
//        int [] a = {-5,6,-7,1,4,-8,16};
//        int [] a = {-2,1,-3,4,-1,2,1,-5,4};
        int [] a = {-4, 2, -5, 1, 2, 3, 6, -5, 1};
//        int [] a = {1};
        System.out.println("Maximum contiguous sum is " + maxSubArraySum(a));
    }

    static int maxSubArraySum(int array[])
    {
        //Write your code here
        int sum=0;
        int maxSum=0;

        for(int i=0;i<array.length;i++){
            if(sum+array[i]<0){
                sum=0;
            }
            else {
                sum+=array[i];
            }
            maxSum=Math.max(maxSum,sum);
        }
        return maxSum;
    }
}
