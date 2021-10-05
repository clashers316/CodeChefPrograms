import java.util.*;
import java.io.*;
public class Main 
{
    public static void main(String args[])throws IOException 
    {
        try {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int one[] = new int[n];
            int two[] = new int[n];
            for(int i = 0;i<n;i++)
            {
                one[i] = sc.nextInt();
                two[i] = sc.nextInt();
            }
            int lead = 0;
            int y = 0;
            for(int i = 0;i<n;i++)
            {
                if(i == 0)
                {
                    if(one[i]>two[i])
                    {
                        lead = one[i] - two[i];
                        y = 1;
                    }
                    else{
                        lead = two[i]-one[i];
                        y = 2;
                    }
                    
                }
                else
                {
                    one[i] = one[i]+one[i-1];
                    two[i] = two[i]+two[i-1];
                    if(one[i]>two[i])
                    {
                        if((one[i]-two[i])>lead)
                        {
                            lead = one[i] - two[i];
                            y = 1;
                        }
                        
                    }
                    else
                    {
                        if((two[i]-one[i])>lead)
                        {
                            lead = two[i]-one[i];
                            y = 2;
                        }
                        
                    }
                }
            }
            System.out.println(y+" "+lead);
        } catch(Exception e)
        {
            return;
        } 
    }
}
