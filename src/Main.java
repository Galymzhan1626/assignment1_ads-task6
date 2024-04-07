import java.util.Scanner;

public class Main {
    /**
     * This method calculates a value in a sequence based on the inputs 'n' and 'm'.
     * It uses recursion to multiply 'n' by the result of the sequence with 'm-1'.
     * The base cases handle when 'n' is 1 or 'm' is 0, returning 1, and when 'n' is 0, returning 0.
     *
     * @param n The base integer of the sequence.
     * @param m The exponent representing the depth of the sequence calculation.
     * @return The calculated value of the sequence for 'n' and 'm'.
     */
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
