import java.util.Scanner;

public class Hours
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter number of seconds:");
        n = sc.nextInt();

        int h,m;
        h=n/3600;
        n=n%3600;
        m= n/60;
        n=n%60;

        System.out.println(h+":"+m+":"+n);
    }

}