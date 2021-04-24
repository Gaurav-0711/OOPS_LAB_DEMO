import java.util.Scanner;

public class LastDigit
{
    public static  void main(String[] args)
    {
        int i;
        int [] arr = new int[3];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 elements:");
        for(i=0;i<3;i++)
        {
            arr[i] = sc.nextInt();
        }

        int[] flag = {0,0,0,0,0,0,0,0,0,0};

        for(i=0;i<3;i++)
        {
            flag[(arr[i]%10)]++;
        }
        for(i=0;i<10;i++)
        {
            if(flag[i]>1)
            {
                System.out.println("TRUE");
                return;
            }
        }
        System.out.println("False");


    }
}
