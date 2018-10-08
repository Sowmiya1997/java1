import java.util.Scanner;

public class EvenOdd {

    public static void main(String[] args) {
      int n;

       Scanner sc=new Scanner(System.in);
       n=sc.nextInt();

        if(n % 2 == 0)
            System.out.println( "even");
        else if(n>0)
            System.out.println("odd");
            else
            System.out.println("invalid");
    }
}