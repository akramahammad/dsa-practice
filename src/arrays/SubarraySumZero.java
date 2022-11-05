package arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class SubarraySumZero {
    static class SubArray
    {
        int first, second;
        SubArray(int a, int b)
        {
            first = a;
            second = b;
        }

        @Override
        public String toString() {
            return "SubArray{" +
                    "first=" + first +
                    ", second=" + second +
                    '}';
        }
    }

    static ArrayList<SubArray> findSubArrays(int[] array, int n)
    {
        ArrayList<SubArray> subArrays=new ArrayList<>();
        Map<Integer,ArrayList<Integer>> indexes=new HashMap<>();
        int sum=0;
        for(int i=0;i< array.length;i++){
            sum+=array[i];
            if(indexes.containsKey(sum)){
                ArrayList<Integer> list=indexes.get(sum);
                for(int j=0;j<list.size();j++){
                    subArrays.add(new SubArray(list.get(j)+1,i));
                }
                list.add(i);
            }
            else{
                ArrayList<Integer> newList=new ArrayList<>();
                newList.add(i);
                indexes.put(sum,newList);
            }
        }
        return subArrays;
    }


    public static void main(String args[])
    {
        int[] array = {6, 3, -2, -5, -3, 7, 2, -6, -1, 4};
//        int[] array = {4,2,0,1,6};
//        int[] array = {-3,2,3,1,6};
        int n = array.length;

        ArrayList<SubArray> out = findSubArrays(array, n);
        System.out.println(out);

    }

}
