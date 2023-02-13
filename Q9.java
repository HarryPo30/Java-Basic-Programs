import java.util.Scanner;

public class Q9{
    public static void main(String []args){
        Scanner yo=new Scanner(System.in);
        int i,j;
        System.out.println("Enter two numbers for range:- ");
        int a=yo.nextInt();
        int b=yo.nextInt();
        for(i=a;i<=b;i++)
        {
            for(j=2;j<=i;j++)
            {
                if(i%j==0)
                    break;
            }
            if(i==j)
            System.out.println(j+" ");
        }
    }
}