import java.util.Arrays;
import java.util.Scanner;

public class OddEven
{
    public static void main(String[] args)
    {
        int[] arr=new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 array elements");
        int i;
        for(i=0;i<10;i++)
            arr[i] = sc.nextInt();
        System.out.println(Arrays.toString(arr));

        int temp;
        for( i=0; i < 10; i++){
            for(int j=1; j < (10-i); j++){
                if((arr[j-1]%2==0)&&(arr[j]%2!=0)){

                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }

            }
        }
        System.out.println("Array after sorting is ");
        System.out.println(Arrays.toString(arr));



    }

}
