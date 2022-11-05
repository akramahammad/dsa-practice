package arrays;

public class MajorityNumber {
    // Function to return majority element present in given array
    public static int majorityElement(int[] array)
    {
        int majority=array[0];
        int count=1;

        for(int i=1;i< array.length;i++){
            if(array[i]!=majority){
                count--;
            }
            else{
                count++;
            }
            if(count==0){
                majority=array[i];
                count=1;
            }
        }
        return majority;
    }

    public static void main (String[] args)
    {
        // Assumption - valid input (majority element is present)
        int[] array = { 3, 8, 3, 4, 3, 2, 2, 2, 2, 2, 2 ,3 ,3 ,3 , 3, 3, 3};

        System.out.println("Majority element is " + majorityElement(array));
    }
}
