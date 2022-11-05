package arrays;

public class DistributeCandy {
    public static int candy(int[] ratings)
    {
        int [] left= new int[ratings.length];
        int [] right= new int[ratings.length];

        for(int i=0;i<ratings.length;i++){
            if(i==0 || (ratings[i]<=ratings[i-1])){
                left[i]=1;
            }
            else{
                left[i]=left[i-1]+1;
            }
        }

        for(int i= ratings.length-1;i>=0;i--){
            if(i== ratings.length-1 || (ratings[i]<=ratings[i+1])){
                right[i]=1;
            }
            else{
                right[i]=right[i+1]+1;
            }
        }
        int result=0;
        for(int i=0;i< ratings.length;i++){
            result+= Math.max(left[i],right[i]);
        }
        return result;
    }
    public static void main(String[] args) {
        int ratings[] = {1,5,2,1,2,6,4,1,7};
        int result = candy(ratings);
        System.out.println(result);
    }
}
