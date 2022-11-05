package arrays;

public class CountFrequencies {
    //Function to find counts of all elements present in arr[0..n-1]. The array  elements must be range from 1 to n
    public static void countfrequenciesEfficient(int input[]) {

        int n= input.length;
        for(int i=0;i< n;i++){
            input[i]-=1;
        }

        for(int i=0;i< n;i++){
            input[input[i]%n]=n+input[input[i]%n];
        }

        for(int i=0;i<n;i++){
            System.out.println( "Frequency of "+(i+1) +" is "+input[i]/n);
        }
    }

    public static void main(String[] args) {
//        int[] input = { 4,4,4,4};
//        int[] input = { 1, 2, 2, 1, 1, 2, 3, 2};
        int[] input = { 1, 2, 2};
        countfrequenciesEfficient(input);
    }

/* Try more Inputs
case 1:
actual = countfrequenciesEfficient([1, 2, 2, 1, 1, 2, 3, 2])
expected = [[1 3],[2 4],[3  1]]

case2:
 actual = countfrequenciesEfficient([1, 2, 2])
 expected = [[1 1],[2 2]]

case3:
actual = countfrequenciesEfficient([4, 4, 4, 4}])
expected = [[4 4]]
*/
}
