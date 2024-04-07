import java.util.Scanner;

public class Main {
    public static int sequence(int n, int m){
        if(n==1 || m==0){
            return 1;
        }
        if(n==0){
            return 0;
        }

        return n*sequence(n,m-1);
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int n = sc.nextInt();
        int m= sc.nextInt();

        System.out.println(sequence(n,m));
    }
}