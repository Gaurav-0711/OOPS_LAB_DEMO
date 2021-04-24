import java.util.Scanner;

public class Staircase
{
    public static void main(String[] args)
    {
        Design ob = new Design();
        ob.display();
    }
}

class Design
{
       public void display() {
           int i, j, n;
           Scanner sc = new Scanner(System.in);

           System.out.println("Enter number:");
           n = sc.nextInt();

           for (i = 1; i <= n; i++) {
               for (j = 1; j <= i; j++) {
                   System.out.print("$ ");
               }
               System.out.println();
           }
       }
}