package arrays;

public class BuySellStock {

    static int findProfit(int array[], int n)
    {
        int profit=0;
        int buy=-1;
        for (int i=0;i< array.length-1;i++){
            if(array[i]<array[i+1] && buy==-1){
                buy=i;
            }
            if(array[i]>array[i+1] && buy!=-1){
                profit+= array[i]-array[buy];
                buy=-1;
            }
        }
        if(buy!=-1) profit+=array[array.length-1]-array[buy];
        return profit;
    }

    public static void main(String args[])
    {

//        int array[] = { 98, 178, 250, 300, 40, 540, 690 };
//        int[] array={7,1,5,3,6,4 };
//        int[] array={ 1, 2, 3, 4, 5};
//        int[] array={ 4, 4 ,4 ,4};
        int[] array={ 4, 3 ,2 ,1};
        int n = array.length;

        System.out.println("Profit is "+BuySellStock.findProfit(array, n));
    }

}
