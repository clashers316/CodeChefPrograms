/* package codechef; // don't place package name! */
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        // your code goes here
        int n = sc.nextInt();
        int h = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        String s1 = sc.next();
        String s = sc.nextLine();
        s = s1+s;
        int k = 0;
        int j = 0;
        int box = 0;
        while(k<s.length())
        {
            char ch = s.charAt(k);
            switch(ch)
            {
                case '0':
                break;
                case '1':
                if(j == 0)
                {
                    break;
                }
                else
                {
                    j = j-1;
                }
                break;
                case '2':
                if(j == (n-1))
                {
                    break;
                }
                else
                {
                    j = j+1;
                }
                break;
                case '3':
                if(arr[j] == 0||box == 1)
                {
                    break;
                }
                else
                {
                    box = 1;
                    arr[j] = arr[j] - 1;
                }
                break;
                case '4':
                if(arr[j] == h||box == 0)
                {
                    break;
                }
                else
                {
                    box = 0;
                    arr[j] = arr[j]+1;
                }
                break;
                default:
                break;
            }
            k = k+2;
        }
        for(int i = 0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}

