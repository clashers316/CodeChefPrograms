import java.util.*;
import java.io.*;
public class Main
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0)
        {
            int n =sc.nextInt();
            int k = sc.nextInt();
            int arr[] = new int[n];
            int bot = 0;
            int acc = 0;
            int ts = 0;
            int rejected = 0;
            for(int i = 0;i<n;i++)
            {
                arr[i] = sc.nextInt();
            }
            for(int i = 0;i<n;i++)
            {
                if(arr[i] == -1)
                {
                    rejected++;
                }
                else if(arr[i]>k)
                {
                    ts++;
                }
                else
                {
                    if(arr[i]<= 1)
                    {
                        bot++;
                        acc++;
                    }
                    else
                    {
                        acc++;
                    }
                }
            }
            if(rejected>(n/2))
            {
                System.out.println("Rejected");
            }
            else if(ts>0)
            {
                System.out.println("Too Slow");
            }
            else
            {
                if(bot == n)
                {
                    System.out.println("Bot");
                }
                else
                {
                    System.out.println("Accepted");
                }
            }
            t--;
        }
    }
}
