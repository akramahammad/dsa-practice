package arrays;

public class JumpGameLinear {
    private static int Jump(int[] num)
    {
        //Practise Yourself : Write your code Here
        int jump=1;
        int jumpSteps=num[0];
        int maxJumpSteps=num[0];

        for(int i=0;i<num.length;i++){
            if(i==num.length-1) return jump;

            if(num[i]>maxJumpSteps) maxJumpSteps=num[i];
            if(jumpSteps==0){
                if(maxJumpSteps==0) return -1;
                jumpSteps=maxJumpSteps;
                jump++;
            }
            jumpSteps--;
            maxJumpSteps--;
        }

        return jump;
    }

    public static void main(String[] args)
    {
        int num[] = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};

        System.out.println("Minimum number of jumps to reach end is : "
                + Jump(num));
    }
}
