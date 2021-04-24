import java.io.*;

public class Npartition
{
    public static  void main(String[] args)throws IOException
    {
        int a,b,c,d;
        int n;

        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);

        System.out.println("Enter number:");
       n = Integer.parseInt(in.readLine());

        for(a=0;a<=9;a++)
            for(b=0;b<=9;b++)
                for(c=0;c<=9;c++)
                    for(d=0;d<=9;d++)
                    {
                        if((a+b+c+d)==n)
                            System.out.println(a+"+"+b+"+"+c+"+"+d+" = "+n);
                    }
    }
}