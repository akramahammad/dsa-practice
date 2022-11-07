package arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class DistinctElementsWindow {
    static void distinctElement(int array[], int k)
    {
        Map<Integer,Integer> occurrences= new HashMap<>();
        ArrayList<Integer> distinctElements=new ArrayList<>();
        //Finding distinct elements for 1st window
        for(int i=0;i<k;i++){
            if(occurrences.containsKey(array[i])){
                occurrences.put(array[i],occurrences.get(array[i]) + 1);
            }
            else{
                occurrences.put(array[i],1 );
            }
        }
        distinctElements.add(occurrences.keySet().size());

        for(int i=1;i+k< array.length;i++){
            if(occurrences.containsKey(array[i-1]) && occurrences.get(array[i-1])!=1 ){
                occurrences.put(array[i-1],occurrences.get(array[i-1]) - 1);
            }
            else{
                occurrences.remove(array[i-1]);
            }
            if(occurrences.containsKey(array[i+k-1])){
                occurrences.put(array[i+k-1],occurrences.get(array[i+k-1]) + 1);
            }
            else{
                occurrences.put(array[i+k-1],1);
            }
            distinctElements.add(occurrences.keySet().size());
        }

        for(int i=0;i<distinctElements.size();i++){
            System.out.println("Distinct elements in "+ (i+1) +" window is : "+distinctElements.get(i));
        }
    }

    public static void main(String args[])
    {
        int array[] = {2, 3, 2, 4, 5, 3, 3, 4},  k = 3;

        distinctElement(array, k);
    }
}
