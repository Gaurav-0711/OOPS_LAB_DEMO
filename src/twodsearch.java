import java.nio.file.FileSystemNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class twodsearch
{
    public static void main(String[] args)
    {
        int m =5,n=5,i,j;
        int[][] arr = new int[m][n];
        int[] arr1 = new int[2];
        int ele;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter matrix:");
        for(i=0;i<m;i++)
            for(j=0;j<n;j++)
                arr[i][j] = sc.nextInt();

            System.out.println("Enter element to be searched:");
            ele = sc.nextInt();
             arr1= m1(arr,ele);

             System.out.println(Arrays.toString(arr1));
             System.out.println("Hi");
    }
    static int[] m1(int[][] arr,int ele)
    {
     int[]array = new int[2];
        for(int i=0;i<5;i++)
            for(int j=0;j<5;j++)
                if(arr[i][j]==ele)
                {
                    array[0] = i+1;
                    array[1] = j+1;
                }
        return array;
    }

}
