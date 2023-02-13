import java.util.Scanner;
public class Q13{
    public static void main(String[] ar){

        Scanner yo=new Scanner(System.in);
        System.out.println("Enter anumber to check whether it is neon or not:- ");
        int a=yo.nextInt();
        int p=a*a;
        int r,sum=0;
        while(p>0){
            r=p%10;
            sum=sum+r;
            p=p/10;
        }
        if(a==sum){
            System.out.println("Neon Number");
        }
        else{
            System.out.println("Not neon");
        }

    }
}