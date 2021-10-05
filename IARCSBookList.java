import java.util.*;
import java.io.*;
public class Main 
{
    public static void main(String args[])throws IOException
    {
        try
        {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int arr[] = new int[n];
            int counter = 0;
            for(int i = 0;i<n;i++)
            {
                arr[i] = sc.nextInt();
            }
            int b = sc.nextInt();
            int borrow[] = new int[b];
            for(int i = 0; i<b;i++)
            {
                borrow[i] = sc.nextInt();
            }
            for(int i = 0;i<b;i++)
            {
                int y = borrow[i];
                System.out.println(arr[y-1]);
                for(int j = y-1;j<n-i-1;j++)
                {
                    arr[j] = arr[j+1];
                }
                arr[n-i-1] = 0;
            }
        }
        catch(Exception e)
        {
            return;
        }
    }
}
