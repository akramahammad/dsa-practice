package arrays;

import java.util.Arrays;

public class MinPlatforms {
    static int minimumNumberOfPlatform(int array[], int departure[], int n)
    {
        if(array.length<=1) return array.length;
        int maxPlatforms=1;
        int platforms=1;
        int p1=1;
        int p2=0;
        Arrays.sort(departure);
        while (p1< array.length){
//            System.out.println(array[p1]);
//            System.out.println(departure[p2]);
            if(array[p1]<=departure[p2]){
                p1++;
                platforms++;
            }
            else{
                p2++;
                platforms--;
            }

            maxPlatforms=Math.max(platforms,maxPlatforms);
        }

        return maxPlatforms;
    }
    public static void main(String[] args)
    {
        int[] arrival = { 900,940,950,1100,1500,1800};
        int[] departure = {910, 1200, 1120, 1130, 1900, 2000};
//        int[] arrival = { 200, 210, 300, 320, 350, 500};
//        int[] departure = {230, 340, 320, 430, 400, 520};
//        int[] arrival = { 900, 1100, 1235};
//        int[] departure = {1000, 1200, 1240};
        int n = arrival.length;

        System.out.print("Minimum platforms required is "
                + minimumNumberOfPlatform(arrival, departure,n));
    }
}
