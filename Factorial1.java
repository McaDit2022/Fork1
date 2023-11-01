import java.util.Scanner;
public class Factorial1
{
    public static void main(String[]args)
    { 
        int i,fact=1;
        try (Scanner s = new Scanner(System.in)) {
            int f=s.nextInt();
            for(i=1;i<=f;i++){
                fact=fact*i;

           }
            //Changes are made in the code
            System.out.println("The factorial of "+f+" is "+fact);
        }


    }
}
