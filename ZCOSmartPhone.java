import java.util.*;
import java.io.*;
public class Main
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        long arr[] = new long[size];
        for(int i = 0;i<size;i++)
        {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        long max = 0;
        long sum = 0;
        for(int i = 0; i<size;i++)
        {
            sum = arr[i]*(size-i);
            if(sum>= max)
            {
                max = sum;
            }
            sum = 0;
        }
        System.out.println(max);
    }
}
