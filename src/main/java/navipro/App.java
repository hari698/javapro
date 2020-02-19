package navipro;
import java.util.Scanner;
public class App 
{
    public static void main( String[] args )
    {
	    int a,b,c;
            Scanner in=new Scanner(System.in);
            System.out.print("enter the two numbers:");
            a=in.nextInt();
            b=in.nextInt();
            c=a+b;
            System.out.println(c);
    } 
}
