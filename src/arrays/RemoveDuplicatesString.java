package arrays;

public class RemoveDuplicatesString {
    static String removeDuplicatesFromString(String str1)
    {
        //Write your code Here
        int[] ascii=new int[256];
        char[] str=str1.toCharArray();
        for(int i=0;i<str.length;i++){
            if(ascii[str[i]]==0){
                ascii[str[i]]=-1;
            }
            else if (ascii[str[i]]==-1){
                str[i]='\0';
            }
        }
        str1=new String(str);
        return str1.replaceAll("\0","");
    }

    public static void main(String[] args)
    {
        String str = "abdeebcba";
        System.out.println(removeDuplicatesFromString(str));
    }
}
