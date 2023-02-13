import java.util.Scanner;
public class Q10{
    public static void main(String []args){
        Scanner yo=new Scanner(System.in);
        System.out.println("Give a range for fibanocci:- ");
        int n=yo.nextInt();
        int i,a=0,b=1,c;
        for (i=1;i<=n;i++)
        {
            System.out.println(+a+"  ");
            c=a+b;
            a=b;
            b=c;
        }
    }
}